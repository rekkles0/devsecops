package gestionemploye.exam.controller;
import gestionemploye.exam.Service.UserService;
import gestionemploye.exam.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);

        return "Employe is well added";
    }
    @GetMapping()
    public List<User> getUsers() {
        return userService.getUsers();
    }
    @GetMapping("/get")
    public User getUser(@RequestParam Long id) {
        return userService.getUser(id);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateUser(@PathVariable Long id, @RequestBody User user) {
        userService.updateUser(id, user);

        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);

        return ResponseEntity.ok().build();
    }
}
