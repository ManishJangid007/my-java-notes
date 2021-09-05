import java.net.ConnectException;
import java.sql.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.naming.CommunicationException;

public class TheSQLTest {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/collage", "root", "");
        System.out.println("Connected to Database collage");

        Scanner input = new Scanner(System.in);

        Statement st = con.createStatement();
        try {
            System.out.println("Email : ");
            String email = input.nextLine();
            ResultSet email_query = st.executeQuery("SELECT * FROM student_data WHERE email = '" + email + "'");
            email_query.next();
            String name = email_query.getString("name");
            System.out.println("Password : ");
            String password = input.nextLine();
            ResultSet data = st.executeQuery(
                    "SELECT * FROM student_data WHERE email = '" + email + "' AND password = '" + password + "'");
            data.next();
            name = data.getString("name");
            System.out.println("Welcome " + name);
        } catch (SQLException e) {
            System.out.println("User Not Found");
        } catch (NoSuchElementException e) {
            System.out.println("User Not Found");
        }
    }
}