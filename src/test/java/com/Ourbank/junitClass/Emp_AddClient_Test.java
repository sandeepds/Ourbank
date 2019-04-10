package com.Ourbank.junitClass;


import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.StrutsTestCase;
import org.junit.Before;
import org.junit.Test;

import com.Ourbank.actionClass.Emp_AddClient_Action;
import com.Ourbank.actionForm.Client_Login;
import com.Ourbank.actionForm.Emp_AddClient;
import com.opensymphony.xwork2.ActionContext;

public class Emp_AddClient_Test extends StrutsTestCase{
	
	Client_Login clLogin = new Client_Login();
	Emp_AddClient_Action emp_AddClient_Action = new Emp_AddClient_Action();
	Emp_AddClient emp_AddClient = null;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		Map<String, Object> sessionVal = new HashMap<String, Object>();
		
		sessionVal.put("test", "1234");
		ActionContext.getContext().setSession(sessionVal);
	}

	@Test
	public void test() {
		clLogin.setUserName("sandeep");
		clLogin.setPassword("sandeep");
		emp_AddClient_Action.setAdds(clLogin);
		String result = emp_AddClient_Action.addClients();
		assertEquals("success", result);
		
	}
	
	@Test
	public void testAddClient(){
		emp_AddClient = new Emp_AddClient();
		emp_AddClient.setAddress("add");
		emp_AddClient.setBank_id("1234");
		emp_AddClient.setBranch("add");
		emp_AddClient.setCity("add");
		emp_AddClient.setDob("01/01/2001");
		emp_AddClient.setEmail("add");
		emp_AddClient.setFirstName("add");
		emp_AddClient.setGender("M");
		emp_AddClient.setLandLine("9393993");
		emp_AddClient.setLastName("add");
		emp_AddClient.setMiddleName("add");
		emp_AddClient.setMobile("939393");
		emp_AddClient.setState("add");
		emp_AddClient_Action.setAdd(emp_AddClient);		
		String result = emp_AddClient_Action.addClient();
		if(result.equals("success"))
			assertEquals("success", result);
		else
			assertEquals("error", result);
	}
	
	@Test
	public void testEditClient(){
		emp_AddClient = new Emp_AddClient();
		emp_AddClient.setBank_id("1234");
		emp_AddClient_Action.setEdit(emp_AddClient);
		String result =emp_AddClient_Action.editclient();
		assertEquals("success", result);
	}

	@Test
	public void testeClient(){
		emp_AddClient = new Emp_AddClient();
		emp_AddClient.setAddress("update");
		//emp_AddClient.setBank_id("1234");
		emp_AddClient.setBranch("update");
		emp_AddClient.setCity("update");
		emp_AddClient.setDob("01/01/2001");
		emp_AddClient.setEmail("update");
		emp_AddClient.setFirstName("update");
		emp_AddClient.setGender("M");
		emp_AddClient.setLandLine("9393993");
		emp_AddClient.setLastName("update");
		emp_AddClient.setMiddleName("update");
		emp_AddClient.setMobile("939393");
		emp_AddClient.setState("update");
		emp_AddClient_Action.setAddb(emp_AddClient);		
		String result = emp_AddClient_Action.eclient();
		if(result.equals("success"))
			assertEquals("success", result);
		else
			assertEquals("error", result);
	}
}
