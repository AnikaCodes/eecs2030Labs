package eecs2030.lab6;


/***********************************
* File name: Rearrange.java
* Author: Last name, first name
* Student ID: 
* EECS login ID: 
************************************/

public class Rearrange
{

/**************************************************************
 * DO NOT ADD ANYTHING ABOVE THIS LINE EXCEPT YOUR STUDENT INFO
 ***************************************************************/

/* 
 * Rearrange the array so that all the negative numbers 
 * appear before all the non-negative numbers. 
 * n is the number of elements A contains.
 *
 * The running time of your algorithm must O( n ).
 * Add a brief description of how your algorithm works below.
 */

/* Brief description: ....................................

 */
 


   // COMPLETE THIS METHOD.
	
	


	public static void rearrangeArray( int[] A, int n )
	{//first pos found in arr new
	    int neglast=0;
	    //new rear
	    int foundpos=0;
	    
	    arrayHelper(A, neglast, foundpos, n);

	}

	public static void arrayHelper( int[] A, int neglast, int foundpos, int n){
	    if(neglast == n) {
	    	return;
	    } 
	    else if(foundpos==n) {
	    	return;
	    }
	    else{
	        if(A[foundpos]>= 0){
	        	arrayHelper(A, neglast, foundpos+1,n);
	        }
	        //pointing same at the beginning. 
	        //neg number not found>> increment neglast
	        //pos FOUND increment foundpositive.
	        
	else if (A[neglast]>=0){
	           //swap(A[foundpos], A[neglast] );
		int foo= A[neglast];
		A[neglast]=A[foundpos];
		A[foundpos]=foo;
	        	arrayHelper(A, neglast+1, foundpos+1, n);

	        }
	        else{
	        	arrayHelper(A,neglast+1, foundpos, n);
	        }
	    }
	}

	public static void swap(int i, int j) {
		int foo= j;
		j=i;
		i=foo;
	}
}
