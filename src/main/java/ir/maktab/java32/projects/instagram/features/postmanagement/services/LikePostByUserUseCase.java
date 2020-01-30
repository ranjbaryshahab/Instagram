package ir.maktab.java32.projects.instagram.features.postmanagement.services;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.postmanagement.models.Post;

public interface LikePostByUserUseCase {
    Post like(Post post, User user);
}
