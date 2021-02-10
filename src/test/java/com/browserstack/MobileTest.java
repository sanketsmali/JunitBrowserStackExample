package com.browserstack;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MobileTest extends BrowserStackJUnitTest {
	


  @Test
  public void test() throws Exception {
    driver.get("https://www.google.com/ncr");
    WebElement element = driver.findElement(By.name("q"));
    element.sendKeys("BrowserStack");
    element.submit();
    Thread.sleep(5000);
    assertEquals("BrowserStack - Google Search", driver.getTitle());
    TestStatus="passed";
  }
}
