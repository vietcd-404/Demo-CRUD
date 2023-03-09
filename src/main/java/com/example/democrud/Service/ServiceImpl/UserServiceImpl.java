package com.example.democrud.Service.ServiceImpl;

import com.example.democrud.Model.User;
import com.example.democrud.Repository.UserRepo;
import com.example.democrud.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public List<User> getAll() {
        return (List<User>) userRepo.findAll();
    }

    @Override
    public void save(User user) {
        this.userRepo.save(user);
    }

    @Override
    public void delete(int id) {
       this.userRepo.deleteById(id);
    }
    @Override
    public void update(User user,int id) {


    }
    @Override
    public User findById(int id) {
        Optional<User> optional = userRepo.findById(id);
        User user = null;
        if(optional.isPresent()){
            user = optional.get();
        }else {
            throw new RuntimeException("Không tìm thấy id" +id);
        }
        return  user;
    }

}
