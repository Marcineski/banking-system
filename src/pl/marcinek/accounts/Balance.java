package pl.marcinek.accounts;

import pl.marcinek.sql.sql;
import java.sql.*;

public class Balance {
    public static void Balance() throws SQLException, ClassNotFoundException {
            System.out.println("stan konta: ");
            sql.balance();
    }
}