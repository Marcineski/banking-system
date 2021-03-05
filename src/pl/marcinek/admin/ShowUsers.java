package pl.marcinek.admin;

import pl.marcinek.sql.sql;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class ShowUsers {
    public static void showUsers() throws InterruptedException, SQLException, ClassNotFoundException {
        System.out.println("Pokazuje wszystkich dostpenych uzytkownikow..");
        TimeUnit.SECONDS.sleep(2);
        sql.adminshowall();

    }
}
