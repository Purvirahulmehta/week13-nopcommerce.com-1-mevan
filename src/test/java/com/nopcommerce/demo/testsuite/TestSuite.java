package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

//1. Create class “TestSuite”
//
//        Write the following Test:
//
//        1.Test name ()
//        1.1 Click on Computer Menu.
//        1.2 Click on Desktop
//        1.3 Select Sort By position "Name: Low To High"
//        1.4 Verify the Product will arrange in Low To High.

public class TestSuite extends TestBase {
    HomePage homePage=new HomePage();
    Computer computer=new Computer();
    DeskTopPage deskTopPage=new DeskTopPage();
    BuiltYourOwnComputer builtYourOwnComputer=new BuiltYourOwnComputer();
    ShoppingCart shoppingCart=new ShoppingCart();
    SignIn signin=new SignIn();
    GuestCheckOut guestCheckOut=new GuestCheckOut();
    Shipping shipping=new Shipping();
    CheckOut checkOut=new CheckOut();
    CheckOutCompleted checkOutCompleted=new CheckOutCompleted();





    @Test
    public void clickOnDeskTop(){
        clickOnElement(By.xpath("//h1[contains(text(),'Desktops')]"));
    }
    //price low to high is remaining on desktop page
   // List<Double>expectedDisplayed=deskTopPage.getPriceOrderList();
   // Collections.so
@Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        computer.clickOnComputer();
        deskTopPage.clickOnDesktop();
        builtYourOwnComputer.clickOnDualCore("2.2 GHz Intel Pentium Dual-Core E2200");
        builtYourOwnComputer.clickOnRam("8GB [+$60.00");
        builtYourOwnComputer.clickOnHDDButton("400 GB [+$100.00]");
        builtYourOwnComputer.clickOnOSButton("Vista Premium [+$60.00]");
        builtYourOwnComputer.clickOnTotalCommander("Total Commander [+$5.00]");
        builtYourOwnComputer.totalPrice();
        builtYourOwnComputer.clickOnAddToCart();
        builtYourOwnComputer.cliclOnGreenBar();
        builtYourOwnComputer.clickOnCloseButton();
        builtYourOwnComputer.clickOnGoToYourCart();
        shoppingCart.clearQuentity("1");
        shoppingCart.upDateQuantity("2");
        shoppingCart.clickOnUpdatedShoppingCart();
        shoppingCart.clickOnTermsAndConditionTab();
        shoppingCart.clickOnCheckOutButton();
        guestCheckOut.clickOnGuestCheckOut();
        shipping.getFirstName("Pooja");
        shipping.getLastName("Patel");
        shipping.getEmail("Poojapatel@gmail.com");
        shipping.getCountry("India");
        shipping.clickOnCity("Ahmedabad");
        shipping.clickOnState("Gujarat");
        shipping.address("Laxmi Nivas");
        shipping.zipCode("364001");
        shipping.setPhoneNumber("9824032133");
        shipping.clickOnContinuButton();
        shipping.clickOnNextDayShipping();
        shipping.clickOnContinuButton1();
        shipping.clickOnCCardButton();
        shipping.clickOnContinuButton2();
        shipping.cardHolderName("Mrs Pooja Patel");
        shipping.cardHolderNumber("5555555555554444");
        shipping.clickOnExpiryMonth("12");
        shipping.clickOnExpiryYear("2025");
        shipping.cardCode("1234");
        shipping.clickOnContinuButton2();
        checkOutCompleted.clickOnContinu();
}

}


