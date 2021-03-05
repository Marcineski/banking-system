package pl.marcinek.managers;

import pl.marcinek.accounts.*;

import java.sql.SQLException;
import java.util.Scanner;

public class AccountManager {
    public static void accoutmanager() throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Wybierz opcje bankowa");
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("1: Pokasz stan konta");
        lista.add("2: Przelej pieniadze innemu uzytkownikowi banku");
        lista.add("3: Wyplac pieniadze");
        lista.add("4: Wplac pieniadze");
        lista.add("5: Usun konto");
        lista.add("6: Zmien nazwe uzytkownika");
        lista.add("7: Zmien haslo");
        lista.add("8: Zmien imie");
        lista.add("9: Zmien nazwisko");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
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

