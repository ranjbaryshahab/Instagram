package ir.maktab.java32.projects.instagram.features.postmanagement.services.impl;

import ir.maktab.java32.projects.instagram.features.postmanagement.repositories.PostRepository;
import ir.maktab.java32.projects.instagram.features.postmanagement.services.DeletePostByUserUseCase;
import ir.maktab.java32.projects.instagram.features.postmanagement.validations.PostIdValidation;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableObjectException;

public class DeletePostByUserUseCaseImpl implements DeletePostByUserUseCase {
    @Override
    public int delete(Long id) {
        try {
            new PostIdValidation().validate(id);
            PostRepository.getInstance().removeById(id);
            return 1;
        } catch (NullableObjectException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
