import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SignInForm extends JFrame implements ActionListener
{
    Container SignInContainer;
    JButton Home;
    JLabel lbluser,lblpass;
    JTextField tfuser;
    JPasswordField tfpass;
    JButton SignIn;
    
    String enteruname,enterPassword;
    char[] entpass;
    
    SignInForm()
    {
        SignInContainer=getContentPane();
        setSize(500,500);
        setLayout(null);
        setTitle("Sign In Form");
        
        Home=new JButton("Home");
        Home.setBounds(400,20,80,30);
        SignInContainer.add(Home);
        
        lbluser=new JLabel("Username");
        lbluser.setBounds(50,100,100,30);
        SignInContainer.add(lbluser);
        tfuser=new JTextField(25);
        tfuser.setBounds(160,100,200,30);
        SignInContainer.add(tfuser);
        
        lblpass=new JLabel("Password");
        lblpass.setBounds(50,150,100,30);
        SignInContainer.add(lblpass);
        tfpass=new JPasswordField(25);
        tfpass.setBounds(160,150,200,30);
        SignInContainer.add(tfpass);
        
        SignIn=new JButton("Login");
        SignIn.setBounds(160,200,200,30);
        SignInContainer.add(SignIn);
        
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent Close)
            {
                System.exit(1);
            }
        });
        Home.addActionListener(this);
        SignIn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent isClicked)
    {
        if(isClicked.getSource()==Home)
        {
            this.setVisible(false);
            new MainForm().show();
        }
            else if(isClicked.getSource()==SignIn)
            {
                enteruname=tfuser.getText();
                entpass= tfpass.getPassword();
                enterPassword=new String(entpass);
                
                SignUpForm s=new SignUpForm();
                if(enteruname.equals(s.name)==true&&enterPassword.equals(s.pass)==true)
                {
                    new SuccessFullLogin().show();
                }
                    else if(enteruname.equals(s.name)==false||enterPassword.equals(s.pass)==false)
                    {
                        new FailedLogin().show();
                    }
            }
    }
    
}
class SuccessFullLogin extends JFrame implements ActionListener
{
    Container Login;
    JButton Ok;
    JLabel Successfull;
    SuccessFullLogin()
    {
        Login=getContentPane();
        setTitle("Success");
        setSize(300,200);
        setLayout(null);
        Successfull=new JLabel("Login  SuccessFull");
        Successfull.setBounds(50,10,300,30);
        Login.add(Successfull);
        Ok=new JButton("OK");
        Ok.setBounds(100,100,100,30);
        Login.add(Ok);
        
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent Close)
            {
                System.exit(1);
            }
        });
       Ok.addActionListener(this);
    }
    public void actionPerformed(ActionEvent isClicked)
    {
        if(isClicked.getSource()==Ok)
        {
            this.setVisible(false);
        }
    }
}
class FailedLogin extends JFrame implements ActionListener
{
    Container FLogin;
    JButton Ok;
    JLabel Failed;
    FailedLogin()
    {
        FLogin=getContentPane();
        setTitle("Success");
        setSize(300,200);
        setLayout(null);
        Failed=new JLabel("Login  Failed");
        Failed.setBounds(50,10,300,30);
        FLogin.add(Failed);
        Ok=new JButton("OK");
        Ok.setBounds(100,100,100,30);
        FLogin.add(Ok);
        
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent Close)
            {
                System.exit(1);
            }
        });
       Ok.addActionListener(this);
    }
    public void actionPerformed(ActionEvent isClicked)
    {
        if(isClicked.getSource()==Ok)
        {
            this.setVisible(false);
        }
    }
}
class SignUpForm extends JFrame implements ActionListener
{
    Container SignUpContainer;
    JButton Home;
    
    JLabel lbluser,lblpass,lblrpass,lblemail,lblhinta,lblhintq;
    JTextField tfuser,tfemail,tfhintq;
    JPasswordField tfpass,tfrpass,tfhinta;
    JButton Register;
    
    JLabel indication;
    
