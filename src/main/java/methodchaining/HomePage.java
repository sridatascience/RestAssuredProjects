package methodchaining;

public class HomePage {
	
	public HomePage sendFriendRequest() {
		System.out.println("Send Friend request");
		return this;
	}
	
	public HomePage sendMessage() {
		System.out.println("Message sent");
		return this;
	}
	
 

}
