package com.pote.engg.exception;

import java.sql.SQLException;

public class ExceptionPropogation {
	public void p() throws SQLException{
		throw new SQLException();
	}
	
	public void q() throws SQLException{
		p();
	}
	
	public void r() throws SQLException{
		q();
	}
	
	

	public static void main(String[] args) {
		ExceptionPropogation obj = new ExceptionPropogation();
		try {
			obj.r();
		}catch(Exception ex) {
			System.out.println("Inside the sql exception");
		}
	}

}
