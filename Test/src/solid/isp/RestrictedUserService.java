package solid.isp;

public interface RestrictedUserService {
    boolean deleteUserById(long id);
    boolean deleteUserbyCellphone(String cellphone);
}

class UserAdminServiceImpl implements UserService, RestrictedUserService{

    @Override
    public boolean deleteUserById(long id) {
        return false;
    }

    @Override
    public boolean deleteUserbyCellphone(String cellphone) {
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
