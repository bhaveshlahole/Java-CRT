package com.pote.engg.exception;

public class SampleExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Prepare for the exception");
		try {
			System.out.println("Reach to the vmv square");
			System.out.println("Observe the trffic on the road");
			System.out.println("Ask for the traffic");
			System.out.println("Again observe the traffic");
			//throw new RuntimeException("Accident :: 2 hr");
		}
		catch(Exception ex){
			System.out.println("Take diversion");
			System.out.println("Reason is ::"+ex.getMessage());
			System.out.println("Reached to theater");
		}
			finally {
				System.out.println("removal of keys");

			}

			
		}
	}

