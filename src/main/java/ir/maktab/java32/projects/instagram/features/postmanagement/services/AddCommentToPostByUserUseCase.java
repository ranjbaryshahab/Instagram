package ir.maktab.java32.projects.instagram.features.postmanagement.services;

import ir.maktab.java32.projects.instagram.features.postmanagement.models.Post;

public interface AddCommentToPostByUserUseCase {
    void add(Post post, String comment);
}
