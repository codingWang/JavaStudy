package com.duweri.interview;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * JAVA8 
 * @author ¶ÅÎ°
 */
public class LambdaTest {

	public static void main(String[] args) {
		
	}
	
	public void inInterface(){
		Button button = new Button();
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("java7");
			}
		});
		
//		button.addActionListener(e->{System.out.println("java8");})
	}
	//Î½´Ê
	public void PredicateDemo(){
//		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
//		List<String> filteredNames = names
//		        .filter(e -> e.length() >= 4)
//		        .into(new ArrayList<String>());
//		for (String name : filteredNames) {
//		    System.out.println(name);
//		}
		
//		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
//		names.filter(e -> e.length() >= 4)
//		   .forEach(e -> { System.out.println(e); });
	//==================================================	
//		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
//		names.mapped(e -> { return e.length(); })
//		   .asIterable() // returns an Iterable of BiValue elements
//		                 // an element's key is the person's name, its value is the string length
//		   .filter(e -> e.getValue() >= 4)
//		   .sorted((a, b) -> a.getValue() - b.getValue())
//		   .forEach(e -> { System.out.println(e.getKey() + '\t' + e.getValue()); });
	}
}
