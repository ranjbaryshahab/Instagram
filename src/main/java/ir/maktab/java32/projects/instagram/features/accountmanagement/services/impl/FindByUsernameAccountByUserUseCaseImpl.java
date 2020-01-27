package ir.maktab.java32.projects.instagram.features.accountmanagement.services.impl;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.accountmanagement.repositories.UserRepository;
import ir.maktab.java32.projects.instagram.features.accountmanagement.services.FindByUsernameAccountByUserUseCase;
import ir.maktab.java32.projects.instagram.features.shared.enumeration.ExceptionMessage;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableListException;
import ir.maktab.java32.projects.instagram.features.shared.validations.NullableListValidation;

import java.util.List;
import java.util.function.Predicate;

public class FindByUsernameAccountByUserUseCaseImpl implements FindByUsernameAccountByUserUseCase {
    @Override
    public List<User> find(String username) {
        try {
            new NullableListValidation().validate(UserRepository.getInstance().findAll((Predicate<User>) user -> user.getUsername().contains((username))),
                    ExceptionMessage.USERNAME_NOT_FOUND.getMessage());
            return UserRepository.getInstance().findAll((Predicate<User>) user -> user.getUsername().contains((username)));
        } catch (NullableListException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
