package consult_01.innerClasses.nonInnerClasses;

public class BicycleDemo {
    public static void main(String[] args) {
        HandBar handBar = new HandBar();

        Seat seat = new Seat();

        Bicycle bicycle = new Bicycle("model1",4,handBar,seat);

        bicycle.getHandBar().right();
        // равносильно
        //handBar.right();

        /*
        теряется логика программы, потому что получается, что мы можем
        создать отдельно руль, который будет существовать сам по себе
        и поворачивать направо / налево без основного объекта - велосипеда
         */
//
//        Seat seat1 = new Seat();
//        seat1.up();

    }
}
