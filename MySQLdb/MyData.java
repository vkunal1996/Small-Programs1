import java.sql.*;
import java.util.Scanner;
class MyData
{
    public static void main(String []args) throws Exception
    {
        int rl;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Roll Number");
        rl=input.nextInt();
        Connection cn;
        PreparedStatement st;
        ResultSet rs;
        String url,sql;
        Class.forName("com.mysql.jdbc.Driver");
        //url="jdbc:mysql://localhost:3306/College","scarlet","Lmno1996&&";
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/College?autoReconnect=true&useSSL=false","scarlet","Lmno1996&&");
        sql="select * from Student where RollNumber=?";
        st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        st.setInt(1,rl);
        rs=st.executeQuery();
        rs.last();
        if(rs.getRow()==0)
        {
            System.out.println("No Record Found");
        }
            else
            {
                sql="select * from Student where RollNumber=?";
                st=cn.prepareStatement(sql);
                st.setInt(1,rl);
                rs=st.executeQuery();
                System.out.println("Roll Number \t Name \t Address");
                    while(rs.next())
                    {
                        System.out.print("      " +rs.getInt("RollNumber")+"\t\t");
                        System.out.print(rs.getString("Name")+"\t");
                        System.out.print(rs.getString("Address")+"\t");
                        System.out.println();
                    }
            }
        rs.close();
        st.close();
        cn.close();
    }
}
