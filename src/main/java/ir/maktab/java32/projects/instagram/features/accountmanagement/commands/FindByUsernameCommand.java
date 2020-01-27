package ir.maktab.java32.projects.instagram.features.accountmanagement.commands;

public class FindByUsernameCommand implements Command {
    private AccountManagement accountManagement;

    public FindByUsernameCommand(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }

    @Override
    public void execute() {
        accountManagement.findByUsername();
    }
}
