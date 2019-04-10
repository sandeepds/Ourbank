package com.Ourbank.junitClass;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.StrutsTestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Ourbank.actionClass.Admin_Login_Action;
import com.Ourbank.actionForm.Admin_Login;
import com.opensymphony.xwork2.ActionContext;

public class Admin_Login_Test extends StrutsTestCase {
	/* public class Admin_Login_Test extends StrutsJUnit4TestCase { */
	Admin_Login_Action alAction = new Admin_Login_Action();
	Admin_Login adLogin = new Admin_Login();

	@Before
	public void setUp() throws Exception {
		super.setUp();

		Map<String, Object> sessionVal = new HashMap<String, Object>();
		alAction.setChpw(adLogin);
		alAction.setLogin(adLogin);
		sessionVal.put("user1", "1234");
		ActionContext.getContext().setSession(sessionVal);
		alAction.setSession(sessionVal);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCheckLogin() {
		adLogin.setUserName("admin");
		adLogin.setPassword("admin");
		adLogin.setBank_id("1234");
		String result = alAction.checkLogin();
		assertEquals("success", result);

	}

	@Test
	public void testChangePw() {
		// request.setParameter("adminLogin.userName", "abc");
		// request.setParameter("adminLogin.password", "abc");
		// System.out.println("adLogin .." +adLogin.getUserName());
		adLogin.setUserName("User One");
		adLogin.setPassword("newPwd");
		adLogin.setOldpw("admin");
		adLogin.setNewpw("admin");
		adLogin.setCnewpw("admin");
		String result = alAction.changepw();
		assertEquals("success", result);
		// fail("Not yet implemented");
	}

}
