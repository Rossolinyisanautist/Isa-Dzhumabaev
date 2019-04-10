
// DONE

import processing.core.*;
import javax.swing.*;

public class Task07 extends PApplet {
    final int NUMBER_OF_POINTS = Integer.parseInt(JOptionPane.showInputDialog("N:"));
    final int NUMBER_OF_LINES = Integer.parseInt(JOptionPane.showInputDialog("M:"));
    int diameter = 700;
    int angle = 0;
    int angleDelta = 360 / NUMBER_OF_POINTS;
    int angleForAnimation = 0;
    int speedOfRotation = 10;
    public static void main(String[] args) {
        PApplet.main("Task07");
    }
    public void settings(){
        fullScreen();
    }
    public void setup(){
    }
    public void draw(){
        background(0);
        translate(width/2, height/2);
        stroke(255,0,0);
        strokeWeight(5);
        rotate(angleForAnimation += speedOfRotation);
        for(int i = 0; i < NUMBER_OF_POINTS; i++){
            int x = (int)(cos(radians(angle += angleDelta)) * diameter / 2);
            int y = (int)(sin(radians(angle)) * diameter / 2);
            int x2 = (int)(cos(radians(angle + NUMBER_OF_LINES * angleDelta)) * diameter / 2);
            int y2 = (int)(sin(radians(angle + NUMBER_OF_LINES * angleDelta)) * diameter / 2);
            line(x,y,x2,y2);
        }
        if(angleForAnimation >= 360){
            angleForAnimation = 0;
        }
    }
}
