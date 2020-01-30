package ir.maktab.java32.projects.instagram.features.postmanagement.validations;

import ir.maktab.java32.projects.instagram.features.accountmanagement.repositories.UserRepository;
import ir.maktab.java32.projects.instagram.features.postmanagement.repositories.PostRepository;
import ir.maktab.java32.projects.instagram.features.shared.enumeration.ExceptionMessage;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableObjectException;
import ir.maktab.java32.projects.instagram.features.shared.validations.NullableObjectValidation;

public class PostIdValidation {
    public void validate(Long id) throws NullableObjectException {
        new NullableObjectValidation().validate(PostRepository.getInstance().findById(id), ExceptionMessage.ID_NOT_EXIST.getMessage());
    }
}
