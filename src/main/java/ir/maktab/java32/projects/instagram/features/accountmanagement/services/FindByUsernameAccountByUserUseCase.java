package ir.maktab.java32.projects.instagram.features.accountmanagement.services;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;

import java.util.List;

public interface FindByUsernameAccountByUserUseCase {
    List<User> find(String username);
}
