package pl.marcinek.accounts;

import pl.marcinek.admin.Admin;
import pl.marcinek.managers.AccountManager;
import pl.marcinek.sql.sql;

import java.sql.*;
import java.util.Scanner;

public class Login {
    public static String login;
    public static String password;
    public static String authcode;

    private static Connection conn = null;
    private static Statement st = null;
    private static PreparedStatement preparedStmt = null;

    public static void login() throws InterruptedException, SQLException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj login, haslo oraz kod autoryzujący");
        login = scan.nextLine();
        password = scan.nextLine();
        authcode = scan.nextLine();

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
        String query = "SELECT * from accounts";
        st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        int x = 0;
        while(rs.next()){
            if ((rs.getString("username").equals(login)) && rs.getString("password").equals(password) && rs.getString("authcode").equals(authcode)) {
                String stp = rs.getString("type");
                if (stp.equals("admin")) {
                    x = 1;
                    break;
                }else{
                    x = 2;
                    break;
                }
            }
        }
        if (x == 2) {
            AccountManager.accoutmanager();
        }else if(x == 1){
            Admin.admin();
        }else{
            System.out.println("Bledny login lub haslo");
        }
    }
}