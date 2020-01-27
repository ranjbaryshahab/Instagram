package ir.maktab.java32.projects.instagram.features.accountmanagement.services.impl;


import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.accountmanagement.repositories.UserRepository;
import ir.maktab.java32.projects.instagram.features.accountmanagement.services.LoginToAccountByUserUseCase;
import ir.maktab.java32.projects.instagram.features.accountmanagement.validations.UsernameAndPasswordValidation;
import ir.maktab.java32.projects.instagram.features.shared.enumeration.ExceptionMessage;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableListException;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableObjectException;
import ir.maktab.java32.projects.instagram.features.shared.validations.NullableListValidation;

public class LoginToAccountByUserUseCaseImpl implements LoginToAccountByUserUseCase {

    @Override
    public User login(User user) {
        try {
            new NullableListValidation().validate(UserRepository.getInstance().getUserByUsernameAndPassword(user),
                    ExceptionMessage.USERNAME_NOT_FOUND.getMessage());
            new UsernameAndPasswordValidation().validate(user);
            return UserRepository.getInstance().getUserByUsernameAndPassword(user).get(0);
        } catch (NullableObjectException | NullableListException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
