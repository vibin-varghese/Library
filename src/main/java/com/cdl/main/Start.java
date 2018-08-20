package com.cdl.main;

import java.util.HashMap;
import java.util.Scanner;

import com.cdl.library.openingaccount.NewAccount;
import com.cdl.library.view.DisplayMenu;

public class Start {

    private static HashMap<Integer, String> users = new HashMap<>();

    static {
        users.putIfAbsent(1, "Harry Potter");
        users.putIfAbsent(2, "Meghan Clarke");
        users.putIfAbsent(3, "Stephen Hawking");
    }

    public static void main(String[] args) {


        //Display Menu
        DisplayMenu displayMenu = new DisplayMenu();
        displayMenu.displayMenus();

        //Choosing Option
        System.out.println("Please select the option!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Option: ");
        int input = sc.nextInt();

        if(input == DisplayMenu.Menus.NEW_ACCOUNT.getPointer()) {
            NewAccount newAccount = new NewAccount();
            newAccount.openingAccount();
        }
    }

}
