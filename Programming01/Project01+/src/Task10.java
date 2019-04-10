import processing.core.*;

public class Task10 extends PApplet {
    int N = 2;
    final int SPEED = 5;
    int angleDiff = 3;

    int lengthOfSide = 300 / N;
    int speedX = SPEED;
    int speedY = SPEED;
    int angle = 0;
    int angle2 = 0;
    int[] x = new int[N];
    int[] y = new int[N];

    public static void main(String[] args) {
        PApplet.main("Task10");
    }
    public void settings(){
        fullScreen();
    }
    public void setup(){
        for(int i = 0; i < N; i++){
            x[i] = (i+1) * (lengthOfSide + lengthOfSide / 2); //+ xStart;
            y[i] = (i+1) * (lengthOfSide + lengthOfSide / 2); //+ yStart;
        }
        background(0);
    }
    public void draw(){

        fill(0, 15);
        rectMode(CORNER);
        rect(0,0, width, height);
//        stroke(255);
        for (int j = 0; j < N; j++){
            for(int i = 0; i < N; i++){
                pushMatrix();
                translate(x[i], y[j]);
                rotate(radians(angle));
                fill(180,255);
                noStroke();
                rectMode(CENTER);
                rect(0, 0, lengthOfSide,lengthOfSide);
                popMatrix();
            }
        }
        for (int j = 0; j < N; j++){
            for(int i = 0; i < N; i++){
                pushMatrix();
                translate(x[i], y[j]);
                rotate(radians(angle2));
                fill(0,0,255);
                noStroke();
                rectMode(CENTER);
                rect(0-lengthOfSide/2, 0-lengthOfSide/2, lengthOfSide,lengthOfSide);
                translate(-x[i], -y[j]);
                popMatrix();
            }
        }

        angle -= 2*angleDiff;
        angle2 -= 2*angleDiff;
        animation();
    }
    public void animation(){
        for (int j = 0; j < N; j++){
            if(x[j] <= lengthOfSide / 2 || x[j] >= width - lengthOfSide / 2){
                speedX = -speedX;
//                angleDiff = -angleDiff;
            }
        }
        for(int i = 0; i < N; i++){
            x[i] += speedX;
        }
        // FOR Y
        for (int j = 0; j < N; j++){
            if(y[j] <= lengthOfSide / 2 || y[j] >= height - lengthOfSide / 2){
                speedY = -speedY;
//                angleDiff = -angleDiff;
            }
        }
        for(int i = 0; i < N; i++){
            y[i] += speedY;
        }
    }
}
