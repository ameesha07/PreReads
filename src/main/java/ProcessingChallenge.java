import processing.core.PApplet;

public class ProcessingChallenge  extends PApplet {

    public  static final int widht =600;
    public  static final int height =600;
    int widht1=0,widht2=0,widht3=0,widht4=0;

    public  static void main(String[] args)        //called by java
    {
        PApplet.main("ProcessingChallenge" , args );
    }

    public void settings()     //called only once by processing itself  (initialize)
    {
        super.settings();
        size(widht,height);
    }

    public  void draw()   //called repeactedly (infinite)
    {
        drawCircle();

    }


    private void drawCircle()
    {
        ellipse(widht1,height/5,10,10);
        widht1+=1;
        ellipse(widht2,(2*height)/5,10,10);
        widht2+=2;
        ellipse(widht3,(3*height)/5,10,10);
        widht3+=3;
        ellipse(widht4,(4*height)/5,10,10);
        widht4+=4;
    }


}
