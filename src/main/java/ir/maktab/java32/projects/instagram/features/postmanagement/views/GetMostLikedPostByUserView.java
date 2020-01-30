package ir.maktab.java32.projects.instagram.features.postmanagement.views;

import ir.maktab.java32.projects.instagram.features.postmanagement.services.impl.MostLikedPostSearchByUserUseCaseImpl;

public class GetMostLikedPostByUserView {
    public void view() {
        System.out.println("This post most like than all posts : \n"
                + new MostLikedPostSearchByUserUseCaseImpl().get());
    }
}
