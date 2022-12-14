package com;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import unit.RunTest;

public class ExecutionPoint {


public static void main(String[] args) {
	System.out.println("Do something in application");
	Result res= JUnitCore.runClasses(RunTest.class);
	//res will collect the results in an array [pass,pass,fail,pass]
	for(Failure fail:res.getFailures())
	{	
	System.out.println(fail.toString());
    System.out.println(res.wasSuccessful());	
	System.out.println("Do something in application");

	}

}
}