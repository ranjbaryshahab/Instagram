package ir.maktab.java32.projects.instagram.features.accountmanagement.commands;

public class CreateCommand implements Command {
    private AccountManagement accountManagement;

    public CreateCommand(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }

    @Override
    public void execute() {
        accountManagement.create();
    }
}
