import java.util.Scanner;
import processing.core.*;
public class Main extends PApplet{
    int diameter = 1000;
    int numOfCircles = 20;
    int diff = diameter/numOfCircles;
    int red = 0;
    int diffRed = 255/numOfCircles;
    public static void main(String[] args){
        PApplet.main("Main");
    }
    public void draw(){
        for (; diameter > 50; diameter -= diff){
            noStroke();
            fill(red,0,0);
            ellipse(width/2, height/2, diameter,diameter);
            red += diffRed;
        }
    }
    public void settings(){
        fullScreen();
    }
    public void setup(){
        background(0);
    }
}
