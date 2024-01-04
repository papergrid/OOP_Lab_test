package Week1.Calculator;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.printf("Sum=%d\nDifference=%d\nProduct=%d\nQuotient=%d\n", calc.add(x, y), calc.subtract(x, y), calc.multiply(x, y), calc.divide(x, y));
    }
}
