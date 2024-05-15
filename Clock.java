import java.util.Date;
import java.text.SimpleDateFormat;

public class Clock {
    private int Hour;
    private int Minute;
    
    public void TellMeTime(){
        Date currentTime = new Date();
        SimpleDateFormat hourFormat = new SimpleDateFormat("HH");
        SimpleDateFormat minuteFormat = new SimpleDateFormat("mm");

        Hour = Integer.parseInt(hourFormat.format(currentTime));
        Minute = Integer.parseInt(minuteFormat.format(currentTime));

    }

    public int getHour(){
        return Hour;
    }
    public void setHour(int hour){
        Hour = hour;
    }

    public int getMinute(){
        return Minute;
    }
    public void setMinute(int minute){
        Minute = minute;
    }

    public static void main(String[]args){
        Clock myClock = new Clock();

        myClock.TellMeTime();
        int hour = myClock.getHour();
        int minute = myClock.getMinute();
        System.out.println("Current time: " + hour + ":" + minute);

        Sundial mySundial = new Sundial();
        mySundial.TellMeTime();
        
        WristWatch myWristWatch = new WristWatch();
        myWristWatch.TellMeTime();

        CuckooClock myCuckooClock = new CuckooClock();
        myCuckooClock.TellMeTime();
    }
    
}
