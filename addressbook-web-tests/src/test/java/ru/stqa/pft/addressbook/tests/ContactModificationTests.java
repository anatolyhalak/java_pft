package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.goToContactPage(); //- метод открывает страницу создания нового контакта
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Tony", "Stark", "Ironman", "89995678989", "ToniStark@mail.ru", "test1"), true);
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Tony", "Stark", "Ironman", "89995678989", "ToniStark@mail.ru", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToContactPage();
  }
}
