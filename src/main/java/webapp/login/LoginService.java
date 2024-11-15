package webapp.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("drv98") && password.equals("1234"))
			return true;

		return false;
	}

}
