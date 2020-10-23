//: METAsimbols REGEX:
//        \d     \D
//        \w     \W
//        \s     \S
//        \A     \Z
//        \b     \B

package REGularEXpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMetaSimbols {
    public static void main(String[] args) {

// METAsimbol REGEX: \d
        System.out.println("------------------");
        String letter0 = "ab c5abg6";
        Pattern pattern0 = Pattern.compile("\\d");
        Matcher matcher0 = pattern0.matcher(letter0);

        while(matcher0.find()) {
            System.out.println("Position: " + matcher0.start() + " - " + matcher0.group());
        }   // Output: Position: 4 - 5
            //         Position: 8 - 6

// METAsimbol REGEX: \D
        System.out.println("------------------");
        String letter1 = "423 n52T98 17";
        Pattern pattern1 = Pattern.compile("\\D");
        Matcher matcher1 = pattern1.matcher(letter1);

        while(matcher1.find()) {
            System.out.println("Position: " + matcher1.start() + " - " + matcher1.group());
        }   // Output: Position: 3  -
            //         Position: 4  - n
            //         Position: 7  - T
            //         Position: 10 -

// METAsimbol REGEX: \w
        System.out.println("------------------");
        String letter2 = "ab c5";
        Pattern pattern2 = Pattern.compile("\\w");
        Matcher matcher2 = pattern2.matcher(letter2);

        while(matcher2.find()) {
            System.out.println("Position: " + matcher2.start() + " - " + matcher2.group());
        }   // Output: Position: 0 - a
            //         Position: 1 - b
            //         Position: 3 - c
            //         Position: 4 - 5

// METAsimbol REGEX: \W
        System.out.println("------------------");
        String letter3 = "ab c5!@";
        Pattern pattern3 = Pattern.compile("\\W");
        Matcher matcher3 = pattern3.matcher(letter3);

        while(matcher3.find()) {
            System.out.println("Position: " + matcher3.start() + " - " + matcher3.group());
        }   // Output: Position: 2 -
            //         Position: 5 - !
            //         Position: 6 - @

// METAsimbol REGEX: \s
        System.out.println("------------------");
        String letter4 = "ab c5 ";
        Pattern pattern4 = Pattern.compile("\\s");
        Matcher matcher4 = pattern4.matcher(letter4);

        while(matcher4.find()) {
            System.out.println("Position: " + matcher4.start() + " - " + matcher4.group());
        }   // Output: Position: 2 -
            //         Position: 5 -

// METAsimbol REGEX: \S
        System.out.println("------------------");
        String letter5 = "ab c5 ";
        Pattern pattern5 = Pattern.compile("\\S");
        Matcher matcher5 = pattern5.matcher(letter5);

        while(matcher5.find()) {
            System.out.println("Position: " + matcher5.start() + " - " + matcher5.group());
        }   // Output: Position: 0 - a
            //         Position: 1 - b
            //         Position: 3 - c
            //         Position: 4 - 5

// METAsimbol REGEX: \A
        System.out.println("------------------");
        String letter6 = "flat: 22, phone: +34521112345";
        Pattern pattern6 = Pattern.compile("\\Aflat");
        Matcher matcher6 = pattern6.matcher(letter6);

        while(matcher6.find()) {
            System.out.println("Position: " + matcher6.start() + " - " + matcher6.group());
        }   // Output: Position: 0 - flat

// METAsimbol REGEX: \Z
        System.out.println("------------------");
        String letter7 = "post 65000 a";
        Pattern pattern7 = Pattern.compile("a\\Z");
        Matcher matcher7 = pattern7.matcher(letter7);

        while(matcher7.find()) {
            System.out.println("Position: " + matcher7.start() + " - " + matcher7.group());
        }   // Output: Position: 11 - a

// METAsimbol REGEX: \b
        System.out.println("------------------");
        String letter8 = "flat: 22, phone: +34521112345";
        Pattern pattern8 = Pattern.compile("\\b\\d{2}\\b");
        Matcher matcher8 = pattern8.matcher(letter8);

        while(matcher8.find()) {
            System.out.println("Position: " + matcher8.start() + " - " + matcher8.group());
        }   // Output: Position: 6 - 22

// METAsimbol REGEX: \B
        System.out.println("------------------");
        String letter9 = "flat: 22, phone: +34521112345";
        Pattern pattern9 = Pattern.compile("\\B\\d{2}\\B");
        Matcher matcher9 = pattern9.matcher(letter9);

        while(matcher9.find()) {
            System.out.println("Position: " + matcher9.start() + " - " + matcher9.group());
        }   // Output: Position: 19 - 45
            //         Position: 21 - 21
            //         Position: 23 - 11
            //         Position: 25 - 23

    }
}
