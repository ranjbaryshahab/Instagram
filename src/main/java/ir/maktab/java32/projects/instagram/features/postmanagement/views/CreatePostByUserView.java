package ir.maktab.java32.projects.instagram.features.postmanagement.views;

import ir.maktab.java32.projects.instagram.features.postmanagement.models.Post;
import ir.maktab.java32.projects.instagram.features.postmanagement.services.impl.CreatePostByUserUseCaseImpl;
import ir.maktab.java32.projects.instagram.features.shared.service.AuthenticationService;

import java.util.Scanner;

public class CreatePostByUserView {
    private Scanner scanner = new Scanner(System.in);

    public void view() {
        Post post = new Post();

        System.out.println("Please enter caption : ");
        post.setCaption(scanner.nextLine());

        System.out.println("Please enter content : ");
        post.setContent(scanner.nextLine());

        post.setUser(AuthenticationService.getInstance().getLoginUser());

        if (new CreatePostByUserUseCaseImpl().create(post) != null)
            System.out.println("Your post is add successfully!!!");
    }
}
