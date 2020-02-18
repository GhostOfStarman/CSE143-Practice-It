package cse143;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListProbs {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<String> arr2 = new ArrayList<String>();
		
		
		arr1.add(6);
		arr1.add(1);
		arr1.add(4);
		arr1.add(-2);
		
		arr2.add("Hi");
		arr2.add("Hi");
		arr2.add("Hello");
		arr2.add("Hola");
		arr2.add("Aloha");
		arr2.add("Nice");


		System.out.println(markLength4(arr2));
		
	}
	

//replaces every four letter word with "****":
	public static ArrayList<String> markLength4(ArrayList<String> list){
		
        for(int i = list.size() - 1; i >= 0; i--) {
        	
        	if(list.get(i).length() == 4) {
				
				list.add(i, "****");
				
			}

        }
        
        return list;
	}
	
	
//removes duplicates from arrList:
	public static ArrayList<String> removeDuplicates(ArrayList<String> list){ 
		
		ArrayList<String> holder = new ArrayList<String>();
		
		if(list.size() <= 1){
            
            return list;
        }
		
		for(int i = 1; i < list.size(); i++) {
			
			String tempStr = list.get(i);

			
			if(!holder.contains(tempStr)) {
				
				holder.add(tempStr);
				
			}
			
			}
		
		
		list.clear();
		
		for(int j = 0; j < holder.size(); j++) {
			
			list.add(holder.get(j));
			
		}

		return list;
	}
	
	
//switches orders of values in arrList of Strings in pairs:
	public static ArrayList<String> switchPairs(ArrayList<String> list){
		
		for(int i = 0; i < list.size()-1; i+=2) {
			
			String tempStr = list.get(i);
			String tempStr2 = list.get(i+1);
			
			list.set(i, tempStr2);
			list.set(i+1, tempStr);
			
		}
		
		
		return list;
		
	}

	
//iterates through consecutive pairs of string in arrList and eliminates the shorter one:
	public static ArrayList <String> removeShorterStrings (ArrayList<String> list){
			
		String last;
	
		if(list.size()==1) {
			
			return list;
		}
		
		if(list.size()%2 == 1) {
			
			last = list.get(list.size()-1);
			list.add(list.size()-1, last);
		}
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).length() < list.get(i+1).length()) {
				
				list.remove(i);
				
			}
			
			else if(list.get(i).length() == list.get(i+1).length()) {
				
				list.remove(i);
				
			}
			
			else {
				list.remove(i+1);
			}
			
		}
	
		return list;
	}
	
	
//duplicates value into index after current value:
	public static ArrayList<String> stutter(ArrayList<String> list){
	    

	    for(int i = 0; i < list.size(); i+=2){
	        
	        String temp = list.get(i);
	        
	        list.add(i, temp);
	        
	    }
	        
	    return list;
	    
	}
	
	
//returns max length of longest string in arrayList:
	public int maxLength(ArrayList<String> list){
	    
	    int max=0;
	    
	    if(list.isEmpty() == true){
	        
	        return 0;
	    }
	    
	    else{
	        
	        for(int i = 0; i < list.size(); i++){
	            
	            if(list.get(i).length() > max){
	             
	                max = list.get(i).length();
	                
	            }
	        
	        }
	    }
	    
	     return max;
	    
	    
	}
	
	
//returns range of values within arrList:
	public int range(ArrayList<Integer> list){
		 
	    if(list.size() == 0){
	        
	        return 0;
	    }
	    
	int min = list.get(0);
	 int max = list.get(0);
	    
	    for(int x: list){
	        
	        if(x < min){
	            
	            min = x;
	        }
	        
	        else if(x> max){
	            
	            max = x;
	            
	        }
	        
	        
	    }
	    
	    return max-min+1;
	}
	
	
//brings minimum integer to front of arrList:
	public static ArrayList<Integer> minToFront(ArrayList<Integer> list){
	    
	    int min = list.get(0);
	    
	    //{6,1,4,-2} -> {-2,6,1,4}
	    
	    for(int i = 0; i < list.size(); i++){
	        
	        int temp = list.get(i);
	        
	        if(temp < min){
	         
	            min = temp;

	        }
	        
	    }
	    list.remove(list.indexOf(min));
        list.add(0, min);
	    
	    return list;
	    
	}
	
	
//removes strings of even length from arrList:
	ArrayList<String> removeEvenLength(ArrayList<String> list){
        
	    List<String>removeList = new ArrayList<String>();
	    
	        for(String x: list){
	         
	            if(x.length()%2 == 0){
	                
	                removeList.add(x);
	            
	        }
	        }
	    list.removeAll(removeList);
	    return list;
	    
	}
	
}
