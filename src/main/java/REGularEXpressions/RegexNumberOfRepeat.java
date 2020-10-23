//: Simbols REGEX:
//      Number of repeating
//            expression ?
//            expression *
//            expression +
//            expression {n}
//            expression {m, n}
//            expression {n, }

package REGularEXpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexNumberOfRepeat {
    public static void main(String[] args) {

// Simbol REGEX: +
        System.out.println("------------------");
        String letter0 = "ab c5 3ESu";
        Pattern pattern0 = Pattern.compile("\\w+");
        Matcher matcher0 = pattern0.matcher(letter0);

        while(matcher0.find()) {
            System.out.println("Position: " + matcher0.start() + " - " + matcher0.group());
        }   // Output: Position: 0 - ab
            //         Position: 3 - c5
            //         Position: 6 - 3ESu

// Simbol REGEX: {n}
        System.out.println("------------------");
        String letter1 = "hi John, how a you?";
        Pattern pattern1 = Pattern.compile("\\w{3}");
        Matcher matcher1 = pattern1.matcher(letter1);

        while(matcher1.find()) {
            System.out.println("Position: " + matcher1.start() + " - " + matcher1.group());
        }   // Output: Position: 3  - Joh
            //         Position: 9  - how
            //         Position: 15 - you

    }
}
