package task2;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = {
          new Guitar(6),
                new Drum(50),
                new Trumpet(20)
        };
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
