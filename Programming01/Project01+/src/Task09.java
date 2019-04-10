import processing.core.*;
import javax.swing.*;
public class Task09 extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Task09");
    }
    public void settings(){
        fullScreen();
    }
    public void setup(){
        JOptionPane JOP = new JOptionPane();
        final int N = Integer.parseInt(JOP.showInputDialog("N: "));
        final int deskSize = 400;
        final int cellSize = deskSize / N;
        background(0);
        noStroke();
        int y =  (height - deskSize) / 2;
        for(int i = 0; i < N; i++){
            int x = (width - deskSize) / 2;
            boolean isRed = i % 2 == 0;
            for(int j = isRed ? 0 : 1; j < N + (isRed ? 0 : 1); j++){
                if (j % 2 == 0){
                    fill(255,0,0);
                }
                else{
                    fill(0,0,255);
                }
                rect(x , y, cellSize, cellSize);
                x += cellSize;
            }
            y += cellSize;
        }
    }
    public void draw(){}
}
