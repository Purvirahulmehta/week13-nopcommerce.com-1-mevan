package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By computerLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]");
    By apparelLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]");
    By digitaldownloadsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]");
    By booksLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]");
    By jewelryLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]");
    By giftCardsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]");
    //click on login link
    public void clickOnLoginLink() {
        clickOnElement(loginLink);//fatch from utility class
    }

    //click on register link
    public void selectMenu(String menu){
        if(menu.equalsIgnoreCase("Computers")) clickOnElement(computerLink);
        if(menu.equalsIgnoreCase("Electronics")) clickOnElement(electronicsLink);
        if(menu.equalsIgnoreCase("Apparel")) clickOnElement(apparelLink);
        if(menu.equalsIgnoreCase("Digital downloads")) clickOnElement(digitaldownloadsLink);
        if(menu.equalsIgnoreCase("Books")) clickOnElement(booksLink);
        if(menu.equalsIgnoreCase("Jewelry")) clickOnElement(jewelryLink);
        if(menu.equalsIgnoreCase("Gift Cards")) clickOnElement(giftCardsLink);
    }
    }


