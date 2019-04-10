
// DONE // PERFECT;

import processing.core.*;

import javax.swing.*;

public class Task01 extends PApplet{
    int N = Integer.parseInt(JOptionPane.showInputDialog("Enter number Of stars"));

    final int MAX_SPEED = 5;
    final int MIN_SPEED = -5;
    final int MAX_RADIUS = 20;
    final int MIN_RADIUS = 5;
    final int MAX_ROTATE_SPEED = 10;
    final int MIN_ROTATE_SPEED = -10;
    final int NUMBER_OF_RAYS = 8;

    int[] x = new int[N];           int[] y = new int[N];
    int[] speedX = new int[N];      int[] speedY = new int[N];

    int[] angles = new int[N];
    int[] angleForRotation = new int[N];
    int[] speedOfRoatation = new int[N];

    int[] radius = new int[N];

    int[] red = new int[N];
    int[] grren = new int[N];
    int[] blue = new int[N];

    public static void main(String[] args){
        PApplet.main("Task01");
    }
    public void settings(){
        fullScreen();
    }
    public void setup(){
        background(0);
        for(int i = 0; i < N; i++){
            radius[i] = (int)random(MIN_RADIUS,MAX_RADIUS);

            x[i] = (int)random(radius[i],width - radius[i]);          y[i] = (int)random(radius[i],height - radius[i]);
            speedX[i] = (int)random(MIN_SPEED,MAX_SPEED);                   speedY[i] = (int)random(MIN_SPEED,MAX_SPEED);
            if(speedX[i] == 0){
                speedX[i]++;
            }
                                                                            if(speedY[i] == 0){
                                                                                speedY[i]++;
                                                                            }
            angles[i] = (int)random(0,360);
            angleForRotation[i] = (int)(random(0,360));
            speedOfRoatation[i] = (int)random(MIN_ROTATE_SPEED,MAX_ROTATE_SPEED);
            if(speedOfRoatation[i] == 0){
                speedOfRoatation[i] += 1;
            }

            red[i] = (int)random(0,255);
            grren[i] = (int)random(0,255);
            blue[i] = (int)random(0,255);
        }
    }
    public void draw(){
        background(0);
        strokeWeight(2);
        stroke(255);
        for(int j = 0; j < N; j++){
            for(int i = 0; i < NUMBER_OF_RAYS; i++){
                stroke(red[j],grren[j],blue[j]);
                int angleDelta = 360 / NUMBER_OF_RAYS;
                int newX = (int) (x[j] + cos(radians(angles[j])) * radius[j]);
                int newY = (int) (y[j] + sin(radians(angles[j])) * radius[j]);
                line(x[j], y[j],newX,newY);
                angles[j] += angleDelta;
            }
        }
        animation();
    }
    public void animation(){
        for(int i = 0; i < N; i++){
            angles[i] += speedOfRoatation[i];
            x[i] += speedX[i];
            if(x[i] > width - radius[i] || x[i] < radius[i]){
                speedX[i] = -speedX[i];
            }
            y[i] += speedY[i];
            if(y[i] > height - radius[i] || y[i] < radius[i]){
                speedY[i] = -speedY[i];
            }
        }
    }
}
