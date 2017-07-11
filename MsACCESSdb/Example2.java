import java.sql.*;


class Example2
 {
    public static void main(String argv[]) 
	{
        try
 {
            Class.forName("com.hxtt.sql.access.AccessDriver");

            String url = "jdbc:Access:///col.mdb";

            

            String sql = "select * from student";

            Connection con = DriverManager.getConnection(url, "", "");
            Statement stmt = con.createStatement();
	ResultSet rs=stmt.executeQuery(sql);
            while (rs.next()) 
	{
System.out.print(rs.getInt("Rollno"));
System.out.println(rs.getString("Name"));
                }
                


            rs.close();
            stmt.close();
            con.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
