package simplilearn;

import  simplilearn.ProtectedSpecifier;

public class TestProtectedSpecifier {

	public static void main(String[] args) {
		
		ProtectedSpecifier access = new ProtectedSpecifier();
		
		access.display(); //not visible outside the package
	}

}
