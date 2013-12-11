package Exercise2;


class Glass {
    float level;
}

public class Assign {
    public static void main(String[] args) {
        Glass t1 = new Glass();
        Glass t2 = new Glass();
        t1.level = 0.9f;
        t2.level = 0.47f;
        System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1 = t2;
        System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level = 0.27f;
        System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
}