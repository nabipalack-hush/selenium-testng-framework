package oopConcept;

import org.testng.annotations.Test;

public class Source {
	
	 @Test
	 public void test1() {
		Day d=Day.MONDAY;
		Day u=Day.valueOf("hi");
		String v=String.valueOf(Day.MONDAY);
		Day days[]=Day.values();
		 for(Day day:days) {
			 System.out.println(day);
			 if(Day.MONDAY.equals(day)) {
				 break;
			 }
		 }
		 
		 
		 
		 
		 Animal a=new Cow() ;
		 a.eat();//milk Animal a=new Cow() ;
		
		 Animal a1=new Dog() ;
		 a1.eat();//bone
		
		 Animal an[]=new Animal[2];
		 an[0]=new Cow();
		an[1]=new Dog();
		 for(int i=0;i<an.length;i++) {
			 an[i].eat();
		 }
	 }

}
