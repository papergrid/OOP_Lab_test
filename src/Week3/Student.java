package Week3;

public class Student {
    static String collegename="NIT ANP";
    int rollno;

    void display(){
        System.out.println("College name:"+collegename);
        System.out.println("Roll no:"+ rollno);
    }

    static void changeCollege(String clgname){
        collegename=clgname;
    }

    public static void main(String[] args){
        Student ob = new Student();
        ob.rollno=80;
        ob.display();
        Student.changeCollege("NIT AP");
        ob.display();
    }
}

