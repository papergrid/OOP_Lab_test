package Week3.Minor1;

public class Question2_Factorial {
    public int factorial(int n) {
        if (n==0)
            return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Question2_Factorial f = new Question2_Factorial();
        System.out.println("Factorial of 5: " + f.factorial(5));
        System.out.println("Factorial of 10: " + f.factorial(10));
    }
}

