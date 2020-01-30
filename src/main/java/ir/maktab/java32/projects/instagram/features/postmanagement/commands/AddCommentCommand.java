package ir.maktab.java32.projects.instagram.features.postmanagement.commands;

import ir.maktab.java32.projects.instagram.features.shared.commands.Command;

public class AddCommentCommand implements Command {
    private PostManagement postManagement;

    public AddCommentCommand(PostManagement postManagement) {
        this.postManagement = postManagement;
    }

    @Override
    public void execute() {
        postManagement.addComment();
    }
}
