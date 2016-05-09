package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by асус on 09.05.2016.
 */
public class NavigationHelper extends HeplerBase{

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void goToGroupPage() {
     click(By.linkText("groups"));
  }
}
