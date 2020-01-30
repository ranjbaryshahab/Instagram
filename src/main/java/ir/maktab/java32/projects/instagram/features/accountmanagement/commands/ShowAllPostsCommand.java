package ir.maktab.java32.projects.instagram.features.accountmanagement.commands;

import ir.maktab.java32.projects.instagram.features.shared.commands.Command;

public class ShowAllPostsCommand implements Command {
    private AccountManagement accountManagement;

    public ShowAllPostsCommand(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }

    @Override
    public void execute() {
        accountManagement.showAllPosts();
    }
}
