//: Annotation
//      @Override
//      @Deprecated

package ImportantTopics.Annotation;

public class AnnotationExample {
    public static void main(String[] args) {

        Parent parent = new Child("Mary");

        parent.showInfo();
            // Output: It's Child class.

        parent.showInfoWithName();
            // Output: It's Child class. Name Mary
    }
}

class Parent {

    String name;

    public Parent(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("It's Parent class.");
    }

    @Deprecated
    public void showInfoWithName() {
        System.out.println("It's Parent class. Name " + name);
    }
}

class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    @Override
    public void showInfo() {
        System.out.println("It's Child class.");
    }

    @Override
    public void showInfoWithName() {
        System.out.println("It's Child class. Name " + name);
    }
}