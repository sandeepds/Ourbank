package com.Ourbank.junitClass;


import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.StrutsTestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Ourbank.actionClass.Emp_Login_Action;
import com.Ourbank.actionForm.Emp_Login;
import com.opensymphony.xwork2.ActionContext;

public class Emp_Login_Test extends StrutsTestCase{
	Emp_Login_Action emp_Login_Action = new Emp_Login_Action();
	Emp_Login empLogin = null;
	
	
	@Before
	public void setUp() throws Exception {
		super.setUp();

		Map<String, Object> sessionVal = new HashMap<String, Object>();
		
		sessionVal.put("user", "emp");
		ActionContext.getContext().setSession(sessionVal);
		emp_Login_Action.setChpw(empLogin);
		emp_Login_Action.setLogin(empLogin);
		emp_Login_Action.setSession(sessionVal);
	}

	@Test
	public void testCheckLoginNull(){
		String result = "";
		empLogin = new Emp_Login();
		empLogin.setUserName("");
		empLogin.setPassword("");
		empLogin.setBank_id("");
		emp_Login_Action.setLogin(empLogin);
		result = emp_Login_Action.checkLogin();
		assertEquals("error", result);
	}
	
	@Test
	public void testCheckLogin(){
		String result = "";
		empLogin = new Emp_Login();
		empLogin.setUserName("aaa687");
		empLogin.setPassword("aaa687");
		empLogin.setBank_id("687");
		emp_Login_Action.setLogin(empLogin);
		result = emp_Login_Action.checkLogin();	
		assertEquals("success", result);
	}
	

	@Test
	public void testChangepw() {
		String result = "";
		empLogin = new Emp_Login();
		if(empLogin.getOldpw() != null && empLogin.getNewpw() != null && empLogin.getCnewpw() != null){
			empLogin.setOldpw("abcd");
			empLogin.setNewpw("abcde");
			empLogin.setCnewpw("abcde");
			emp_Login_Action.setChpw(empLogin);
			result = emp_Login_Action.changepw();
			assertEquals("success", result);
		}	
	}
	
	@After
	public void removeChangepw(){
		String result = "";
		if(empLogin.getOldpw() != null && empLogin.getNewpw() != null && empLogin.getCnewpw() != null){
			empLogin.setOldpw("abcde");
			empLogin.setNewpw("abcd");
			empLogin.setCnewpw("abcd");
			emp_Login_Action.setChpw(empLogin);
			result = emp_Login_Action.changepw();
			assertEquals("success", result);
		}	
	}
}
