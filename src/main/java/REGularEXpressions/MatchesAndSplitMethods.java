//: Methods
//      public boolean matches(String regex);
//      public String[] split(String regex);

package REGularEXpressions;

import java.util.Arrays;

public class MatchesAndSplitMethods {
    public static void main(String[] args) {


        String info = "" +
                "Ivanov Vasiliy, Ukraine, Kiev, Shevchenko street, 51, Flat 32, " +
                "email: vasiliy@mail.ru, Postcode: AA99, Phone Number: +380675553146;" +
                "Petrova Mariya, Ukraine, Odessa, Semena Paliy, 67, Flat 12," +
                "email: mariya@mail.ua, Postcode: 14TD, Phone Number: +380973416701;" +
                "John Lee, USA, Hollywood, Park Avenue, 112, Flat 233," +
                "email: lee@mail.com, Postcode: 34US, Pone Number: +901235552315.";

// matches
        String email = "lee@mail.com";
        boolean result = email.matches("\\w+@\\w+\\.(ru|ua|com)");

        System.out.println(result);
            // Output: true

// split
        String[] array = info.split(" ");

        System.out.println(Arrays.toString(array));
            // Output: [Ivanov, Vasiliy,, ... Number:, +901235552315.]
    }
}
