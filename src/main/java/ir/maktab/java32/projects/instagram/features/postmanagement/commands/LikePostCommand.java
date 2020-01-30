package ir.maktab.java32.projects.instagram.features.postmanagement.commands;

import ir.maktab.java32.projects.instagram.features.shared.commands.Command;

public class LikePostCommand implements Command {
    private PostManagement postManagement;

    public LikePostCommand(PostManagement postManagement) {
        this.postManagement = postManagement;
    }

    @Override
    public void execute() {
        postManagement.likePost();
    }
}
