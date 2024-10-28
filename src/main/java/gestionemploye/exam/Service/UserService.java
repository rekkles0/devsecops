package gestionemploye.exam.Service;

import gestionemploye.exam.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getUsers();

    User getUser(Long id);

    void updateUser(Long id, User user);

    void deleteUser(Long id);
}
