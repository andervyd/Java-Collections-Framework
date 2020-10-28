//: Class Scanner
//      methods: .nextByte()
//               .nextShort()
//                  .nextInt()
//               .nextLong()
//               .nextFloat()
//               .nextDouble();
//               .nextBoolean()

//               .next()
//                  .nextLine()

//               .hasNext()
//               .hasNextLine()
//               .hasNextInt()
//               ...

package ImportantTopics.ScannerClass;

import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {

/* .nextInt()
        Scanner scannerInputInt = new Scanner(System.in);
        System.out.println("Insert the number...");
        int inputInt = scannerInputInt.nextInt();
        System.out.println("Insert the number: " + inputInt);
            // Output: Insert the number...
            //         12
            //         Insert the number: 12
*/
/*
        Scanner scannerForDiv = new Scanner(System.in);
        System.out.println("Insert two the number...");
        int x = scannerForDiv.nextInt();
        int y = scannerForDiv.nextInt();
        System.out.println("Division: " + x / y);
        System.out.println("The remainder:" + x % y);
            // Output: Insert two the number...
            //         10
            //         3
            //         Division: 3
            //         The remainder:1
*/
/* .nextLine()
        Scanner scannerStrName = new Scanner(System.in);
        System.out.println("Insert you name...");
        String name = scannerStrName.nextLine();
        System.out.println("Hello " + name);
            // Output: Insert you name...
            //         Alex
            //         Hello Alex
*/
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert you name...");
        String name = scanner.nextLine();
        System.out.println("Insert you age...");
        int age = scanner.nextInt();
        System.out.println("Hello " + name);
        System.out.println("You age: " + age);
            // Output: Insert you name...
            //         Alex
            //         Insert you age...
            //         35
            //         Hello Alex
            //         You age: 35
*/
/*
        Scanner scanner = new Scanner("Hello");
        String string = scanner.nextLine();
        System.out.println(string + " World!");
            // Output: Hello World!
*/
/* .hasNextLine()
        Scanner scanner = new Scanner(
                "Laurie:   So, what are your plans for this weekend?\n" +
                        "Christie: I don’t know. Do you want to get together or something?\n" +
                        "Sarah: How about going to see a movie? Cinemax 26 on Carson Boulevard is showing Enchanted.\n" +
                        "Laurie:   That sounds like a good idea.");
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
            // Output: Laurie:   So, what are your plans for this weekend?
            //         Christie: I don’t know. Do you want to get together or something?
            //         Sarah: How about going to see a movie? Cinemax 26 on Carson Boulevard is showing Enchanted.
            //         Laurie:   That sounds like a good idea.
*/
        Scanner scanner = new Scanner("Hello World!");
        System.out.println("Index 6: " + scanner.nextLine().charAt(6));
            // Output: Index 6: W

    }
}
