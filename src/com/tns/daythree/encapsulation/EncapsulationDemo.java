package com.tns.daythree.encapsulation;
import java.util.Scanner;
public class EncapsulationDemo {

	public static void main(String[] args) {
		
		/*s.setName("spoorthi HK");
		s.setRollNo(20);
		s.setAge(21);
		System.out.println("Name"+s.getName());
		System.out.println("Name"+s.getRollNo());
		C("Name"+s.getAge());
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		System.out.println("enter age");
		System.out.println("enter per");
		String name=sc.nextLine();
		int age=sc.nextInt();
		float per=sc.nextFloat();
		System.out.println("name:"+name+"age:"+age+"per"+per);
	}

}
