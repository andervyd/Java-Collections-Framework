//: Synchronizer Exchanger
//       method: .exchange()


package Multithreading.Synchronizers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerSync {
    public static void main(String[] args) {

        Exchanger<Action> exchanger = new Exchanger<>();

        List<Action> list1 = new ArrayList<>();

        list1.add(Action.ROCK);
        list1.add(Action.PAPER);
        list1.add(Action.PAPER);

        List<Action> list2 = new ArrayList<>();

        list2.add(Action.SCISSORS);
        list2.add(Action.SCISSORS);
        list2.add(Action.ROCK);

        new BestFriend("Oleg", list1, exchanger);
        new BestFriend("Mary", list2, exchanger);

    }
}/* Output:
            Oleg WINS !!!
            Mary WINS !!!
            Oleg WINS !!!
*///:~

enum Action {
    ROCK, SCISSORS, PAPER;
}

class BestFriend extends Thread {

    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    public void whoWins(Action myAction, Action friendAction) {
        if(    (myAction == Action.ROCK     && friendAction == Action.SCISSORS)
            || (myAction == Action.PAPER    && friendAction == Action.ROCK)
            || (myAction == Action.SCISSORS && friendAction == Action.PAPER)) {
            System.out.println(name + " WINS !!!");
        }
    }

    public void run() {
        Action reply;
        for(Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}