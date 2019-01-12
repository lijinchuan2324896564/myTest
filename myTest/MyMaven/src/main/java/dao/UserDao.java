package dao;

import entity.User;

public interface UserDao {

    public void addUser(User user);

    public void delUser(int id);

    public void updateUser(User user);

    public User findById(int id);

    public User findByname(String username);

    public User showUserAll();

}
