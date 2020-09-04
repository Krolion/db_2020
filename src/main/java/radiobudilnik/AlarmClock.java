package radiobudilnik;

public class AlarmClock implements GeneralAlarmClock{

    @Override
    public void setTime() {
        System.out.println("Time set on alarm clock");
    }

    @Override
    public void stopAlarm() {
        System.out.println("PIP-PIP-pip-pip-...");
    }
}
