import java.time.LocalTime;

public class CuckooClock extends Clock {
    public void TellMeTime(){
        LocalTime currentTime = LocalTime.now();

        System.out.println("Current time: "+currentTime);

        int hour = currentTime.getHour();
        System.out.println("it will dings " + hour + " hour time");
    }
    
}
