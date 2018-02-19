package com.sixdelta;

public class StringCalculator {
	
	public int add(String numbers)
	{
		if(numbers.isEmpty())
		{
			return 0;
		}
		else if()
		{
			return	Integer.parseInt(numbers);
		}
		else
		{
          int n=7, suma=1;
		
		   for (int i=1; i<n; i++)
		   {
		      if(i==1)
		     {
			   System.out.print("("+i+")"+"="+suma+"\n");
		     }
		     else if(i==2)
		     {
			   suma++;
			   System.out.print("("+i+")"+"="+suma+"\n");
		      }
		      else
		     {
			   suma=(i-1)+(i-2);
		      System.out.print("("+i+")"+"="+suma+"\n");
		     }
		   }
		}
	
	
	}

	
	
	
}
