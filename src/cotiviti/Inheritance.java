package cotiviti;

class Parent {
    int a = 2;
}

class Child extends Parent {
    int a = 3;
}

public class Inheritance {
    public static void main(String[] args) {
        Child newObj = new Child();
        System.out.println(newObj.a);
    }
}

