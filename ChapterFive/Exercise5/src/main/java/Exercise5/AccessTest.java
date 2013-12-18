package Exercise5;

    public class AccessTest {

        int a = 1;
   	    public int b = 2;
   	    protected int c = 3;
   	    private int d = 4;


        AccessTest() { System.out.println("FourWays() constructor"); }
   	    void showa() { System.out.println(a); }
    	public void showb() { System.out.println(b); }
    	protected void showc() { System.out.println(c); }
    	private void showd() { System.out.println(d); }
    }






