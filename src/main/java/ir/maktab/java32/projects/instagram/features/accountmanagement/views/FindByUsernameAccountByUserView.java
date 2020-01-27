package ir.maktab.java32.projects.instagram.features.accountmanagement.views;

import ir.maktab.java32.projects.instagram.features.accountmanagement.services.impl.FindByUsernameAccountByUserUseCaseImpl;

import java.util.Scanner;

public class FindByUsernameAccountByUserView {
    private Scanner scanner = new Scanner(System.in);

    public void view() {
        System.out.println("Please enter username : ");

        String username = scanner.nextLine();
        if (new FindByUsernameAccountByUserUseCaseImpl().find(username) != null) {
            System.out.println(new FindByUsernameAccountByUserUseCaseImpl().find(username).get(0));
        }
    }
}
