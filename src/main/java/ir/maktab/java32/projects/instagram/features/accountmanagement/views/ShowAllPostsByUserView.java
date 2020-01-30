package ir.maktab.java32.projects.instagram.features.accountmanagement.views;

import ir.maktab.java32.projects.instagram.features.shared.service.AuthenticationService;

public class ShowAllPostsByUserView {
    public void view() {
        AuthenticationService.getInstance().getLoginUser().getFollowing().stream()
                .flatMap(user -> user.getPosts().stream())
                .forEach(System.out::println);
    }
}
