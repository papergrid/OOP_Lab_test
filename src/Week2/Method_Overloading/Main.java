package Week2.Method_Overloading;

public class Main {
    public static void main(String[] args){
        Box box1 = new Box();
        box1.length = 10;
        box1.breadth = 5;
        box1.height = 5;

        Box box2 = new Box(20);
        Box box3 = new Box(5, 10, 5);

        System.out.printf("Box1 volume:%d\nBox2 volume:%d\nBox3 volume:%d\n",box1.Volume(), box2.Volume(), box3.Volume());
        System.out.printf("Are box1 and box3 dimensions same: %b", box1.equalDimensions(box3));
    }
}
