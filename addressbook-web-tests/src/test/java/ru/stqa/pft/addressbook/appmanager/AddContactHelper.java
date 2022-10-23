package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddContactHelper {
  private WebDriver wd;

  public AddContactHelper(WebDriver wd) {
    this.wd = wd;
  }

  public void goToContactPage() {
    wd.findElement(By.linkText("add new")).click();
  }
}
