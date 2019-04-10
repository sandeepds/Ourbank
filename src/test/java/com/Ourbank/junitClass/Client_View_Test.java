package com.Ourbank.junitClass;


import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.StrutsTestCase;
import org.junit.Before;
import org.junit.Test;

import com.Ourbank.actionClass.Client_View_Action;
import com.Ourbank.actionForm.Client_View;
import com.opensymphony.xwork2.ActionContext;

public class Client_View_Test extends StrutsTestCase {

	Client_View_Action clAction = new Client_View_Action();
	Client_View view;
	Client_View abc = new Client_View();
	Map<String, Object> sessionVal;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		Map<String, Object> sessionVal = new HashMap<String, Object>();
		sessionVal.put("user1", "1234");
		ActionContext.getContext().setSession(sessionVal);
		//clAction.setSession(sessionVal);
		view = new Client_View();
		view.setClid("1234");
	}

	@Test
	public void testViewcl() {
		
		clAction.setView(view);
		String result = clAction.viewcl();
		assertEquals("success", result);
		//fail("Not yet implemented");
	}

}
