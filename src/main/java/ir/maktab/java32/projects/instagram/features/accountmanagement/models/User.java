package ir.maktab.java32.projects.instagram.features.accountmanagement.models;


import ir.maktab.java32.projects.instagram.features.postmanagement.models.Post;
import ir.maktab.java32.projects.instagram.features.shared.enumeration.LengthFieldValue;
import ir.maktab.java32.projects.instagram.features.shared.model.PersistenceEntity;
import lombok.*;

import javax.persistence.*;
import java.util.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
public class User extends PersistenceEntity<Long> {

    @Column(name = "FIRST_NAME", nullable = false, length = 25)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false, length = 25)
    private String lastName;

    @Column(name = "BIOGRAPHY")
    private String biography;

    @Column(name = "BIRTHDAY")
    @Temporal(TemporalType.DATE)
    private Date birthday;

    @Column(name = "EMAIL", nullable = false, length = 50)
    private String email;

    @Column(name = "USERNAME", nullable = false, length = 25, unique = true)
    private String username;

    @Column(name = "PASSWORD", nullable = false, length = 25)
    private String password;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Post> posts = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "FOLLOWERS_USERS",
            joinColumns = {@JoinColumn(name = "USER_ID")},
            inverseJoinColumns = {@JoinColumn(name = "FOLLOWER_ID")})
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<User> followers = new HashSet<>();

    @ManyToMany(mappedBy = "followers")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<User> usersFollowers = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "FOLLOWING_USERS",
            joinColumns = {@JoinColumn(name = "USER_ID")},
            inverseJoinColumns = {@JoinColumn(name = "FOLLOWING_ID")})
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<User> following = new HashSet<>();

    @ManyToMany(mappedBy = "following")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<User> usersFollowing = new HashSet<>();


}
