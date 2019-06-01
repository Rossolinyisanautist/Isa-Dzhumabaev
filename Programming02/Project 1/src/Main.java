import processing.core.PApplet;
import processing.core.PConstants;

public class Main extends PApplet {

    // TODO: For Background
    final int NUMBER_OF_STARS = 1000;
    float[] x = new float[NUMBER_OF_STARS];
    float[] y = new float[NUMBER_OF_STARS];
    float[] z = new float[NUMBER_OF_STARS];
    int[] color = new int[NUMBER_OF_STARS];
    int[] color2 = new int[NUMBER_OF_STARS];

    private final static int TITLE_STATE            = 0;
    private final static int SPEED_SELECTION_STATE  = 1;
    private final static int GAME_STATE             = 2;
    private final static int RESULTS_STATE          = 3;
    private final static int TOP_MARGIN             = 100;
    private final static int TEXT_SIZE              = 50;

    private Field field;
    private Fruit fruit;
    private Snake snake;
    private float speed;
    private int scores;
    private int currentState;

    public void settings(){
//        size(1200, 800);
        fullScreen();
    }

    public void setup(){
        currentState = TITLE_STATE;
        speed = 1;
        surface.setResizable(true);
        field = new Field(this);
        snake = new Snake(field,0,0, 1);
        fruit = new Fruit(field, snake);

        // TODO: Background
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
        background(0);
        Draw draw = new Draw(this, field, fruit, snake);
        if(!snake.isAlive()){
            currentState = RESULTS_STATE;
        }
        switch (currentState){
            case TITLE_STATE:{


                float r = map(mouseX, 0, width, 0, 255);
                float g = map(mouseY, 0, width, 0, 255);
                background(r, g, 180);
                textAlign(PConstants.CENTER, PConstants.CENTER);
                r = map(mouseY, 0, width, 0, 255);
                g = map(mouseX, 0, width, 0, 255);
//                drawSpeedSelectionBackground();
                fill((r + g), g, r);
                textSize(TEXT_SIZE);
                text("Super Snake", width/2, height/2 - TOP_MARGIN);
                text("", width / 2, height / 2);
                text("Press ESC to exit\nPress Enter to continue", width / 2, height / 2 + 300);

                break;
            }
            case SPEED_SELECTION_STATE:{
                noStroke();
                float r = map(mouseX, 0, width, 0, 255);
                float g = map(mouseX, 0, width, 0, 255);

                background(r, g / 2, r + 25);

                pushMatrix();
                drawSpeedSelectionBackground();
                popMatrix();

                speed = map(mouseX, 0, width, 1, 8);
                float b = map(mouseX, 0, width, 0, 255);
                r = 255 / speed;
                fill(r , g, b);

                float textSize = map(speed, 0, 1, 40, 50);
                textSize(textSize);
                text("Select speed", width / 2, height / 2 - textSize);
                text(speed, width / 2, height / 2 + textSize);
                break;
            }
            case GAME_STATE:{

                snake.move();

                if(snake.headCollides(fruit)){
                    snake.grow();
                    fruit = new Fruit(field, snake);
                    scores++;
                }

                draw.field();
                draw.fruit();
                draw.snake();

                delay(100 / Math.round(speed));
                break;
            }
            case RESULTS_STATE:
                float r = map(mouseX, 0, width, 0, 255);
                float g = map(mouseY, 0, width, 0, 255);
                background(r, g, 180);
                textAlign(PConstants.CENTER, PConstants.CENTER);
                r = map(mouseY, 0, width, 0, 255);
                g = map(mouseX, 0, width, 0, 255);
                fill((r + g), g, r);
                textSize(TEXT_SIZE);
                text("Game Over", width/2, height/2 - TOP_MARGIN);
                text("Scores: " + scores, width / 2, height / 2);
                text("Press ESC to exit\nPress Enter to continue", width / 2, height / 2 + 300);

                break;
        }
    }

    @Override
    public void keyPressed() {
        switch (keyCode){
            case UP:
                if(currentState == SPEED_SELECTION_STATE){
                    if(speed < 8){
                        speed++;
                    }
                }
                else{
                    snake.turnUp();
                }
                break;
            case DOWN:
                if(currentState == SPEED_SELECTION_STATE){
                    if(speed > 1){
                        speed--;
                    }
                }
                else{
                    snake.turnDown();
                }
                break;
            case LEFT:
                snake.turnLeft();
                break;
            case RIGHT:
                snake.turnRight();
                break;
            case ENTER:
                if(currentState == RESULTS_STATE){
                    System.out.println("RESULTS");
                    snake.setAlive();
                    currentState = SPEED_SELECTION_STATE;
                    scores = 0;
                }
                else{
                    currentState++;
//                    currentState %= 3;
                }
                break;
            case ESC:
                System.exit(0);
        }

    }

    public void drawSpeedSelectionBackground(){
        translate(width / 2, height / 2);

        for(int i = 0; i < NUMBER_OF_STARS; i++){
            float tail = map(mouseX, 0, width, 5, width / 4);
            float xs = map(x[i] / z[i], 0, 1, 0, width / 2);
            float ys = map(y[i] / z[i], 0, 1, 0, width / 2);
            float pxs = map(x[i] / (z[i] + tail), 0, 1, 0, width / 2);
            float pys = map(y[i] / (z[i] + tail), 0, 1, 0, width / 2);
            float strokeWeight = map(z[i], 1, width, 5f,0f);
            float shade = map(mouseX, 0, width, 100, 255);

            stroke(shade);
            strokeWeight(strokeWeight);
            line(pxs,pys,xs,ys);

        }
        update();
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


    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
