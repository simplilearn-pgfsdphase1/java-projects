package universe;

import simplilearn.ProtectedSpecifier;

public class TestProtectedSpecifier {

	public static void main(String[] args) {
		
		ProtectedSpecifier access = new ProtectedSpecifier();		
		//access.display(); //accessible in the package
		
		SubClass instance = new SubClass();
		instance.display();
	}

}
