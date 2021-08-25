package restassured;


class MethodRepo{
	
	public MethodRepo printName(String name) {
		System.out.println("name is "+ name);
		
		//return new MethodRepo();
		//instead of creating one more new object we can return
		//the same object by calling this
		return this;
	}
	
	public MethodRepo printAge(int age) {
		System.out.println("Age is "+ age);
		//return new MethodRepo();
		//instead of creating one more new object we can return
		//the same object by calling this
		return this;
	}
}










public class MethodChainingLogic {
    public static void main(String[] args) {
    	MethodRepo methodRepo = new MethodRepo();
    	methodRepo.printName("Sridhar").printAge(25);
		
	}
}
