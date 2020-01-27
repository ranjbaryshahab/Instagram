package ir.maktab.java32.projects.instagram.features.accountmanagement.commands;

public class FollowCommand implements Command {
    private AccountManagement accountManagement;

    public FollowCommand(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }

    @Override
    public void execute() {
        accountManagement.follow();
    }
}
