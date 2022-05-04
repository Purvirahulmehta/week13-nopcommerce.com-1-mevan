package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {
//    By pageHeader=By.xpath("");
//    By quantity=By.xpath("");
//    By updateCart=By.xpath("");
//    By total=By.xpath("");
//    By termsAndConditions=By.xpath("");
//    By checkOut=By.xpath("");

    By shoppingCart=By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantity=By.xpath("//th[contains(text(),'Qty.')]");
   // By quentity2=By.xpath("//th[contains(text(),'Qty.')]");
    By updateShoppingCard=By.xpath("//button[@id='updatecart']");
    By updatedTotal=By.xpath("//th[contains(text(),'Total')]");
    By termsOfService=By.xpath("//input[@id='termsofservice']");
    By checkOut=By.xpath("//button[@id='checkout']");
    By welcomeMessage=By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By guestCheckOut=By.xpath("//button[contains(text(),'Checkout as Guest')]");



    public String shoppingCartTab() {
        return getTextFromElement(shoppingCart);
    }
    public void clearQuentity(String number){
       sendTextToElement(quantity,number);
    }
    public void upDateQuantity(String number){
        sendTextToElement(quantity,number);
    }
    public void clickOnUpdatedShoppingCart(){
        clickOnElement(updateShoppingCard);
    }
    public String clickOnUpdatedTotal(){
        return getTextFromElement(updatedTotal);

    }
    public void clickOnTermsAndConditionTab(){
        clickOnElement(termsOfService);
    }
    public void clickOnCheckOutButton(){
        clickOnElement(guestCheckOut);

    }
    }



