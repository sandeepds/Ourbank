package com.Ourbank.junitClass;


import org.apache.struts2.StrutsTestCase;
import org.junit.Before;
import org.junit.Test;

import com.Ourbank.actionClass.Admin_EmpChPW_Action;
import com.Ourbank.actionForm.Admin_EmpChPW;

public class Admin_EmpChPW_Test extends StrutsTestCase {

	Admin_EmpChPW_Action adAction = new Admin_EmpChPW_Action();
	Admin_EmpChPW adForm;
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		adForm = new Admin_EmpChPW();
		adForm.setBank_id("1234");
		adForm.setNewpw("abcd");
		adForm.setCnewpw("abcd");
		adAction.setChpw(adForm);
		String result = adAction.changepw();
		assertEquals("success", result);
		//fail("Not yet implemented");
	}

}
