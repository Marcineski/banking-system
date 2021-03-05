package pl.marcinek.accounts;

import pl.marcinek.sql.sql;

import java.sql.SQLException;
import java.util.Scanner;

public class ChangePassword {

    public static String odp;
    public static void changepassword() throws SQLException, ClassNotFoundException {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj nowe haslo");
        odp = scan1.nextLine();

        sql.changepassword();
    }
}
