import processing.core.*;

public class Task04 extends PApplet{
    public static void main(String[] args){
        PApplet.main("Task04");
    }
    public void draw(){

    }
    public void settings(){
        fullScreen();
    }
    public void setup(){
        noStroke();
        background(0);
        fill(0,0,255);
        translate(width/2,height/2);
        float x = 0;
        float y = 0;
        int angle = 45;
        int radius = 50;
        textSize(50);
        for(int i = 0; i < 50; i++){
            fill(255);
            text(i, x,y);
            fill(0,0,255);
            ellipse(x,y,radius,radius);
            x = cos(radians(angle)) * radius * i;
            y = sin(radians(angle)) * radius * i;
            if(x > width || y > height || x < 0 || y < 0){
//                angle = -angle;
                radius = -radius;
            }
        }
    }
}