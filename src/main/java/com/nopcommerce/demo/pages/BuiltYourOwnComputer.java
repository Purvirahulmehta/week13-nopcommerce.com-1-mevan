package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;

public class BuiltYourOwnComputer extends Utility {
   // By computers = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
  //  By deskTop = By.xpath("//h1[contains(text(),'Desktops')]");
  //  By sortByPosition = By.xpath("//select[@id='products-orderby']");
   // By addToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
  //  By buildyourowncomputer = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]");
    By pentiumDualCore = By.xpath("//select[@id='product_attribute_1']");
    By ram=By.xpath("//select[@id='product_attribute_2']");
    By hddRadioButton=By.xpath("//input[@id='product_attribute_3_7']");
    By osRadioButton=By.xpath("//input[@id='product_attribute_4_9']");
    By totalCommander=By.xpath("//label[contains(text(),'Total Commander [+$5.00]");
    By totalPrice=By.xpath("//label[contains(text(),'Total Commander [+$5.00]");
    By AddTOCART=By.xpath("//button[@id='add-to-cart-button-1']");
    By greenBar=By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeButton=By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By goToCartButton=By.xpath("//button[contains(text(),'Go to cart')]");

    public void clickOnDualCore(String text){
        selectByVisibleTextFromDropDown(pentiumDualCore,text);
    }
    public void clickOnRam(String text){
        selectByVisibleTextFromDropDown(ram,text);

    }
    public void clickOnHDDButton(String text){
        selectByVisibleTextFromDropDown(hddRadioButton,text);
    }
    public void clickOnOSButton(String text){
        selectByVisibleTextFromDropDown(osRadioButton,text);
    }
    public void clickOnTotalCommander(String text){
        selectByVisibleTextFromDropDown(totalCommander,text);
    }
    public String totalPrice(){
        return getTextFromElement(totalPrice);
    }
        public void clickOnAddToCart(){
        clickOnElement(AddTOCART);
    }
    public void cliclOnGreenBar(){
        clickOnElement(greenBar);
    }
    public void clickOnCloseButton(){
        clickOnElement(closeButton);
    }
    public void clickOnGoToYourCart(){
        clickOnElement(goToCartButton);
    }

}

