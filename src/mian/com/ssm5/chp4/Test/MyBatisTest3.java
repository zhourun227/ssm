package mian.com.ssm5.chp4.Test;

import mian.com.ssm5.chp4.po.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class MyBatisTest3 {
    @Test
    public void findCustomerByTest3() throws Exception {
        String resource = "mian/com/ssm5/chp4/Xml/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        Customer customer=new Customer();
        customer.setId(4);
        customer.setUsername("rose");
        customer.setJobs("writer");
        customer.setPhone("999999");
        int rows=sqlSession.insert("mian.com.ssm5.chp4.mapper.CustomerMapper3.updateCustomer",customer);
        if (rows>0){
            System.out.println("修改了"+rows+"行");
        }else {
            System.out.println("修改失败");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
