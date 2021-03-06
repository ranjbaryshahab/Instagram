package ir.maktab.java32.projects.instagram.features.accountmanagement.validations;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.accountmanagement.repositories.UserRepository;
import ir.maktab.java32.projects.instagram.features.shared.enumeration.ExceptionMessage;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableObjectException;
import ir.maktab.java32.projects.instagram.features.shared.validations.NullableObjectValidation;

public class UsernameAndPasswordValidation {
    public void validate(User user) throws NullableObjectException {
        new NullableObjectValidation().validate(user.getUsername(), ExceptionMessage.USERNAME_REQUIRED.getMessage());
        new NullableObjectValidation().validate(user.getPassword(), ExceptionMessage.PASSWORD_REQUIRED.getMessage());
        new NullableObjectValidation().validate(
                UserRepository.getInstance().getUserByUsernameAndPassword(user).get(0),
                ExceptionMessage.USERNAME_OR_PASSWORD_INCORRECT.getMessage()
        );
    }
}
