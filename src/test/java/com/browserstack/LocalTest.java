package com.browserstack;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;

public class LocalTest extends BrowserStackJUnitTest {

	
	
  @Test
  public void test() throws Exception {
    driver.get("http://localhost:8888/MAMP/?language=English");
    Thread.sleep(3000);
    System.out.println(driver.getTitle());
    assertTrue(driver.getTitle().equalsIgnoreCase("MAMP"));
    TestStatus="passed";
    
  }
}
