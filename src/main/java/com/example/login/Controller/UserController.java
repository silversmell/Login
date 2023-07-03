package com.example.login.Controller;

import com.example.login.Model.User;
import com.example.login.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) { //user
        this.userService = userService;
    }
    @GetMapping("")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }
    @PostMapping("/join")
    public User join(@RequestBody User user){
        return userService.join(user);
    }
    @PostMapping("/delete")
    public void delete(@RequestBody User user){
        userService.deleteUser(user);
    }

//    @GetMapping("/{userid}") //pathvariable에 넣은 userid를 찾음
//    public User getUserByUserId(@PathVariable Long userid){
//        return userService.getUserByUserId(userid);
//    }
//    @PutMapping("/{userid}") //유저 아이디변경
//    public void modifyUser(@PathVariable Long userid, @RequestBody User user){
//        userService.modifyUser(userid,user);
//    }
//
//    @DeleteMapping("/{userid}")
//    public void removeUser(@PathVariable Long userid){
//        userService.removeUser(userid);
//    }

}
