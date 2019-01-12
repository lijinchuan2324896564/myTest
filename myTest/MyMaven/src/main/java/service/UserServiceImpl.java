package service;

import dao.UserDao;
import entity.User;
import entity.UserDTO;
import org.springframework.beans.BeanUtils;

public class UserServiceImpl implements UserService {


    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    public void addUser(UserDTO dto) {
        User user =new User();
        //对象之间复制
        BeanUtils.copyProperties (dto,user);
        userDao.addUser (user);
    }

    @Override
    public void delUser(int id) {
        userDao.delUser (id);
    }

    @Override
    public void updateUser(UserDTO dto) {
        User user =new User();
        BeanUtils.copyProperties (dto,user);
        userDao.updateUser (user);
    }

    @Override
    public UserDTO findById(int id) {
        User byId = userDao.findById (id);
        UserDTO dto = new UserDTO ();
        BeanUtils.copyProperties (byId,dto);
        return dto;
    }

    @Override
    public UserDTO findByname(String username) {
        User byname = userDao.findByname (username);
        UserDTO dto = new UserDTO ();
        BeanUtils.copyProperties (byname,dto);
        return dto;
    }

    @Override
    public UserDTO showUserAll() {
        User showuserAll = userDao.showUserAll ();
        UserDTO dto = new UserDTO ();
        BeanUtils.copyProperties (showuserAll,dto);
        return dto;
    }
}
