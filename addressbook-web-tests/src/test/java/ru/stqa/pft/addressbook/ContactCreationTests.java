package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.goToContactPage();
    app.fillContactForm(new ContactData("Tony", "Stark", "Ironman", "89995678989", "ToniStark@mail.ru"));
    app.submitContactCreation();
    app.returnToContactPage();
  }

}
