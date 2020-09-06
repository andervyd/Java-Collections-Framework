//: Class Team: command names and
//              list of participants.

package Generics.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> { // add <T>, add <T extends Participant>

	private String name;
//	private List<Participant> listOfParticipant = new ArrayList<>();
	private List<T> listOfParticipant = new ArrayList<>();
	
	public Team(String name) {
		this.name = name;
	}
	
//	public void addNewParticipant(Participant participant) {
	public void addNewParticipant(T participant) {
		listOfParticipant.add(participant);
		
		System.out.println("To the team '" + name + 
//				"' has a new member been added " + participant.getName());  // if <T> cast
//        		"' has a new member been added " + ((Participant)participant).getName()); if <T extends Participant> not cast
        		"' has a new member been added " + participant.getName());
 	}
	
//	public void playWith(Team team) {
	public void playWith(Team<T> team) { // add <T>
		String winnerName;
		
		Random random = new Random();
		int i = random.nextInt(2);
		
		if(i == 0) {
			winnerName = this.name;
		} else {
			winnerName = team.name;
		}
		
		System.out.println("Team winner '" + winnerName + "'");
	}
}