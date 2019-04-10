
// DONE

import processing.core.*;

public class Task02 extends PApplet {
    int x[] = new int[3];
    int y[] = new int[3];
    int speedsOfX[] = new int[3],    speedOfX = 10;
    int speedsOfY[] = new int[3],    speedOfY = 10;
    int diameter = 50;
    int radius = diameter / 2;
    public static void main(String[] args) {
        PApplet.main("Task02");
    }
    public void settings(){
        fullScreen();
    }
    public void setup(){
        x[0] = width/2;                     y[0] = height/2;
        x[1] = x[0] + diameter;               y[1] = y[0] + diameter;
        x[2] = x[1] + diameter;               y[2] = y[1] + diameter;
        for(int i = 0; i < speedsOfX.length; i++){
            speedsOfX[i] = speedOfX;
            speedsOfY[i] = speedOfY;
        }
    }
    public void draw(){
        background(0);
        fill(255,0,0);
        ellipse(x[0], y[0],diameter,diameter);
        fill(0,255,0);
        ellipse(x[1],y[1],diameter,diameter);
        fill(0,0, 255);
        ellipse(x[2],y[2],diameter,diameter);

        for(int i = 0; i < 3; i++){
            x[i] += speedsOfX[i];
            y[i] += speedsOfY[i];
            if(x[i] >= width - radius || x[i] <= radius){
                speedsOfX[i] = -speedsOfX[i];
            }
            if(y[i] >= height - radius || y[i] <= radius){
                speedsOfY[i] = -speedsOfY[i];
            }
        }
    }
}
