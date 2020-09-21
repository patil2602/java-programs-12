package ExceptionDemo;

public class UserRegThrowsMain {
	
	public static void main(String[] args) throws InvalidCountryNameException, InvalidAgeException {

		UserReg  user = new UserReg();
		user.registerationProfile();

}
}