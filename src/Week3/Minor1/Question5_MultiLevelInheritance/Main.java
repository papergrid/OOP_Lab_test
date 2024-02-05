package Week3.Minor1.Question5_MultiLevelInheritance;

public class Main {
    public static void main(String[] args){
        Shipment ob1 = new Shipment(3, 3, 3, 5, 10);
        Shipment ob2 = new Shipment(ob1);

        ob2.cost = ob2.cost+10;
        ob1.displayCost();
        ob1.displayWeight();

        int vol1 = ob1.volume();
        System.out.println("Volume of ob1 = " + vol1);
        ob2.displayCost();
        ob2.displayWeight();

        int vol2 = ob2.volume();
        System.out.println("Volume of ob2 = " + vol2);
    }
}
