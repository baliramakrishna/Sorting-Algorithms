/*package whatever //do not write package name here */

import java.io.*;

class MergeSort{
    
    
    static void mergeSort(int a[],int n){
        
        
        if(n==1)
        return;
        
        int mid=n/2;
        
        int left[]=new int[mid];
        int right[]=new int[n-mid];
        
        for(int i=0;i<mid;i++)
            left[i]=a[i];
            
        for(int i=mid;i<n;i++)
          right[i-mid]=a[i];
          
          mergeSort(left,mid);
          mergeSort(right,n-mid);
          merge(left,right,a,mid,n-mid);
        
    }
    
    
    static void merge(int left[],int right[],int a[],int l,int r){
        
        
        int i=0,j=0,k=0;
        
        while(i<l && j<r){
            
            if(left[i]<=right[j])
                a[k++]=left[i++];
            else
            a[k++]=right[j++];
        }
        
        while(i<l)
         a[k++]=left[i++];
        
        while(j<r)
         a[k++]=right[j++];
        
    }
    
	public static void main (String[] args) {
		
		int a[]={2,4,1,6,8,5,3,7};
		mergeSort(a,a.length);
		for(int k:a)
		System.out.print(k+" ");
	}
}
