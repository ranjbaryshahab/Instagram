package ir.maktab.java32.projects.instagram.features.accountmanagement.commands;

public class MyPostsCommand implements Command{
    private AccountManagement accountManagement;

    public MyPostsCommand(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }

    @Override
    public void execute() {
        accountManagement.myPosts();
    }
}
