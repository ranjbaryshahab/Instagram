package ir.maktab.java32.projects.instagram.features.accountmanagement.views;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.accountmanagement.services.impl.LoginToAccountByUserUseCaseImpl;
import ir.maktab.java32.projects.instagram.features.shared.service.AuthenticationService;

import java.util.Scanner;

public class LoginToAccountByUserView {
    private Scanner scanner = new Scanner(System.in);
    private User user = new User();

    public void view() {
        User loginUser;

        System.out.println("Please enter username : ");
        user.setUsername(scanner.nextLine());

        System.out.println("Please enter password : ");
        user.setPassword(scanner.nextLine());

        if ((loginUser = new LoginToAccountByUserUseCaseImpl().login(user)) != null) {
            AuthenticationService.getInstance().setLoginUser(loginUser);
            System.out.println("Welcome to Instagram application");
        }
    }
}
