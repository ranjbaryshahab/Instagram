package ir.maktab.java32.projects.instagram.features.accountmanagement.views;

import ir.maktab.java32.projects.instagram.features.postmanagement.models.Post;
import ir.maktab.java32.projects.instagram.features.shared.service.AuthenticationService;

import java.util.Set;

public class MyPostsView {
    public void view() {
        Set<Post> posts;
        if ((posts = AuthenticationService.getInstance().getLoginUser().getPosts()) != null || AuthenticationService.getInstance().getLoginUser().getPosts().size() != 0) {
            System.out.println("Your posts : ");
            posts.forEach(System.out::println);
        }
        else
            System.out.println("You don't have any posts !!!");
    }
}
