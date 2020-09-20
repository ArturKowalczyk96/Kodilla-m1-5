import java.time.LocalTime;

public class Clock {
    public LocalTime clock;

    public Clock(int hour, int minute){
        this.clock = LocalTime.of(hour, minute);
    }

    @Override
    public String toString(){
        return "Clock is set to: " + clock;
    }

    public void addOneMinute(){
        clock = clock.plusMinutes(1);
        System.out.println("Clock is set to: " + clock);
    }
}
