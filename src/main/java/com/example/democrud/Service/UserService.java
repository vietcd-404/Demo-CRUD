package com.example.democrud.Service;

import com.example.democrud.Model.User;
import com.example.democrud.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    List<User> getAll();
    void save(User user);
    void delete(int id);
    void update(User user, int id);
    User findById(int id);
}
