package ir.maktab.java32.projects.instagram.features.accountmanagement.commands;

import ir.maktab.java32.projects.instagram.features.accountmanagement.views.*;

public class AccountManagement {
    public void create() {
        new CreateAccountByUserView().view();
    }

    public void findByUsername() {
        new FindByUsernameAccountByUserView().view();
    }

    public void update() {
        new UpdateAccountByUserView().view();
    }

    public void delete() {
        new DeleteAccountByUserView().view();
    }

    public void follow() {
        new FollowAccountByUserView().view();
    }

    public void unFollow() {
        new UnFollowAccountByUserView().view();
    }

    public void login() {
        new LoginToAccountByUserView().view();
    }

    public void logout() {
        new LogoutOfAccountByUserView().view();
    }

    public void myFollowers() {
        new MyFollowersView().view();
    }

    public void myFollowings() {
        new MyFollowingsView().view();
    }

    public void myPosts() {
        new MyPostsView().view();
    }

}
