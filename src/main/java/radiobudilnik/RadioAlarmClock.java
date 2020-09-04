package radiobudilnik;

import model.GameManager;
import model.Hero;
import model.HeroFactory;

public class RadioAlarmClock {

    private final Radio radioPart;
    private final AlarmClock alarmClockPart;

    public RadioAlarmClock() {
        radioPart = new Radio();
        alarmClockPart = new AlarmClock();
    }

    public Radio useRadio() {
        return radioPart;
    }

    public AlarmClock useAlarmClock() {
        return alarmClockPart;
    }

    public static void main(String[] args) {
        RadioAlarmClock iphone = new RadioAlarmClock();
        iphone.useAlarmClock().stopAlarm();
        iphone.useRadio().changeChannel();
    }
}
