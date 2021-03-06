package ir.maktab.java32.projects.instagram.features.postmanagement.views;

import ir.maktab.java32.projects.instagram.features.postmanagement.models.Post;
import ir.maktab.java32.projects.instagram.features.postmanagement.repositories.PostRepository;
import ir.maktab.java32.projects.instagram.features.postmanagement.services.impl.AddCommentToPostByUserUseCaseImpl;
import ir.maktab.java32.projects.instagram.features.postmanagement.services.impl.LikePostByUserUseCaseImpl;
import ir.maktab.java32.projects.instagram.features.shared.enumeration.ExceptionMessage;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableListException;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableObjectException;
import ir.maktab.java32.projects.instagram.features.shared.service.AuthenticationService;
import ir.maktab.java32.projects.instagram.features.shared.validations.NullableListValidation;
import ir.maktab.java32.projects.instagram.features.shared.validations.NullableObjectValidation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class LikedPostByUserView {
    private Scanner scanner = new Scanner(System.in);

    public void view() {
        try {
            List<Post> posts = new ArrayList<>();
            Post post;
            AuthenticationService.getInstance().getLoginUser().getFollowing().stream()
                    .flatMap(user -> user.getPosts().stream())
                    .forEach(posts::add);

            new NullableListValidation().validate(posts, ExceptionMessage.ACCOUNT_HAVE_NOT_ANY_POSTS.getMessage());
            posts.forEach(System.out::println);
            System.out.println("Please enter post id for like : ");
            new NullableObjectValidation().validate(post = PostRepository.getInstance().findById(scanner.nextLong()), ExceptionMessage.ID_NOT_EXIST.getMessage());
            new LikePostByUserUseCaseImpl().like(post, AuthenticationService.getInstance().getLoginUser());
        } catch (NullableListException | NullableObjectException e) {
            System.out.println(e.getMessage());
        }
    }
}
