package ir.maktab.java32.projects.instagram.features.shared.validations;

import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableListException;

import java.util.List;

public class NullableListValidation {
    public void validate(List list, String exceptionMsg) throws NullableListException {
        if (list == null || list.isEmpty())
            throw new NullableListException(exceptionMsg);

    }
}
