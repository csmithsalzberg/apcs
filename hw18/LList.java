//Caleb Smith-Salzberg
//APCS2 pd5
//HW18b -- On the DLL
//2017-03-15

/*****************************************************
 * class LList
 * skeleton
 * Implements a linked list of LLNodes.
 *****************************************************/

public class LList implements List 
{ //your homemade List.java must be in same dir

    //instance vars
    private LLNode _head;
    private int _size;

    // constructor -- initializes instance vars
    public LList( ) 
    {
        _head = null;
        _size = 0;
    }


    //--------------v  List interface methods  v--------------

    /* YOUR IMPLEMENTATIONS HERE */
    public boolean add( String x ) {
	if (this.size() == 0) { //if theres nothing in the head, just add the new node immediately
	    _head = new LLNode( x, null );
	    _size+=1;
	    return true;
	}
	LLNode curr = _head; //otherwise, traverse through _head with a new LLNode
	for (int i = 0; i+1 < this.size(); i++) { //reach the end of _head
	    curr = curr.getNext();
	}
	curr.setNext( new LLNode(x, null)); //add the new node at the end
	_size+=1;
	return true;
    }

    public String get( int i ) {
	LLNode curr = _head; //same methodf as before
	for (int j = 0; j < i; j++) {
	    curr = curr.getNext();
	}
	return curr.getCargo();
    }

    public String set( int i, String x ) {
	String old = get(i);
    LLNode curr = _head;
	for (int j = 0; j < i; j++) {
	    curr = curr.getNext();
	}
	curr.setCargo(x);
	return old;
    }
    public void add( int index, String newVal ){
        for (int i=_size; i>index; i--){
            set(i, get(i-1));
        }
        set(i,newVal);
        _size+=1;
    }
    public String remove( int index ){
        for (int i=index; i<_size; i++){
            set(i, get(i+1));
        }
        _size-=1;
    }
    
    //return number of nodes in list
    public int size() { return _size; } 

    //--------------^  List interface methods  ^--------------


    // override inherited toString
    public String toString() { 
	String retStr = "HEAD->";
	LLNode tmp = _head; //init tr
	while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
	}
	retStr += "NULL";
	return retStr;
    }


    //main method for testing
    public static void main( String[] args ) 
    {
	LList james = new LList();

	System.out.println( james );
	System.out.println( "size: " + james.size() );

	james.add("beat");
	System.out.println( james );
	System.out.println( "size: " + james.size() );

	james.add("a");
	System.out.println( james );
	System.out.println( "size: " + james.size() );

	james.add("need");
	System.out.println( james );
	System.out.println( "size: " + james.size() );

	james.add("I");
	System.out.println( james );
	System.out.println( "size: " + james.size() );

	System.out.println( "2nd item is: " + james.get(1) );

	james.set( 1, "got" );
	System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

	System.out.println( james );
	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class LList
