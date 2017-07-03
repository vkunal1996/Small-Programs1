import java.awt.*;
import java.awt.event.*;


public class Gui extends Frame implements ActionListener 

{
     Label first,second,result;
     TextField tfirst,tsecond,tresult;
     Button sum,mul;
    
    Gui()
    {
       setSize(300,300);
       setTitle("Calculations..");
       FlowLayout fl=new FlowLayout();
       setLayout(fl);
       setBackground(Color.yellow);
       setForeground(Color.blue);
       first=new Label("First Number");
       tfirst=new TextField(10);
       second=new Label("Second Number");
       tsecond=new TextField(10);
       result=new Label("Result Number");
       tresult=new TextField(10);
       sum=new Button("Sum");
       mul=new Button("mul");
       add(first);add(tfirst);
       add(second);add(tsecond);
       add(result);add(tresult);
       System.out.println("\n\n");
       add(sum);add(mul);
       
       sum.addActionListener(this);
       mul.addActionListener(this);
        
    }

       public void actionPerformed(ActionEvent e)
       {
           int a,b;
           if(e.getSource()==sum)
           {
               a=Integer.parseInt(tfirst.getText());
               b=Integer.parseInt(tsecond.getText());
               tresult.setText(String.valueOf(a+b));
           }
           
           else if(e.getSource()==mul)
           {
               a=Integer.parseInt(tfirst.getText());
               b=Integer.parseInt(tsecond.getText());
               tresult.setText(String.valueOf(a*b));
           }
       }

    
public static void main(String[] args) 
    {
        Gui g=new Gui();
        g.show();
    }
    
    
}
