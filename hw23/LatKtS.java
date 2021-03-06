/*****************************************************
 * class LatKtS (LatKeysToSuccess)
 * Driver class for Latkes.
 * Uses a stack to reverse a text string, check for sets of matching parens.
 * SKELETON
 *****************************************************/


public class LatKtS 
{

    /**********************************************************
     * precondition:  input string has length > 0
     * postcondition: returns reversed string s
     *                flip("desserts") -> "stressed"
     **********************************************************/
    public static String flip( String s ) 
    {
	String retstr="";
	Latkes flip= new Latkes(s.length());
	for (int i=0; i<s.length(); i++)
	    flip.push(s.substring(0,1));
	for (int i=0; i<s.length(); i++)
	    retstr+=flip.pop;
	return retstr;	  
    }//end flip()


    /**********************************************************
     * precondition:  s contains only the characters {,},(,),[,]
     * postcondition: allMatched( "({}[()])" )    -> true
     *                allMatched( "([)]" )        -> false
     *                allMatched( "" )            -> true
     **********************************************************/
    public static boolean allMatched( String s ) 
    { 
	return false;
    }//end allMatched()


    //main method to test
    public static void main( String[] args ) { 


	System.out.println(flip("stressed"));
	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
        System.out.println(allMatched( "({}[()])" )); //true
        System.out.println(allMatched( "([)]" ) ); //false
        System.out.println(allMatched( "(){([])}" ) ); //true
        System.out.println(allMatched( "](){([])}" ) ); //false
        System.out.println(allMatched( "(){([])}(" ) ); //false
        System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
          ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
    }

}//end class LatKtS
