package REGularEXpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankAccountGroup {
    public static void main(String[] args) {

        // bank card: number - 4321 6654 9812 3121; date - 23/04 cv - (567)
        String cardNumber = "43216654981231212304567;" +
                            "98237346238279364283747;" +
                            "22103293761498271938624.";

        Pattern pattern = Pattern.compile("" +
                "(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})"); // group
        Matcher matcher = pattern.matcher(cardNumber);

/*
        String newFormanCard = matcher.replaceAll("$1 $2 $3 $4 $5/$6 ($7)");
        System.out.println(newFormanCard);
            // Output: 4321 6654 9812 3121 23/04 (567);
            //         9823 7346 2382 7936 42/83 (747);
            //         2210 3293 7614 9827 19/38 (624).
*/

        while(matcher.find()) {
            System.out.println("cv (" + matcher.group(7) + ")"); // group 7 (cv)
        } // Output: cv (567)
          //         cv (747)
          //         cv (624)

    }
}
