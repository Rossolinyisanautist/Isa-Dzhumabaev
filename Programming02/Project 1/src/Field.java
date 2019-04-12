public class Field {

    static final int DEFAULT_WIDTH = 50;
    static final int DEFAULT_HEIGHT = 50;
    private static final int DEFAULT_COLOR = 0x00cc0d;
    private int cellSize;
    private int width, height;
    private int color;

    Field(int cellSize){
        this(DEFAULT_WIDTH, DEFAULT_HEIGHT, cellSize);
    }
    Field(int width, int height, int cellSize){
        this.width = width;
        this.height = height;
        this.cellSize = cellSize;
        color = DEFAULT_COLOR;
    }
    public void setColor(int color){
        this.color = color;
    }
    int getWidth() {
        return width;
    }
    int getHeight() {
        return height;
    }
    int getColor() {
        return color;
    }
    int getCellSize() {
        return cellSize;
    }
}
