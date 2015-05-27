import java.applet.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.net.*;

public class CAPTURETHESAGETS extends Applet implements ActionListener, MouseListener, MouseMotionListener
{
    static int posOfMouseX = 0;
    static int posOfMouseY = 0;
    private int x1 = 0;
    private int y1 = 300;
    private int x2 = 1200;
    private int y2 = 100;
    private int x3 = 500;
    private int y3 = 500;
    private int x4 = 1400;
    private int y4 = 200;
    private int x5 = 150;
    private int y5 = 150;

    static int x11 = 450;
    static int y11 = 800;
    static int x12 = 1500;
    static int y12 = 700;
    static int x13 = 750;
    static int y13 = 400;
    static int x14 = 375;
    static int y14 = 375;

    private int xinc1 = 3;
    private int yinc1 = 4;
    private int xinc2 = 3;
    private int yinc2 = 4;
    private int xinc3 = 3;
    private int yinc3 = 4;
    private int xinc4 = 3;
    private int yinc4 = 4;
    private int xinc5 = 3;
    private int yinc5 = 4;

    static int xinc11 = 3;
    static int yinc11 = 4;
    static int xinc12 = 3;
    static int yinc12 = 4;
    static int xinc13 = 3;
    static int yinc13 = 4;
    static int xinc14 = 3;
    static int yinc14 = 4;

    private Timer timer;

    private Image image1;
    private Image image2;
    private Image image3;
    private Image image4;
    private Image image5;

    private Image stephanieImage;
    private Image michelleImage;
    private Image DJTannerImage;
    private Image uncleJesseImage;

    private Image bobSagetGif;
    static int score = 0;

    //private Sound song;
    //private URL url;
    AudioClip soundFile1;
    public void init()
    {

        timer=new Timer(10,this);
        timer.start();

        addMouseListener(this);
        addMouseMotionListener(this);
        requestFocus();

        image1 = getImage(getDocumentBase() , "bsaget2-sm.jpg");
        image2 = getImage(getDocumentBase() , "images-1.jpeg");
        image3 = getImage(getDocumentBase() , "images.jpeg");
        image4 = getImage(getDocumentBase() , "images copy.jpeg");
        image5 = getImage(getDocumentBase() , "Bob Saget Arrivals Rebels Cause Gala nNNy3T2tChjl.jpg");

        stephanieImage = getImage(getDocumentBase() , "Stephanie-full-house-32318723-540-720.jpg");
        michelleImage = getImage(getDocumentBase() , "Michelle_Tanner.jpg");
        DJTannerImage = getImage(getDocumentBase() , "DJ-Tanner-full-house-446292_278_387.jpg");
        uncleJesseImage = getImage(getDocumentBase() , "6a00ccff855d15985d00fae8dd637c000b-500pi.jpg");
        //url = null;
        // try{
        //   url = new URL(getDocumentBase(), "music.wav");
        // }catch(Exception e){
        // System.out.println("File not found");
        //}
        soundFile1 = getAudioClip(getCodeBase(),"music.wav");

        bobSagetGif = getImage(getDocumentBase() , "giphy.gif");
    }

    public void getYouLose(Graphics g)
    {
        YouLose.loseScreen(g);
    }

    public void actionPerformed(ActionEvent ae){
        repaint();
        if(score == 5)
        {

            timer.stop();
            soundFile1.play();

        }
    }

    public void mouseExited(MouseEvent me){

    }

    public void mouseEntered(MouseEvent me){

    }

    public void mouseReleased(MouseEvent me){

    }

    public void mousePressed(MouseEvent me){

    }

    public void mouseClicked(MouseEvent me){

    }

    public void mouseMoved(MouseEvent me){

    }

    public void mouseDragged(MouseEvent me){
        posOfMouseX = me.getX();
        posOfMouseY = me.getY();
    }

