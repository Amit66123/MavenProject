package learn_testNG;

import org.testng.annotations.Test;

@Test(groups="groupsAtClassLevel")
public class GroupsDemo {
	@Test(groups= {"smoke"})
	public void testCase1()
	{
		System.out.println("Test Case 1 for smoke");
	}
	@Test(groups= {"smoke","sanity"})
	public void testCase2()
	{
		System.out.println("Test Case 2 for smoke and Sanity");
	}
	@Test(groups= {"linux.sanity"})
	public void testCase3()
	{
		System.out.println("Test Case 3 for Sanity");
	}
	@Test(groups= {"windows.regression"})
	public void testCase4()
	{
		System.out.println("Test Case 4 for regression");
	}
	@Test(groups= {"smoke","sanity","regression"})
	public void testCase5()
	{
		System.out.println("Test Case 5 for smoke, sanity and Regression");
	}
	@Test(groups= {"sanity","regression"})
	public void testCase6()
	{
		System.out.println("Test Case 6 for sanity and regression");
	}
	@Test(groups= {"mac.loadtest"})
	public void testCase7()
	{
		System.out.println("Test Case 7 mac.loadtest");
	}

}
