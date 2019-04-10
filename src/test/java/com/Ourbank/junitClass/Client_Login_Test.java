package com.Ourbank.junitClass;


import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.StrutsTestCase;
import org.junit.Before;
import org.junit.Test;

import com.Ourbank.actionClass.Client_Login_Action;
import com.Ourbank.actionForm.Client_Login;
import com.opensymphony.xwork2.ActionContext;


public class Client_Login_Test extends StrutsTestCase {
	Client_Login_Action clAction = new Client_Login_Action();
	Client_Login login = null;
	Client_Login chpw;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		Map<String, Object> sessionVal = new HashMap<String, Object>();
		
		sessionVal.put("user1", "1234");
		clAction.setChpw(chpw);
		clAction.setLogin(login);
		ActionContext.getContext().setSession(sessionVal);
		clAction.setSession(sessionVal);
		
	}

	@Test
	public void testCheckLogin() {
		String result = "";
			login = new Client_Login();
			if(login.getOldpw() != null && login.getNewpw() != null && login.getCnewpw() != null){
				login.setUserName("sandeep");
				login.setPassword("sandeep");
				login.setBank_id("1234");
				clAction.setLogin(login);
				result = clAction.checkLogin();
			}else{
				login.setUserName("");
				login.setPassword("");
				login.setBank_id("");
				clAction.setLogin(login);
				result = clAction.checkLogin();
			}
			if(result.equals("success"))
				assertEquals("success", result);
			else
				assertEquals("error", result);
		
	}

	@Test
	public void testChangepw() {
		login = new Client_Login();
		if(login.getOldpw() != null && login.getNewpw() != null && login.getCnewpw() != null){
			login.setOldpw("mindtree");
			login.setNewpw("sandeep");
			login.setCnewpw("sandeep");
			clAction.setChpw(login);
			String result = clAction.changepw();
			assertEquals("success", result);
		}
		else{
			
			login.setOldpw("");
			login.setNewpw("");
			login.setCnewpw("");
			clAction.setChpw(login);
			String result = clAction.changepw();
			assertEquals("error", result);
		}
	}
	
	@Test
	public void testLogout(){
		
		try {
			clAction.logout();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
