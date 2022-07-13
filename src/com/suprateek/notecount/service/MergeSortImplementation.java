package com.suprateek.notecount.service;

public class MergeSortImplementation {
	
	public void merge(int arr[], int left, int mid, int right){
	    
	    int n1 = mid-left+1;
	    
	    int n2 = right-mid;
	   
	   
	    int leftArray[] = new int[n1];
	    int rightArray[] = new int[n2];
	    
	 
	    
	    for(int i=0;i<n1;++i)
	        leftArray[i] = arr[left+i];
	    for(int j=0;j<n2;++j)
	        rightArray[j] = arr[mid+1+j];
	   
	   
	    int i=0,j=0;
	  
	
	    int k= left;
	    
	    while(i<n1 &&j<n2){
	       
	    	if(leftArray[i] >= rightArray[j]){
	            arr[k]=leftArray[i];
	            i++;
	      
	        }else{
	        	  arr[k] = rightArray[j];
		           j++;
		   
	        }
	    	  k++;
	       }
	    
	 // copy remaining elements of left array if any
	    while(i<n1){
	    
	       arr[k] = leftArray[i];
	       i++;
	       k++;
	    }
	
	// copy remaining elements of right array if any
	while(i < n2){
	
	   arr[k]=rightArray[i];
	   i++;
	   k++;
	}
	}
	
	// Main function that sorts array[left ... right]using merge()
	public void sort(int[]notes,int left,int right){
	   if(left < right){
		// Find the middle point
	       int mid=(left+right)/2;
	       
	       // Sort first and second halves
	       sort(notes, left, mid);
	       sort(notes, mid+1, right);
	       // Merge the sorted halves
	       merge(notes,left,mid,right);
	   }
	}
}
