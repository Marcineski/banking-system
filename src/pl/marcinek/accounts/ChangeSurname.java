package pl.marcinek.accounts;

import pl.marcinek.sql.sql;
import java.sql.SQLException;
import java.util.Scanner;

public class ChangeSurname {
    public static String odp;

    public static void changesurname() throws ClassNotFoundException, SQLException {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj nowe imie");
        odp = scan1.nextLine();
        sql.changesurname();
    }
}
