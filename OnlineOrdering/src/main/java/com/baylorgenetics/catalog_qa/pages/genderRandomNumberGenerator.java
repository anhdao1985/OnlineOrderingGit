package com.baylorgenetics.catalog_qa.pages;



import java.util.concurrent.ThreadLocalRandom;



	
public class genderRandomNumberGenerator {

	    public static void main(String[] args) 
	    {
	        for(int i=0; i<2; i++)
	        {
	            int randomNum = ThreadLocalRandom.current().nextInt( 1 + 1);
	            System.out.println(randomNum);
	        }
	    }
	}


