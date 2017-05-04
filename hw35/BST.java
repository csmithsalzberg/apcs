//Caleb Smith-Salzberg
//APCS2 pd5
//HW34 -- Algorithm as Data Structure
//2017-05-03

/*****************************************************
 * class BST
 * <<< skeleton >>>
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT) 
 * A BST maintains the invariant that, for any node N with value V, 
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value, 
 *  and any value in its right subtree must be greater.)
 * This BST only holds ints (its nodes have int cargo)
 *****************************************************/

public class BST 
{
    //instance variables / attributes of a BST:
    private TreeNode root;

    /*****************************************************
     * default constructor
     *****************************************************/
    BST( ) 
    {
	root = null;
    }


    /*****************************************************
     * void insert( int ) 
     * Adds a new data element to the tree at appropriate location.
     *****************************************************/
    public void insert( int newVal ) 
    {
    if (root==null)
	    root = new TreeNode(newVal);
	else{
        TreeNode track = root;
	    while(track.getValue()>newVal || track.getValue()<newVal){
		if (newVal < track.getValue()){ //if the root value is greater than the to-be-added
            if (track.getLeft()!=null){
		      track=track.getLeft();
            }
            else{
                track.setLeft(new TreeNode(newVal));
            }
        }
		if (newVal > track.getValue()){ //if the root value is less than the to-be-added
            if (track.getRight()!=null){
		      track=track.getRight();
            }
            else{
                track.setRight(new TreeNode(newVal));
            }
        }
    }
    }
    }


    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

    // each traversal should simply print to standard out 
    // the nodes visited, in order

    public void preOrderTrav() 
    {
        pre(root);
    }
    
    public void pre(TreeNode root){
        if (root==null) 
            return;
        System.out.print(root.getValue()+",");
        pre(root.getLeft());
        pre(root.getRight());
    }
    
    public void inOrderTrav() 
    {
        in(root);	
    }
    
    public void in(TreeNode root){
        if (root==null)
            return;
        in(root.getLeft());
        System.out.print(root.getValue()+",");
        in(root.getRight()); 
    }

    public void postOrderTrav() 
    {
        post(root);
    }
    
    public void post(TreeNode root){
	if (root==null)
            return;
        post(root.getLeft());
        post(root.getRight()); 
	System.out.print(root.getValue()+",");
        
    }



    /*****************************************************
     * TreeNode search(int)
     * returns pointer to node containing target,
     * or null if target not found
     *****************************************************/
    TreeNode search( int target )
    {
    	/*** YOUR IMPLEMENTATION HERE ***/
    }


    /*****************************************************
     * int height()
     * returns height of this tree (length of longest leaf-to-root path)
     * eg: a 1-node tree has height 1
     *****************************************************/
    public int height() //h of L, h of R, add 1
    {
    	retrun 1 + totalh(root);
    }
    public int height(root){
	if (root.getleft==null && root.getRight==null)
	    return 1;
	return max(height(root.getLeft),height(root.getRight()));
    }


    /*****************************************************
     * int numLeaves()
     * returns number of leaves in tree
     *****************************************************/
    public int numLeaves()
    {
    	/*** YOUR IMPLEMENTATION HERE ***/
    }




    //main method for testing
    public static void main( String[] args ) 
    {
	/*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
	  BST arbol = new BST();

	  arbol.insert( 4 );
	  arbol.insert( 2 );
	  arbol.insert( 5 );
	  arbol.insert( 6 );
	  arbol.insert( 1 );
	  arbol.insert( 3 );

	  System.out.println( "\npre-order traversal:" );
	  arbol.preOrderTrav();

	  System.out.println( "\nin-order traversal:" );
	  arbol.inOrderTrav();
	
	  System.out.println( "\npost-order traversal:" );
	  arbol.postOrderTrav();	

	  //insert your new test calls here...
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class
