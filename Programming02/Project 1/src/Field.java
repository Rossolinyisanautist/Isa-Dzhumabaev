import processing.core.PApplet;

class Field extends Cell{

    private static final int DEFAULT_NUMBER_OF_CELLS = 50;

    private int numberOfCells;

    Field(PApplet applet){
        super(DEFAULT_NUMBER_OF_CELLS, DEFAULT_NUMBER_OF_CELLS,
                PApplet.min(applet.width / Field.DEFAULT_NUMBER_OF_CELLS,    // CELL SIZE
                            applet.height / Field.DEFAULT_NUMBER_OF_CELLS)); // CELL SIZE

        numberOfCells = DEFAULT_NUMBER_OF_CELLS;
    }

    boolean isPointInside(float x, float y){
        return x >= 0 && x < getWidth() &&
               y >= 0 && y < getHeight();
    }
    int getNumberOfCells(){
        return numberOfCells;
    }
    int getCellSize(){
        return super.getSize();
    }
}




