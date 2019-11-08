import java.util.Random; 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Main{
public static void main(String[] args){
    System.out.println("Hello");

int dogCount = 1;
System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

int catCount = 2;
System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

int turtleCount = 0;
System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

System.out.println(flipNHeads(1));

for(int i=0;i>=0;i++){
    try
    {
    Thread.sleep(1000);
   System.out.println(Clock());
    }
    catch(InterruptedException ex)
    {
    Thread.currentThread().interrupt();
    }
}

}
public static String pluralize(String word, int count1){
    if (count1 == 0 || count1 > 1){
    return word+"s";
    }
    else{
    return word;
    }   
}

public static String flipNHeads(int n){
int headsCount=0;
int tailsCount=0;
do{
    // create instance of Random class 
    Random rand = new Random(); 
    // Generate random integers in range 0 to 100 
    int randInt = rand.nextInt(10);
    double randDouble=((double)randInt/10);
    if(randDouble<0.5){
    tailsCount++;
    System.out.println("tails");
    }
    else{
    headsCount++;
    System.out.println("heads");
    }
    } while(headsCount<n);
            return "It took "+Integer.toString(tailsCount+headsCount)+" flips to flip "+ Integer.toString(n)+ " heads in a row.";
}

public static String Clock(){
LocalDateTime now = LocalDateTime.now();
int hour = now.getHour();
int minute = now.getMinute();
int second = now.getSecond();
String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
return time;
}

}
