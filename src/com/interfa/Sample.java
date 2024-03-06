package com.interfa;

public class Sample extends Sampuu implements demo,memo 
{
 @Override
 public void test()
 {
	 System.out.println("overridden method of interface");
 }

@Override
public void bom() 
{
	System.out.println("overridden method of bom");	
}
}
