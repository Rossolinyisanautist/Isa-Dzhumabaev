import processing.core.PApplet;

class Field extends Cell{

    private static final int DEFAULT_NUMBER_OF_CELLS = 50;

    private int numberOfCells;

    Field(PApplet applet){
        super(DEFAULT_NUMBER_OF_CELLS, DEFAULT_NUMBER_OF_CELLS,
                PApplet.min(applet.width / Field.DEFAULT_NUMBER_OF_CELLS, applet.height / Field.DEFAULT_NUMBER_OF_CELLS)); // CELL SIZE

        numberOfCells = DEFAULT_NUMBER_OF_CELLS;
    }
    int getNumberOfCells(){
        return numberOfCells;
    }
    int getCellSize(){
        return super.getSize();
    }
}




