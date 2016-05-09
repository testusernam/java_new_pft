package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by асус on 09.05.2016.
 */
public class SessionHelper extends HeplerBase{

  public SessionHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void login(String password, String userName) {
    type(By.name("user"),userName);
    type(By.name("pass"),password);
    click(By.xpath("//form[@id='LoginForm']/input[3]"));
  }

}
