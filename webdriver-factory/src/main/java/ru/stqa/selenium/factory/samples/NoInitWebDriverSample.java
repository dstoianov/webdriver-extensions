package ru.stqa.selenium.factory.samples;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.stqa.selenium.factory.WebDriverFactory;

public class NoInitWebDriverSample {

  @Test
  public void test1() {
    doSomething();
  }

  @Test
  public void test2() {
    doSomething();
  }

  @Test
  public void test3() {
    doSomething();
  }

  private void doSomething() {
    WebDriver driver = WebDriverFactory.getDriver(DesiredCapabilities.firefox());
    driver.get("http://seleniumhq.org/");
    driver.findElement(By.name("q")).sendKeys("selenium");
    driver.findElement(By.id("submit")).click();
    new WebDriverWait(driver, 30).until(
        ExpectedConditions.titleContains("Google Custom Search"));
  }

}
