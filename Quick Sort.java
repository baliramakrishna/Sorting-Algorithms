/*package whatever //do not write package name here */

import java.io.*;

class QuickSort{
    
    public static void quickSort(int a[],int start,int end){
        
        if(start<end){
          
            int pivot=randomPartition(a,start,end);
            quickSort(a,start,pivot-1);
            quickSort(a,pivot+1,end);
            
        }
    }
    
    public static int randomPartition(int a[],int start,int end){
        
        int pindex=((int)((end-start)*(Math.random())))+start;
        swap(a,pindex,end);
        return partition(a,start,end);
        
        
    }
    
    static int partition(int a[],int start,int end){
        
        int pivot=end;
        int pIndex=start;
        
        for(int i=start;i<end;i++){
            
            if(a[i]<=a[pivot]){
            swap(a,i,pIndex);
            pIndex++;        
            }
        }
        
       
        if(a[pIndex]>a[pivot])
          swap(a,pIndex,pivot);
        	
	
        return pIndex;
        
    }
   
   public static void swap(int a[],int x,int y){
       
       int temp=a[x];
       a[x]=a[y];
       a[y]=temp;
   }
	public static void main (String[] args) {
		
		int a[]={7,2,1,6,8,5,3,4,834,63,732,262,273,7347384};
		quickSort(a,0,a.length-1);
	    
	    for(int k:a)
	    System.out.print(k+" ");
	}
}
