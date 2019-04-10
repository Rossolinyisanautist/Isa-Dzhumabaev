import processing.core.*;

public class Test extends PApplet{
    final int NUMBER_OF_STARS = 1000;
    float[] x = new float[NUMBER_OF_STARS];
    float[] y = new float[NUMBER_OF_STARS];
    float[] z = new float[NUMBER_OF_STARS];
    int[] color = new int[NUMBER_OF_STARS];

    public static void main(String[] args){
        PApplet.main("Test");
    }
    public void settings(){
        fullScreen();
    }
    public void setup(){
        frameRate(60);
        background(0);
        for(int i = 0; i < NUMBER_OF_STARS; i++){
            x[i] = random(-width / 2,width / 2);
            y[i] = random(-height / 2, height / 2);
            z[i] = random(100, width);
            color[i] = (int)(random(1, 4));
        }
    }
    public void draw(){
        noStroke();
        fill(0,map(mouseX, 0, width, 200, 50));
        rect(0,0,width,height);
        fill(255);
        translate(width / 2, height / 2);
        for(int i = 0; i < NUMBER_OF_STARS; i++){
            float lalalalala = map(mouseX, 0, width, 0, 100);
            float xs = map(x[i] / z[i], 0, 1, 0, width / 2);
            float ys = map(y[i] / z[i], 0, 1, 0, width / 2);
            float pxs = map(x[i] / (z[i] + lalalalala), 0, 1, 0, width / 2);
            float pys = map(y[i] / (z[i] + lalalalala), 0, 1, 0, width / 2);
//            float diameter = map(z[i], 1, width, 10,1);
//            float diameter2 = map((z[i] + ddd[i]), 1, width, 5,1);
//            ellipse(xs, ys, diameter, diameter);
//            ellipse(pxs, pys, diameter2, diameter2);
            float shade = map(mouseX, 0, width, 150, 255);
            switch (color[i]){
                case 1:
                    stroke(shade,0,0);
                    break;
                case 2:
                    stroke(0,shade,0);
                    break;
                case 3:
                    stroke(0,0,shade);
            }
            float w = map(z[i], 1, width, 5,1);
            strokeWeight(w);
            line(pxs,pys,xs,ys);
        }
        update();
    }
    public void update(){
        for(int j = 0; j < NUMBER_OF_STARS; j++){
            z[j] = z[j] - map(mouseX, 0,width,0,100);//random(10,50);
            if(z[j] < 1){
                x[j] = random(-width / 2,width / 2);
                y[j] = random(-height / 2, height / 2);
                z[j] = random(100, width);
                color[j] = (int)(random(1, 4));
            }
        }
    }
}