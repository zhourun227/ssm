package mian.com.ssm4.chp3.Dao;

public class UserDaoImpl implements UserDao{
    @Override
    public void addUser() {
        System.out.println("添加信息");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除信息");
    }
}
