package cotiviti;

// A method aka function is a block of code that performs a specific task.
public class Methods {
    // String name = "Binaya";
    // int age = 21;

    int a(int x, int y) {
        int z = x + y;
        return z;
    }

    int n() {
        int c = 12;
        int d = 12;
        int z = c + d;
        return z;
    }

    // double a(int a, int b) { // 'a(int, int)' is already defined in 'cotiviti.Methods'
        //return a+b;
    //}

    void display(){
        System.out.println("Hello Binaya");
    }



    public static void main(String[] args) {
        Methods newObj = new Methods();
        System.out.println(newObj.a(1,2));
        System.out.println(newObj.n());

        newObj.display();

    }
}
