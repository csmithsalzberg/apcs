//Caleb Smith-Salzberg
//APCS2 pd5
//HW18a -- On the DLL
//2017-03-15

/*****************************************************
 * class DLLNode
 * Implements a node, for use in lists and other container classes.
 *****************************************************/

public class DLLNode 
{

    private String _cargo;    //cargo may only be of type String
    private DLLNode _nextNode; //pointer to next LLNode
    private DLLNode _prevNode; //pointer to prev LLNode

    // constructor -- initializes instance vars
    public LLNode( String value, DLLNode next, DLLNode last ) 
    {
        _cargo=value;
        _nextNode=next;
	_prevNode=last;
    }


    //--------------v  ACCESSORS  v--------------
    public String getCargo() { return _cargo; }

    public LLNode getNext() { return _nextNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo( String newCargo ) 
{
        String old = _cargo;
        _cargo = newCargo;
        return old;
    }

    public LLNode setNext( LLNode newNext ) 
{
        LLNode old = _nextNode;
        _nextNode = newNext;
        return old;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() { return _cargo.toString(); }


    //main method for testing
    public static void main( String[] args ) 
{

	//Below is an exercise in creating a linked list...

	//Create a node
	LLNode first = new LLNode( "cat", null );

	//Create a new node after the first
	first.setNext( new LLNode( "dog", null ) );

	//Create a third node after the second
	first.getNext().setNext( new LLNode( "cow", null ) );
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

	// A naive list traversal:
	while( first != null ) {
	    System.out.println( first );
	    first = first.getNext();
	}
    //~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 
	//Q: When head ptr moves to next node in list,
	//   what happens to the node it just left?
    //   It is ignored (?)

    }//end main

}//end class LLNode
