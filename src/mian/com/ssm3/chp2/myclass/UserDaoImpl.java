package mian.com.ssm3.chp2.myclass;

import mian.com.ssm3.chp2.interfaceweb.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
//<bean id="userDao" class="...UserDaoImpl"/>
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("userdao...save...");
    }
}
