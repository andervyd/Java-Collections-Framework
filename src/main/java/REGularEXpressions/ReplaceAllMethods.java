package REGularEXpressions;

public class ReplaceAllMethods {
    public static void main(String[] args) {

        String greeting = "Hi,      how  is  your      Java  learning     progress?";

        String newGreeting = greeting.replace("Hi", "Hello");
        System.out.println(newGreeting);
            // Output: Hello,      how  is  your      Java  learning     progress?

        String removeSpaces = greeting.replaceAll(" {2,}", " ");
        System.out.println(removeSpaces);
            // Output: Hi, how is your Java learning progress?

    }
}
