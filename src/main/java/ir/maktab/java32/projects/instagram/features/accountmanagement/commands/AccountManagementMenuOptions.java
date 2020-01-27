package ir.maktab.java32.projects.instagram.features.accountmanagement.commands;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AccountManagementMenuOptions {
    private Command createCommand;
    private Command findByIdCommand;
    private Command updateCommand;
    private Command deleteCommand;
    private Command followCommand;
    private Command unFollowCommand;
    private Command loginCommand;
    private Command logoutCommand;
    private Command myFollowers;
    private Command myFollowings;
    private Command myPosts;


    public void inputCreate() {
        createCommand.execute();
    }

    public void inputFindById() {
        findByIdCommand.execute();
    }

    public void inputUpdate() {
        updateCommand.execute();
    }

    public void inputDelete() {
        deleteCommand.execute();
    }

    public void inputFollow() {
        followCommand.execute();
    }

    public void inputUnFollow() {
        unFollowCommand.execute();
    }

    public void inputLogin() {
        loginCommand.execute();
    }

    public void inputLogout() {
        logoutCommand.execute();
    }

    public void inputMyFollowers() {
        logoutCommand.execute();
    }

    public void inputMyFollowings() {
        logoutCommand.execute();
    }

    public void inputMyPosts() {
        logoutCommand.execute();
    }
}
