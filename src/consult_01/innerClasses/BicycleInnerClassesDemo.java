package consult_01.innerClasses;

public class BicycleInnerClassesDemo {
    public static void main(String[] args) {


        BicycleInnerClasses myBicycle = new BicycleInnerClasses("super model",3);

        BicycleInnerClasses.HandBar handBar = myBicycle.new HandBar(true);

        BicycleInnerClasses.Seat seat = myBicycle.new Seat();

        handBar.right();
        seat.up();
        myBicycle.start();

        System.out.println("Класс, который Java считает что мы создали: " + handBar.getClass());
        System.out.println("Класс, который Java считает что мы создали: " + seat.getClass());

    }
}
