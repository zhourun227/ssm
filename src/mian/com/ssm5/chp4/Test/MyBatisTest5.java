package mian.com.ssm5.chp4.Test;

import mian.com.ssm5.chp4.po.Customer;
import mian.com.ssm5.chp4.utils.MyUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MyBatisTest5 {
    @Test
    public void findCustomerByTest5() throws Exception {
        SqlSession sqlSession= MyUtils.getSession();

        Customer customer=new Customer();
        customer.setUsername("jack");
        customer.setJobs("teacher");
        List<Customer> customers=sqlSession.selectList("mian.com.ssm5.chp4.mapper.CustomerMapper5.findsql",customer);
        for (Customer c:customers){
            System.out.println(c);
        }
        sqlSession.close();
    }
}
