package pl.marcinek.admin;

import pl.marcinek.sql.sql;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UpdateUser {
    public static int id;
    public static String odp1;
    public static String odp2;
    public static String odp3;
    public static String odp4;
    public static int odp5;


    public static void UpdateUser() throws InterruptedException, ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Co chcesz zaktualizowac?");
        TimeUnit.SECONDS.sleep((long) 0.5);
        System.out.println("1: Nazwa");
        System.out.println("2: Haslo");
        System.out.println("3: Imie");
        System.out.println("4: Nazwisko");
        System.out.println("5: Stan konta");
        System.out.println("6: Pokasz wszystkich uzytkownikow bazy danych");
        String odp = scanner.nextLine();

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj id uzytkownika");
        id = scan.nextInt();

        if(odp.equals("1")){
                Scanner scan1 = new Scanner(System.in);
                System.out.println("Podaj nowa nazwe uzytkownika");
                odp1 = scan1.nextLine();

                sql.updateuser1();
        }
        if(odp.equals("2")){
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Podaj nowe haslo");
            odp2 = scan1.nextLine();

            sql.updateuser2();
        }
        if(odp.equals("3")){
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Podaj nowe imie uzytkownika");
            odp3 = scan1.nextLine();

            sql.updateuser3();
        }
        if(odp.equals("4")){
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Podaj nowe nazwisko uzytkownika");
            odp4 = scan1.nextLine();

            sql.updateuser4();
        }
        if(odp.equals("5")){
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Podaj nowy stan konta uzytkownika");
            odp5 = scan1.nextInt();

            sql.updateuser5();
        }
        if(odp.equals("6")){
            sql.adminshowall();
        }
    }
}
