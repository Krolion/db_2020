package radiobudilnik;

public class Radio implements GeneralRadio{

    public void setVolume() {
        System.out.println("Volume set on radio");
    }

    public void changeChannel() {
        System.out.println("Channel changed");
    }
}
