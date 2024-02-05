package Week3.Minor1;

public class Question4_Static {
    int a;
    static int b;
    static int c = 5;

    static void display() {
        // System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    public void incrByTen() {
        a = a+10;
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {
        Question4_Static obj = new Question4_Static();
        obj.a = 10;
        //obj.b = 5;
        Question4_Static.b = 6;
        Question4_Static.display();
        obj.incrByTen();
    }
}
