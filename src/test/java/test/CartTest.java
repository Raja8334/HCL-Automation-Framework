package test;

import org.testng.annotations.Test;

import base.BaseTest;

public class CartTest extends BaseTest {
  @Test(groups = {"smoke"})
  public void cart() {
	  System.out.println("CartTest");
  }
  

}
