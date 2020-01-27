package ir.maktab.java32.projects.instagram.features.shared.enumeration;

public enum ExceptionMessage {


    ID_NOT_EXIST(1, "This id not exist !!!"),

    FIRST_NAME_LARGER(2, "First name field input value larger than allowed !!!"),

    LAST_NAME_LARGER(3, "Last name field input value larger than allowed !!!"),

    EMAIL_LARGER(4, "Email field input value larger than allowed !!!"),

    USERNAME_LARGER(5, "Username field input value larger than allowed !!!"),

    UNIQUE_USERNAME(6, "This username is exist in the database !!!"),

    FIRST_NAME_REQUIRED(7, "First name is required ! Please input it !!!"),

    LAST_NAME_REQUIRED(8, "Last name is required ! Please input it !!!"),

    EMAIL_REQUIRED(9, "Email is required ! Please input it !!!"),

    USERNAME_REQUIRED(10, "Username is required ! Please input it !!!"),

    PASSWORD_REQUIRED(11, "Password is required ! Please input it !!!"),

    USERNAME_OR_PASSWORD_INCORRECT(12, "Username or password is incorrect !!!"),

    USERNAME_NOT_FOUND(13, "This username not found !!!"),

    ;

    private final Integer code;
    private final String message;

    ExceptionMessage(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code + ": " + message;
    }
}
