//A simple program which prints a timeout message
import java.util.*;
import java.awt.Toolkit;
public class ProgTimer{
      Toolkit toolkit;
      Timer timer;

      public ProgTimer(int seconds){
            toolkit=Toolkit.getDefaultToolkit();
            timer=new Timer();
            timer.schedule(new ReminderTask(),seconds*1000);
      }

          class ReminderTask extends TimerTask{//class remindertask extending parent class TimerTask
      
                 public void run(){//overrides run method of parent class
                        System.out.println("Timeout");
                        toolkit.beep();
                        System.exit(0);
                 }
           }
 
               public static void main(String []args){
                     System.out.println("About to shedule task");
                     new ProgTimer(5);//passing 5 in constructor of ProgTimer class
                     System.out.println("Task sheduled");
               }

} 
