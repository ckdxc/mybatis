package cn.xc.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatis {
    /**
     * 通过配置文件创建SqlSessionFactory
     * @return
     * @throws IOException
     */
    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis.cfg.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }

    /**
     * SqlSession
     * @return
     * @throws IOException
     */
    public static SqlSession getSqlSession() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        return sqlSessionFactory.openSession();
    }
}
