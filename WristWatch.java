public class WristWatch extends Clock {
    private double Angle;
    
    public void TellMeTime(){
        super.TellMeTime();

        int hour = getHour();
        int minute = getMinute();

        double hourAngle = (hour %12 + minute /60.0)*360/12;
        double minuteAngle =(minute / 60.0)*360;

        Angle = Math.abs(hourAngle - minuteAngle);
        System.out.println("The angle between clock arms: " + Angle + " degrees");
        

    }
    
}
