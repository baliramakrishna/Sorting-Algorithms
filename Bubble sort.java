
/* best case time complexcity=> O(n),worst case => O(n^2), Inplace sorting algo */


/*package whatever //do not write package name here */

import java.io.*;

class Sort{
    
    public static void bubbleSort(int a[],int n){
        
        
        for(int i=0;i<n-1;i++){
            
            boolean flag=false;
            
            for(int j=0;j<n-i-1;j++){
                
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;
                }
            }
            
           if(!flag)
           break;
            
            
        }
        
        
    }
    
	public static void main (String[] args) {
		
		int a[]={2,5,2,7,9,1,0,3,6,7};
		bubbleSort(a,a.length);
		
		for(int k:a)
		System.out.print(k+" ");
	}
}
