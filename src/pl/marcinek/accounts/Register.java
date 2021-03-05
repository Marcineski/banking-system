package pl.marcinek.accounts;

import pl.marcinek.sql.sql;

import java.sql.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Register {
    public static String username;
    public static String password;
    public static String name;
    public static String surname;
    public static int balance;
    public static String type;


    public static void Register() throws InterruptedException, SQLException, ClassNotFoundException {
        Scanner reg = new Scanner(System.in);
        System.out.println("Zajerestruj sie w tej kolejnosci...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Nazwa uzytkownika, haslo, imie, nazwisko oraz ile posiadasz gotowki");

        username = reg.nextLine();
        password = reg.nextLine();
        name = reg.nextLine();
        surname = reg.nextLine();
        balance = reg.nextInt();
        type = "user";

        System.out.println("Zostale/as poprawnie zajerestowany");
        System.out.println("Twoj wlasny kod zabezpieczajacy to: ");
        sql.register();
        TimeUnit.SECONDS.sleep(1);
        sql.newid();
    }
}