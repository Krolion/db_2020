package radiobudilnik;

public class AlarmClock implements GeneralAlarmClock{

    public void setTime() {
        System.out.println("Time set on alarm clock");
    }

    public void stopAlarm() {
        System.out.println("PIP-PIP-pip-pip-...");
    }
}
