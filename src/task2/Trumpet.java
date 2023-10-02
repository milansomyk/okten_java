package task2;

public class Trumpet implements Instrument{
    int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Грає труба з діаметром "+ diameter);
    }
}
