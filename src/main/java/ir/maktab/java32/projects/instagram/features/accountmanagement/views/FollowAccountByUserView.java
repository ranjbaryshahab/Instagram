package ir.maktab.java32.projects.instagram.features.accountmanagement.views;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.accountmanagement.services.impl.FindByUsernameAccountByUserUseCaseImpl;
import ir.maktab.java32.projects.instagram.features.accountmanagement.services.impl.FollowAccountByUserUseCaseImpl;

import java.util.Scanner;

public class FollowAccountByUserView {
    private Scanner scanner = new Scanner(System.in);

    public void view() {
        System.out.println("Please enter username for follow : ");
        String username = scanner.nextLine();
        if (new FindByUsernameAccountByUserUseCaseImpl().find(username) != null) {
            User user = new FindByUsernameAccountByUserUseCaseImpl().find(username).get(0);
            System.out.println(user);
            System.out.println("Are you sure about this ???     (YES OR NO)");
            String answer = scanner.nextLine();
            if (answer.toLowerCase().equals("yes"))
                new FollowAccountByUserUseCaseImpl().follow(user);
        }
    }
}
