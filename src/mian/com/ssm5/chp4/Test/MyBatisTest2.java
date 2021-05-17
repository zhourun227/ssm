package mian.com.ssm5.chp4.Test;

import mian.com.ssm5.chp4.po.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class MyBatisTest2 {
    @Test
    public void findCustomerByTest2() throws Exception {
        String resource = "mian/com/ssm5/chp4/Xml/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        Customer customer=new Customer();
        customer.setUsername("rose");
        customer.setJobs("student");
        customer.setPhone("27546");
        int rows=sqlSession.insert("mian.com.ssm5.chp4.mapper.CustomerMapper2.addCustomer",customer);
        if (rows>0){
            System.out.println("更新了"+rows+"行");
        }else {
            System.out.println("插入失败");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
