package com.mynewapp.mywebapp.user;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private UserService userService;

   /* @GetMapping("{/users}")
    public String showUserList(Model model){
        List<User> userList = userService.listAll();
        model.addAttribute("userList", userList);
        return "users";
    }*/
    @GetMapping("/user/new")
    public String showNewForm(Model model){
        model.addAttribute("user",new User());
        return "user_form";
    }
}
