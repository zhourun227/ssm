package mian.com.itheima.service.impl;

import mian.com.itheima.po.Customer;
import mian.com.itheima.dao.CustomerDao;
import mian.com.itheima.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    //自动注入
    @Autowired
    private CustomerDao customerDao;
    //查询客户
    @Override
    public Customer findCustomerById(Integer id) {
        return this.customerDao.findCustomerById(id);
    }
}
