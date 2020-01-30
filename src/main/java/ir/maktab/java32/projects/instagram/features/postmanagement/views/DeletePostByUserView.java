package ir.maktab.java32.projects.instagram.features.postmanagement.views;

import ir.maktab.java32.projects.instagram.features.postmanagement.models.Post;
import ir.maktab.java32.projects.instagram.features.postmanagement.repositories.PostRepository;
import ir.maktab.java32.projects.instagram.features.postmanagement.services.impl.ReadPostByUserUseCaseImpl;

import java.util.Scanner;

public class DeletePostByUserView {
    private Scanner scanner = new Scanner(System.in);

    public void view() {
        System.out.println("Please enter post id : ");
        Post post = new ReadPostByUserUseCaseImpl().read(scanner.nextLong());

        System.out.println("Are you sure about this ???     (YES OR NO)");
        String answer = scanner.nextLine();

        if (answer.toLowerCase().equals("yes")) {
            PostRepository.getInstance().removeById(post.getId());
            System.out.println("Your post is delete !!!");
        }
    }
}