    public static String name,pass,rpass,hinta,hintq,email;
    private static char[] charpass;
    private static char[] charrpass;
    private static char[] charhinta;
    SignUpForm()
    {
        SignUpContainer=getContentPane();
        setSize(500,500);
        setLayout(null);
        setTitle("Sign Up Form");
        
        Home=new JButton("Home");
        Home.setBounds(400,20,80,30);
        SignUpContainer.add(Home);
        
        indication=new JLabel("                                                     ");
        indication.setBounds(50,20,300,30);
        SignUpContainer.add(indication);
        
        lbluser=new JLabel("Username");
        lbluser.setBounds(50,100,100,30);
        SignUpContainer.add(lbluser);
        tfuser=new JTextField(25);
        tfuser.setBounds(160,100,200,30);
        SignUpContainer.add(tfuser);
        
        lblpass=new JLabel("Password");
        lblpass.setBounds(50,150,100,30);
        SignUpContainer.add(lblpass);
        tfpass=new JPasswordField(25);
        tfpass.setBounds(160,150,200,30);
        SignUpContainer.add(tfpass);
        
        lblrpass=new JLabel("Retype Pass");
        lblrpass.setBounds(50,200,100,30);
        SignUpContainer.add(lblrpass);
        tfrpass=new JPasswordField(25);
        tfrpass.setBounds(160,200,200,30);
        SignUpContainer.add(tfrpass);
        
        lblemail=new JLabel("Email Id");
        lblemail.setBounds(50,250,100,30);
        SignUpContainer.add(lblemail);
        tfemail=new JTextField(25);
        tfemail.setBounds(160,250,200,30);
        SignUpContainer.add(tfemail);
        
        lblhintq=new JLabel("Question");
        lblhintq.setBounds(50,300,100,30);
        SignUpContainer.add(lblhintq);
        tfhintq=new JTextField(25);
        tfhintq.setBounds(160,300,200,30);
        SignUpContainer.add(tfhintq);
        
        lblhinta=new JLabel("Answer");
        lblhinta.setBounds(50,350,100,30);
        SignUpContainer.add(lblhinta);
        tfhinta=new JPasswordField(25);
        tfhinta.setBounds(160,350,200,30);
        SignUpContainer.add(tfhinta);
        
        Register=new JButton("Register");
        Register.setBounds(160,400,200,30);
        SignUpContainer.add(Register);
        
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent Close)
            {
                System.exit(1);
            }
        });
        Home.addActionListener(this);
        Register.addActionListener(this);

    }
    public void actionPerformed(ActionEvent isClicked)
    {
        if(isClicked.getSource()==Home)
        {
            this.setVisible(false);
            new MainForm().show();
        }
            else if(isClicked.getSource()==Register)
            {
                name=tfuser.getText();
                charpass=tfpass.getPassword();
                charrpass=tfrpass.getPassword();
                email=tfemail.getText();
                hintq=tfhintq.getText();
                charhinta=tfhinta.getPassword();
                
                pass=new String(charpass);
                rpass=new String(charrpass);
                hinta=new String(charhinta);
                    
                    if(pass.equals(rpass)==false)
                    {
                        indication.setText("Password don't Match");
                    }
                        else
                        {
                            this.setVisible(false);
                            new SuccessFullForm().show();
                        }
            }
        
    }
    
}
class SuccessFullForm extends JFrame implements ActionListener
{
    Container Success;
    JButton Ok;
    JLabel Successfull;
    SuccessFullForm()
    {
        Success=getContentPane();
        setTitle("Success");
        setSize(300,200);
        setLayout(null);
        Successfull=new JLabel("Regisration SuccessFull");
        Successfull.setBounds(50,10,300,30);
        Success.add(Successfull);
        Ok=new JButton("OK");
        Ok.setBounds(100,100,100,30);
        Success.add(Ok);
        
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent Close)
            {
                System.exit(1);
            }
        });
       Ok.addActionListener(this);
    }
    public void actionPerformed(ActionEvent isClicked)
    {
        if(isClicked.getSource()==Ok)
        {
            this.setVisible(false);
            new MainForm().show();
        }
    }
}
class ForgotPasswordForm extends JFrame implements ActionListener
{
    Container ForgotPassContainer;
    JButton Home;
    JLabel lbluser,lblhintq,lblhinta;
    JButton Recover;
    JTextField tfuser,tfhintq;
    JPasswordField tfhinta;
    JLabel Indicator;
    
