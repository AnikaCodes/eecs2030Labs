package eecs2030.lab6;

/***********************************
* File name: BinaryTree.java
* Author: Last name, first name
* Student ID: 
* EECS login ID: 
************************************/

public class BinaryTree
{
	public class TreeNode
	{
		private int data;
		private TreeNode left;
		private TreeNode right;
		
		// Constructor
		public TreeNode( int d )
		{
			data = d;
			left = null;
			right = null;
		}  // end constructor TreeNode
	}  // end class BinaryNode
	
	private TreeNode root;
	
	// Constructor
	public BinaryTree( )
	{
		root = null;
	}  // end constructor BinaryTree	
	
    
    /**
     * Insert an integer d into the tree  
     */
    public void insert( int d )
    { 
		// This method is used to build the binary tree.
		// We are not concerned with how the tree is built.
		
		if ( root == null )
			root = new TreeNode( d );
		else {	
			TreeNode c = root;
			TreeNode par = null;
			while( c != null ) {
				par = c;
				if ( d < c.data )
					c = c.left;
				else
					c = c.right;	
			}	// end while
			if( d < par.data )
				par.left = new TreeNode( d );
			else
				par.right = new TreeNode( d );
		}  // end else			
    }  // end insert



	/**************************************************************
 	* DO NOT ADD ANYTHING ABOVE THIS LINE EXCEPT YOUR STUDENT INFO
 	***************************************************************/
 	
 	/**
     * Returns true if the binary tree contains key zero, and false otherwise.
     * Returns false if the tree is empty. 
 	 * Add a brief description of how your algorithm works below.
     */
     
    /* Brief description: ....................................

 	 */
       
    public boolean hasZero( )
    {
    	return helper(root, 0);
    }
   		
    	
public boolean helper(TreeNode root, int key) {
	
	    // Base Cases: root is null or key is present at root 
	    if (root==null) {
	    	return false;
	    }
	    else if(root.data==key) {
	        return true; 
	    }
	    // val is greater than root's key 
	    else{
	    	if (root.data > key) {
	    		
	    		return helper(root.left, key); 
	    }
	    	else {
	        return helper(root.right, key); 
	    	}
	    // val is less than root's key 
	    
	    }
	    

// COMPLETE THIS METHOD.

   		// DO NOT CHANGE the above method declaration.

   		// You may define local variables inside this method.  Do not use global variables.

   		// You may add your own helper methods/subroutines to this file.
   		
   		// NOTE: The external nodes are not dummy nodes but contain actual data (integers).
   		
			// replace this line with your code
		
    }	// end hasZero
    		
}  // end class BinaryTree	