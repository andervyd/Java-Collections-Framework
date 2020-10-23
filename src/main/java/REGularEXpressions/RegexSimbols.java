//: Simbols REGEX:
//        abc
//        [abc]
//        [d-j]
//        [3-8]
//        [B-Fd-j3-8]
//        a|b
//        [^d-j]
//        .
//        ^ expression
//        expression $

package REGularEXpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSimbols {
    public static void main(String[] args) {

// simbol REGEX: abc
        System.out.println("------------------");
        String letter1 = "ASJPOSTE BHGQP NH BHSY POSFG";
        Pattern pattern1 = Pattern.compile("POS");
        Matcher matcher1 = pattern1.matcher(letter1);

        while(matcher1.find()) {
            System.out.println("Position: " + matcher1.start() + " - " + matcher1.group());
        }   // Output: Position: 3  - POS
            //         Position: 23 - POS

// simbol REGEX: [abc]
        System.out.println("------------------");
        String letter2 = "DAPMNHTYODS";
        Pattern pattern2 = Pattern.compile("[POS]");
        Matcher matcher2 = pattern2.matcher(letter2);

        while(matcher2.find()) {
            System.out.println("Position: " + matcher2.start() + " - " + matcher2.group());
        }   // Output: Position: 2  - P
            //         Position: 8  - O
            //         Position: 10 - S

// simbol REGEX: [d-j]
        System.out.println("------------------");
        String letter3 = "ABDOP";
        Pattern pattern3 = Pattern.compile("AB[C-F]OP");
        Matcher matcher3 = pattern3.matcher(letter3);

        while(matcher3.find()) {
            System.out.println("Position: " + matcher3.start() + " - " + matcher3.group());
        }   // Output: Position: 0 - ABDOP

// simbol REGEX: [3-8]
        System.out.println("------------------");
        String letter4 = "28741987";
        Pattern pattern4 = Pattern.compile("[2-5]");
        Matcher matcher4 = pattern4.matcher(letter4);

        while(matcher4.find()) {
            System.out.println("Position: " + matcher4.start() + " - " + matcher4.group());
        }   // Output: Position: 0 - 2
            //         Position: 3 - 4

// simbol REGEX: [B-Fd-j3-8]
        System.out.println("------------------");
        String letter5 = "abcd abce abc5abcg6abch";
        Pattern pattern5 = Pattern.compile("abc[e-g4-7]");
        Matcher matcher5 = pattern5.matcher(letter5);

        while(matcher5.find()) {
            System.out.println("Position: " + matcher5.start() + " - " + matcher5.group());
        }   // Output: Position: 5  - abce
            //         Position: 10 - abc5
            //         Position: 14 - abcg

// simbol REGEX: [B-Fd-j3-8]
        System.out.println("------------------");
        String letter7 = "abcd abce abc5abcg6abch";
        Pattern pattern7 = Pattern.compile("abc[^e-g4-7]");
        Matcher matcher7 = pattern7.matcher(letter7);

        while(matcher7.find()) {
            System.out.println("Position: " + matcher7.start() + " - " + matcher7.group());
        }   // Output: Position: 0 - abcd
            //         Position: 19 - abch

// simbol REGEX: a|b
        System.out.println("------------------");
        String letter6 = "BGSKWUDLLANF";
        Pattern pattern6 = Pattern.compile("A|B");
        Matcher matcher6 = pattern6.matcher(letter6);

        while(matcher6.find()) {
            System.out.println("Position: " + matcher6.start() + " - " + matcher6.group());
        }   // Output: Position: 0 - B
            //         Position: 9 - A

// simbol REGEX: .
        System.out.println("------------------");
        String letter8 = "abcd abce abc5abcg6abch";
        Pattern pattern8 = Pattern.compile("abc.");
        Matcher matcher8 = pattern8.matcher(letter8);

        while(matcher8.find()) {
            System.out.println("Position: " + matcher8.start() + " - " + matcher8.group());
        }   // Output: Position: 0  - abcd
            //         Position: 5  - abce
            //         Position: 10 - abc5
            //         Position: 14 - abcg
            //         Position: 19 - abch

// simbol REGEX: ^
        System.out.println("------------------");
        String letter9 = "abcd abce abc5abcg6abch";
        Pattern pattern9 = Pattern.compile("^abc");
        Matcher matcher9 = pattern9.matcher(letter9);

        while(matcher9.find()) {
            System.out.println("Position: " + matcher9.start() + " - " + matcher9.group());
        }   // Output: Position: 0  - abc

// simbol REGEX: $
        System.out.println("------------------");
        String letter10 = "abcd abce abc5abcg6abch";
        Pattern pattern10 = Pattern.compile("6abch$");
        Matcher matcher10 = pattern10.matcher(letter10);

        while(matcher10.find()) {
            System.out.println("Position: " + matcher10.start() + " - " + matcher10.group());
        }   // Output: Position: 18 - 6abch

    }
}