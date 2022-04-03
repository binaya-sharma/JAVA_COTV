package cotiviti;

import java.sql.SQLOutput;

public class MethodOverloading {
    int a(int x, int y){
        return x+y;
    }

    int a(){
        int a = 2;
        int b =3;
        return a+b;
    }

    MethodOverloading(){
        System.out.println("Hello World");
    }

    MethodOverloading(int a, int b){
        System.out.println(a+b);

    }

    public static void main(String[] args) {
        MethodOverloading newObj = new MethodOverloading(1,2);
        MethodOverloading newObj1 = new MethodOverloading();

    }
}
