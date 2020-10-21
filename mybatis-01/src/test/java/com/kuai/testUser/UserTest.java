package com.kuai.testUser;

import com.kuai.dao.UserDao;
import com.kuai.pojo.User;
import com.kuai.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserTest {

    @Test
    public void test(){

        //获取sqlSession实列
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //获取mapper
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        //调用方法
        List<User> list = mapper.getListUser();
        for(User user : list){
            System.out.println(user);
        }

        //关闭链接
        sqlSession.close();

//        错误：userDao没有在mapper注册
//        Type interface com.kuai.dao.UserDao is not known to the MapperRegistry
    }
}
