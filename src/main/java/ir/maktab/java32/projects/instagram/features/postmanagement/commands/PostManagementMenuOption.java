package ir.maktab.java32.projects.instagram.features.postmanagement.commands;

import ir.maktab.java32.projects.instagram.features.shared.commands.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PostManagementMenuOption {
    private Command addCommentCommand;
    private Command createCommand;
    private Command updateCommand;
    private Command deleteCommand;
    private Command likePostCommand;
    private Command getMostLikePostCommand;


    public void inputCreate() {
        createCommand.execute();
    }

    public void inputLikePost() {
        likePostCommand.execute();
    }

    public void inputUpdate() {
        updateCommand.execute();
    }

    public void inputDelete() {
        deleteCommand.execute();
    }

    public void inputGetMostPost() {
        getMostLikePostCommand.execute();
    }

    public void inputAddComment() {
        addCommentCommand.execute();
    }
}
