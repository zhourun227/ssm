package mian.com.ssm5.chp4.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class MyUtils {
    private static SqlSessionFactory sqlSessionFactory=null;
    //初始化SqlSessionFactory对象
    static {
        try {
            //使用MyBatis提供的resources类加载MyBatis的配置文件
            Reader reader=
                    Resources.getResourceAsReader("mian/com/ssm5/chp4/Xml/mybatis-config.xml");
            //构建sqlSessionFactory工厂
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}
