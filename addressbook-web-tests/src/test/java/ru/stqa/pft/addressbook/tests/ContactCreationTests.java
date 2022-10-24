package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.goToContactPage();
    app.getContactHelper().fillContactForm(new ContactData("Tony", "Stark", "Ironman", "89995678989", "ToniStark@mail.ru"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToContactPage();
  }

}
