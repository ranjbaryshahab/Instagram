package ir.maktab.java32.projects.instagram.features.accountmanagement.commands;

public class LoginCommand implements Command {
    private AccountManagement accountManagement;

    public LoginCommand(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }

    @Override
    public void execute() {
        accountManagement.login();
    }
}
