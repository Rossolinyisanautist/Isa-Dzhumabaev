import processing.core.*;

public class Main extends PApplet{
    final int NUMBER_OF_CIRCLES = 100;
    int minDiameter = 10,
        maxDiameter = 100,
        red, green, blue;
    public static void main(String[] args) {
        PApplet.main("Main");

    }
    public void draw(){

    }
    public void settings(){
        fullScreen();
    }
    public void setup(){
        background(0);
        for(int i = 0; i < NUMBER_OF_CIRCLES; i++){
        int diameter = (int)(minDiameter + Math.random() * (maxDiameter - minDiameter + 1));
        int radius = diameter/2;
        int x = (int)(-radius + Math.random() * (width + radius) );
        int y = (int)(-radius + Math.random() * (height + radius) );
        int red = (int)(Math.random()*255);
        int green = (int)(Math.random()*255);
        int blue = (int)(Math.random()*255);
        noStroke();
        fill(red,green,blue);
        ellipse(x,y,diameter,diameter);
        fill(0);}
    }
}
