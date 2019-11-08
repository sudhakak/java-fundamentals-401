import java.util.Calendar;
import java.text.SimpleDateFormat;


public class Basics {
public static void main(String[] args) {
System.out.println("Hello world!");
if(isGingerCold()){
    System.out.println("Get ginger a sweater");
}
else{
    System.out.println("May be we should shave");
}

    }
   public static boolean isGingerCold(){
       Calendar cal = Calendar.getInstance();

       String currentMonth = new SimpleDateFormat("MMM").format(cal.getTime());
       
       if(currentMonth.equals("Nov") || currentMonth.equals("Dec") || currentMonth.equals("Jan") || currentMonth.equals("Feb")){
           return true;
       }
       else{
           return false;
       }
   } 
}