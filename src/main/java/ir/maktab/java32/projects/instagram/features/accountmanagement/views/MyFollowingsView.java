package ir.maktab.java32.projects.instagram.features.accountmanagement.views;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.shared.service.AuthenticationService;

import java.util.Set;

public class MyFollowingsView {
    public void view() {
        Set<User> followings;
        if ((followings = AuthenticationService.getInstance().getLoginUser().getFollowing()) != null || AuthenticationService.getInstance().getLoginUser().getFollowing().size() != 0) {
            System.out.println("Your followings : ");
            followings.forEach(System.out::println);
        } else
            System.out.println("You don't have any followings !!!");
    }
}
