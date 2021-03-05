package pl.marcinek.licensing;

import java.util.Scanner;

public class License {
    public static void license(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj klucz licencyjny..");
        String odp = scan.nextLine();

        if(odp.equals("gowno z bazy")){
            System.out.println();
        }
    }
}
