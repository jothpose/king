package com.itycl.kingsignal.service;

        import com.itycl.kingsignal.entity.User;
        import java.util.List;

  public interface UserService {
    User findUserById(int id);
    void deleteUserById(int id);
    List<User> findUserList();
    void updateUserById(User user);
}
