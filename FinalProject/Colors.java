import java.util.*;
import java.awt.*;

/**
 * Write a description of class Colors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Colors
{
    
    public static Color RandomColor(){
        int red=(int)(Math.random()*255+1);
        int green=(int)(Math.random()*255+1);
        int blue=(int)(Math.random()*255+1);
        return new Color(red,green,blue);
    }
}
