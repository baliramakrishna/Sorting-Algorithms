/*package whatever //do not write package name here */

import java.io.*;

/* stable,best case:O(n),worst case:O(n^2),inplace algo */
class Sort{
    
    public static void insertionSort(int a[],int n){
        
        
       for(int i=1;i<n;i++){
           
           int value=a[i];
           int  hole=i;
           
           while(hole>0 && a[hole-1]>value){
               a[hole]=a[hole-1];
               hole--;
           }
           a[hole]=value;
           
       }
        
    }
    
	public static void main (String[] args) {
		
		int a[]={2,5,2,7,9,1,0,3,6,7};
		insertionSort(a,a.length);
		
		for(int k:a)
		System.out.print(k+" ");
	}
}
