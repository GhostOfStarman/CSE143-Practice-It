package cse143;

import java.util.*;

public class SetsAndMapsProbs {

	public static void main(String[] args) {
	}
	
//returns the number of unique integer values in the list	
	public int numUnique(List<Integer> list) {
		  Set<Integer> set = new LinkedHashSet<>();
		  for (Integer number : list) {
		    set.add(number);
		  }
		  return set.size();
		}
	
//returns the number of unique integers that occur in both lists	
	public int numInCommon(List<Integer> list1, List<Integer> list2) {
		  Set<Integer> set1 = new LinkedHashSet<>();
		  Set<Integer> set2 = new LinkedHashSet<>();
		  
		  for (Integer number : list1) {
		    set1.add(number);
		  }
		  for (Integer number : list2) {
		    set2.add(number);
		  }
		  
		  int common = 0;
		  for (Integer number : set1) {
		    if (set2.contains(number)) {
		      common++;
		    }
		  }
		  
		  return common;
		}
	
//returns longest String in set	
	public int maxLength(Set<String> set){
	    int maxString = 0;
	    
	    if(set.isEmpty()){
	        return 0;
	    } 
	    
	    for(String s: set){
	        int stringLength = s.length();
	        if(stringLength > maxString){      
	            maxString = stringLength; 
	        }
	    }
	    
	    return maxString;
	}
	
//returns true if the set has at least one odd integer	
	public boolean hasOdd(Set<Integer> set){
		 
	    if(set.isEmpty()){
	        return false;
	    }
	     
	    for(Integer i: set){
	        if(i%2 == 1){
	            return true;
	        }
	    }    
	        
	    return false;
	    
	}
	
//removes Strings of even length	
	public void removeEvenLength(Set<String> set){
		 
	    Iterator<String> iterator = set.iterator();
	    
	    while(iterator.hasNext()) {
	        String setElement = iterator.next();
	        if(setElement.length()%2 == 0) {
	            iterator.remove();
	        }
	    }
	    
	}
	
//returns true if any single string occurs at least 3 times in the list, and false otherwise	
	public boolean contains3(List<String> list){
		 
	    Map<String, Integer> map = new LinkedHashMap<>();
	    
	    for(String s: list){
	     
	        if(!map.containsKey(s)){
	            map.put(s, 1);
	        } else{
	            int val = map.get(s);
	            val++;
	            map.replace(s, val);
	        }      
	    }
	           
	    if(map.values().contains(3)){
	            return true;
	        }
	    
	    return false;
	    
	}
	
//returns a map from each value in the set to the number of occurrences of that value in the list	
	public Map<Integer, Integer> counts(List<Integer> list, Set<Integer> set){
		 
	    Map<Integer, Integer> map = new HashMap<>();
	    
	    for(Integer i: set){
	        map.put(i, 0);
	    }
	    
	    for(Integer j: list){
	        if(map.containsKey(j)){
	            int val = map.get(j);
	            val+=1;
	            map.put(j, val);
	        }
	        
	    }
	    
	    return map;
	}
	
//returns true if no two keys map to the same value (and false if any two or more keys do map to the same value)	
	public boolean isUnique(Map<String,String> map){
	    
	    Set<String> set = new LinkedHashSet<>();
	    
	    set.addAll(map.values());

	    if(map.values().size() == set.size()){
	        return true;
	    }
	    
	    return false;
	}
	
//reverses the order of the V,K of the initial map	
	public Map<String, Integer> reverse(Map<Integer, String> map){
		 
	    Map<String, Integer> revMap = new LinkedHashMap<>();
	    
	    for (Map.Entry<Integer,String> entry : map.entrySet())  {
		           revMap.put(entry.getValue(), entry.getKey());
			}
	    
	    return revMap;
	}
	
//returns a map of the V,K that appears in both maps	
	public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2){
		 
	    Map<String, Integer> retMap = new LinkedHashMap<>();
	    
	    for (Map.Entry<String,Integer> entry : map1.entrySet()){
	        for (Map.Entry<String,Integer> entry2 : map2.entrySet()){
	                    if(entry.getKey() == entry2.getKey() && entry.getValue() == entry2.getValue())
	                    retMap.put(entry.getKey(), entry.getValue());
	               }
			}
	                  
	    return retMap;
	}
	
//returns the number of times the most frequent integer in the list occurs 	
	int maxOccurrences(List<Integer> list){
	    
	    Map<Integer, Integer> map = new LinkedHashMap<>();
	    
	    if(list.size() == 0){
	        return 0;
	    }
	    
	    for(int i = 0; i < list.size(); i++){
	        int val = list.get(i);
	        if(!map.containsKey(val)){
	            map.put(val, 1);
	        }else{
	            int val2 = map.get(val);
	            val2++;
	            map.put(val, val2);
	        }
	    }
	           
	    int maxVal = 0;
	           
	    Collection<Integer> set = map.values();
	    
	    for(Integer j: set){
	        maxVal = Math.max(maxVal, j);
	    }
	           
	    return maxVal;
	}
	
}
