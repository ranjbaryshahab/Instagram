package ir.maktab.java32.projects.instagram.features.postmanagement.services.impl;

import ir.maktab.java32.projects.instagram.features.postmanagement.models.Post;
import ir.maktab.java32.projects.instagram.features.postmanagement.repositories.PostRepository;
import ir.maktab.java32.projects.instagram.features.postmanagement.services.CreatePostByUserUseCase;
import ir.maktab.java32.projects.instagram.features.postmanagement.validations.LengthPostFieldsValidation;
import ir.maktab.java32.projects.instagram.features.postmanagement.validations.NullablePostFieldsValidation;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.LengthFieldException;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableObjectException;

public class CreatePostByUserUseCaseImpl implements CreatePostByUserUseCase {

    @Override
    public Post create(Post post) {
        try {
            new NullablePostFieldsValidation().validate(post);
            new LengthPostFieldsValidation().validate(post);
            return PostRepository.getInstance().save(post);
        } catch (NullableObjectException | LengthFieldException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
