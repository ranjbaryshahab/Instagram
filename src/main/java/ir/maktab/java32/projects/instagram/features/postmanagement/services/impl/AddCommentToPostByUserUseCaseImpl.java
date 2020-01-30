package ir.maktab.java32.projects.instagram.features.postmanagement.services.impl;

import ir.maktab.java32.projects.instagram.features.postmanagement.models.Post;
import ir.maktab.java32.projects.instagram.features.postmanagement.repositories.PostRepository;
import ir.maktab.java32.projects.instagram.features.postmanagement.services.AddCommentToPostByUserUseCase;
import ir.maktab.java32.projects.instagram.features.postmanagement.validations.LengthPostFieldsValidation;
import ir.maktab.java32.projects.instagram.features.postmanagement.validations.NullablePostFieldsValidation;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.LengthFieldException;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableObjectException;

import java.util.Set;

public class AddCommentToPostByUserUseCaseImpl implements AddCommentToPostByUserUseCase {
    @Override
    public void add(Post post, String comment) {
        try {
            new NullablePostFieldsValidation().validate(post);
            new LengthPostFieldsValidation().validate(post);
            if (post.getComments() == null || post.getComments().isEmpty())
                post.setComments(Set.of(comment));
            else
                post.getComments().add(comment);
            PostRepository.getInstance().update(post);
        } catch (LengthFieldException | NullableObjectException e) {
            System.out.println(e.getMessage());
        }
    }
}
