package ir.maktab.java32.projects.instagram.features.accountmanagement.services;

import ir.maktab.java32.projects.instagram.features.accountmanagement.models.User;

public interface ReadAccountByUserUseCase {
    User read(Long id) ;
}
