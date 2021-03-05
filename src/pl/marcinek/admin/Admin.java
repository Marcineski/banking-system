package pl.marcinek.admin;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Admin {
    public static void admin() throws InterruptedException, SQLException, ClassNotFoundException {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Wybierz opcje admina");
        TimeUnit.SECONDS.sleep(2);

        System.out.println("1: Pokaz wszystkich uzytkownikow");
        System.out.println("2: Usun wybranego uzytkownika");
        System.out.println("3: Aktualizuj konto uzytkownika");
        System.out.println("4: Usun wszystkich uzytkownika");
        String scan = scaner.nextLine();
        System.out.println("Wybrales: " + scan);

        if(scan.equals("1")){
            ShowUsers.showUsers();
        }
        if(scan.equals("2")){
            DeleteUser.DeleteUser();
        }
        if(scan.equals("3")){
            UpdateUser.UpdateUser();
        }
        if(scan.equals("4")){
            DeleteAllUsers.DeleteAllUsers();
        }
    }
}
