package ir.maktab.java32.projects.instagram.features.postmanagement.services.impl;

import ir.maktab.java32.projects.instagram.features.postmanagement.models.Post;
import ir.maktab.java32.projects.instagram.features.postmanagement.repositories.PostRepository;
import ir.maktab.java32.projects.instagram.features.postmanagement.services.ReadPostByUserUseCase;
import ir.maktab.java32.projects.instagram.features.postmanagement.validations.PostIdValidation;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableObjectException;

public class ReadPostByUserUseCaseImpl implements ReadPostByUserUseCase {
    @Override
    public Post read(Long id) {
        try {
            new PostIdValidation().validate(id);
            return PostRepository.getInstance().findById(id);
        } catch (NullableObjectException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
