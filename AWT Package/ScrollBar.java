import java.awt.*;
import java.awt.event.*;
	class First extends Frame implements AdjustmentListener
	{
		Label lblR,lblG,lblB;
		TextField txtR,txtG,txtB;
		Panel pnlBase;
		Scrollbar hsR,hsG,hsB;
		First()
		{
		setSize(500,500);
		setLayout(new FlowLayout());
		pnlBase=new Panel();
		pnlBase.setLayout(new GridLayout(3,3,10,10));
		lblR=new Label("Red");
		txtR=new TextField(10);
		hsR=new Scrollbar(0);
		hsR.setMinimum(1);
		hsR.setMaximum(265);
		pnlBase.add(lblR);pnlBase.add(txtR);pnlBase.add(hsR);
		lblG=new Label("Green");
		txtG=new TextField(10);
		hsG=new Scrollbar(0);
		hsG.setMinimum(1);
		hsG.setMaximum(265);
		pnlBase.add(lblG);pnlBase.add(txtG);pnlBase.add(hsG);
		lblB=new Label("Blue");
		txtB=new TextField(10);
		hsB=new Scrollbar(0);
		hsB.setMinimum(1);
		hsB.setMaximum(265);
		pnlBase.add(lblB);pnlBase.add(txtB);pnlBase.add(hsB);
		add(pnlBase);
		hsR.addAdjustmentListener(this);
		hsG.addAdjustmentListener(this);
		hsB.addAdjustmentListener(this);

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		}
	public void adjustmentValueChanged(AdjustmentEvent e)
		{
			if(e.getSource()==hsR)
			{
		txtR.setText(String.valueOf(hsR.getValue()));
		setBackground(new Color(hsR.getValue(),hsG.getValue(),hsB.getValue()));
			}
			else if(e.getSource()==hsG)
			{
		txtG.setText(String.valueOf(hsG.getValue()));
		setBackground(new Color(hsR.getValue(),hsG.getValue(),hsB.getValue()));
			}
		else if(e.getSource()==hsB)
			{
		txtB.setText(String.valueOf(hsB.getValue()));
		setBackground(new Color(hsR.getValue(),hsG.getValue(),hsB.getValue()));
			}
		}
		public static void main(String []ar)
		{
			new First().show();
		}
	}
