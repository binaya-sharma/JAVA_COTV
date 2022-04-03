package cotiviti;

import com.sun.jdi.PathSearchingVirtualMachine;

public  class Const {
    // A constructor in Java is similar to a method that is invoked when an object of the class is created.
    // Unlike Java methods, a constructor has the same name as that of the class and does not have any return type.
    // For example, class Test { Test() { // constructor body } } Here, Test() is a constructor.

    String name;
    int age;

    // Default constructor
    Const(){
        name = "Binaya";
        age = 21;
    }

    //Parameterized Constructor
    Const(String X,int Y){
        name = X;
        age = Y;
    }

    public static void main(String[] args) {
        Const newObj = new Const(); // Default constructor invoked
        System.out.println(newObj.name + " " +  newObj.age);

        Const newObj2 = new Const("Bishwash" , 21); // Default Parameterized invoked
        System.out.println(newObj2.name + " " +  newObj2.age);

    }
}

// Constructor cannot be overridden.
