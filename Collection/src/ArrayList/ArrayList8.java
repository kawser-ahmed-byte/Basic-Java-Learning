package ArrayList;

import java.util.*;

class ArrayList8
{
  
  public static void main(String [] args)
     {
          ArrayList<String> al=new ArrayList<String>();  
          al.add("Robin");    
          al.add("Samiul");    
          al.add("Adnan");   
          al.add("Arshi");  
          al.add("Pathan");  
          System.out.println("An initial list of elements: "+al);   
          //Removing specific element from arraylist  
          al.remove("Adnan");  
          System.out.println("After removing Adnan: "+al);
          //Removing element on the basis of specific position  
          al.remove(0);  
          System.out.println("After removing index 0: "+al);
            
          //Creating another arraylist  
          ArrayList<String> al2=new ArrayList<String>();    
          al2.add("Rayhan");    
          al2.add("Simanto");    
          //Adding new elements to arraylist  
          al.addAll(al2);  
          System.out.println("Updated list : "+al);   
          //Removing all the new elements from arraylist  
          al.removeAll(al2);  
          System.out.println("After removing al2: "+al);
          //Removing elements on the basis of specified condition  
          al.removeIf(str -> str.contains("Samiul"));   //Here, we are using Lambda expression   
          System.out.println("After Samiul: "+al);
          System.out.println("Is ArrayList Empty: "+ al.isEmpty());
          //Removing all the elements available in the list  
          al.clear();  
          System.out.println("After clear method: "+al);
          System.out.println("Is ArrayList Empty: "+al.isEmpty()); 
          al.add("John");
          System.out.println("An initial list of elements: "+al);   
          al.removeIf(str -> str.equals("John"));   //Here, we are using Lambda expression 
          System.out.println("An initial list of elements: "+al);  
          al.add("Ron");
          System.out.println("An initial list of elements: "+al);  
          al.removeIf(str -> str.equals("Ro"));   //Here, we are using Lambda expression 
           System.out.println("An initial list of elements: "+al);  
             System.out.println("Is ArrayList Empty: "+al.isEmpty()); 
       }  
    }                   
