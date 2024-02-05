package Week3.Minor1;

public class Question3_NestedClass {
    public void printNaturalNumbers() {
        for(int i=1; i<=10; i++) {
            int finalI = i;
            class InnerClass {
                public void display() {
                    System.out.println(finalI);
                }
            }
            InnerClass obj = new InnerClass();
            obj.display();
        }
    }

    public static void main(String[] args){
        Question3_NestedClass obj1 = new Question3_NestedClass();
        obj1.printNaturalNumbers();
    }
}
