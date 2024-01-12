package com.com.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTestNGClass {
  @Test
  public void f() {
	  
	  System.out.println("I Am in Test");
  }
  
  @Test
  public void f2() {
	  
	  
	  System.out.println("I Am in Test2");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("I Am in BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("I Am in AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("I Am in BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("I Am in AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("I Am in BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("I Am in AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("I Am in BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("I Am in AfterSuite");
  }

}
