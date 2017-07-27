import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.html.*;

public class SwingProgressBar
{
    final static int interval = 1000;
	int i;
	JLabel label;
    JProgressBar pb;
    Timer timer;
    JButton button;

    public SwingProgressBar() {
		JFrame frame = new JFrame("Swing Progress Bar");
        button = new JButton("Start");
        button.addActionListener(new ButtonListener());

		pb = new JProgressBar(0, 20);
        pb.setValue(0);
        pb.setStringPainted(true);

		label = new JLabel("lallyinfosys.com");
		
		JPanel panel = new JPanel();
        panel.add(button);
        panel.add(pb);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel1.add(panel, BorderLayout.NORTH);
		panel1.add(label, BorderLayout.CENTER);
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        frame.setContentPane(panel1);
        frame.pack();
        frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create a timer.
        timer = new Timer(interval, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
				if (i == 20){
					Toolkit.getDefaultToolkit().beep();
					timer.stop();
					button.setEnabled(true);
				pb.setValue(0);
String str = "<html>" + "<font color=\"#FF0000\">" + "<b>" + "Login Accessed completed." + "</b>" + "</font>" + "</html>";
					label.setText(str);
				}
				i = i + 1;
                pb.setValue(i);
            }
        });
    }

    class ButtonListener implements ActionListener
 {
        public void actionPerformed(ActionEvent ae)
 {
            button.setEnabled(false);
			i = 0;
String str = "<html>" + "<font color=\"#008000\">" + "<b>" + "Login  is in process......." + "</b>" + "</font>" + "</html>";
			label.setText(str);
            timer.start();
        }
    }
    
    public static void main(String[] args) 
{
        SwingProgressBar spb = new SwingProgressBar();
    }
}
