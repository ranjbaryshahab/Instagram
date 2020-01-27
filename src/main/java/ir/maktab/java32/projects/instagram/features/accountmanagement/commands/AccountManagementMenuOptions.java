package ir.maktab.java32.projects.instagram.features.accountmanagement.commands;

public class AccountManagementMenuOptions {
    private Command createCommand;
    private Command findByIdCommand;
    private Command updateCommand;
    private Command deleteCommand;
    private Command followCommand;
    private Command unFollowCommand;
    private Command loginCommand;
    private Command logoutCommand;

    public AccountManagementMenuOptions(Command createCommand, Command findByIdCommand, Command updateCommand, Command deleteCommand, Command followCommand, Command unFollowCommand, Command loginCommand, Command logoutCommand) {
        this.createCommand = createCommand;
        this.findByIdCommand = findByIdCommand;
        this.updateCommand = updateCommand;
        this.deleteCommand = deleteCommand;
        this.followCommand = followCommand;
        this.unFollowCommand = unFollowCommand;
        this.loginCommand = loginCommand;
        this.logoutCommand = logoutCommand;
    }

    public void inputCreate() {
        createCommand.execute();
    }

    public void inputFindById() {
        findByIdCommand.execute();
    }

    public void inputUpdate() {
        updateCommand.execute();
    }

    public void inputDelete() {
        deleteCommand.execute();
    }

    public void inputFollow() {
        followCommand.execute();
    }

    public void inputUnFollow() {
        unFollowCommand.execute();
    }

    public void inputLogin() {
        loginCommand.execute();
    }

    public void inputLogout() {
        logoutCommand.execute();
    }
}
