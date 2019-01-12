package service;

import entity.UserDTO;

public interface UserService {

    public void addUser(UserDTO dto);

    public void delUser(int id);

    public void updateUser(UserDTO dto);

    public UserDTO findById(int id);

    public UserDTO findByname(String username);

    public UserDTO showUserAll();

}
