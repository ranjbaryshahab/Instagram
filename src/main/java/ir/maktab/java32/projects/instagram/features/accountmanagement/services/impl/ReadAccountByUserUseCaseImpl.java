package ir.maktab.java32.projects.instagram.features.accountmanagement.services.impl;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.accountmanagement.repositories.UserRepository;
import ir.maktab.java32.projects.instagram.features.accountmanagement.services.ReadAccountByUserUseCase;
import ir.maktab.java32.projects.instagram.features.accountmanagement.validations.UserIdValidation;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableObjectException;

public class ReadAccountByUserUseCaseImpl implements ReadAccountByUserUseCase {

    @Override
    public User read(Long id) {
        try {
            new UserIdValidation().validate(id);
            return UserRepository.getInstance().findById(id);
        } catch (NullableObjectException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
