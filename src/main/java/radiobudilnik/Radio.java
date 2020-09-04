package radiobudilnik;

public class Radio implements GeneralRadio{

    @Override
    public void setVolume() {
        System.out.println("Volume set on radio");
    }

    @Override
    public void changeChannel() {
        System.out.println("Channel changed");
    }
}
