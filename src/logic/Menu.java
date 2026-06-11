package logic;

import java.util.Scanner;

public class Menu {

    public static int mainMenu(Scanner sc) {
        System.out.println("");
        System.out.println("[1] Depositar");
        System.out.println("[2] Sacar");
        System.out.println("[3] Transferir");
        System.out.println("[4] Sair");

        return sc.nextInt();
    }
}
