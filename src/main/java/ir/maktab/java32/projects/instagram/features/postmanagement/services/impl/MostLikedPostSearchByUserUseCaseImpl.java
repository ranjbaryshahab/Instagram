package ir.maktab.java32.projects.instagram.features.postmanagement.services.impl;

import ir.maktab.java32.projects.instagram.features.postmanagement.models.Post;
import ir.maktab.java32.projects.instagram.features.postmanagement.repositories.PostRepository;
import ir.maktab.java32.projects.instagram.features.postmanagement.services.MostLikedPostSearchByUserUseCase;
import ir.maktab.java32.projects.instagram.features.shared.exceptions.NullableListException;
import ir.maktab.java32.projects.instagram.features.shared.validations.NullableListValidation;

import java.util.List;
import java.util.Optional;

public class MostLikedPostSearchByUserUseCaseImpl implements MostLikedPostSearchByUserUseCase {

    @Override
    public Post get() {
        try {
            new NullableListValidation().validate(PostRepository.getInstance().findAll(), "");
            List<Post> posts = PostRepository.getInstance().findAll();
            Optional<Post> mostLike = posts.stream().min((p1, p2) -> p1.getLikes().size() > p2.getLikes().size() ? -1 : 1);
            return mostLike.get();
        } catch (NullableListException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
