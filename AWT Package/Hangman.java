import java.awt.*;
import java.awt.event.*;
class Hangman extends Frame implements ActionListener
{
	Label InputMovie,OutputMovie,turnLabel,turnLabelOutput,lresultLabel,lresultLabelOutput,wresultLabel,wresultLabelOutput,Player1,Player2;
	TextField Input,Ouput,player1,player2;
	Button A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;
	Button one,two,three,four,five,six,seven,eight,nine,zero;
	Panel MoviePanel,ButtonPanel;
	Panel TurnsLeft;
	Panel Result;

	String org_movie,player1Name,player2Name;
	int i;
	private static int flag=0;
	private static int countTurns=9;
	char ch[];
    private static String guess_movie;
    private static char checkChar;

	Hangman()
	{
		setSize(400,500);
		setBackground(Color.PINK);
		setTitle("Hangman...");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		InputMovie=new Label("Enter Movie");
		Input=new TextField(20);
		Input.setEchoChar('*');
		OutputMovie=new Label("Guess Movie");
		Ouput=new TextField(20);
		turnLabel=new Label("Turns Left: ");
		turnLabelOutput=new Label("");
		wresultLabel=new Label("                         ");
		wresultLabelOutput=new Label("                   ");
		lresultLabel=new Label("                         ");
		lresultLabelOutput=new Label("                   ");
		Player1=new Label("Player Dominating : ");
		player1=new TextField(20);
		Player2=new Label("Player Competing  : ");
		player2=new TextField(20);
		A=new Button("A");
		B=new Button("B");
		C=new Button("C");
		D=new Button("D");
		E=new Button("E");
		F=new Button("F");
		G=new Button("G");
		H=new Button("H");
		I=new Button("I");
		J=new Button("J");
		K=new Button("K");
		L=new Button("L");
		M=new Button("M");
		N=new Button("N");
		O=new Button("O");
		P=new Button("P");
		Q=new Button("Q");
		R=new Button("R");
		S=new Button("S");
		T=new Button("T");
		U=new Button("U");
		V=new Button("V");
		W=new Button("W");
		X=new Button("X");
		Y=new Button("Y");
		Z=new Button("Z");
		one=new Button("1");
		two=new Button("2");
		three=new Button("3");
		four=new Button("4");
		five=new Button("5");
		six=new Button("6");
		seven=new Button("7");
		eight=new Button("8");
		nine=new Button("9");
		zero=new Button("0");
		

		TurnsLeft=new Panel();
		TurnsLeft.setLayout(new GridLayout(1,2,10,10));
		TurnsLeft.add(turnLabel);TurnsLeft.add(turnLabelOutput);
		turnLabelOutput.setEnabled(false);
		turnLabelOutput.setText(String.valueOf(countTurns));
		add(TurnsLeft);

		MoviePanel=new Panel();
		
		MoviePanel.setLayout(new GridLayout(4,2,10,10));
		MoviePanel.add(Player1);MoviePanel.add(player1);
		MoviePanel.add(Player2);MoviePanel.add(player2);
		MoviePanel.add(InputMovie);MoviePanel.add(Input);
		MoviePanel.add(OutputMovie);MoviePanel.add(Ouput);
		
		Ouput.setEditable(false);
		add(MoviePanel);
	
		ButtonPanel=new Panel();

		ButtonPanel.setLayout(new GridLayout(4,9,10,10));
		ButtonPanel.add(A);ButtonPanel.add(B);ButtonPanel.add(C);ButtonPanel.add(D);ButtonPanel.add(E);ButtonPanel.add(F);ButtonPanel.add(G);ButtonPanel.add(H);ButtonPanel.add(I);ButtonPanel.add(J);ButtonPanel.add(K);ButtonPanel.add(L);ButtonPanel.add(M);ButtonPanel.add(N);ButtonPanel.add(O);ButtonPanel.add(P);
		ButtonPanel.add(Q);ButtonPanel.add(R);ButtonPanel.add(S);ButtonPanel.add(T);ButtonPanel.add(U);ButtonPanel.add(V);ButtonPanel.add(W);ButtonPanel.add(X);ButtonPanel.add(Y);ButtonPanel.add(Z);ButtonPanel.add(one);ButtonPanel.add(two);ButtonPanel.add(three);ButtonPanel.add(four);ButtonPanel.add(five);ButtonPanel.add(six);
		ButtonPanel.add(seven);ButtonPanel.add(eight);ButtonPanel.add(nine);ButtonPanel.add(zero);
		add(ButtonPanel);

		Result=new Panel();
		Result.setLayout(new GridLayout(2,2,10,10));
		Result.add(wresultLabel);Result.add(wresultLabelOutput);
		Result.add(lresultLabel);Result.add(lresultLabelOutput);
		add(Result);

		A.addActionListener(this);
		B.addActionListener(this);
		C.addActionListener(this);
		D.addActionListener(this);
		E.addActionListener(this);
		F.addActionListener(this);
		G.addActionListener(this);
		H.addActionListener(this);
		I.addActionListener(this);
		J.addActionListener(this);
		K.addActionListener(this);
		L.addActionListener(this);
		M.addActionListener(this);
		N.addActionListener(this);
		O.addActionListener(this);
		P.addActionListener(this);
		Q.addActionListener(this);
		R.addActionListener(this);
		S.addActionListener(this);
		T.addActionListener(this);
		U.addActionListener(this);
		V.addActionListener(this);
		W.addActionListener(this);
		X.addActionListener(this);
		Y.addActionListener(this);
		Z.addActionListener(this);
		zero.addActionListener(this);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		

		setResizable(false);
		Ouput.addFocusListener(new FocusAdapter()
				{
						public void focusGained(FocusEvent e)
						{
							player1Name=player1.getText();
							player2Name=player2.getText();
							org_movie=Input.getText();
							org_movie=org_movie.toUpperCase();
							ch=org_movie.toCharArray();
							for(i=0;i<(ch.length);i++)
							{
								if(ch[i]=='A'||ch[i]=='I'||ch[i]=='E'||ch[i]=='O'||ch[i]=='U')
								{
									continue;
								}
								else if(ch[i]==' ')
								{
									ch[i]=' ';
								}
									else if(ch[i]=='-')
									{
										ch[i]='-';
									}
										else if(ch[i]=='/')
										{
											ch[i]='/';
										}
											else if(ch[i]=='(')
											{
												ch[i]='(';
											}
												else if(ch[i]==')')
												{
													ch[i]=')';
												}
									else
									{
										ch[i]='_';
									}
							}
							guess_movie=new String(ch);
							Ouput.setText(guess_movie);
							A.setEnabled(false);
							I.setEnabled(false);
							O.setEnabled(false);
							U.setEnabled(false);
							E.setEnabled(false);
						}
						
				});

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(1);
			}
		});
	}
	
	public void actionPerformed(ActionEvent e)
	{


				if(e.getSource()==B)
				{
					checkChar='B';
					checkState(B,checkChar);
				}	
					else if(e.getSource()==C)
					{
						checkChar='C';
						checkState(C,checkChar);
					}
						
					else if(e.getSource()==D)
					{
						checkChar='D';
						checkState(D,checkChar);
					}
					else if(e.getSource()==F)
					{
						checkChar='F';
						checkState(F,checkChar);
					}
					else if(e.getSource()==G)
					{
						checkChar='G';
						checkState(G,checkChar);
					}
					else if(e.getSource()==H)
					{
						checkChar='H';
						checkState(H,checkChar);
					}	
					else if(e.getSource()==J)
					{
						checkChar='J';
						checkState(J,checkChar);
					}
					else if(e.getSource()==K)
					{
						checkChar='K';
						checkState(K,checkChar);
					}
					else if(e.getSource()==L)
					{
						checkChar='L';
						checkState(L,checkChar);
					}
					else if(e.getSource()==M)
					{
						checkChar='M';
						checkState(M,checkChar);
					}
					else if(e.getSource()==N)
					{
						checkChar='N';
						checkState(N,checkChar);
					}
					else if(e.getSource()==P)
					{
						checkChar='P';
						checkState(P,checkChar);
					}
					else if(e.getSource()==Q)
					{
						checkChar='Q';
						checkState(Q,checkChar);
					}
					else if(e.getSource()==R)
					{
						checkChar='R';
						checkState(R,checkChar);
					}
					else if(e.getSource()==S)
					{
						checkChar='S';
						checkState(S,checkChar);;
					}
					else if(e.getSource()==T)
					{
						checkChar='T';
						checkState(T,checkChar);
					}
					else if(e.getSource()==V)
					{
						checkChar='V';
						checkState(V,checkChar);
					}
					else if(e.getSource()==W)
					{
						checkChar='W';
						checkState(W,checkChar);
					}
					else if(e.getSource()==X)
					{
						checkChar='X';
						checkState(X,checkChar);
					}
					else if(e.getSource()==Y)
					{
						checkChar='Y';
						checkState(Y,checkChar);
					}
					else if(e.getSource()==Z)
					{
						checkChar='Z';
						checkState(Z,checkChar);
					}
					else if(e.getSource()==Z)
					{
						checkChar='Z';
						checkState(Z,checkChar);
					}
					else if(e.getSource()==Z)
					{
						checkChar='Z';
						checkState(Z,checkChar);
					}
					else if(e.getSource()==Z)
					{
						checkChar='Z';
						checkState(Z,checkChar);
					}
					else if(e.getSource()==Z)
					{
						checkChar='Z';
						checkState(Z,checkChar);
					}
					else if(e.getSource()==Z)
					{
						checkChar='Z';
						checkState(Z,checkChar);
					}
					else if(e.getSource()==Z)
					{
						checkChar='Z';
						checkState(Z,checkChar);
					}
					else if(e.getSource()==Z)
					{
						checkChar='Z';
						checkState(Z,checkChar);
					}

					else if(e.getSource()==Z)
					{
						checkChar='Z';
						checkState(Z,checkChar);
					}
					else if(e.getSource()==Z)
					{
						checkChar='Z';
						checkState(Z,checkChar);
					}

					else if(e.getSource()==Z)
					{
						checkChar='Z';
						checkState(Z,checkChar);
					}
			   
				
	}
				public  void checkState(Button obj,char checkChar)
				{
					
						boolean b;
						ch=guess_movie.toCharArray();
						for(i=0;i<ch.length;i++)
						{
							if(org_movie.charAt(i)==checkChar)
							{
								ch[i]=checkChar;
								flag=1;
							}
						}
							if(flag==0)
							{
								countTurns--;
								turnLabelOutput.setText(String.valueOf(countTurns));
								obj.setEnabled(false);
							}
								else
								{
									guess_movie=new String(ch);
									Ouput.setText("");
									Ouput.setText(guess_movie);
									obj.setEnabled(false);
									flag=0;
								}

								b=checkTurns(countTurns);
								if(b==false)
								{
									lresultLabel.setText("Losing Person");
									lresultLabelOutput.setText(player2Name);
									lresultLabel.setText("Winning Person");
									lresultLabelOutput.setText(player1Name);
									Input.setText(org_movie);
									
									disableButtons();
									
								}
									else if(b==true)
									{
										if(org_movie.equals(guess_movie))
										{
											lresultLabel.setText("Losing Person");
											lresultLabelOutput.setText(player1Name);
											lresultLabel.setText("Winning Person");
											lresultLabelOutput.setText(player2Name);
											disableButtons();
										}
									}
					
				}

	public boolean checkTurns(int countTurns)
	{
		boolean b=true;
		if(countTurns==0)
			b=false;
			else if(countTurns>0)
				b=true;

			return b;
	}
	public void disableButtons()
	{
		B.setEnabled(false);
		C.setEnabled(false);
		D.setEnabled(false);
	    F.setEnabled(false);
		G.setEnabled(false);
		H.setEnabled(false);
        J.setEnabled(false);
		K.setEnabled(false);
		L.setEnabled(false);
     	M.setEnabled(false);
		N.setEnabled(false);
		P.setEnabled(false);
		Q.setEnabled(false);
		R.setEnabled(false);
		S.setEnabled(false);
		T.setEnabled(false);
		V.setEnabled(false);
		W.setEnabled(false);
		X.setEnabled(false);
		Y.setEnabled(false);
		Z.setEnabled(false);
	}
	
	public static void main(String []args)
	{
		new Hangman().show();
	}
}