package cn.xc.test;

import cn.xc.entity.User;
import cn.xc.util.MyBatis;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        SqlSession session = MyBatis.getSqlSession();
        User user = session.selectOne("cn.xc.entity.UserMapper.selectUser",1);
        System.out.println("name:"+user.getName()+"\npwd:"+user.getPwd());
        session.close();
    }
}
