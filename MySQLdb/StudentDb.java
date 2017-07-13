import java.sql.*;
import java.util.Scanner;
class StudentDb
{
    public static void main(String args[])throws Exception
    {
        Scanner input=new Scanner(System.in);
        char choice;
        int rl;
        String name,address;
        System.out.println("1.)Show all Data ");
        System.out.println("2.)Show Records RollNumberwise");
        System.out.println("3.)Show Records NameWise");
        System.out.println("4.)Show Records Addresswise");
        System.out.print("Enter Your Choice : ");
        choice =input.next().charAt(0);
        
        Connection con;
        PreparedStatement st;
        ResultSet rs;
        String url,sql;
        
        
        switch(choice)
        {
            case '1':
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Collegedb?autoReconnect=true&useSSL=false","scarlet","Lmno1996&&");
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
                        while(rs.next())
                        {
                            System.out.print("      " +rs.getInt("RollNumber")+"\t\t");
                            System.out.print(rs.getString("StudentName")+"\t");
                            System.out.print(rs.getString("Address")+"\t");
                            System.out.println();
                        }
                        rs.close();
                        st.close();
                        con.close();
                    }
                break;
                
                case '2':
                System.out.println("Enter the Roll Number : ");
                rl=input.nextInt();
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Collegedb?autoReconnect=true&useSSL=false","scarlet","Lmno1996&&");
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
                        while(rs.next())
                        {
                            System.out.print("      " +rs.getInt("RollNumber")+"\t\t");
                            System.out.print(rs.getString("StudentName")+"\t");
                            System.out.print(rs.getString("Address")+"\t");
                            System.out.println();
                        }
                        rs.close();
                        st.close();
                        con.close();
                    }
                break;
                
                case '3':
                System.out.println("Enter the Name : ");
                input.nextLine();
                name=input.nextLine();
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Collegedb?autoReconnect=true&useSSL=false","scarlet","Lmno1996&&");
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
                        while(rs.next())
                        {
                            System.out.print("      " +rs.getInt("RollNumber")+"\t\t");
                            System.out.print(rs.getString("StudentName")+"\t");
                            System.out.print(rs.getString("Address")+"\t");
                            System.out.println();
                        }
                        rs.close();
                        st.close();
                        con.close();
                    }
                break;
                
                case '4':
                System.out.println("Enter the Address : ");
                input.nextLine();
                address=input.nextLine();
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Collegedb?autoReconnect=true&useSSL=false","scarlet","Lmno1996&&");
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
                        while(rs.next())
                        {
                            System.out.print("      " +rs.getInt("RollNumber")+"\t\t");
                            System.out.print(rs.getString("StudentName")+"\t");
                            System.out.print(rs.getString("Address")+"\t");
                            System.out.println();
                        }
                        rs.close();
                        st.close();
                        con.close();
                    }
                break;
                
        }
        
        
        
    }
   
}