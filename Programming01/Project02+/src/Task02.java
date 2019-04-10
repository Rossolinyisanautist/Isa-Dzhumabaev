
// DONE // PERFECT

import processing.core.*;

public class Task02 extends PApplet {
    final int NUMBER_OF_STARS = 50;

    int maxRays = 12;
    int minRays = 8;
    int angle = 0;
    int[] rotateAngle = new int[NUMBER_OF_STARS];
    int[] x = new int[NUMBER_OF_STARS];
    int[] y = new int[NUMBER_OF_STARS];
    int[] radius = new int[NUMBER_OF_STARS];
    int[] yDelta = new int[NUMBER_OF_STARS];
    int[] numberOfRays = new int[NUMBER_OF_STARS];
    int[] angles = new int[NUMBER_OF_STARS];

    public static void main(String[] args) {
        PApplet.main("Task02");
    }
    public void settings() {
        fullScreen();
    }
    public void setup() {
        //to make sure that number of rays will be even
        maxRays /= 2;
        minRays /= 2;
        // fill all arrays with random values;
        for (int i = 0; i < NUMBER_OF_STARS; i++) {
            x[i] = (int) (Math.random() * width);
            y[i] = (int) (Math.random() * -height);
            radius[i] = (int) (10 + Math.random() * (50 - 20 + 1));
            rotateAngle[i] = (int) (-10 + (Math.random() * (10*2)));
            angles[i] = (int)(Math.random() * 90);
            yDelta[i] = (int)(2 + Math.random() * 3);
            numberOfRays[i] = (int)(minRays + (Math.random() * (maxRays - minRays + 1))) * 2;
        }
    }
    public void draw() {
        background(0);
        stroke(255);
        strokeWeight(3);
        for(int i = 0; i < NUMBER_OF_STARS; i++){
            drawStar(x[i], y[i], radius[i], numberOfRays[i], angles[i]);
            y[i] = animation(y[i], yDelta[i], radius[i]/*, false*/);
            if (rotateAngle[i] == 0){
                rotateAngle[i] += 2;
            }
            angles[i] += rotateAngle[i];
        }
    }
    public int animation(int y, int yDelta, int radiusOfStar){
                y += yDelta;
                if(y > height + radiusOfStar){
                    y = -radiusOfStar;
            }
            return y;
    }
    public void drawStar(int x, int y, int radius, int numberOfRays, int angle){
        int angleDelta = 360 / numberOfRays;
        float prevX = (x + cos(radians(angle - angleDelta)) * 0.5f * radius);
        float prevY = (y + sin(radians(angle - angleDelta)) * 0.5f * radius);
        for (int j = 0; j < numberOfRays; j++) {
            float radius2 = j % 2 == 0 ? radius : 0.5f * radius;
            float newX = x + cos(radians(angle)) * radius2;
            float newY = y + sin(radians(angle)) * radius2;
            line(x, y, newX, newY);
            line(newX, newY, prevX, prevY);
            prevX = newX;
            prevY = newY;
            angle += angleDelta;
        }
    }
    public int getRandomX(int number, int y, int radius){
        if(y > height + radius) {
            return (int) (Math.random() * width);
        } else
            return number;
    }
}