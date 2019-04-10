package com.Ourbank.junitClass;

import org.apache.struts2.StrutsTestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Ourbank.actionClass.Emp_AddTrans_Action;
import com.Ourbank.actionForm.Emp_AddTrans;

public class EmpAddTransTest extends StrutsTestCase {

	Emp_AddTrans_Action empAddTra = new Emp_AddTrans_Action();
	Emp_AddTrans depo = new Emp_AddTrans();
	Emp_AddTrans with = new Emp_AddTrans();
	Emp_AddTrans view = new Emp_AddTrans();
	

	@Before
	public void setUp() throws Exception {
		super.setUp();
		empAddTra.setDepo(depo);
		empAddTra.setWith(with);
		empAddTra.setViews(view);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMoneyDeposit() {
		depo.setClid("1234");
		depo.setDetails("someDetails");
		depo.setAmount("1000");
		String result = empAddTra.deposit();
		assertEquals("success",result);

	}
	
	@Test
	public void testMoneyWithdrawMore(){
		with.setClid("1234");
		with.setDetails("someDetails");
		with.setAmount("500");
		String result = empAddTra.withdrawn();
		assertEquals("success",result);
		
	}
	
	@Test
	public void testMoneyWithdraw(){
		with.setClid("1234");
		with.setDetails("someDetails");
		with.setAmount("1000");
		String result = empAddTra.withdrawn();
		assertEquals("success",result);
		
	}
	
	@Test
	public void testViewCls (){
		view.setClid("1234");
		empAddTra.viewcls();
		assertNotNull(empAddTra.getDetailList());
	}
	

}
