package org.tnsindia.packagexample;

import java.util.Scanner;

//importing the pacakge
import org.tnsindia.packagedemo.*;

public class PackageClient {

	public static void main(String[] args) {
		
		/* we are accesing the metod of PackageDemo class import the package
		 *  of the specified class */
		
		
		// user input
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str1=s.nextLine();
		
		
		//object creation
		PackageDemo d=new PackageDemo();
		d.str=str1;
		d.display();
		s.close();

	}

}
