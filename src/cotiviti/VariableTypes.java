package cotiviti;

import java.sql.SQLOutput;

public class VariableTypes {
    public static String ThisIsStaticVariable = "Binaya"; // Static Variable # Memory alloted only once
    String ThisIsInstanceVariable = "Bishwash"; // Instance variable #Inside class outside method

    static {
        System.out.println("Yo afai execute huncha yedi static variable main method ma access gardai cham vane");
    }
    public static void main(String[] args) {
        String ThisIsLocalVariable = "Binita"; //Inside Method

        VariableTypes newObj = new VariableTypes();
        System.out.println(newObj.ThisIsInstanceVariable);
        System.out.println(VariableTypes.ThisIsStaticVariable);
        System.out.println(ThisIsLocalVariable);


    }
}
