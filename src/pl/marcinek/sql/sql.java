package pl.marcinek.sql;

import pl.marcinek.accounts.*;
import pl.marcinek.admin.DeleteUser;
import pl.marcinek.admin.UpdateUser;
import pl.marcinek.auth.Authenticator;

import java.sql.*;

public class sql {

    public static String balance;
    private static Connection conn = null;
    private static Statement st = null;
    private static PreparedStatement preparedStmt = null;

    public static void sql() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
        st = conn.createStatement();

    }

    public static void register() throws SQLException, ClassNotFoundException {
        sql.sql();
        String query = " insert into accounts (username, password, name, surname, balance, authcode, type)" + " values (?, ?, ?, ?, ?, ?, ?)";

        preparedStmt = conn.prepareStatement(query);
        preparedStmt.setString(1, Register.username);
        preparedStmt.setString(2, Register.password);
        preparedStmt.setString(3, Register.name);
        preparedStmt.setString(4, Register.surname);
        preparedStmt.setString(5, String.valueOf(Register.balance));
        preparedStmt.setString(6, Authenticator.authenticator());
        preparedStmt.setString(7, Register.type);
        preparedStmt.executeUpdate();
    }

    public static void newid() throws SQLException, ClassNotFoundException{
        sql.sql();
        String query = "SELECT * FROM accounts ORDER BY id DESC LIMIT 1;";
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            String id = rs.getString("id");
            System.out.println("ID twojego konta to :" + id);
        }
        st.executeQuery(query);
    }

    public static void balance() throws SQLException, ClassNotFoundException {
        sql.sql();
        String query = "SELECT balance FROM accounts WHERE authcode = " + Login.authcode;
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            balance = rs.getString("balance");
        }
    }

    public static void changename() throws SQLException, ClassNotFoundException {
        sql.sql();
        String query = "UPDATE accounts SET name = '"+ ChangeName.odp +"' WHERE authcode = " + Login.authcode;
        st.executeUpdate(query);
    }

    public static void changepassword() throws SQLException, ClassNotFoundException {
        sql.sql();
        String query = "UPDATE accounts SET password = '"+ ChangePassword.odp +"' WHERE authcode = " + Login.authcode;
        st.executeUpdate(query);
    }

    public static void changesurname() throws SQLException, ClassNotFoundException{
        sql.sql();
        String query = "UPDATE accounts SET surname = '"+ ChangeSurname.odp +"' WHERE authcode = " + Login.authcode;
        st.executeUpdate(query);
    }

    public static void changeusername() throws SQLException, ClassNotFoundException {
        sql.sql();
        String query = "UPDATE accounts SET username = '"+ ChangeUsername.odp +"' WHERE authcode = " + Login.authcode;
        st.executeUpdate(query);
    }

    public static void deleteaccount() throws SQLException, ClassNotFoundException {
        sql.sql();
        PreparedStatement st = conn.prepareStatement("DELETE FROM accounts WHERE authcode = " + Login.authcode + ";");
        st.executeUpdate();
        System.out.println("Konto usuniete!");
    }

    public static void deposit() throws SQLException, ClassNotFoundException{
        sql.sql();
        String query = "UPDATE accounts SET balance = balance + '"+ Deposit.odp +"' WHERE authcode = " + Login.authcode;
        st.executeUpdate(query);
    }

    public static void sendmoney() throws SQLException, ClassNotFoundException{
        sql.sql();
        String query = "UPDATE accounts SET balance = balance + '"+ SendMoney.odp +"' WHERE authcode = " + SendMoney.authcode; //odbiornik
        String query1= "UPDATE accounts SET balance = balance - '"+ SendMoney.odp +"' WHERE authcode = " + Login.authcode; //wysylajacy
        st.executeUpdate(query);
        st.executeUpdate(query1);
    }

    public static void withdraw() throws SQLException, ClassNotFoundException {
        sql.sql();
        String query = "UPDATE accounts SET balance = balance - '"+ Withdraw.odp +"' WHERE authcode = " + Login.authcode;
        st.executeUpdate(query);
    }
    //ADMIN
    public static void admindeleteuser() throws SQLException, ClassNotFoundException {
        sql.sql();
        String query = "delete from accounts where id = ?";
        PreparedStatement preparedStmt = conn.prepareStatement(query);
        preparedStmt.setInt(1, DeleteUser.id);
        preparedStmt.execute();
        System.out.println("Usunieto uzytkownika z id: " + DeleteUser.id);
    }

    public static void admindeleteallusers() throws SQLException, ClassNotFoundException{
        sql.sql();
        PreparedStatement pre = conn.prepareStatement("DELETE FROM accounts");
        pre.executeUpdate();
    }

    public static void adminshowall() throws SQLException, ClassNotFoundException{
        sql.sql();
        String query = "SELECT * FROM accounts  ";
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            String id = rs.getString("id");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String name = rs.getString("name");
            String surname = rs.getString("surname");
            String balance = rs.getString("balance");
            String authcode = rs.getString("authcode");

            System.out.println("id: username: password: name: surname: balance: authcode:");
            System.out.println(id + " " + username + " " + password + " " + name + " " + surname + " " + balance + " " + authcode);
            System.out.println(" ");
        }
        st.executeQuery(query);
    }

    public static void updateuser1() throws SQLException, ClassNotFoundException{
        sql.sql();
        String query = "UPDATE accounts SET username = '"+ UpdateUser.odp1 +"' WHERE authcode = " + Login.authcode;
        st.executeUpdate(query);
        conn.close();
    }

    public static void updateuser2() throws SQLException, ClassNotFoundException {
        sql.sql();
        String query = "UPDATE accounts SET password = '"+ UpdateUser.odp2 +"' WHERE authcode = " + Login.authcode;
        st.executeUpdate(query);
        conn.close();
    }

    public static void updateuser3() throws SQLException, ClassNotFoundException{
        sql.sql();
        String query = "UPDATE accounts SET name = '"+ UpdateUser.odp3 +"' WHERE id = " + Login.authcode;
        st.executeUpdate(query);
        conn.close();
    }

    public static void updateuser4() throws SQLException, ClassNotFoundException{
        sql.sql();
        String query = "UPDATE accounts SET surname = '"+ UpdateUser.odp4 +"' WHERE id = " + Login.authcode;
        st.executeUpdate(query);
        conn.close();
    }

    public static void updateuser5() throws SQLException, ClassNotFoundException{
        sql.sql();
        String query = "UPDATE accounts SET balance = '"+ UpdateUser.odp5 +"' WHERE id = " + Login.authcode;
        st.executeUpdate(query);
        conn.close();
    }
}