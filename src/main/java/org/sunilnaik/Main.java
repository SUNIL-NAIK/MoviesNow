package org.sunilnaik;


import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dictionary<String, String> Usercreds = new Hashtable<>();
        Usercreds.put("Sunil", "abcd59@");
        System.out.println(Usercreds.get("Sunil"));

        // Login check ...
        Scanner sc = new Scanner(System.in);
        String Username = sc.next();
        String password = sc.next();
        try {
            if (Usercreds.get(Username).equals(password)) {
                System.out.println("Success login");
            }
            else{
                System.out.println("Incorrect password");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("User doesn't exist...");
        }

    }
}