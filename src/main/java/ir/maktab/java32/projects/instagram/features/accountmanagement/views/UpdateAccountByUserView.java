package ir.maktab.java32.projects.instagram.features.accountmanagement.views;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.accountmanagement.services.impl.UpdateAccountByUserUseCaseImpl;
import ir.maktab.java32.projects.instagram.features.shared.service.AuthenticationService;
import ir.maktab.java32.projects.instagram.features.shared.service.DateGenerator;

import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class UpdateAccountByUserView {
    private Scanner scanner = new Scanner(System.in);
    private User user = AuthenticationService.getInstance().getLoginUser();

    public void view() {
        System.out.println("Please enter your first name : ");
        user.setFirstName(scanner.nextLine());

        System.out.println("Please enter your last name : ");
        user.setLastName(scanner.nextLine());

        System.out.println("Please enter your birthday (like this 23/04/1996) : ");
        user.setBirthday(new DateGenerator().generate(scanner.nextLine()));

        System.out.println("Please enter your email : ");
        user.setEmail(scanner.nextLine());

        System.out.println("Please enter your username : ");
        user.setUsername(scanner.nextLine());

        System.out.println("Please enter your password : ");
        user.setPassword(scanner.nextLine());

        System.out.println("Please enter your biography : ");
        user.setBiography(scanner.nextLine());

        new UpdateAccountByUserUseCaseImpl().update(user);
    }
}
