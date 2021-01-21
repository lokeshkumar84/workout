package java8;

interface TestInterface {
    public void display();
}

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        TestInterface test = () -> {
          System.out.println("Hiiiiiii");
        };
        test.display();
    }
}
