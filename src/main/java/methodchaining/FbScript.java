package methodchaining;

public class FbScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage lp = new LoginPage();
		lp.doLogin();
		
		HomePage hp = new HomePage();
		hp.sendFriendRequest();
		hp.sendMessage();
		
		//Method chaining can reduce a lot of lines of code
		new LoginPage().doLogin().sendFriendRequest().sendMessage();

	}

}
