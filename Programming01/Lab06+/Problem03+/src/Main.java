import processing.core.*;

public class Main extends PApplet{
    int radius = 100;
    int innerRadius = radius / 4;
    int diffA = 3;
    int diffB = diffA / 3;
    int limit = 100;
    int max = radius + limit;
    int min = radius;
    int radiusForCenterStar = radius + limit;
    int innerRadiusForCenterStar = innerRadius + limit / 3;
    public static void main(String[] args){
        PApplet.main("Main");
    }
    public void settings(){
        size(900,900);
    }
    public void setup(){
    }
    public void draw(){
//        animate();
        background(0);
        strokeWeight(1);
        stroke(255,0,0);
        drawStar(width/2, height/2, radiusForCenterStar, innerRadiusForCenterStar);
        stroke(255,255,0);
        drawStar(width/4, height/4, radius, innerRadius);
        drawStar(3*width/4, height/4, radius, innerRadius);
        drawStar(width/4, 3*height/4, radius, innerRadius);
        drawStar(3*width/4, 3*height/4, radius, innerRadius);
    }
    public void drawStar(int translateX, int translateY, int sizeA, int sizeB){
        translate(translateX, translateY);
        line(sizeA, 0,-sizeA,0);
        line(0, sizeA, 0, -sizeA);
        line(sizeB, sizeB,-sizeB,-sizeB);
        line(sizeB,-sizeB,-sizeB, sizeB);
        line(-sizeA,0,-sizeB, -sizeB);
        line(sizeA,0, sizeB, sizeB);
        line(sizeA,0, sizeB,-sizeB);
        line(-sizeA,0,-sizeB, sizeB);
        line(0, sizeA, sizeB, sizeB);
        line(0,-sizeA,-sizeB,-sizeB);
        line(0,-sizeA, sizeB,-sizeB);
        line(0, sizeA,-sizeB, sizeB);
        translate(-translateX, -translateY);
    }
    public void animate(){
        radius += diffA;
        innerRadius += diffB;
        radiusForCenterStar -= diffA;
        innerRadiusForCenterStar -= diffB;
        if(radius > max || radius < min){
            diffA = -diffA;
            diffB = -diffB;
        }
    }
}
