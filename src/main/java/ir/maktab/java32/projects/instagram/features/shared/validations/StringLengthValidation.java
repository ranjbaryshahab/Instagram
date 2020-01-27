package ir.maktab.java32.projects.instagram.features.shared.validations;

import ir.maktab.java32.projects.instagram.features.shared.exceptions.LengthFieldException;

public class StringLengthValidation {
    public void validate(String value, Integer defaultLength, String exceptionMsg) throws LengthFieldException {
        if (value != null && value.length() > defaultLength)
            throw new LengthFieldException(exceptionMsg);
    }
}
