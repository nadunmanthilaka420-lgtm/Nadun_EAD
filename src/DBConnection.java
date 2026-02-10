import java.sql.*;
public class DBConnection {
    Connection con;
    public Connection getConnectivity(){
        try{
            final String DB_URL="jdbc:mysql://localhost/SAMS";
            final String User_Name="root";
            final String Password="";
             Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection(DB_URL, User_Name, Password);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return con;
    
    }
}
