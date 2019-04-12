import processing.core.PApplet;

class Draw {

    static void field(PApplet applet, Field field){

        float cellSize = field.getCellSize();
        float fieldWidth = cellSize * field.getWidth();
        float fieldHeight = cellSize * field.getHeight();
        float shiftX = (applet.width - fieldWidth) / 2;
        float shiftY = (applet.height - fieldHeight) / 2;
        for(int y = 0; y < field.getHeight(); y++){
            for(int x = 0; x < field.getWidth(); x++){
                float cellX = shiftX + x * cellSize;
                float cellY = shiftY + y * cellSize;

                applet.fill(12, 188, 0);
                applet.rect(cellX, cellY, cellSize, cellSize);
            }
        }
    }
}
