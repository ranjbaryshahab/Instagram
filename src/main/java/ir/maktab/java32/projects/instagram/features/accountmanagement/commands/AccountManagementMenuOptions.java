package ir.maktab.java32.projects.instagram.features.accountmanagement.commands;

import ir.maktab.java32.projects.instagram.features.shared.commands.Command;
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
    private Command showAllPosts;


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
        myFollowers.execute();
    }

    public void inputMyFollowings() {
        myFollowings.execute();
    }

    public void inputMyPosts() {
        myPosts.execute();
    }

    public void inputShowAllPosts() {
        showAllPosts.execute();
    }
}
