import java.time.LocalTime;

public class Sundial extends Clock {
    public void TellMeTime(){
        LocalTime currentTime = LocalTime.now();
        LocalTime midday = LocalTime.of(12,0);
        
        if(currentTime.isBefore(midday)){
            System.out.println("Before midday");
        }
        else{
            System.out.println("After midday");
        }

    }
    
}
