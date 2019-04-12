public class Cell {

    static final int COLOR = 0xff01b20c;
    static final int STROKE = 0xff009909;

    private int size;

    private int width, height;

    Cell(int width, int height, int size){
        this.size = size;
        this.width = width;
        this.height = height;
    }
    int getSize() {
        return size;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }
}

