/*package whatever //do not write package name here */

import java.io.*;

/*unstable,time compexity is O(n^2),In place algo  */

class Sort{
    
    
    public static void selectionSort(int a[],int n){
        
        
        for(int i=0;i<n-1;i++){
           
            int min=i;
            
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min])
                min=j;
             }
            
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
        
        
    }
    
	public static void main (String[] args) {
	
	   int a[]={2,5,3,4,1,8,9,0};
	   selectionSort(a,a.length);
	   for(int k:a)
	   System.out.print(k+" ");
	
	}
}
