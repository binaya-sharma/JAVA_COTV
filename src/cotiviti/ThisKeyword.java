package cotiviti;

import com.sun.jdi.event.ThreadStartEvent;

public class ThisKeyword {
    int a = 2; // instance variable

    void dispaly(){
        int a = 22; //local variable
        System.out.println(this.a); //print instance variable
        System.out.println(a); //print local variable
    }

    public static void main(String[] args) {
        ThisKeyword newObj = new ThisKeyword();
        System.out.println(newObj.a);

        newObj.dispaly();
    }

}
