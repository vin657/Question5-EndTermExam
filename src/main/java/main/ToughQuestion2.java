package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread
                        	double calories=cal.calculateCalories(bread);
                        	String energy=String.format("%.3f",cal.calculateEnergy(calories));
                        	System.out.println(energy+" kJ of energy generated from "+calories+" calories");
                        	
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread & jam
                        	double Calories=cal.calculateCalories(bread,jam);
                        	String Energy=String.format("%.3f",cal.calculateEnergy(Calories));
                        	System.out.println(Energy+" kJ of energy generated from "+Calories+" calories");
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for  bread,jam & butter
                        	double Calories1=cal.calculateCalories(bread,jam,butter);
                        	String Energy1=String.format("%.3f",cal.calculateEnergy(Calories1));
                        	System.out.println(Energy1+" kJ of energy generated from "+Calories1+" calories");
                        	break;
                        }
                        //System.out.printf("%.3f",ca.calculateEnergy());
                        
            }
}



class Calories {
	
	
    
    
    int calculateCalories(int bread) {
   
    	
    	int BE=bread*74;
    	
    	return  BE ;
    }
    
    
    
    
    int calculateCalories(int bread,int jam) {
   
    	
    	int BE=bread*74+jam*26;
    	
    	return  BE ;
    }
    
    
    
    
    
    int calculateCalories(int bread,int jam,int butter) {
   
    	
    	int BE=bread*74+jam*26+butter*102;
    	
    	return  BE ;
    }
    
       
           float calculateEnergy(double calories) {
        	float f=(float) (calories*4.1868);
        	   
        	   return f;
           }
            
            
}