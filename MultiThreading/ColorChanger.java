import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyThread extends JFrame implements Runnable
{
    JPanel colorPanel;
    static Thread t;
    Container c;
    MyThread()
    {
        c=getContentPane();
        setSize(400,400);
        setLayout(null);
        
            colorPanel=new JPanel();
            colorPanel.setBounds(140,100,120,120);
            colorPanel.setBackground(Color.RED);
            c.add(colorPanel);
            setTitle("Red Sample Color");
            setResizable(false);
            
            t=new Thread(this);
            t.start();
            
            addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
            System.exit(0);
            }
            });
    }
        public void run()
        {
            try
            {
                setTitle("Red Sample Color");
                colorPanel.setBackground(Color.RED);
                t.sleep(1000);
                c.setBackground(Color.red);
                t.sleep(1000);
                colorPanel.setBackground(Color.yellow);
                setTitle("Yellow Sample Color");
                t.sleep(1000);
                c.setBackground(Color.yellow);
                t.sleep(1000);
                colorPanel.setBackground(Color.green);
                setTitle("Green Sample Color");
                t.sleep(1000);
                c.setBackground(Color.green);
                t.sleep(1000);
                colorPanel.setBackground(Color.orange);
                setTitle("Orange Sample Color");
                t.sleep(1000);
                c.setBackground(Color.orange);
                
                t.sleep(1000);
                colorPanel.setBackground(Color.cyan);
                setTitle("Cyan Sample Color");
                t.sleep(1000);
                c.setBackground(Color.cyan);
                
                Thread tt=new Thread(this);
                tt.start();
                
            }
            catch(Exception e)
            {
                System.out.print(e);
            }
        }
        
    
    
    
    public static void main(String []args)
    {
        new MyThread().show();
    }
}