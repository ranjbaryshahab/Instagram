package ir.maktab.java32.projects.instagram.features.accountmanagement.services.impl;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.accountmanagement.repositories.UserRepository;
import ir.maktab.java32.projects.instagram.features.accountmanagement.services.FollowAccountByUserUseCase;
import ir.maktab.java32.projects.instagram.features.shared.service.AuthenticationService;

import java.util.Set;

public class FollowAccountByUserUseCaseImpl implements FollowAccountByUserUseCase {
    @Override
    public void follow(User user) {
        User loginUser = AuthenticationService.getInstance().getLoginUser();
        if (loginUser.getFollowing() == null)
            loginUser.setFollowing(Set.of(user));
        else
            loginUser.getFollowing().add(user);

        if (user.getFollowers() == null)
            user.setFollowers(Set.of(loginUser));
        else
            user.getFollowers().add(loginUser);

        UserRepository.getInstance().update(user);
        UserRepository.getInstance().update(loginUser);
    }
}
