package Week2.Method_Overwriting;

public class Main {
    public static void main(String[] args){
        Animal a = new Animal();
        Animal cow = new Animal("Cow");
        Cow c = new Cow();
        a.makeSound();
        cow.makeSound();
        c.makeSound();
    }
}
