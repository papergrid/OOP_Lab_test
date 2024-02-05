package Week3.Minor1.Question5_MultiLevelInheritance;

public class Shipment extends BoxWeight{
    int cost;

    Shipment() {
        super();
        cost = 0;
    }

    Shipment(int l, int h, int b, int w, int c){
        super(l,h,b,w);
        cost = c;
    }

    Shipment(Shipment ob){
        super(ob);
        this.cost = ob.cost;
    }

    public void displayCost(){
        System.out.println("Cost = " + cost);
    }
}
