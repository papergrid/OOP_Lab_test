package Week3;

public class Student {
    static String collegename="NIT ANP";
    int rollno;
    String name;

    Student(int roll, String n){
        rollno=roll;
        name=n;
    }
    void display(){
        System.out.println("College name:"+collegename);
        System.out.println("Roll no:"+ rollno);
        System.out.println("Name:"+name);
    }

    static void changeCollege(String clgname){
        collegename=clgname;
    }

    public static void main(String[] args){
        Student ob = new Student(80, "Veeraja");
        ob.display();
        Student.changeCollege("NIT AP");
        ob.display();
    }
}

