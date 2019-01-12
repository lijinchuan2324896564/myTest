package dao;

import entity.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    @Override
    public void addUser(User user) {
        this.getSqlSession ().insert("com.mapper.UserMapper.insertUser",user );
    }

    @Override
    public void delUser(int id) {
        this.getSqlSession ().delete ("com.mapper.UserMapper.deleteUser",id);
    }

    @Override
    public void updateUser(User user) {
        this.getSqlSession ().update ("com.mapper.UserMapper.updateUser",user);
    }

    @Override
    public User findById(int id) {
        User user = this.getSqlSession ().selectOne ("com.mapper.UserMapper.selectUserById",id);
        return user;
    }

    @Override
    public User findByname(String username) {
        User user = this.getSqlSession ().selectOne ("com.mapper.UserMapper.selectUserByName",username);
        return user;
    }

    @Override
    public User showUserAll() {
        User user = this.getSqlSession ().selectOne ("com.mapper.UserMapper.showUserAll");
        return user;
    }
}
