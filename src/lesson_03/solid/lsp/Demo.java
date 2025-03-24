package lesson_03.solid.lsp;

public class Demo {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10,7);

        Square square = new Square(5);


    }

    static void printArea(int width, int height){
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.area());
    }
}
