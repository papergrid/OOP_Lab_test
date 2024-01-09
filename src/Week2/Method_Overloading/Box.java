package Week2.Method_Overloading;

public class Box {
    int height, length, breadth;

    Box(){
        height = 0;
        length = 0;
        breadth = 0;
    }
    Box(int side){
        height = side;
        length = side;
        breadth = side;
    }
    Box(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public int Volume(){
        return this.length * this.breadth * this.height;
    }

    public Box copyDimensions(){
        Box newbox = new Box();
        newbox.length = this.length;
        newbox.breadth = this.breadth;
        newbox.height = this.height;
        return newbox;
    }

    public boolean equalDimensions(Box box){
        return (this.height == box.height && this.length == box.length && this.breadth == box.length);
    }
}
