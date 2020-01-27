package ir.maktab.java32.projects.instagram.features.accountmanagement.commands;

public class UnFollowCommand implements Command {
    private AccountManagement accountManagement;

    public UnFollowCommand(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }

    @Override
    public void execute() {
        accountManagement.unFollow();
    }
}
