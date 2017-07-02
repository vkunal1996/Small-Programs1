import java.awt.*;
import java.awt.event.*;
class App extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
    App()
    {
        setSize(300,300);
        setTitle("Mathematics ..");
        FlowLayout fl=new FlowLayout();
        setLayout(fl);
        setBackground(Color.yellow);
        setForeground(Color.blue);
        l1=new Label("First   ");
        t1=new TextField(10);
        l2=new Label("Second  ");
        t2=new TextField(10);
        l3=new Label("Result  ");
        t3=new TextField(10);
        b1=new Button("Sum    ");
        b2=new Button("Mul    ");
        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
        add(b1);add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        int a,b;
        if(e.getSource()==b1)
        {
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(a+b));
        }
            else if(e.getSource()==b2)
            {
                a=Integer.parseInt(t1.getText());
                b=Integer.parseInt(t2.getText());
                t3.setText(String.valueOf(a*b));
            }
    }
    public static void main(String []args)
    {
        App a=new App();
        a.show();
    }
}