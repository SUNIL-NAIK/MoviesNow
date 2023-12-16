package org.sunilnaik;
import org.sunilnaik.Theatre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if (theatre.login(username, password)) {
            System.out.println("Login successful!");
            // Add more code here to handle other operations
        } else {
            System.out.println("Login failed!");
        }
    }
}
