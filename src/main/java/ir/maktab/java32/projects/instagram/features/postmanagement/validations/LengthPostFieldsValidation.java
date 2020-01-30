package ir.maktab.java32.projects.instagram.features.postmanagement.validations;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.postmanagement.models.Post;
import ir.maktab.java32.projects.instagram.features.shared.enumeration.ExceptionMessage;
import ir.maktab.java32.projects.instagram.features.shared.enumeration.LengthFieldValue;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.LengthFieldException;
import ir.maktab.java32.projects.instagram.features.shared.validations.StringLengthValidation;

public class LengthPostFieldsValidation {
    public void validate(Post post) throws LengthFieldException {
        new StringLengthValidation().validate(post.getCaption(),
                LengthFieldValue.CAPTION.getLength(), ExceptionMessage.CAPTION_LARGER.getMessage());
    }
}
