package ir.maktab.java32.projects.instagram.features.postmanagement.services.impl;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.postmanagement.models.Post;
import ir.maktab.java32.projects.instagram.features.postmanagement.repositories.PostRepository;
import ir.maktab.java32.projects.instagram.features.postmanagement.services.LikePostByUserUseCase;
import ir.maktab.java32.projects.instagram.features.postmanagement.validations.LengthPostFieldsValidation;
import ir.maktab.java32.projects.instagram.features.postmanagement.validations.NullablePostFieldsValidation;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.LengthFieldException;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableObjectException;

import java.util.Set;

public class LikePostByUserUseCaseImpl implements LikePostByUserUseCase {
    @Override
    public Post like(Post post, User user) {
        try {
            new NullablePostFieldsValidation().validate(post);
            new LengthPostFieldsValidation().validate(post);
            if (post.getLikes() == null || post.getLikes().isEmpty())
                post.setLikes(Set.of(user));
            else
                post.getLikes().add(user);
            return PostRepository.getInstance().update(post);
        } catch (LengthFieldException | NullableObjectException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
