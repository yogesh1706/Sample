package org.emp;
//method overloading by differ datatype arguments
public class Employee {
	
	private void empId(String name) {
		
		System.out.println("Employee name: "+name);
		
	}
	
    private void empId(int id) {
		
		System.out.println("Employee ID: "+id);
		
	}
    
   private void empId(char i) {
		
		System.out.println("Employee inital: "+i);
		
	}
   
   private void empId(long phone) {
	   
	   
		
		System.out.println("Employee phone no: "+phone);
		
	}
   
   private void empId(float weight) {
		
		System.out.println("Employee weight: "+weight);
		
	}
   
   private void empId(double height) {
		
		System.out.println("Employee height: "+height);
		
	}
   
   public static void main(String[] args) {
	
	   Employee e=new Employee();
	   e.empId("Ram");
	   e.empId(2622);
	   e.empId('h');
	   e.empId(75.6f);
	   e.empId(5.5);
	   e.empId(6546435135l);
}
	
	
	
	
	
	 
    
    
	

}
