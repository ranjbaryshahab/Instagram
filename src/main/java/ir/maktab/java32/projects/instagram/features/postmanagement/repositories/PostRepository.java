package ir.maktab.java32.projects.instagram.features.postmanagement.repositories;

import ir.maktab.java32.projects.instagram.config.database.HibernateUtil;
import ir.maktab.java32.projects.instagram.features.postmanagement.models.Post;
import ir.maktab.java32.projects.instagram.features.shared.repositories.CrudRepository;

public class PostRepository extends CrudRepository<Post, Long> {

    private static PostRepository postRepository;

    private PostRepository() {
        setSession(HibernateUtil.getSession());
    }

    public static PostRepository getInstance() {
        if (postRepository == null) {
            postRepository = new PostRepository();
        }
        return postRepository;
    }

    @Override
    protected Class<Post> getEntityClass() {
        return Post.class;
    }
}
