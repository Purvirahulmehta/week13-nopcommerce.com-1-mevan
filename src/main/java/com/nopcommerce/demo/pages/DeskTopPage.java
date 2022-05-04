package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DeskTopPage extends Utility {

    By deskTop= By.xpath("//h1[contains(text(),'Desktops')]");
    By priceorder=By.xpath("//div[@class='prices']");
    By LowToHigh=By.xpath("//select[@id='products-orderby']");
    public void clickOnDesktop(){
        clickOnElement(deskTop);
    }

    public void sortByLowToHigh(String sortBy){
        selectByVisibleTextFromDropDown(LowToHigh,sortBy);


    }
    public List<WebElement> fetchItemList(){
        return listOfWebElementsList(priceorder);

    }
    public List<Double>getPriceOrderList(){
        List<WebElement>listToSort=fetchItemList();
        ArrayList<Double> list=new ArrayList<>();
        for(WebElement data:listToSort){
            String a=data.getText().substring(1).replace(",","");
            Double a1=Double.valueOf(a);
            list.add(a1);
        }
        return list;

    }


}
