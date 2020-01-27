package ir.maktab.java32.projects.instagram.features.accountmanagement.views;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.accountmanagement.services.impl.FindByUsernameAccountByUserUseCaseImpl;
import ir.maktab.java32.projects.instagram.features.accountmanagement.services.impl.UnFollowAccountByUserUseCaseImpl;

import java.util.Scanner;

public class UnFollowAccountByUserView {
    private Scanner scanner = new Scanner(System.in);

    public void view() {
        System.out.println("Please enter username for unFollow : ");
        User user =
                new FindByUsernameAccountByUserUseCaseImpl().find(scanner.nextLine()).get(0);

        if (user != null) {
            System.out.println(user);
            System.out.println("Are you sure about this ???     (YES OR NO)");
            String answer = scanner.nextLine();
            if (answer.toLowerCase().equals("yes"))
                new UnFollowAccountByUserUseCaseImpl().unFollow(user);
        }
    }
}
