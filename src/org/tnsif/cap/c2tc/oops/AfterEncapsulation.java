package org.tnsif.cap.c2tc.oops;

public class AfterEncapsulation {
	public class Human1 {
	    public static void main(String[] args) {

	        AfterEncapsulation obj = new AfterEncapsulation();

	        obj.setAge(12);
	        obj.setName("Hema");

	        System.out.println(obj.getAge());
	        System.out.println(obj.getName());
	    }
	}
}
