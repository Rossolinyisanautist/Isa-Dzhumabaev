
// DONE

import processing.core.*;

public class Task08 extends PApplet {
    float angle = 0;
    float angle2 = 0;
    float angleDelta = 1f;
    final int SUN_DIAMETER = 200;
    final int EARTH_DIAMETER = SUN_DIAMETER / 6;
    final int SECOND_PLANET_DIAMETER = SUN_DIAMETER / 4;
    final int MOON_DIAMETER = EARTH_DIAMETER / 4;
    public static void main(String[] args){
        PApplet.main("Task08");
    }
    public void draw(){
        fill(0,40);
        rect(0,0,width,height);
        noStroke();
        // SUN
        fill(255,230,20);
        translate(width/2,height/2);                                                    // TRANSLATE TO CENTER
        pushMatrix();                                                                         // SAVE SUN'S CENTER
        rotate(radians(angle));                                                               // ROTATE SUN'S POSITION
        angle += angleDelta;
        ellipse(0, 0, SUN_DIAMETER,SUN_DIAMETER);                                      //DRAW SUN
        // EARTH
        translate(SUN_DIAMETER * 2,0);                                                 // TRANSLATE TO EARTH POSITION
        rotate(radians(angle * 12));                                                 // ROTATE EARTH' POSITION
        fill(0,120,255);
        ellipse(0, 0, EARTH_DIAMETER,EARTH_DIAMETER);                                  // DRAW EARTH
        translate(EARTH_DIAMETER / 2 + MOON_DIAMETER / 2 + MOON_DIAMETER / 2,0);       // TRANSLATE TO MOON'S POSITION
        // MOON
        fill(180);
        ellipse(0,0,MOON_DIAMETER,MOON_DIAMETER);                                     // DRAW MOON
        popMatrix();                                                                         // TRANSLATE BACK TO SUN'S CENTER
        rotate(radians(-angle));                                                             // HERE -angle MAKE SECOND PLANET ROTATE BACKWARDS
        translate(SUN_DIAMETER,0);                                                        // TRANSLATE TO SECOND PLANET'S POSITION
        fill(180,0,0);
        ellipse(0,0,SECOND_PLANET_DIAMETER,SECOND_PLANET_DIAMETER);                    // DRAW SECOND PLANET
    }
    public void setup(){
    }
    public void settings(){
        fullScreen();
    }
}
