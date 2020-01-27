package ir.maktab.java32.projects.instagram.features.accountmanagement.validations;

import ir.maktab.java32.projects.instagram.features.accountmanagement.repositories.UserRepository;
import ir.maktab.java32.projects.instagram.features.shared.enumeration.ExceptionMessage;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableObjectException;
import ir.maktab.java32.projects.instagram.features.shared.validations.NullableObjectValidation;

public class UserIdValidation {
    public void validate(Long id) throws NullableObjectException {
        new NullableObjectValidation().validate(UserRepository.getInstance().findById(id), ExceptionMessage.ID_NOT_EXIST.getMessage());
    }
}
