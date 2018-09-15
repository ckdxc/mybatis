package cn.xc.dao;

import cn.xc.entity.User;
import cn.xc.util.MyBatis;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class UserDao {
    public User getById(int id) throws IOException {
        SqlSession session = MyBatis.getSqlSession();
        User user = session.selectOne("cn.xc.entity.UserMapper.selectUser",id);
        session.close();
        return user;
    }
    public List<User> getAll() throws IOException {
        SqlSession session = MyBatis.getSqlSession();
        List<User> users = session.selectList("cn.xc.entity.UserMapper.selectAll");
        session.close();
        return users;
    }
    public int addUser(User user) throws IOException {
        SqlSession session = MyBatis.getSqlSession();
        int result = session.insert("cn.xc.entity.UserMapper.addUser",user);
        session.commit();
        session.close();
        return result;
    }
    public int updateUser(User user) throws IOException {
        SqlSession session = MyBatis.getSqlSession();
        int result = session.update("cn.xc.entity.UserMapper.updateUser",user);
        session.commit();
        session.close();
        return result;
    }
    public int deleteUser(int id) throws IOException {
        SqlSession session = MyBatis.getSqlSession();
        int result = session.delete("cn.xc.entity.UserMapper.deleteUser", id);
        session.commit();
        session.close();
        return result;
    }
}
