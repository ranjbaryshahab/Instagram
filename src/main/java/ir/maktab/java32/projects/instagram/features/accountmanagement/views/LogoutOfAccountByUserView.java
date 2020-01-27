package ir.maktab.java32.projects.instagram.features.accountmanagement.views;

import ir.maktab.java32.projects.instagram.features.accountmanagement.services.impl.LogoutOfAccountUserUseCaseImpl;
import ir.maktab.java32.projects.instagram.features.shared.service.AuthenticationService;

public class LogoutOfAccountByUserView {
    public void view() {
        AuthenticationService.getInstance().setLoginUser(new LogoutOfAccountUserUseCaseImpl().logout());
    }
}
