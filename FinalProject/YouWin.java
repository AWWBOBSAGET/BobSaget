import java.awt.*;
import javax.swing.*;
/**
 * Class YouWin - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class YouWin extends JApplet
{
    public static void winScreen(Graphics g)
    {
        if(CAPTURETHESAGETS.score == 5)
        {
            g.setColor(Color.GREEN);
            CAPTURETHESAGETS.xinc11 = 0;
            CAPTURETHESAGETS.yinc11 = 0;
            CAPTURETHESAGETS.xinc12 = 0;
            CAPTURETHESAGETS.yinc12 = 0;
            CAPTURETHESAGETS.xinc13 = 0;
            CAPTURETHESAGETS.yinc13 = 0;
            CAPTURETHESAGETS.xinc14 = 0;
            CAPTURETHESAGETS.yinc14 = 0;
            CAPTURETHESAGETS.x11 = 5000;
            CAPTURETHESAGETS.y11 = 5000;
            CAPTURETHESAGETS.x12 = 5000;
            CAPTURETHESAGETS.y12 = 5000;
            CAPTURETHESAGETS.x13 = 5000;
            CAPTURETHESAGETS.y13 = 5000;
            CAPTURETHESAGETS.x14 = 5000;
            CAPTURETHESAGETS.y14 = 5000;

            //for(int x = 100; x <= 1800; x+=75)
            //{
            //for(int y = 100; y<= 950; y +=75){
            //g.drawString("You Win!",500,500);

            //}
            //}
            CAPTURETHESAGETS.posOfMouseX = 5000;
        }
    }
}