    String entname,enthintq,enthinta;
    char[] charhinta;
    ForgotPasswordForm()
    {
        ForgotPassContainer=getContentPane();
        setSize(500,500);
        setLayout(null);
        setTitle("Forgot Password");
        
        Home=new JButton("Home");
        Home.setBounds(400,20,80,30);
        ForgotPassContainer.add(Home);
        
        lbluser=new JLabel("Username");
        lbluser.setBounds(50,100,100,30);
        ForgotPassContainer.add(lbluser);
        tfuser=new JTextField(25);
        tfuser.setBounds(160,100,200,30);
        ForgotPassContainer.add(tfuser);

        lblhintq=new JLabel("Question");
        lblhintq.setBounds(50,150,100,30);
        ForgotPassContainer.add(lblhintq);
        tfhintq=new JTextField(25);
        tfhintq.setBounds(160,150,200,30);
        ForgotPassContainer.add(tfhintq);
        
        lblhinta=new JLabel("Answer");
        lblhinta.setBounds(50,200,100,30);
        ForgotPassContainer.add(lblhinta);
        tfhinta=new JPasswordField(25);
        tfhinta.setBounds(160,200,200,30);
        ForgotPassContainer.add(tfhinta);
        
        Recover=new JButton("Recover");
        Recover.setBounds(160,250,200,30);
        ForgotPassContainer.add(Recover);
        
        Indicator=new JLabel("                             ");
        Indicator.setBounds(50,300,300,30);
        ForgotPassContainer.add(Indicator);
        
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent Close)
            {
                System.exit(1);
            }
        });
       Home.addActionListener(this);
       Recover.addActionListener(this);

    }
    public void actionPerformed(ActionEvent isClicked)
    {
        if(isClicked.getSource()==Home)
        {
            this.setVisible(false);
            new MainForm().show();
        }
            else if(isClicked.getSource()==Recover)
            {
                entname=tfuser.getText();
                enthintq=tfhintq.getText();
                charhinta=tfhinta.getPassword();
                enthinta=new String(charhinta);
                
                SignUpForm s=new SignUpForm();
                if(entname.equals(s.name)==true&&enthintq.equals(s.hintq)==true&&enthinta.equals(s.hinta)==true)
                {
                    Indicator.setText("Your Password is : "+s.pass);
                }
                    else
                    {
                        Indicator.setText("UserName Or Answer is Wrong");
                    }
            }
    }
    
}
class MainForm extends JFrame implements ActionListener
{
    JButton SignIn,SignUp,ForgotPass;
    Container MainContainer;
    MainForm()
    {
        setSize(450,500);
        setTitle("Main Form");
        setLayout(null);
        MainContainer=getContentPane();
        SignIn=new JButton("Sign In");
        SignUp=new JButton("Sign Up");
        ForgotPass=new JButton("Forgot Pass ");
        
        SignIn.setBounds(50,50,100,30);
        MainContainer.add(SignIn);
        SignUp.setBounds(160,50,100,30);
        MainContainer.add(SignUp);
        ForgotPass.setBounds(270,50,100,30);
        MainContainer.add(ForgotPass);
        
        
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent Close)
            {
                System.exit(1);
            }
        });
        SignIn.addActionListener(this);
        SignUp.addActionListener(this);
        ForgotPass.addActionListener(this);
    }
    public void actionPerformed(ActionEvent isClicked)
    {
        if(isClicked.getSource()==SignIn)
        {
          this.setVisible(false);
          new SignInForm().show();
        }
            else if(isClicked.getSource()==SignUp)
            {
            this.setVisible(false);
            new SignUpForm().show();
            }
                else if(isClicked.getSource()==ForgotPass)
                {
                this.setVisible(false);
                new ForgotPasswordForm().show();
                }
    }
    public static void main(String []args )
    {
        new MainForm().show();
    }
}

