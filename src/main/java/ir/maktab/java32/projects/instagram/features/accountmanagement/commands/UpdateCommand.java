package ir.maktab.java32.projects.instagram.features.accountmanagement.commands;

public class UpdateCommand implements Command {
    private AccountManagement accountManagement;

    public UpdateCommand(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }

    @Override
    public void execute() {
        accountManagement.update();
    }
}
