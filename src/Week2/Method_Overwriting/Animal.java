package Week2.Method_Overwriting;

public class Animal {
    String name;
    Animal(){
        name = "";
    }
    Animal(String name){
        this.name = name;
    }

    public void makeSound(){
        System.out.println("AAAAAA");
    }
}
