
// DONE

import processing.core.*;
import javax.swing.JOptionPane;

public class Task06 extends PApplet {
    final int NUMBER_OF_ELLIPSES = Integer.parseInt(JOptionPane.showInputDialog("Enter number of circles")) * 2;
    float angle = 360 / NUMBER_OF_ELLIPSES;
    float angleForAnimation = 0;
    float speedOfAnimation = 5;
    public static void main(String[] args) {
        PApplet.main("Task06");
    }
    public void settings(){
        fullScreen();
    }
    public void setup(){}
    public void draw(){
        background(0);
        noStroke();
        fill(255,0,0,20);
        translate(width/2, height/ 2);
        rotate(radians(angleForAnimation));
        for(int i = 0; i < NUMBER_OF_ELLIPSES; i++){
            ellipse(0, 0, 600,125);
            rotate(radians(angle));
        }
        angleForAnimation += speedOfAnimation;
        if(angleForAnimation > 360)
            angleForAnimation = 0;
    }
}

