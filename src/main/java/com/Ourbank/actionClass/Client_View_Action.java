package com.Ourbank.actionClass;

import com.opensymphony.xwork2.ActionSupport;

import com.Ourbank.daoImpl.Client_View_DaoImpl;
import com.Ourbank.actionForm.Client_View;
import java.util.List;
import java.util.Map;

public class Client_View_Action extends ActionSupport {

	private static final long serialVersionUID = -1977441021493581739L;
	private Client_View view;
	private Client_View abc = new Client_View();
	private Client_View_DaoImpl xyz = new Client_View_DaoImpl();
	private List<Client_View> detailList;

	private Map<String, Object> session;

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	/**
	 * @return Client View Transactions
	 */
	public String viewcl() {
		this.detailList = xyz.list(view);
		xyz.vish(abc);
		return SUCCESS;

	}

	public Client_View getView() {
		return view;
	}

	public void setView(Client_View view) {
		this.view = view;
	}

	public Client_View_DaoImpl getXyz() {
		return xyz;
	}

	public void setXyz(Client_View_DaoImpl xyz) {
		this.xyz = xyz;
	}

	public List<Client_View> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<Client_View> detailList) {
		this.detailList = detailList;
	}

	public Client_View getAbc() {
		return abc;
	}

	public void setAbc(Client_View abc) {
		this.abc = abc;
	}

}