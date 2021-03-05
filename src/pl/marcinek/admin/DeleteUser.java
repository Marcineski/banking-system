package pl.marcinek.admin;

import pl.marcinek.sql.sql;
import java.sql.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DeleteUser {
    public static int id;

    public static void DeleteUser() throws InterruptedException, SQLException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj id uzytkownika ktorego chcesz usunac?");
        TimeUnit.SECONDS.sleep(1);
        id = scan.nextInt();
        sql.admindeleteuser();
    }
}
