package com.example.democrud.Controller;

import com.example.democrud.Model.User;
import com.example.democrud.Service.ServiceImpl.UserServiceImpl;
import com.example.democrud.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
@Autowired
private UserServiceImpl userService;


    @RequestMapping("/")
    public String index(Model model) {
        List<User> users = userService.getAll();

        model.addAttribute("users", users);

        return "index";
    }
    @GetMapping("/showAdd")
    public String showAdd(Model model){
        model.addAttribute("user",new User());
        return "new_show";
    }
    @PostMapping("/saveUser")
    public String saveUser(User user){
        userService.save(user);
        return "redirect:/";
    }
    @GetMapping("/showUpdate/{id}")
    public String showUpdate(@PathVariable(value = "id") int id,Model model){
        User user = userService.findById(id);
        model.addAttribute("user",user);
        return "new-update";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(value = "id") int id){
        userService.delete(id);
        return "redirect:/";
    }
}
