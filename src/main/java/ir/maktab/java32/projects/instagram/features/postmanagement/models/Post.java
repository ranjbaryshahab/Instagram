package ir.maktab.java32.projects.instagram.features.postmanagement.models;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;
import ir.maktab.java32.projects.instagram.features.shared.model.PersistenceEntity;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
public class Post extends PersistenceEntity<Long> {

    @Column(name = "CAPTION", length = 30, nullable = false)
    private String caption;

    @Column(name = "CONTENT", nullable = false)
    private String content;

    @ManyToOne
    private User user;

    @OneToMany
    private Set<User> likes = new HashSet<>();

    @ElementCollection
    private Set<String> comments;
}
