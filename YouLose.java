import java.awt.*;
import javax.swing.*;

/**
 * Class Stephanie - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class YouLose extends JApplet
{
    public static void loseScreen(Graphics g)
    {
        g.setColor(Colors.RandomColor());
        //         CAPTURETHESAGETS.posOfMouseX = 100;
        //         CAPTURETHESAGETS.posOfMouseY = 100;       
        g.drawString("You lose" , 50 , 50);
    }
}