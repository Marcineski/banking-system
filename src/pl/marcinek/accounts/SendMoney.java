package pl.marcinek.accounts;

import pl.marcinek.sql.sql;
import java.sql.SQLException;
import java.util.Scanner;

public class SendMoney {

    public static int authcode;
    public static int odp;

    public static void SendMoney() throws ClassNotFoundException, SQLException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj kod autoryzujący twojego znajomego");
        authcode = scan.nextInt();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Ile chcesz przelac?");
        odp = scan1.nextInt();

        sql.sendmoney();
    }
}
