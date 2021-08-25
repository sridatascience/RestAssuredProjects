package methodchaining;

public class LoginPage {
	
	public HomePage doLogin() {
		System.out.println("you are logged in ");
		return new HomePage();
	}

}
