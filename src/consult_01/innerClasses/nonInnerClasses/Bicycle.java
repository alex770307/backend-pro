package consult_01.innerClasses.nonInnerClasses;

public class Bicycle {
    private String model;

    private int weight;

    private HandBar handBar;

    private Seat seat;

    public Bicycle(String model, int weight, HandBar handBar, Seat seat) {
        this.model = model;
        this.weight = weight;
        this.handBar = handBar;
        this.seat = seat;
    }

    public void start(){
        System.out.println("Поехали!");
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public HandBar getHandBar() {
        return handBar;
    }

    public Seat getSeat() {
        return seat;
    }
}
