//: REGular EXpressions [REGEX]
//        Pattern pattern = Pattern.compile("search");
//        Matcher matcher = pattern.matcher(some_string);
//
//        while(matcher.find()) {
//            System.out.println("Position: " + matcher.start() + " - " + matcher.group());
//        }

package REGularEXpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternAndMatcher {
    public static void main(String[] args) {

        String info = "" +
                "Ivanov Vasiliy, Ukraine, Kiev, Shevchenko street, 51, Flat 32, " +
                "email: vasiliy@mail.ru, Postcode: AA99, Phone Number: +380675553146;" +
                "Petrova Mariya, Ukraine, Odessa, Semena Paliy, 67, Flat 12," +
                "email: mariya@mail.ua, Postcode: 14TD, Phone Number: +380973416701;" +
                "John Lee, USA, Hollywood, Park Avenue, 112, Flat 233," +
                "email: lee@mail.com, Postcode: 34US, Pone Number: +901235552315.";

//        Pattern pattern = Pattern.compile("\\w+");         // all
//        Pattern pattern = Pattern.compile("\\d{2}");       // street and flat number (don't work)
//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b"); // street and flat number
//        Pattern pattern = Pattern.compile("\\+\\d{12}");     // phone number
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|ua|com)");     // email


        Matcher matcher = pattern.matcher(info);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }






    }
}
