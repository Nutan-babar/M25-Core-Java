package org.tnsindia.multithreding;

//demo on Synchronized method
public class SynchronizedMethodDemo {
	
	synchronized void arraysum(int[] arr)
	{
		int sum=0;
		for(int itr:arr)
		{
			System.out.println(Thread.currentThread().getName());
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public Object arraysum1(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object arraysum11(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

