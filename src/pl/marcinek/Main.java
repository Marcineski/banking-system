package pl.marcinek;
import pl.marcinek.accounts.Login;
import pl.marcinek.accounts.Register;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException, SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz opcje");
        System.out.println("1:Zaloguj sie");
        System.out.println("2:Zajerestruj sie");
        String opcja = scanner.nextLine();

        if(opcja.equals("1")){
            Login.login();
        }
        if(opcja.equals("2")){
            Register.Register();
        }
    }
}
