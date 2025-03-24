package lesson_03.solid.lsp;

public class Square  extends Rectangle{
    public Square(int width) {
        super(width, width);
    }

    @Override
    public int area() {
        return getWidth() * getWidth();
    }
}
