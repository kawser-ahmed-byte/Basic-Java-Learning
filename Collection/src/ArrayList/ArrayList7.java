package ArrayList;

import java.util.*;

 class ArrayList7
    {
        public static void main(String args[])
            {
                   ArrayList<String> al=new ArrayList<String>();

                   System.out.println("Initial list of elements: "+al);
                   //Adding elements to the end of the list
                   al.add("Arshi");
                   al.add("Karim");
                   al.add("Bijoy");
                   System.out.println("After Adding 3 Names: " + al);
                   //Adding an element at the specific position
                   al.add(1, "Adnan");
                   System.out.println("After adding Adnan at index 1: " + al);

                   ArrayList<String> al2=new ArrayList<String>();
                   al2.add("Robin");
                   al2.add("Samiul");
                   //Adding second list elements to the first list
                   al.addAll(al2);
                   System.out.println("After adding al2 at al: " + al );

                   ArrayList<String> al3=new ArrayList<String>();
                   al3.add("Arshi");
                   al3.add("Mouri");
                   //Adding second list elements to the first list at specific position
                   al.addAll(1, al3);
                   System.out.println("After adding al3 at al 1 index: " + al);
             
            }
    }
