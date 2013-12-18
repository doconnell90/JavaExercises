package Exercise8;

class Orange {


    Orange(int i) {
        this("last");
        int slices = i;
        System.out.println("This Orange has " + i + " slices");
    }

    Orange(String s) {
        String degree = s;
        System.out.println("This is the " + s + " orange left.");

    }

    void pickup(){
        System.out.println("Picking up Orange");
        peelOrange();
        //this.peelOrange();   this is exercise 8 and 9 together!


    }

    void peelOrange() {
        System.out.println("Peeling Orange");

    }


}

