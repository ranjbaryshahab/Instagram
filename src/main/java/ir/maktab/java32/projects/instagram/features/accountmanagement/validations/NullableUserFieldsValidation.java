package ir.maktab.java32.projects.instagram.features.accountmanagement.validations;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.shared.enumeration.ExceptionMessage;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableObjectException;
import ir.maktab.java32.projects.instagram.features.shared.validations.NullableObjectValidation;

public class NullableUserFieldsValidation {
    public void validate(User user) throws NullableObjectException {
        new NullableObjectValidation().validate(user.getFirstName(), ExceptionMessage.FIRST_NAME_REQUIRED.getMessage());
        new NullableObjectValidation().validate(user.getLastName(), ExceptionMessage.LAST_NAME_REQUIRED.getMessage());
        new NullableObjectValidation().validate(user.getEmail(), ExceptionMessage.EMAIL_REQUIRED.getMessage());
        new NullableObjectValidation().validate(user.getUsername(), ExceptionMessage.USERNAME_REQUIRED.getMessage());
    }
}
