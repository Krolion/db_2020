package my_spring;

public class ConsoleSpeakerWithBenchmark implements Speaker {
    @Override
    public void speak(String message) {
        ConsoleSpeaker consoleSpeaker = new ConsoleSpeaker();
        long start = System.nanoTime();
        consoleSpeaker.speak(message);
        System.out.println(System.nanoTime() - start);
    }
}
