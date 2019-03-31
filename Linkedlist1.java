package datastructures;

public class Linkedlist1 {
           Node head = null;
           Node current = null;
            
           
       void push(int data){
        	Node n= new Node();
        	n.data =data;
        	if (head == null){
            head = n;
            current = n;
            }
        	else {
        		current.nextnode = n;
        		current = n;
         }
       }
       void pop(){
    	   Node n= head;
    	   head = n.nextnode;
       }  
       
       
     //Size of the list
       int size(){
    	   int size = 0;
    	   Node n  = head;
    	   while (n!=null){
    		   size++;
    		   n = n.nextnode;
    	   }
    	   System.out.println("size of the list is" +size);
    	   return size;
       }
       
       
       //max number in the list
         int max() {
        	 Node temp = head;
        	 int max = head.data;
        	 while(temp!=null){
        	 if (temp.data>max){
        		 max = temp.data;
              }	 
             temp = temp.nextnode;
            }
        	 System.out.println("max number in the list" +max);
        	 return max;
          } 
         
         
      //min number in the list
         int min(){
        	 Node temp = head;
        	 int min = head.data;
        	 while(temp!=null){
        	 if(temp.data<min){
        		 min=temp.data;
                }
        	 temp= temp.nextnode;
        	  }
        	 System.out.println("min number in the list" +min);
        	 return min;
         }
         
         
         
       void display() {
    	    Node n = head;
    	    while(n!= null) {
    	    System.out.println("The inserted element " +n.data);
    	    n = n.nextnode;
    	    }
       }
       
}
                                                                                                                                                                           