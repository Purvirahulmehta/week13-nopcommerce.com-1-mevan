package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Shipping extends Utility {
    By firstname=By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName=By.xpath("//input[@id='BillingNewAddress_LastName']");
    By email=By.xpath("//input[@id='BillingNewAddress_Email']");
    By country=By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city=By.xpath("//input[@id='BillingNewAddress_City']");
    By state=By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    By address1=By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postalCode=By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber=By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continuButton=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");
    By nextdayshipping=By.xpath("//input[@id='shippingoption_1']");
    By countinu1=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    By paymentMethodTab=By.xpath("//input[@id='paymentmethod_1']");
    By continu2=By.xpath("//div[@id='shipping-method-buttons-container']/button");
    By cCardButton=By.xpath("//input[@id='paymentmethod_1']");
   // By selectCCard=By.xpath("//select[@id='CreditCardType']");
    By cardHolderName=By.xpath("//input[@id='CardholderName']");
    By cardNumber=By.xpath("//input[@id='CardNumber']");
    By expireMonth=By.xpath("//select[@id='ExpireMonth']");
    By expireYear=By.xpath("//select[@id='ExpireYear']");
    By cardCode=By.xpath("//input[@id='CardCode']");
    By countinu3=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    By verifyCCardMethod=By.xpath("//span[contains(text(),'Credit Card')]");
    By nextDayAirShippingMethod=By.xpath("//span[@class='value' and contains(text(),'Next Day Air')]");
    By totalVerify=By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");
    By confirm=By.xpath("//button[contains(text(),'Confirm')]");
    By thankYouMessage=By.xpath("//h1[contains(text(),'Thank you')]");
    By orderSuccessfullyMessage=By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continu=By.xpath("//button[contains(text(),'Continue')]");
    By welcomeToOurStoreMessage=By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public void getFirstName(String text){
        sendTextToElement(firstname,text);
    }
    public void getLastName(String text){
        sendTextToElement(lastName,text);
    }
    public void getEmail(String text){
        sendTextToElement(email,text);
    }
    public void getCountry(String text){
        selectByVisibleTextFromDropDown(country,text);
    }
    public void clickOnCity(String text){
       selectByVisibleTextFromDropDown(city,text);
    }
    public void clickOnState(String text){
        selectByVisibleTextFromDropDown(state,text);
    }
    public void address(String text){
        sendTextToElement(address1,text);
    }
    public void zipCode(String text){
        sendTextToElement(postalCode,text);
    }
    public void setPhoneNumber(String text){
        sendTextToElement(phoneNumber,text);
    }
    public void clickOnContinuButton() {
        clickOnElement(continuButton);
    }
    public void clickOnNextDayShipping() {
        clickOnElement(nextdayshipping);
    }
    public void clickOnContinuButton1() {
        clickOnElement(countinu1);
    }
    public void clickOnCCardButton() {
        clickOnElement(cCardButton);
    }
    public void cardHolderName(String text) {
        sendTextToElement(cardHolderName, text);
    }
    public void cardHolderNumber(String text) {
        sendTextToElement(cardNumber, text);
    }
    public void clickOnExpiryMonth(String text) {
        selectByVisibleTextFromDropDown(expireMonth, text);
    }
    public void clickOnExpiryYear(String text) {
        selectByVisibleTextFromDropDown(expireYear, text);
    }
    public void cardCode(String text) {
        sendTextToElement(cardCode, text);
    }
    public void clickOnContinuButton2() {
        clickOnElement(continu2);
    }
    public void confirm(){
        clickOnElement(confirm);

  }

}
