package ir.maktab.java32.projects.instagram.features.accountmanagement.services.impl;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.accountmanagement.services.UnFollowAccountByUserUseCase;
import ir.maktab.java32.projects.instagram.features.shared.service.AuthenticationService;

import java.util.HashSet;
import java.util.Set;

public class UnFollowAccountByUserUseCaseImpl implements UnFollowAccountByUserUseCase {
    @Override
    public void unFollow(User user) {
        Set<User> followers = new HashSet<>();
        User unFollowUser = new FindByUsernameAccountByUserUseCaseImpl().find(user.getUsername()).get(0);
        AuthenticationService.getInstance().getLoginUser()
                .getFollowers().stream().filter(u -> !u.getUsername().equals(unFollowUser.getUsername())).forEach(followers::add);
        AuthenticationService.getInstance().getLoginUser().setFollowers(followers);
        new UpdateAccountByUserUseCaseImpl().update(AuthenticationService.getInstance().getLoginUser());
    }
}
