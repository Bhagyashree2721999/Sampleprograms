package com.program.files;

import java.util.*;

public class QueueOperation {
	public static void main(String args[]) {
		
		
		Queue<Integer> queue1=new LinkedList<>();
		queue1.add(2331);
		queue1.add(123);
		queue1.add(123);
		queue1.add(3647);
		
	System.out.println(queue1);
	System.out.println(queue1.poll());
	System.out.println(queue1.remove());
		
	}	

}
