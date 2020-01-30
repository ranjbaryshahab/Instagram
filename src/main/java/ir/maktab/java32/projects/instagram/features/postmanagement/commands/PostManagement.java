package ir.maktab.java32.projects.instagram.features.postmanagement.commands;

import ir.maktab.java32.projects.instagram.features.postmanagement.views.*;

public class PostManagement {
    public void addComment() {
        new AddCommentByUserView().view();
    }

    public void createPost() {
        new CreatePostByUserView().view();
    }

    public void deletePost() {
        new DeletePostByUserView().view();
    }

    public void updatePost() {
        new UpdatePostByUserView().view();
    }

    public void likePost() {
        new LikedPostByUserView().view();
    }

    public void getMostLike() {
        new GetMostLikedPostByUserView().view();
    }
}
