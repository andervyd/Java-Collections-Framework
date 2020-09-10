// ListIterator example

package Collection.List.ListIterator;

import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		
		String palindrome = "RADAR";
		boolean isPalindrome = true;
		
		List<Character> characterList = new LinkedList<>();
		
		for(char charList : palindrome.toCharArray()) {
			characterList.add(charList);
		}
		
		System.out.println(characterList);
		
		ListIterator<Character> startIterator = characterList.listIterator();
		ListIterator<Character> finishIterator = characterList.listIterator(characterList.size());
		
		while(startIterator.hasNext() && finishIterator.hasPrevious()) {
			if(startIterator.next() != finishIterator.previous()) {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome) {
			System.out.println("Word '" + palindrome + "' - palindrome.");
		} else {
			System.out.println("Word '" + palindrome + "' - not palindrome.");
		}
	
	}
}
