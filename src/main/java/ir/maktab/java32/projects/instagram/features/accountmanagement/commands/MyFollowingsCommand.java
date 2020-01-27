package ir.maktab.java32.projects.instagram.features.accountmanagement.commands;

public class MyFollowingsCommand implements Command {
    private AccountManagement accountManagement;

    public MyFollowingsCommand(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }

    @Override
    public void execute() {
        accountManagement.myFollowings();
    }
}
