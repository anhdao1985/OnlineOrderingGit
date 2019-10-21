package AnhSandBox;

public class SandBox3 {

public static void main (String[]args){
		
		int a, b,c, d;
		a=10; b= 80; c= 700; d= -5000;
		
		
	// Flow control
	/*Java Conditional statements is to insert verification points and for error handling
	 * Two types of conditional statements in Java
	 * Type #1- If statement
	 * Type #2 - Switch statement
	 * 
	 * Types of conditions
	 * 1)Single condition (positive and negative condition)
	 * 2)compound condition
	 * 
	 */
	if (a>b){
	}  //This is a positive single condition 
	if (!(a<b)){
		} // This is a negative single condition
	
	if ((a>b) && (a>c)){
	} // compound condition
	if ((a>b) || (a>c)){
	} // compound condition
	
	//Nested condition
	
	if (a>b){
	if (a>c){
	if (a>d){
	}
	}
	}
	//usage of conditional statements
	//1)Execute a block of statements when condition is true
	/*Syntax:
	 * if (condition){Statements }
	 */
	if (a >b ){
		System.out.println("A is a big number"); // condition is true so it print
	}
	if (a<b ){
		System.out.println("A is a big number"); // condition is false so it printed nothing
	}
	
	if ((a>b) && (a>c)){
		System.out.println("A is a big number");// statement is true so print out the value
	}
	if ((a>b) && (a>c)){
		System.out.println("A is a big number");// statement is false so print out nothing
	}
	//Execute a block of statements when the condition is True, otherwise execute another block of statemetns.
	/*syntax:
	 * If (condition) {statement}
	 * else {statement}
	 */
	if (a>b ){
		System.out.println("A is a big number");
		}
		else {
			System.out.println("B is a big number");
		}
	if ((a>b) && (a>c)){
		System.out.println("A is a bigger number");
		}
	else {System.out.println("B and C are the big numbers");
	}
	
	//Decide among several alternates (else if structure)
	/* Syntax
	 * if (condition){statement}
	 * else if(condition) {statement}
	 * else {} -- this else is optional
	 */
	/*
	 * My requirements are - Initialize a integer variable, and verify the number.
	 * if the number is in between 1 and 100 then display number is small number.
	 * If the number is in between 101 and 1000 then display number is a medium number.
	 * if the number is in between 1001 and 10000 then display number is a big number.
	 * if the number is more than 10000 then display number is a high number.
	 * otherwise display Number is either zero or negative number.
	 * */
	int r=-5000;
	if ((r>=1) && (r <=100)){
		System.out.println("r is a small number");
		}
	else if ((r > 100) && (r <= 1000)){
		System.out.println("r is a medium number");
	}
	else if ((r > 1000) && (r <= 10000)){
		System.out.println("r is a big number");
	}
	else if (r > 10000){
		System.out.println("r is a high number");
	}
	else{
		System.out.println("r is either zero or negative number");
	}
	
	/* Execute a block of statements when more than one condition is true
	 * syntax
	 * if (condition){
	 * if (condition){
	 * If (condition){
	 * Statements
	 * Statements
	 * Statements 
	 * }
	 * }
	 * }
	 */
	
	if (a>b){
		if (a>c){
			if (a>d)
			{
				System.out.println("A is a big number");
			}
			else
			{
				System.out.println("A is not a big number");//this is for the first condition only if we take out the other two else statements
			}
			}
			else
			{
				System.out.println("A is not a big number"); //this is for the second condition only if we take out the other two else statements
			}
	     	}
			else
			{
				System.out.println("A is not a big number"); //this is for the third condition only if we take out the other two else statements
	        }

// Get biggest number out of four numbers (use Nested If and else if / Only else if and compound conditions)	
	
	if ((a>b) && (a>c) && (a>d)){
		System.out.println("A is big number");
	}
	else if(((b>a) && (b>c) && (b>d))){
		System.out.println("B is a big number");
		}
	else if (((c>b) && (c>a) && (c>d))){
		System.out.println("C is big number");	
	}
	else {
		System.out.println("D is a big number");
	}
	
	// Decide among several alternates (using switch case structure)
	/* syntax
	 * switch (expression) {
	 * case value:
	 * statements
	 * breaks;
	 * case value
	 * statements
	 * breaks;
	 * default
	 * statements
	 * 
	 * }
	 */
	
	char grade= 'B';
	
	switch (grade){
	
	case 'A':
	System.out.println("Excellent");
	break;
	
	case 'B':
	System.out.println("Good");
	break;
	
	case 'C':
	System.out.println("Passing");
	break;
	
	default:
		System.out.println("invalid Grade");
	
		}
	
	//Java Loop Statements - this is use for repetitive execution
	/* a) for loop	   (use variables) use in automation
	 * b) while loop   (use variables) use in automation
	 * c)do while loop (use variables) use in automation
	 * d) enhanced for loop (array and not use in automation)
	 */
	
	//example of (for loop) - it repeats a block of statements for a specified number of time
	/* syntax
	 * for (statValue; endValue; increment/decrement){statements}
	 * 
	 * requirement/example 1: Print 1 to 10 numbers
	 * requirement/example 2: Print 10 to 1 numbers
	 * requirement/example 3: Print 1 to 10 numbers, except 7
	 * 
	 */
	for(int k=1; k <=10; k++){
		System.out.println(k);  //requirement/example 1: Print 1 to 10 numbers
	}
	
	for(int i=10;  i>=1; i--){
		System.out.println(i); // Print 10 to 1 numbers
	}
	
	for (int p=1; p<=10; p++){
		if (p !=7){
			System.out.println(p); //requirement/example 3: Print 1 to 10 numbers, except 7
		}
	}
	
	for (int p=1; p<=10; p++){
		if ((p !=7)&& (p !=4)){
			System.out.println(p); //requirement/example 3: Print 1 to 10 numbers, except 7 and 4
		}
	}
	
	
	//while loop - repeat a block of statements while the condition is true 
	/*syntax
	 * initialization
	 * while (condition){statements increment/decrement}
	 * 
	 */
	
	int o=1;
	while(o <= 10){
		System.out.println(o); // Print 1 to 10 numbers
		o++;
	}
	
	int q=10;
	while(q >= 1){
		
		System.out.println(q);  // Print 10 to 1 numbers
		q--;
	}
	
	
	int p=1;
	while(p <= 10){
		if ((p!=7) && (p!=4))
		System.out.println(p);  // Print 10 to 1 numbers, , except 7 and 4
		p++;
	}
	
	//do while loop - it repeats a block of statements while condition is true
	//It executes a block of statements at least once irrespective of the condition.
	/*syntax
	 * initialization 
	 * do {statements increment/decrement}
	 * while(condition);
	 */
	
	int h = 1;
	do {
		System.out.println(h);
		h++; } while (h<=10);
	
//Enhance for loop - it executed all elements in an Array (array is an object in java)
	/*syntax
	 * Array declaration
	 * for (declaration: expression/array){statements}
	 *  watch ep 11 at 2hr 11 mins
	 */
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
}

