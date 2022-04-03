package cotiviti;

public class VariableTypes {
    public static String ThisIsStaticVariable = "Binaya"; // Static Variable # Memory alloted only once
    String ThisIsInstanceVariable = "Bishwash"; // Instance variable #Inside class outside method

    public static void main(String[] args) {
        String ThisIsLocalVariable = "Binita"; //Inside Method

        VariableTypes newObj = new VariableTypes();
        System.out.println(newObj.ThisIsInstanceVariable);
        System.out.println(ThisIsStaticVariable);
        System.out.println(ThisIsLocalVariable);


    }
}
