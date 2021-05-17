package mian.com.ssm6.chp5;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao{

    @Override
    public Customer findCustomerById(Integer id) {
        return this.getSqlSession().selectOne("mian.com.ssm6.chp5.CustomerMapper.fingCustomerById",id);
    }
}
