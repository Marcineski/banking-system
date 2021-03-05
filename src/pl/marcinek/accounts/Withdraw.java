package pl.marcinek.accounts;

import pl.marcinek.sql.sql;
import java.sql.SQLException;
import java.util.Scanner;

public class Withdraw {
    public static int odp;

    public static void Withdraw() throws ClassNotFoundException, SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ile chcesz wyplacic?");
        int odp = scan.nextInt();

        sql.withdraw();
    }
}
