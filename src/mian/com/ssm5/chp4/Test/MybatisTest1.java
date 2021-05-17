package mian.com.ssm5.chp4.Test;

import mian.com.ssm5.chp4.po.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisTest1 {
        @Test
        public void findCustomerByTest1() throws Exception {
            String resource = "mian/com/ssm5/chp4/Xml/mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            List<Customer> l=sqlSession.selectList("mian.com.ssm5.chp4.mapper"+
                    ".CustomerMapper1.fingCustomerByName","j");
            for (Customer c:l){
                System.out.println(c);
            }
            sqlSession.close();
        }
    }