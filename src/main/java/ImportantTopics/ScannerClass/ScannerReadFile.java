//: Class Scanner
//     methods: .useDelimiter()


package ImportantTopics.ScannerClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ScannerReadFile {
    public static void main(String[] args) {

        Scanner scanner = null;
        Set<String> set = new TreeSet<>();

        try {

            scanner = new Scanner(new FileReader(
                    new File("/home/andervyd/eclipse/workspace/Java-Collections-Framework/" +
                            "src/main/java/ImportantTopics/ScannerClass/resources/Romeo and Juliet.txt")));

            scanner.useDelimiter("\\W");
            while(scanner.hasNext()) {
                String word = scanner.next();
                set.add(word);
            }
            for(String string : set) {
                System.out.println(string);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}/* Output:
            Act
            Capulet
            Capulets
            Chorus
            Count
            His
            I
            Juliet
            Montagues
            On
            Paris
            Prince
            Romeo
            Soon
            Verona
            a
            after
            and
            as
            banish
            begins
            daughter
            day
            each
            faction
            families
            family
            feast
            feuding
            fight
            goal
            head
            his
            hot
            intercedes
            introduce
            introduces
            is
            marry
            men
            named
            of
            plans
            s
            seeks
            summer
            the
            them
            threatens
            to
            two
            until
            who
            young
*///:~
