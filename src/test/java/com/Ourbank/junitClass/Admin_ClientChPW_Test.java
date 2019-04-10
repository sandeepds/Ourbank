package com.Ourbank.junitClass;


import org.apache.struts2.StrutsTestCase;
import org.junit.Before;
import org.junit.Test;

import com.Ourbank.actionClass.Admin_ClientChPW_Action;
import com.Ourbank.actionForm.Admin_ClientChPW;

public class Admin_ClientChPW_Test extends StrutsTestCase {
	
	Admin_ClientChPW_Action aAction = new Admin_ClientChPW_Action();
	Admin_ClientChPW chpw = new Admin_ClientChPW();

	@Before
	public void setUp() throws Exception {
		
		
	}

	@Test
	public void test() {
		chpw.setNewpw("mindtree");
		chpw.setCnewpw("mindtree");
		chpw.setBank_id("1234");
		aAction.setChpw(chpw);
		String result = aAction.changepw();
		assertEquals("success", result);
		//fail("Not yet implemented");
	}

}
