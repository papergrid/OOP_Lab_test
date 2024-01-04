package Week1;

import java.util.*;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.print("Enter name:");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.printf("Hi %s\n",name);
    }
}
