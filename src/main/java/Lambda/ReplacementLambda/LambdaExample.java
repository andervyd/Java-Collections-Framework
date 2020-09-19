//: Lambda example

package Lambda.ReplacementLambda;

public class LambdaExample {
    static void methodLE(I classI) {
        System.out.println(classI.methodI("Hi")); // length: 2
    }

    public static void main(String[] args) {

        methodLE((String string) -> {return string.length();});
    }
}

interface I {
    int methodI(String string);
}
