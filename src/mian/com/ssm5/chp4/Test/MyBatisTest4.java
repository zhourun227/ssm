package mian.com.ssm5.chp4.Test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class MyBatisTest4 {
    @Test
    public void findCustomerByTest4() throws Exception {
        String resource = "mian/com/ssm5/chp4/Xml/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        int rows=sqlSession.delete("mian.com.ssm5.chp4.mapper.CustomerMapper4.delecrCustomer",4);
        if (rows>0){
            System.out.println("删除了"+rows+"行");
        }else {
            System.out.println("删除失败");
        }
        sqlSession.commit();
        sqlSession.close();

    }
}
