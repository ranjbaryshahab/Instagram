package ir.maktab.java32.projects.instagram.features.accountmanagement.views;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.shared.service.AuthenticationService;

import java.util.Set;

public class MyFollowersView {
    public void view() {
        Set<User> followers;
        if ((followers = AuthenticationService.getInstance().getLoginUser().getFollowers()) != null || AuthenticationService.getInstance().getLoginUser().getFollowers().size() != 0) {
            System.out.println("Your followers : ");
            followers.forEach(System.out::println);
        } else
            System.out.println("You don't have any followers !!!");
    }
}
