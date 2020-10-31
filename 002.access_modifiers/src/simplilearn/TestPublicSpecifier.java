package simplilearn;

public class TestPublicSpecifier {

	public static void main(String[] args) {
		
		PublicSpecifier access = new PublicSpecifier();
		
		access.display(); //not visible outside the package
	}

}
