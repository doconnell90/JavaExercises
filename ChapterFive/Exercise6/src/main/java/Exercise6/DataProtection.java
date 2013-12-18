package Exercise6;

public class DataProtection

{
    public static void main(String[] args)

    {
        Data data = new Data();
        System.out.println(data.a);
        ChangeData.change(data, 99);
        System.out.println(data.a);
    }
}