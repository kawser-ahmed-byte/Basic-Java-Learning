package ArrayList.Book;

import ArrayList.Book.BookDemoClass;

import java.util.*;


    public class ArrayList20
    {
        public static void main(String[] args)
            {
    //Creating list of Books  
                List<BookDemoClass> list=new ArrayList<BookDemoClass>();
                //Creating Books
                BookDemoClass b1=new BookDemoClass(101,"Debi","Humayun","BPB",8);
                BookDemoClass b2=new BookDemoClass(102,"Life of Pie","Shams","Amazon",4);
                BookDemoClass b3=new BookDemoClass(103,"Breathe","Galvin","Wiley",6);
                //Adding Books to list
                list.add(b1);
                list.add(b2);
                list.add(b3);
    //Traversing list  
                 for(BookDemoClass b:list)
                    {
                        System.out.println("ID is: " + b.id+" "+"\nBook Name is: " +b.name+" "+"\nAuthor Name is: " +b.author
                                +" "+"\nPublisher Name is: " +b.publisher+" "+"\nQuantity is: " +b.quantity);
                    }
            }
    }