package ir.maktab.java32.projects.instagram.features.postmanagement.validations;

import ir.maktab.java32.projects.instagram.features.postmanagement.models.Post;
import ir.maktab.java32.projects.instagram.features.shared.enumeration.ExceptionMessage;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableObjectException;
import ir.maktab.java32.projects.instagram.features.shared.validations.NullableObjectValidation;

public class NullablePostFieldsValidation {
    public void validate(Post post) throws NullableObjectException {
        new NullableObjectValidation().validate(post.getCaption(), ExceptionMessage.CAPTION_REQUIRED.getMessage());
        new NullableObjectValidation().validate(post.getContent(), ExceptionMessage.CONTENT_REQUIRED.getMessage());
    }
}
