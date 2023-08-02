package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPageSucces;

public class LoginSucessPageTest extends BaseClass {

	// mention pre condition
	// write the test cases with the help of
	// @Test annotation and call the associated functionality methods from
	// associated classes
	// from page layer package at the time of calling the method pass the test data
	// mention post condition

	@Test
	public void validateLoginSuccessPage() {
		LoginPageSucces loginsuccess = new LoginPageSucces();
		String text = loginsuccess.captureSuccessMessage();
		Assert.assertEquals(text,"Login Successfully");
	}

}
