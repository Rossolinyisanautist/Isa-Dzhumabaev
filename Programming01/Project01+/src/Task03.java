
// DONE

import processing.core.*;

public class Task03 extends PApplet{
    final int numOfCircles = 9;
    final int diameterX = 150;

    int[] diametersY = new int[numOfCircles];
    int[] deltas = new int[numOfCircles];

    int delta = 25;

    public static void main(String[] args){

        PApplet.main("Task03");
    }
    public void draw(){
        background(0);
        stroke(255,0,0);
        strokeWeight(5);
        int toSubtract = diameterX;
        for(int i = 0, j = i; i < numOfCircles; i++, j++){
            if(i == 5){
                toSubtract = -diameterX;
                j -= 4;
            }
            float shade = map(diametersY[i], -diameterX*5, diameterX * 5, 100, 255);
            fill(shade, 0, 0);
            ellipse(width / 2 + j * toSubtract, height / 2, diameterX, diametersY[i] / 2);
        }
        animate();
    }
    public void settings(){
        fullScreen();
    }
    public void setup(){
        for(int i = 0; i < numOfCircles; i++){
            deltas[i] = i > 4 ? -delta : delta;
        }
        for(int i = 1; i <= 5; i++){
            diametersY[i - 1] = diameterX * (6 - i);
            diametersY[i + 3] = diameterX * (6 - i);
        }
    }
    public void animate(){
        for(int i = 0; i < numOfCircles; i++){
            if(diametersY[i] > diameterX * 5 || diametersY[i] < -diameterX * 5){
                deltas[i] = -deltas[i];
            }
        diametersY[i] += deltas[i];
        }
    }
}