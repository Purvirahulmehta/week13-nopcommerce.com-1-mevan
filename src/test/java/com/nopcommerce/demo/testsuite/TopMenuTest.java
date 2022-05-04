package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
@Test

public class TopMenuTest extends TestBase {
    HomePage homePage=new HomePage();
    Computer computers=new Computer();
    Electronic electronic=new Electronic();
    Apperals apperals=new Apperals();
   DigitalDownloads digitaldownloads=new DigitalDownloads();
    Books books= new Books();
    GiftCards giftCards=new GiftCards();
    Jewelery jewelery=new Jewelery();

@Test

public void verifyPageNavigate(){
    homePage.selectMenu("Computers");
    Assert.assertEquals(computers.getPageHeader(),"Computers","Not on correct page");
    System.out.println("Test");
    homePage.selectMenu("Electronics");
    Assert.assertEquals(electronic.getPageHeader(),"Electronics","Not on correct page");
    homePage.selectMenu("Apparel");
   Assert.assertEquals(apperals.getPageHeader(),"Apparel","Not on correct page");
    homePage.selectMenu("Digital Downloads");
    Assert.assertEquals(digitaldownloads.getPageHeader(),"Digital downloads","Not on correct page");
    homePage.selectMenu("Books");
    Assert.assertEquals(books.getPageHeader(),"Books","Not on correct page");
    homePage.selectMenu("Jewelry");
    Assert.assertEquals(jewelery.getPageHeader(),"Jewelry","Not on correct page");
    homePage.selectMenu("Gift Cards");
    Assert.assertEquals(giftCards.getPageHeader(),"Gift Cards","Not on correct page");

    }


    }