    public void paint(Graphics g)
    {
        setBackground(Color.BLACK);
        g.setColor(Colors.RandomColor());
        g.fillOval(posOfMouseX , posOfMouseY , 50 , 50);
        g.drawImage(image1,x1,y1,100,100,this);
        g.drawImage(image2,x2,y2,100,100,this);
        g.drawImage(image3,x3,y3,100,100,this);
        g.drawImage(image4,x4,y4,100,100,this);
        g.drawImage(image5,x5,y5,100,100,this);
        g.drawImage(stephanieImage,x11,y11,100,100,this);
        g.drawImage(michelleImage,x12,y12,100,100,this);
        g.drawImage(DJTannerImage,x13,y13,100,100,this);
        g.drawImage(uncleJesseImage,x14,y14,100,100,this);

        x1+=xinc1;
        y1+=yinc1;
        if (x1<0 || x1>2000-170){
            xinc1*=-1;
        }
        if (y1<0 || y1>1000-160){
            yinc1*=-1;
        }

        x2+=xinc2;
        y2+=yinc2;
        if (x2<0 || x2>2000-170){
            xinc2*=-1;
        }
        if (y2<0 || y2>1000-160){
            yinc2*=-1;
        }

        x3+=xinc3;
        y3+=yinc3;
        if (x3<0 || x3>2000-170){
            xinc3*=-1;
        }
        if (y3<0 || y3>1000-160){
            yinc3*=-1;
        }

        x4+=xinc4;
        y4+=yinc4;
        if (x4<0 || x4>2000-170){
            xinc4*=-1;
        }
        if (y4<0 || y4>1000-160){
            yinc4*=-1;
        }

        x5+=xinc5;
        y5+=yinc5;
        if (x5<0 || x5>2000-170){
            xinc5*=-1;
        }
        if (y5<0 || y5>1000-160){
            yinc5*=-1;
        }

        x11+=xinc11;
        y11+=yinc11;
        if (x11<0 || x11>2000-170){
            xinc11*=-1;
        }
        if (y11<0 || y11>1000-160){
            yinc11*=-1;
        }

        x12+=xinc12;
        y12+=yinc12;
        if (x12<0 || x12>2000-170){
            xinc12*=-1;
        }
        if (y12<0 || y12>1000-160){
            yinc12*=-1;
        }

        x13+=xinc13;
        y13+=yinc13;
        if (x13<0 || x13>2000-170){
            xinc13*=-1;
        }
        if (y13<0 || y13>1000-160){
            yinc13*=-1;
        }

        x14+=xinc14;
        y14+=yinc14;
        if (x14<0 || x14>2000-170){
            xinc14*=-1;
        }
        if (y14<0 || y14>1000-160){
            yinc14*=-1;
        }

        if(posOfMouseX + 25 >= x1 && posOfMouseX + 25 <= x1 + 100 && posOfMouseY + 25 >= y1 && posOfMouseY + 25 <= y1 + 100)
        {
            score++;
            x1 = 5000;
            y1 = 5000;
            xinc1 = 0;
            yinc1 = 0;
        }

        if(posOfMouseX + 25 >= x2 && posOfMouseX + 25 <= x2 + 100 && posOfMouseY + 25 >= y2 && posOfMouseY + 25 <= y2 + 100)
        {
            score++;
            x2 = 5000;
            y2 = 5000;
            xinc2 = 0;
            yinc2 = 0;
        }

        if(posOfMouseX + 25 >= x3 && posOfMouseX + 25 <= x3 + 100 && posOfMouseY + 25 >= y3 && posOfMouseY + 25 <= y3 + 100)
        {
            score++;
            x3 = 5000;
            y3 = 5000;
            xinc3 = 0;
            yinc3 = 0;
        }

        if(posOfMouseX + 25 >= x4 && posOfMouseX + 25 <= x4 + 100 && posOfMouseY + 25 >= y4 && posOfMouseY + 25 <= y4 + 100)
        {
            score++;
            x4 = 5000;
            y4 = 5000;
            xinc4 = 0;
            yinc4 = 0;
        }

        if(posOfMouseX + 25 >= x5 && posOfMouseX + 25 <= x5 + 100 && posOfMouseY + 25 >= y5 && posOfMouseY + 25 <= y5 + 100)
        {
            score++;
            x5 = 5000;
            y5 = 5000;
            xinc5= 0;
            yinc5 = 0;
        }

        while(posOfMouseX + 25 >= x11 && posOfMouseX + 25 <= x11 + 100 && posOfMouseY + 25 >= y11 && posOfMouseY + 25 <= y11 + 100)
        {
            getYouLose(g);
            xinc1 = 0;
            yinc1 = 0;
            xinc2 = 0;
            yinc2 = 0;
            xinc3 = 0;
            yinc3 = 0;
            xinc11 = 0;
            yinc11 = 0;
            xinc12 = 0;
            yinc12 = 0;
            xinc13 = 0;
            yinc13 = 0;
            xinc14 = 0;
            yinc14 = 0;
        }

        while(posOfMouseX + 25 >= x12 && posOfMouseX + 25 <= x12 + 100 && posOfMouseY + 25 >= y12 && posOfMouseY + 25 <= y12 + 100)
        {
            getYouLose(g);
            xinc1 = 0;
            yinc1 = 0;
            xinc2 = 0;
            yinc2 = 0;
            xinc3 = 0;
            yinc3 = 0;
            xinc11 = 0;
            yinc11 = 0;
            xinc12 = 0;
            yinc12 = 0;
            xinc13 = 0;
            yinc13 = 0;
            xinc14 = 0;
            yinc14 = 0;
        }

        while(posOfMouseX + 25 >= x13 && posOfMouseX + 25 <= x13 + 100 && posOfMouseY + 25 >= y13 && posOfMouseY + 25 <= y13 + 100)
        {
            getYouLose(g);
            xinc1 = 0;
            yinc1 = 0;
            xinc2 = 0;
            yinc2 = 0;
            xinc3 = 0;
            yinc3 = 0;
            xinc11 = 0;
            yinc11 = 0;
            xinc12 = 0;
            yinc12 = 0;
            xinc13 = 0;
            yinc13 = 0;
            xinc14 = 0;
            yinc14 = 0;
        }

        while(posOfMouseX + 25 >= x14 && posOfMouseX + 25 <= x14 + 100 && posOfMouseY + 25 >= y14 && posOfMouseY + 25 <= y14 + 100)
        {
            getYouLose(g);
            xinc1 = 0;
            yinc1 = 0;
            xinc2 = 0;
            yinc2 = 0;
            xinc3 = 0;
            yinc3 = 0;
            xinc11 = 0;
            yinc11 = 0;
            xinc12 = 0;
            yinc12 = 0;
            xinc13 = 0;
            yinc13 = 0;
            xinc14 = 0;
            yinc14 = 0;
        }
        if(score == 5)
        {
            YouWin.winScreen(g);
            g.drawImage(bobSagetGif,550,200,700,500,this);   
        }

        String score1 = "" + score;
        g.setColor(Colors.RandomColor());
        g.drawString(score1,50,50);
    }
}