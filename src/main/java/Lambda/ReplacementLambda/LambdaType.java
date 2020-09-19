//: Lambda type write example

package Lambda.ReplacementLambda;

import java.util.*;

public class LambdaType {

    public void returnMethod(ArrayList<Letters> list, Info info) {
        for(Letters letters : list) {
            if(info.checkLetter(letters)) {
                System.out.println(letters);
            }
        }
    }

    public static void main(String[] args) {

        Letters l1 = new Letters("D");
        Letters l2 = new Letters("F");
        Letters l3 = new Letters("A");
        Letters l4 = new Letters("K");
        Letters l5 = new Letters("X");

        ArrayList<Letters> list = new ArrayList<>();

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);

//        System.out.println(list);

        LambdaType type = new LambdaType();

// Long type write lambda expression:
        type.returnMethod(list, (Letters letters) -> { return letters.getLetter().equals("A");});

// Short type write lambda expression:
        type.returnMethod(list, letters -> letters.getLetter().equals("K"));

// Mixed type write lambda expression:
        type.returnMethod(list, (Letters letters) -> letters.getLetter().equals("F"));

// Mixed type write lambda expression:
        type.returnMethod(list, letters -> { return letters.getLetter().equals("X");});



    }
}

interface Info {
    boolean checkLetter(Letters letters);
}

class Letters {
    private String letter;

    public Letters(String letter) {
        this.letter = letter;
    }

    public String getLetter() {
        return letter;
    }

    public String toString() {
        return "letter: '" + letter + "'";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letters letters = (Letters) o;
        return Objects.equals(letter, letters.letter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(letter);
    }
}