package services;

import daos.UserDao;

public class UserService extends BaseService
{
    public UserService(){
        setEntityDao(new UserDao());
    }
}
