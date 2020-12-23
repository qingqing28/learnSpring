package Service;

import Dao.*;

public class UserServiceImpl implements UserService{
    UserDao userDao ;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    public void getUser(){
        System.out.println("获取数据：");
        userDao.getUser();
    }
}
