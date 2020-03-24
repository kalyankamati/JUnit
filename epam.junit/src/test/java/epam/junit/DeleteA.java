package epam.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeleteA {

	void test() {
		Junit deleteA =new Junit();
		String actual=deleteA.del("AAk");
		assertEquals("k",actual);
		System.out.println(actual);
		
	}

}
