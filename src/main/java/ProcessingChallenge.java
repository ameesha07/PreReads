import processing.core.PApplet;

public class ProcessingChallenge  extends PApplet {

   public static int speed = 0;

    public static final int WIDTH = 700;
    public static final int HEIGHT = 700;

    public static void main(String[] args){ PApplet.main("ProcessingChallenge",args); }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        for(int i=1;i<=4;i++){
            ellipse(speed*i, HEIGHT*i/5, diameter, diameter);
        }
        speed+=1;
    }
}
