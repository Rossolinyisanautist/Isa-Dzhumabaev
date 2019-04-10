import processing.core.*;

public class Task03 extends PApplet{
    final int NUMBER_OF_STARS = 1000;
    float[] x = new float[NUMBER_OF_STARS];
    float[] y = new float[NUMBER_OF_STARS];
    float[] z = new float[NUMBER_OF_STARS];
    int[] color = new int[NUMBER_OF_STARS];
    int[] color2 = new int[NUMBER_OF_STARS];
    float temp;
    float r = 20;
    public static void main(String[] args){
        PApplet.main("Task03");
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
            color2[i] = (int)random(0,255);
        }
    }
    public void draw(){
        noStroke();
        fill(0,map(mouseX, 0, width, 200, 25));
        rect(0,0,width,height);
        translate(width / 2, height / 2);
        for(int i = 0; i < NUMBER_OF_STARS; i++){
            float tail = map(mouseX, 0, width, 5, width / 4);
            float xs = map(x[i] / z[i], 0, 1, 0, width / 2);
            float ys = map(y[i] / z[i], 0, 1, 0, width / 2);
            float pxs = map(x[i] / (z[i] + tail), 0, 1, 0, width / 2);
            float pys = map(y[i] / (z[i] + tail), 0, 1, 0, width / 2);
            float strokeWeight = map(z[i], 1, width, 5f,0f);
            float shade = map(mouseX, 0, width, 100, 255);

//            float diameter = map(z[i], 0, width, 10,1);
//            float diameter2 = map((z[i] + tail), 1, width, 5,1);
//            ellipse(xs, ys, diameter, diameter);
//            ellipse(pxs, pys, diameter2, diameter2);

//            switch (color[i]){
//                case 1:
//                    stroke(shade,color2[i],color2[i]);
//                    fill(shade,color2[i],color2[i]);
//                    break;
//                case 2:
//                    stroke(color2[i],shade,color2[i]);
//                    fill(color2[i],shade,color2[i]);
//                    break;
//                case 3:
//                    stroke(color2[i],color2[i],shade);
//                    fill(color2[i],color2[i],shade);
//            }
            stroke(shade);
            strokeWeight(strokeWeight);
            line(pxs,pys,xs,ys);
        }
        update();
        temp = map(mouseX, 0, width, 0f, 0.5f);
        drawObjectInTheCenter(false);
    }
    public void update(){
        for(int j = 0; j < NUMBER_OF_STARS; j++){
            z[j] = z[j] - map(mouseX, 0, width,1,500);//random(10,50);
            if(z[j] < 1){
                x[j] = random(-width / 2,width / 2);
                y[j] = random(-height / 2, height / 2);
                z[j] = random(100, width);
                color[j] = (int)(random(1, 4));
                color2[j] = (int)random(0,255);
            }
        }
    }
    public void drawObjectInTheCenter(boolean isExpanding){
        noStroke();
        float r2 = r;
        float color2 = 20;
        for(int i = 0; i < 50; i++){
            float color2delta = 255 / 50.0f;
            float rd = r2 / 50;
            fill(color2);
            ellipse(0,0,r2, r2);
            color2 += color2delta;
            r2 -= rd;
        }
        if(isExpanding){
            float rDelta = map(r, 1,width,1f,1000f);
            for(int i = 0; i < rDelta; i++) {
                r += temp;
            }
        }
        if(r > width){
            r = 0;
        }
    }
}

// OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD
// OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD
// OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD
// OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD
// OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD
// OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD OLD

//import processing.core.*;
//
//public class Task03 extends PApplet{
//    final int NUMBER_OF_STARS = 1000;
//    float[] x = new float[NUMBER_OF_STARS];
//    float[] y = new float[NUMBER_OF_STARS];
//    float[] diameter = new float[NUMBER_OF_STARS];
//    float[] multiplier = new float[NUMBER_OF_STARS];
//    int[] color = new int[NUMBER_OF_STARS];
//    public static void main(String[] args){
//        PApplet.main("Task03");
//    }
//    public void settings(){
//        fullScreen();
//    }
//    public void setup(){
//        frameRate(60);
//        background(0);
//        for(int i = 0; i < NUMBER_OF_STARS; i++){
//            float angle = random(0, 360);
//            x[i] = cos(radians(angle)) + 1;
//            y[i] = sin(radians(angle)) + 1;
//            multiplier[i] = (random(1000, width));
//            color[i] = (int)(random(1, 4));
//        }
//    }
//    public void draw(){
//        fill(0, 100);
//        noStroke();
//        rect(0,0, width, height);
//        translate(width / 2.0f, height / 2.0f);
//        noStroke();
//        for(int i = 0; i < NUMBER_OF_STARS; i++){
//            switch (color[i]){
//                case 1:
//                    fill(255,0,0);
//                    stroke(255,0,0);
//                    break;
//                case 2:
//                    fill(0,255,0);
//                    stroke(0,255,0);
//                    break;
//                case 3:
//                    fill(0,0, 255);
//                    stroke(0,0,255);
//            }
//            diameter[i] = map(y[i], 0,1,0,10);
//            ellipse(x[i] * multiplier[i], y[i] * multiplier[i], diameter[i], diameter[i]);
//            float lengthOfTail = map(multiplier[i], 100, width,10,200);
//            float tailX = x[i] * (multiplier[i] - lengthOfTail);
//            float tailY = y[i] * (multiplier[i] - lengthOfTail);
//            strokeWeight(2);
//            line(x[i] * multiplier[i], y[i] * multiplier[i], tailX, tailY);
//        }
//        for (int i = 0; i < NUMBER_OF_STARS; i++){
//            multiplier[i] += 50;
//            if(multiplier[i] > width ){
//                x[i] = cos(radians(random(0, 360))) ;
//                y[i] = sin(radians(random(0, 360))) ;
//                multiplier[i] = (random(100, height));
//                color[i] = (int)(random(1, 4));
//            }
//        }
//    }
//}