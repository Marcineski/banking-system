package pl.marcinek.accounts;

import pl.marcinek.sql.sql;
import java.sql.*;
import java.util.Scanner;

public class Deposit {
    public static int odp;

    public static void Deposit() throws ClassNotFoundException, SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ile chcesz wplacic?");
        odp = scan.nextInt();
        sql.deposit();
    }
}
