//Caleb Smith-Salzberg
//APCS2 pd5
//HW22 -- Stacks on Stacks on Stacks on StacksÃ¢â¬Â¦
//2017-03-22

/***
 * class Latkes
 * SKELETON
 * (actually: a class to implement a stack of Strings)
 * uses an array as underlying data structure
 ***/

public class Latkes 
{

    private String [] _stack;
    private int _stackSize;

    //constructor
    public Latkes(int size) 
    { 
	_stack=new String[size];
    _stackSize=0;
    }

    //means of insertion
    public void push( String s ) 
    {
	if (_stackSize != _stack.length){
	    _stack[_stackSize+1]=s;
	    _stackSize+=1;
	}
    }

    //means of removal
    public String pop( ) 
    { 
	_stackSize-=1;
    return (_stack[_stackSize+1]);
    }

    //chk for emptiness
    public boolean isEmpty() 
    { 
	return (_stack.length==0);
    }

    //chk for fullness
    public boolean isFull() 
    {
	return (_stackSize==_stack.length);
    }

}//end class Latkes
