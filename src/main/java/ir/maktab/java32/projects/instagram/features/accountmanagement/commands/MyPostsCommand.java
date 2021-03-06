package ir.maktab.java32.projects.instagram.features.accountmanagement.commands;

import ir.maktab.java32.projects.instagram.features.shared.commands.Command;

public class MyPostsCommand implements Command {
    private AccountManagement accountManagement;

    public MyPostsCommand(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }

    @Override
    public void execute() {
        accountManagement.myPosts();
    }
}
