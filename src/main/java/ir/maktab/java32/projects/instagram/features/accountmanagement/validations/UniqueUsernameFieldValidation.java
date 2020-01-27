package ir.maktab.java32.projects.instagram.features.accountmanagement.validations;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.accountmanagement.repositories.UserRepository;
import ir.maktab.java32.projects.instagram.features.shared.enumeration.ExceptionMessage;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.UniqueFieldException;

import java.util.ArrayList;
import java.util.List;

public class UniqueUsernameFieldValidation {
    public void validate(User user) throws UniqueFieldException {
        List<String> usernameList = new ArrayList<>();
        UserRepository.getInstance().findAll().forEach(u -> usernameList.add(u.getUsername()));
        new ir.maktab.java32.projects.instagram.features.shared.validations.UniqueFieldValidation().validate(usernameList, user.getUsername(), ExceptionMessage.UNIQUE_USERNAME.getMessage());
    }
}
