package org.topia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.topia.services.UserService;

@Controller
@RequestMapping(value = "/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "/{userId}")
    public String getUser(@PathVariable String userId, Model model) {
        model.addAttribute("users", userService.getUsers());
        return "index";
    }
}
