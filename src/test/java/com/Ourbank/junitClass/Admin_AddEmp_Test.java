package com.Ourbank.junitClass;



import org.apache.struts2.StrutsTestCase;
import org.junit.Before;
import org.junit.Test;

import com.Ourbank.actionClass.Admin_AddEmp_Action;
import com.Ourbank.actionForm.Admin_AddEmp;
import com.Ourbank.actionForm.Emp_Login;

public class Admin_AddEmp_Test extends StrutsTestCase {

	Emp_Login emp_login = null;
	
	Admin_AddEmp_Action admin_addEmp_Action = new Admin_AddEmp_Action();
	Admin_AddEmp admin_AddEmp = new Admin_AddEmp();
	
	
	
	String bankEmpId = "";
	
	@Before
	public void setUp() throws Exception {
		Integer id = (int)(Math.random()*1000);
		bankEmpId = ""+id;
		System.out.println("bankEmpId : " + bankEmpId);
	}

	@Test
	public void testAddEmp() {
		
		admin_AddEmp.setAddress("ad");
		admin_AddEmp.setBank_id(bankEmpId);
		admin_AddEmp.setBranch("br");
		admin_AddEmp.setCity("ci");
		admin_AddEmp.setDob("10/10/1000");
		admin_AddEmp.setEmail("abc@abc.com");
		admin_AddEmp.setFirstName("fn");
		admin_AddEmp.setGender("M");
		admin_AddEmp.setLandLine("939393");
		admin_AddEmp.setLastName("ln");
		admin_AddEmp.setMiddleName("mn");
		admin_AddEmp.setMobile("03039");
		admin_AddEmp.setRole_name("rn");
		admin_AddEmp.setState("st");
		admin_addEmp_Action.setAdd(admin_AddEmp);
		String result = admin_addEmp_Action.addEmp();
		assertEquals("success", result);
		if(result.equals("sucess")){
			emp_login = new Emp_Login();
			emp_login.setBank_id(bankEmpId);
			emp_login.setPassword("aaa"+bankEmpId);
			emp_login.setUserName("aaa"+bankEmpId);
			admin_addEmp_Action.setAdds(emp_login);
			result = admin_addEmp_Action.addEmps();
		}
	}


}
