package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Computer extends Utility {
    By pageHeader= By.xpath("//h1[contains(text(),'Computers')]");
    By desktop=By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]");
    public void clickOnComputer(){

        clickOnElement(pageHeader);
    }
    public void clickOnDesktop(){

        clickOnElement(desktop);
    }

    public String getPageHeader(){

        return getTextFromElement(pageHeader);
    }
}
