package cotiviti;

class Parent {
    int a = 2;
    int b = 12;

    void show(){
        System.out.println("Hello World");
    }
}

class Child extends Parent {
    int a = 3;

}

public class Inheritance {
    public static void main(String[] args) {
        Child newObj = new Child();
        System.out.println(newObj.b);
        newObj.show();
    }
}

