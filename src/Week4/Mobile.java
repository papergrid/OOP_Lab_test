package Week4;

import java.util.*;
interface MusicPlayer {
    void PlayPause_Button(int choice);
    void ForwardReverse_button(int choice);
    void volume(int num);
}

interface Clock {
    void alarm(String time);
    void current_time();
}

public class Mobile implements MusicPlayer, Clock{
    public void PlayPause_Button(int choice){
        if (choice==1){
            System.out.println("Music PLaying");
        }
        else if (choice==0){
            System.out.println("Pause button clicked");
        }
        else{
            System.out.println("Invalid");
        }
    }

    public void ForwardReverse_button(int choice){
        if (choice==1){
            System.out.println("Playing Next Song");
        }
        else if (choice==0){
            System.out.println("Playing previous song");
        }
        else{
            System.out.println("Invalid");
        }
    }

    public void volume(int num){
        System.out.println("Current volume is: "+num);
    }

    public void alarm(String time){
        System.out.println("Alarm set for: "+time);
    }

    public void current_time(){
        System.out.println(java.time.LocalTime.now());
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter time for alarm");
        String alarmtime=sc.nextLine();
        System.out.println("ENter choice for play or pause");
        int choice1=sc.nextInt();
        System.out.println("ENter choice for forward or reverse");
        int choice2=sc.nextInt();

        Mobile obj=new Mobile();
        obj.PlayPause_Button(choice1);
        obj.ForwardReverse_button(choice2);
        obj.alarm(alarmtime);
        obj.current_time();
    }
}
