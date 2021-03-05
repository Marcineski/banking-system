package pl.marcinek.managers;

import pl.marcinek.accounts.*;

import java.sql.SQLException;
import java.util.Scanner;

public class AccountManager {
    public static void accoutmanager() throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz opcje bankowa");
        System.out.println("1: Pokasz stan konta");
        System.out.println("2: Przelej pieniadze innemu uzytkownikowi banku");
        System.out.println("3: Wyplac pieniadze");
        System.out.println("4: Wplac pieniadze");
        System.out.println("5: Usun konto");
        System.out.println("6: Zmien nazwe uzytkownika");
        System.out.println("7: Zmien haslo");
        System.out.println("8: Zmien imie");
        System.out.println("9: Zmien nazwisko");

        String scan = scanner.nextLine();

        if(scan.equals("1")){
            Balance.Balance();
        }
        if(scan.equals("2")){
            SendMoney.SendMoney();
        }
        if(scan.equals("3")){
            Withdraw.Withdraw();
        }
        if(scan.equals("4")){
            Deposit.Deposit();
        }
        if(scan.equals("5")){
            DeleteAccount.DeleteAccount();
        }
        if(scan.equals("6")){
            ChangeUsername.changeusername();
        }
        if(scan.equals("7")){
            ChangePassword.changepassword();
        }
        if(scan.equals("8")){
            ChangeName.changename();
        }
        if(scan.equals("9")){
            ChangeSurname.changesurname();
        }

    }
}
