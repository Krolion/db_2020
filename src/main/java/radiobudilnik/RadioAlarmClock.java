package radiobudilnik;

public class RadioAlarmClock implements GeneralAlarmClock, GeneralRadio {

    private final Radio radioPart;
    private final AlarmClock alarmClockPart;

    public RadioAlarmClock() {
        radioPart = new Radio();
        alarmClockPart = new AlarmClock();
    }

    @Override
    public void setVolume() {
        this.radioPart.setVolume();
    }

    @Override
    public void changeChannel() {
        this.radioPart.changeChannel();
    }

    @Override
    public void setTime() {
        this.alarmClockPart.setTime();
    }

    @Override
    public void stopAlarm() {
        this.alarmClockPart.stopAlarm();
    }
}
