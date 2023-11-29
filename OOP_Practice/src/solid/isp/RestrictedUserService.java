package solid.isp;

public interface RestrictedUserService {

    boolean deleteUserInfoByID(long id);
    boolean deleteUserInfoByCellphone(String cellphone);
}

class AdminUserService implements UserService, RestrictedUserService{

    @Override
    public boolean deleteUserInfoByID(long id) {
        return false;
    }

    @Override
    public boolean deleteUserInfoByCellphone(String cellphone) {
        return false;
    }

    @Override
    public boolean register(String cellphone, String password) {
        return false;
    }

    @Override
    public boolean login(String cellphone, String password) {
        return false;
    }

    @Override
    public UserInfo getUserInfoById(long id) {
        return null;
    }

    @Override
    public UserInfo getUserInfoByCellphone(String cellphone) {
        return null;
    }
}