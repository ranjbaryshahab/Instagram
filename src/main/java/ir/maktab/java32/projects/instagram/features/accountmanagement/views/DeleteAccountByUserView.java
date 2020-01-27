package ir.maktab.java32.projects.instagram.features.accountmanagement.views;

import ir.maktab.java32.projects.instagram.features.accountmanagement.services.impl.DeleteAccountByUserUseCaseImpl;
import ir.maktab.java32.projects.instagram.features.accountmanagement.services.impl.LogoutOfAccountUserUseCaseImpl;
import ir.maktab.java32.projects.instagram.features.shared.service.AuthenticationService;

import java.util.Scanner;

public class DeleteAccountByUserView {
    private Scanner scanner = new Scanner(System.in);

    public void view() {
        System.out.println("Are you sure about this ???     (YES OR NO)");
        String answer = scanner.nextLine();

        if (answer.toLowerCase().equals("yes")) {
            new DeleteAccountByUserUseCaseImpl()
                    .delete(AuthenticationService.getInstance().getLoginUser().getId());
            System.out.println("Your account is delete !!!");
            AuthenticationService.getInstance().setLoginUser(new LogoutOfAccountUserUseCaseImpl().logout());
        }
    }
}
