package Exercise15;


class Test {
    String s;
    {
        s = "Test Instance Init";
        System.out.println(s);
    }
    Test() {
        System.out.println("Test()");
    }
}
