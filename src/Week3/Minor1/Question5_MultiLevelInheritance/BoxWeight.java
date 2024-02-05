package Week3.Minor1.Question5_MultiLevelInheritance;

public class BoxWeight extends Box{
    int weight;

    BoxWeight(){
        super();
        weight=0;
    }

    BoxWeight(int l, int h, int b, int w){
        super(l, h, b);
        weight = w;
    }

    BoxWeight(BoxWeight obj){
        super(obj);
        this.weight = obj.weight;
    }

    public void displayWeight(){
        System.out.println("Weight = " + weight);
    }
}
