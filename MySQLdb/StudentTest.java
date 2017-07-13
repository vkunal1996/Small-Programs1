import java.sql.*;
import java.util.Scanner;
class StudentTest
{
    
    public static void main(String args[])throws Exception
    {
       
         Connection con;
        PreparedStatement st;
        ResultSet rs;
        
        String url,sql;
        char choice;
        int rl;
        String name,address;
        
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Collegedb?autoReconnect=true&useSSL=false","scarlet","Lmno1996&&");
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("1.)Show all Data ");
        System.out.println("2.)Show Records RollNumberwise");
        System.out.println("3.)Show Records NameWise");
        System.out.println("4.)Show Records Addresswise");
        System.out.print("Enter Your Choice : ");
        choice =input.next().charAt(0);       
        switch(choice)
        {
            case '1':
                
                sql="select * from Student";
                st=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                rs=st.executeQuery();
                rs.last();
                if(rs.getRow()==0)
                {
                    System.out.println("No Record Found");
                }
                    else
                    {
                        sql="select * from Student";
                        st=con.prepareStatement(sql);
                        rs=st.executeQuery();
                        System.out.println("Roll Number \tName \tAddress");
                        print(rs);
                        Close(rs,con,st);
                    }
                break;
                
                case '2':
                System.out.println("Enter the Roll Number : ");
                rl=input.nextInt();
                
                sql="select * from Student where RollNumber= ?";
                st=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                st.setInt(1,rl);
                rs=st.executeQuery();
                rs.last();
                if(rs.getRow()==0)
                {
                    System.out.println("No Record Found");
                }
                    else
                    {
                        sql="select * from Student where RollNumber= ?";
                        st=con.prepareStatement(sql);
                        st.setInt(1,rl);
                        rs=st.executeQuery();
                        System.out.println("Roll Number \tName \tAddress");
                        print(rs);
                        Close(rs,con,st);
                    }
                break;
                
                case '3':
                System.out.println("Enter the Name : ");
                input.nextLine();
                name=input.nextLine();
                
                sql="select * from Student where StudentName= ?";
                st=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                st.setString(1,name);
                rs=st.executeQuery();
                rs.last();
                if(rs.getRow()==0)
                {
                    System.out.println("No Record Found");
                }
                    else
                    {
                        sql="select * from Student where StudentName= ?";
                        st=con.prepareStatement(sql);
                        st.setString(1,name);
                        rs=st.executeQuery();
                        System.out.println("Roll Number \tName \tAddress");
                        print(rs);
                        Close(rs,con,st);
                    }
                break;
                
                case '4':
                System.out.println("Enter the Address : ");
                input.nextLine();
                address=input.nextLine();
                
                sql="select * from Student where Address= ?";
                st=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                st.setString(1,address);
                rs=st.executeQuery();
                rs.last();
                if(rs.getRow()==0)
                {
                    System.out.println("No Record Found");
                }
                    else
                    {
                        sql="select * from Student where Address= ?";
                        st=con.prepareStatement(sql);
                        st.setString(1,address);
                        rs=st.executeQuery();
                        System.out.println("Roll Number \tName \tAddress");
                        print(rs);
                       Close(rs,con,st);
                    }
                break;
                
        }                   
    }
    
    public static void Close(ResultSet rs,Connection con,PreparedStatement st)throws Exception
    {
        rs.close();
        con.close();
        st.close();
    }
   public static void print(ResultSet rs)throws Exception
   {
        while(rs.next())
         {
            System.out.print("      " +rs.getInt("RollNumber")+"\t\t");                         System.out.print(rs.getString("StudentName")+"\t");
            System.out.print(rs.getString("Address")+"\t");
            System.out.println();
        }   
   }
}