package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class ApplicationManager {

  private final ContactHelper contactHelper = new ContactHelper();
  public SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;

  public void init() {
    contactHelper.wd = new FirefoxDriver();
    contactHelper.wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    contactHelper.wd.get("http://localhost/addressbook/index.php");
    groupHelper = new GroupHelper(contactHelper.wd);
    navigationHelper = new NavigationHelper(contactHelper.wd);
    sessionHelper = new SessionHelper(contactHelper.wd);
    sessionHelper.login("admin", "secret");
  }



  public void stop() {
    contactHelper.wd.quit();
  }

  private void login(String username, String password) {
    contactHelper.wd.findElement(By.name("user")).click();
    contactHelper.wd.findElement(By.name("user")).clear();
    contactHelper.wd.findElement(By.name("user")).sendKeys(username);
    contactHelper.wd.findElement(By.name("pass")).clear();
    contactHelper.wd.findElement(By.name("pass")).sendKeys(password);
    contactHelper.wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  public void goToContactPage() {
    contactHelper.wd.findElement(By.linkText("add new")).click();
  }

  public boolean isElementPresent(By by) {
    try {
      contactHelper.wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }



  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }


  private boolean isAlertPresent() {
    try {
      contactHelper.wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }
}
