package Week3.Minor1.Question5_MultiLevelInheritance;

public class Box {
    int length;
    int height;
    int breadth;

    Box() {
        length = 0;
        height = 0;
        breadth = 0;

    }

    Box(int l, int h, int b){
        length = l;
        breadth = b;
        height = h;
    }

    Box(Box ob) {
        this.length = ob.length;
        this.breadth = ob.breadth;
        this.height = ob. height;
    }

    public int volume(){
        return length * breadth * height;
    }
}
