package ru.stqa.pft.addressbook;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactDeletionTests extends TestBase {
  @Test
  public void testContactDeletion() throws Exception {
    app.selectContact();
    app.acceptNextAlert = true;
    app.deleteSelectedContact();
  }
}
