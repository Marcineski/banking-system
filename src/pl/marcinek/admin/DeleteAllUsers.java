package pl.marcinek.admin;

import pl.marcinek.sql.sql;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteAllUsers {
    public static void DeleteAllUsers() throws InterruptedException, SQLException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Usunac wszystkich uzytkownikow?");
        String odp = scan.nextLine();

        if(odp.equals("tak")){
            System.out.println("Usuwam cala baze danych...");
            sql.admindeleteallusers();
        }
        if(odp.equals("nie")){
            System.out.println("Wracam do panelu glownego");
            Admin.admin();
        }
    }
}
