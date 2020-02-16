package cse143;

public class ArraysProbs {

	public static void main(String[] args) {
		
	}
	
	
	//returns index of targeted value, if not in array, return -1
	public int indexOf(int[] list, int target){
	    
	    for(int i = 0; i<list.length; i++){
	     
	        if(list[i] == target){
	            
	            return i;
	        }
	    }
	    
	    return -1;
	    
	}
	
	
	
	//prints input array into bracketed format
	public void print(int[] list){
	    
	    if(list.length == 0){
	     
	        System.out.print("[]");
	    }
	    
	    else{
	    System.out.print("[");   
	    
	    for(int i = 0; i < list.length-1; i++){
	        
	     System.out.print(list[i] +", ");   
	        
	    }
	    
	    
	    System.out.print(list[list.length-1]+"]");   
	    }
	}
	
	
	//returns number of unique integers in array
	public int numUnique(int[] arr){
	    
	    int uni = 1;
	    
	    if(arr.length == 0){
	        
	        return 0;
	    } 
	    
	    else{
	        
	     int temp = arr[0]; 
	        
	     for(int i = 1; i < arr.length; i++){

	         if(arr[i] != temp){
	             
	             uni+=1;
	             temp = arr[i];
	         }
	     }
	     
	    }
	    return uni;
	}
	
	
}
