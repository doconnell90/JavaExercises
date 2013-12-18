package Exercise19;

public class VariableArgs

{
    static void showStrings(String... args)

    {
        for(String s : args)
            System.out.print(s + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        showStrings("A", "B", "C", "D");
        showStrings(new String[]{"1", "2", "3", "4"});
    }
}