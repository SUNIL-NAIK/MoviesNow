package org.sunilnaik;

import java.util.*;

public class Theatre {
    private String username = "admin";
    private String password = "admin";
    private int[][] seats = new int[10][10];

    boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    void updatePassword(String newPassword) {
        this.password = newPassword;
    }

    void viewSeatingArrangement() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
    /// new commit /// merged confict

    boolean bookTicket(int row, int col) {
        if (seats[row][col] == 0) {
            seats[row][col] = 1;
            return true;
        } else {
            return false;
        }
    }

    boolean checkBookingStatus(int row, int col) {
        return seats[row][col] == 1;
    }
}

