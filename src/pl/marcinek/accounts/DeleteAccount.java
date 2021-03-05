package pl.marcinek.accounts;

import pl.marcinek.sql.sql;

import java.sql.*;

public class DeleteAccount {
    public static void DeleteAccount() throws ClassNotFoundException, SQLException {
        sql.deleteaccount();
    }
}