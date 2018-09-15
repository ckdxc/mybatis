package cn.xc.test;

import cn.xc.dao.UserDao;
import cn.xc.entity.User;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        UserDao userDao = new UserDao();
//        System.out.println(userDao.getById(1));
//        System.out.println(userDao.addUser(new User("zz","ss")));
//        User user = userDao.getById(1);
//        user.setPwd("newpwd");
//        System.out.println(userDao.updateUser(user));
//        System.out.println(userDao.deleteUser(2));
        List<User> users = userDao.getAll();
        for (User user : users){
            System.out.println(user);
        }
    }
}
