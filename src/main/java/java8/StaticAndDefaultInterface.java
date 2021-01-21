package java8;

public interface StaticAndDefaultInterface {
    static void stat_display(){
        System.out.println("I'm static method");
    }
    default void def_display() {
        System.out.println("I'm default method");
    }
}

class TestTestInterface implements StaticAndDefaultInterface {
    public static void main(String[] args) {
        StaticAndDefaultInterface test = new TestTestInterface();
        test.def_display();
        StaticAndDefaultInterface.stat_display();
    }
}
