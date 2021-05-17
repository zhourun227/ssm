package mian.com.ssm5.chp4.Test;

import mian.com.ssm5.chp4.po.Customer;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.apache.ibatis.io.Resources;
import java.io.InputStream;

public class MyBatisTest {
    @Test
    public void findCustomerByTest() throws Exception{
        //读取配置文件
        String resource="mian/com/ssm5/chp4/Xml/mybatis-config.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //SqlSession执行映射文件中的sql语句
        Customer customer=sqlSession.selectOne("mian.com.ssm5.chp4.mapper"+
                ".CustomerMapper.fingCustomerById",1);
        System.out.println(customer.toString());
        sqlSession.close();
    }
}
