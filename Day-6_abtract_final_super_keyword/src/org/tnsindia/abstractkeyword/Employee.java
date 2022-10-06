package org.tnsindia.abstractkeyword;

import java.security.Permission;

public class Employee  extends Permission{

	
	private static final long serialVersionUID = 1L;
	private int Eid;

	public Employee(String name, String gender, int eid) {
		super(name);
		Eid = eid;
	}

	public void work() {
		if(Eid==0)
		{
			System.out.println("Not Working");
		}
		else
		{
			System.out.println(" Working as a Employee");
		}
		
	}

	@Override
	public boolean implies(Permission permission) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getActions() {
		// TODO Auto-generated method stub
		return null;
	}

	public void changeName(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
}
