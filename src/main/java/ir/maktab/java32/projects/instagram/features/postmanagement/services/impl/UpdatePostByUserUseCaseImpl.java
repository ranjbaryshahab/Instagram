package ir.maktab.java32.projects.instagram.features.postmanagement.services.impl;

import ir.maktab.java32.projects.instagram.features.postmanagement.models.Post;
import ir.maktab.java32.projects.instagram.features.postmanagement.repositories.PostRepository;
import ir.maktab.java32.projects.instagram.features.postmanagement.services.UpdatePostByUserUseCase;
import ir.maktab.java32.projects.instagram.features.postmanagement.validations.LengthPostFieldsValidation;
import ir.maktab.java32.projects.instagram.features.postmanagement.validations.NullablePostFieldsValidation;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.LengthFieldException;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableObjectException;

public class UpdatePostByUserUseCaseImpl implements UpdatePostByUserUseCase {
    @Override
    public Post update(Post post) {
        try {
            new NullablePostFieldsValidation().validate(post);
            new LengthPostFieldsValidation().validate(post);
            return PostRepository.getInstance().update(post);
        } catch (LengthFieldException | NullableObjectException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
