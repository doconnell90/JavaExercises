package Exercise21;

public class EnumTest

{
    public enum Notes

    {
        ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
    }

    public static void main(String[] args)

    {
        for(Notes notes : Notes.values())
            System.out.println(notes + ", ordinal " + notes.ordinal());
    }
}