package task2;

public class Guitar implements Instrument{
    int AmountOfStrings;

    public Guitar(int amountOfStrings) {
        AmountOfStrings = amountOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Грає гітара з " + AmountOfStrings + " струнами");
    }
}
