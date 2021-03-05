package pl.marcinek.accounts;

import pl.marcinek.sql.sql;
import java.sql.SQLException;
import java.util.Scanner;

public class ChangeUsername {
    public static int id;
    public static String odp;

    public static void changeusername() throws ClassNotFoundException, SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nowa nazwe uzytkownika");
        odp = scan.nextLine();

        sql.changeusername();
    }
}
