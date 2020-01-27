package ir.maktab.java32.projects.instagram.features.accountmanagement.commands;

public class DeleteCommand implements Command {
    private AccountManagement accountManagement;

    public DeleteCommand(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }

    @Override
    public void execute() {
        accountManagement.delete();
    }
}
