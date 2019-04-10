
// DONE

import processing.core.*;

public class Task05 extends PApplet{
    final int NUMBER_OF_CIRCLES = 50;
    final int MAX_DIAMETER = 300;
    final int MIN_DIAMETER = 50;
    final int DEEPNES_OF_COLOR = 75;

    int shadeDelta = 255 / DEEPNES_OF_COLOR;
    int red = 0,
        green = 0,
        blue = 0;
    public static void main(String[] args) {
        PApplet.main("Task05");
    }
    public void draw(){
        fill(0,25);
        rect(0,0, width, height);
        for(int i = 0; i < NUMBER_OF_CIRCLES; i++){
            red = 0;
            green = 0;
            blue = 0;
            int x = (int)(Math.random() * width);
            int y = (int)(Math.random() * height);
            int diameter = MIN_DIAMETER + (int)(Math.random() * (MAX_DIAMETER - MIN_DIAMETER + 1));
            int randomColor = (int)(Math.random() * 3);
            drawCircles(x, y, randomColor, diameter);
        }
    }
    public void settings(){
        fullScreen();
    }
    public void setup(){
        background(0);
    }
    public void drawCircles(int x, int y, int random, int diameter) {
        int delta = diameter / DEEPNES_OF_COLOR;
        translate(x, y);
        for (int j = 0; j < DEEPNES_OF_COLOR; j++) {
            noStroke();
            if (random == 0) {
                red += shadeDelta;
            } else if (random == 1) {
                green += shadeDelta;
            } else {
                blue += shadeDelta;
            }
            fill(red, green, blue);
            ellipse(0, 0, diameter, diameter);
            diameter -= delta;
        }
    }
}
