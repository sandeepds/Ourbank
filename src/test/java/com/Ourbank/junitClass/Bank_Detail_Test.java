package com.Ourbank.junitClass;

import org.apache.struts2.StrutsTestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Ourbank.actionClass.Bank_Detail_Action;
import com.Ourbank.actionForm.Bank_Detail;

public class Bank_Detail_Test extends StrutsTestCase {

	Bank_Detail_Action bdAction = new Bank_Detail_Action();
	Bank_Detail bankDetail = new Bank_Detail();

	@Before
	public void setUp() throws Exception {
		super.setUp();
		bankDetail.setBank_id(Long.valueOf(12));
		bankDetail.setBank_branch_name("First");
		bankDetail.setBank_branch_add("test");
		bankDetail.setBank_branch_city("test");
		bankDetail.setBank_branch_phone("987898789");
		bdAction.setDetails(bankDetail);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBankDetails() {
		String result=bdAction.execute();
		assertEquals("success",result);
		String temp = bdAction.addBank();
	}

}
