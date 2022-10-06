package org.tnsindia.abstractkeyword;

public class Execulator {


		public static void main(String[] args) {
			Employee p=new Employee("Nutan","Female",1);
			Employee p1=new Employee("Namita","Female",2);
			System.out.println(p.toString());
	        p.work();
	        p1.work();
	        p.changeName("Pratiksha");
	        System.out.println(p.toString());
		}

}
