package consult_01.innerClasses;

public class BicycleInnerClasses {
    private String model;

    private int weight;

    public BicycleInnerClasses(String model, int weight) {
        this.model = model;
        this.weight = weight;
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

    // -------- создание внутренних классов -----

    public class HandBar {

        private boolean isClean;

        public HandBar(boolean isClean) {
            this.isClean = isClean;
        }

        public void right(){
            System.out.println("Turn right");
        }

        public void left(){
            System.out.println("Turn left");
        }

    }

    public class Seat {

        public void up(){
            System.out.println("Сиденье поднято вверх");
        }

        public void down(){
            System.out.println("Сиденье опущено вниз");
        }

    }

}
