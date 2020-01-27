package ir.maktab.java32.projects.instagram.features.accountmanagement.commands;

public class MyFollowersCommand implements Command {
    private AccountManagement accountManagement;

    public MyFollowersCommand(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }

    @Override
    public void execute() {
        accountManagement.myFollowers();
    }
}
