package AnhSandBox;

public class SandBox2 {
	static int e=10, f=5;



	public static void main(String[] args) {
		
		
	// Addition +  (can be use for addition or string concatenation)
		System.out.println(e+f);
		
		String g= "Tuananhdao", h=" Testing";
		System.out.println(g+h);// Concatenation (Tuannhdao Testing)
		System.out.println("The result of addition of e, f is: " + (e+f));
		
	//Subtraction - (can be use for Subtraction, Negation)
		System.out.println(e-f); // the result is -10 which is Negation (negative number)
		System.out.println(f-e); // the result is 10 which is a subtraction

	// Multiplication * 	
		System.out.println(e*f);
		
	// Division /	
		System.out.println(e/f);
		
	// Modules %	this is calculate the remainder which is what remain after a devision 
	// if 8/2 = remainder is 0, 10/3 = the remainder is 1 ( what remain after 10/3 is 1)
		System.out.println(e%f);
		
	// Increment ++ 
		e=++f;
		System.out.println(e); // 5+1 = 6
		
	// Decrement --
		e=--f;
		System.out.println(e);

		e=f++;
		System.out.println(e);
		
	//Relational operators (<=,=>,!=,==...) return Boolean / Logical results (true/false)
		
		System.out.println((e>f)); // result is false
		System.out.println((e>=f)); // result is false
		System.out.println((e==f)); // result is false
		System.out.println((e<f)); //result is true
		
	/* Three important logical operators 	
	 * 1) Logical for Not Operator  !
	 * Result criteria : 
	 * Operand1         Operand2        Result
	 *  True              True           False
	 *  True              False          True
	 *  False             True           True
	 *  False             False          True
	 *  
	 * 2) Logical for and operator  &&
	 *  * Result for (and operator) criteria : 
	 * Operand1         Operand2        Result
	 *  True              True           True
	 *  True              False          False
	 *  False             True           False
	 *  False             False          false
	 * 
	 * 3) Logical for or operator   || 
	 *  *  * Result for (Or operator) criteria : 
	 * Operand1         Operand2        Result
	 *  True              True           True
	 *  True              False          True
	 *  False             True           True
	 *  False             False          False
	 */
		//Examples 
		boolean i=true, j=false;	
	System.out.println(!(i && j)); // for not operator , the result is True
	System.out.println((i && j));// the and operator, the result is false	
	System.out.println((i || j));	// True
		
		int o =1000, p =500, q =7000;
		
	if ((o>p) && (o>q)){
		System.out.println("O is a big number");	
	}
	else{
		System.out.println("O is not a big number");
	}

	//Assignment operators (we dont use this in automation)
	/* Assign operator the symbo is =, a=10;
	 * 
	 * Add and Assign +=
	 * 
	 * Subtract and assign 
	 * 
	 * Multiple and assign
	 */

	int n=10;
	System.out.println(n); // result is 10
	n+=10;
	System.out.println(n);// result is 20
	n-=10;
	System.out.println(n);// result is 10
	n*=10;
	System.out.println(n);// 100









		
		
	}
		
		
		
		
		
		
		
		
}
