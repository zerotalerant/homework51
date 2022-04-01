package Service;


import Dao.UserDao;
import Model.User;

public class UserService {
    UserDao userDao = new UserDao ();

    public int userRegistration ( User user )
    {
        UserDao userDao = new UserDao ();
        return userDao.insertUser ( user );
    }

    public void userAuthorize ( String username, String password )
    {


    }
}
