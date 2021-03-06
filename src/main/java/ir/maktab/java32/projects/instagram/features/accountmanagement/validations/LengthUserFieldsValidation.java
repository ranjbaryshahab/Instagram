package ir.maktab.java32.projects.instagram.features.accountmanagement.validations;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.shared.enumeration.ExceptionMessage;
import ir.maktab.java32.projects.instagram.features.shared.enumeration.LengthFieldValue;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.LengthFieldException;
import ir.maktab.java32.projects.instagram.features.shared.validations.StringLengthValidation;

import java.util.List;

public class LengthUserFieldsValidation {
    public void validate(User user) throws LengthFieldException {
        new StringLengthValidation().validate(user.getFirstName(), LengthFieldValue.FIRST_NAME.getLength(), ExceptionMessage.FIRST_NAME_LARGER.getMessage());
        new StringLengthValidation().validate(user.getLastName(), LengthFieldValue.LAST_NAME.getLength(), ExceptionMessage.LAST_NAME_LARGER.getMessage());
        new StringLengthValidation().validate(user.getUsername(), LengthFieldValue.USERNAME.getLength(), ExceptionMessage.USERNAME_LARGER.getMessage());
        new StringLengthValidation().validate(user.getEmail(), LengthFieldValue.EMAIL.getLength(), ExceptionMessage.EMAIL_LARGER.getMessage());
    }
}
