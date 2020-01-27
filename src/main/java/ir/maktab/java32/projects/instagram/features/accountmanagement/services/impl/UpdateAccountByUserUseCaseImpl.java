package ir.maktab.java32.projects.instagram.features.accountmanagement.services.impl;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.accountmanagement.repositories.UserRepository;
import ir.maktab.java32.projects.instagram.features.accountmanagement.services.UpdateAccountByUserUseCase;
import ir.maktab.java32.projects.instagram.features.accountmanagement.validations.LengthUserFieldsValidation;
import ir.maktab.java32.projects.instagram.features.accountmanagement.validations.NullableUserFieldsValidation;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.LengthFieldException;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableObjectException;

public class UpdateAccountByUserUseCaseImpl implements UpdateAccountByUserUseCase {
    @Override
    public User update(User user) {
        try {
            new NullableUserFieldsValidation().validate(user);
            new LengthUserFieldsValidation().validate(user);
            return UserRepository.getInstance().update(user);
        } catch (LengthFieldException | NullableObjectException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
