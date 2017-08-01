//<applet code='Cartoon.class' Height='1000' width='1000'>
//</applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Cartoon extends Applet implements Runnable
{
    static Thread t,tt;
    Graphics g; 
    Applet a;


    public void init()
    {
        setBackground(Color.black);   
        t=new Thread(this);
        t.start();
    }
        public void run()
        {
            repaint();
        }
            
        public void paint(Graphics g)
        {
            
            g.drawRect(280,60,25,100);
            g.setColor(Color.green);
            g.fillRect(280,60,25,100);
            
            g.drawRect(235,420,120,50);
            g.setColor(Color.blue);
            g.fillRect(235,420,120,50);
            
            g.drawOval(150,150,290,290);
            g.setColor(Color.YELLOW);
            g.fillOval(150,150,290,290);
            g.drawOval(190,190,70,70);
            g.setColor(Color.red);
            g.fillOval(190,190,70,70);
            
            g.drawOval(330,190,70,70);
            g.setColor(Color.red);
            g.fillOval(330,190,70,70);
            
            g.drawOval(70,240,80,80);
            g.setColor(Color.blue);
            g.fillOval(70,240,80,80);
            
            g.drawOval(438,240,80,80);
            g.setColor(Color.blue);
            g.fillOval(438,240,80,80);
            
            g.drawRect(285,230,20,100);
            g.setColor(Color.cyan);
            g.fillRect(285,230,20,100);
            
            g.drawOval(238,350,120,40);
            g.setColor(Color.pink);
            g.fillOval(238,350,120,40);
            
            try
            {
            t.sleep(100);
            }catch(Exception e){}
            
            g.drawOval(190,190,70,70);
            g.setColor(Color.orange);
            g.fillOval(190,190,70,70);
            
            g.drawOval(330,190,70,70);
            g.setColor(Color.orange);
            g.fillOval(330,190,70,70);
            
            
            try
            {
            t.sleep(100);
            }catch(Exception e){}
            
            g.drawOval(190,190,70,70);
            g.setColor(Color.green);
            g.fillOval(190,190,70,70);
            
            g.drawOval(330,190,70,70);
            g.setColor(Color.green);
            g.fillOval(330,190,70,70);
            
            
            try
            {
            t.sleep(100);
            }catch(Exception e){}
            
            g.drawOval(190,190,70,70);
            g.setColor(Color.blue);
            g.fillOval(190,190,70,70);
            
            g.drawOval(330,190,70,70);
            g.setColor(Color.blue);
            g.fillOval(330,190,70,70);
            
            
            try
            {
            t.sleep(100);
            }catch(Exception e){}
            
            g.drawOval(190,190,70,70);
            g.setColor(Color.cyan);
            g.fillOval(190,190,70,70);
            
            g.drawOval(330,190,70,70);
            g.setColor(Color.cyan);
            g.fillOval(330,190,70,70);
            
            
            g.drawOval(70,240,80,80);
            g.setColor(Color.black);
            g.fillOval(70,240,80,80);
            
            g.drawOval(438,240,80,80);
            g.setColor(Color.black);
            g.fillOval(438,240,80,80);
            
            try
            {
            t.sleep(100);
            }catch(Exception e){}
            
            g.drawOval(190,190,70,70);
            g.setColor(Color.pink);
            g.fillOval(190,190,70,70);
            
            g.drawOval(330,190,70,70);
            g.setColor(Color.pink);
            g.fillOval(330,190,70,70);
            
            
            
            try
            {
            t.sleep(100);
            }catch(Exception e){}
            
            g.drawOval(190,190,70,70);
            g.setColor(Color.red);
            g.fillOval(190,190,70,70);
            
            g.drawOval(330,190,70,70);
            g.setColor(Color.red);
            g.fillOval(330,190,70,70);
            
            t=new Thread(this);
            t.start();
           
            
        }
      
            
}
