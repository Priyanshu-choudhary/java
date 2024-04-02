//Douch National Flag Approch

import java.util.*;
class SortArray{
	public static void main(String[] args){
	
		List<Integer> arr=new ArrayList<Integer>();
		List<Integer> arr2=new ArrayList<Integer>();
		arr.addAll(Arrays.asList(new Integer[] {1,2,0,2,0,1,1,2,0,0,0,2,1,2,1,0,1,2}));
		
		int countNumberOfTwos=0;
	
		for(int i=0;i<arr.size();i++){
			
			if(arr.get(i)==0){
				arr2.add(0,0);
				arr.remove(i);
				i--;
				}
			 else if(arr.get(i)==1){
				 try{
					 if(arr2.get(arr2.size()-1)==2){
						 arr2.add(arr2.size()-countNumberOfTwos,1);
						}
					else{
						arr2.add(arr2.size(),1);
						}
				}catch(Exception e){
					arr2.add(0,1);
					}
				arr.remove(i);
				i--;
				}
			else if(arr.get(i)==2){
				countNumberOfTwos++;
				arr2.add(arr2.size(),2);
				arr.remove(i);
				i--;
				}		
	
			}
			
		System.out.println("Result"+arr2);
		}
	}
