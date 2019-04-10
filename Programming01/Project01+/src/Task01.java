
// DONE

import processing.core.*;
import javax.swing.*;

public class Task01 extends PApplet {

    final int MIN_SIZE_OF_STAR = 0;
    final int MAX_SIZE_OF_STAR = 100;

    float outerRadius,
          innerRadius,
          numberOfRays,
          angle,
          angleDiff;

    int variableForAnimation = 0,
        variableForAnimationOfBig = 0,
        speedOfAnimation = 5;

    boolean isMainStar = false;

    public static void main(String[] args) {
        PApplet.main("Task01");
    }
    public void settings(){
        fullScreen();
    }
    public void setup() {
        outerRadius = Integer.parseInt(JOptionPane.showInputDialog("Enter the diameter of a main star"));
        innerRadius = outerRadius * 0.4f;
        numberOfRays = Integer.parseInt(JOptionPane.showInputDialog("Enter number of rays"));
        angle = 0;
        angleDiff = 360 / numberOfRays;
    }
    public void draw(){
        background(0);
        stroke(255, 0, 0);      //USE HEXADECIMAL
        strokeWeight(10);

        drawStar(width/2, height/2, true);
        stroke(255, 0, 255);
        drawStar(width/4, height/4, false);
        drawStar(3*width/4, 3*height/4, false);
        drawStar(width/4, 3*height/4, false);
        drawStar(3*width/4, height/4, false);
        animate();
    }
    public void drawStar(int translateX, int translateY, boolean isBig){
        translate(translateX, translateY);
        float multiplier = 0.5f;
        int IDKHowToNameThisVariable = isBig ? variableForAnimationOfBig : variableForAnimation;
        if(isBig){
            multiplier = 1;
            this.isMainStar = isBig;}
        float prevX = cos(radians(angle - angleDiff)) * (innerRadius + IDKHowToNameThisVariable / 2) * multiplier;
        float prevY = sin(radians(angle - angleDiff)) * (innerRadius + IDKHowToNameThisVariable / 2) * multiplier;
        for(int i = 0; i < numberOfRays; i++, angle += angleDiff){
            float radius = (i % 2 == 0 ? outerRadius + IDKHowToNameThisVariable: innerRadius + IDKHowToNameThisVariable / 2) * multiplier;
            float nextX = cos(radians(angle)) * radius;
            float nextY = sin(radians(angle)) * radius;
            line(0, 0, nextX, nextY);
            line(nextX, nextY, prevX, prevY);
            prevX = nextX;
            prevY = nextY;
        }
        translate(-translateX, -translateY);
    }
    public void animate(){
        if(variableForAnimation > MAX_SIZE_OF_STAR || variableForAnimation < MIN_SIZE_OF_STAR)
            speedOfAnimation = -speedOfAnimation;
        variableForAnimation += speedOfAnimation;
        variableForAnimationOfBig -= speedOfAnimation;
    }
}
