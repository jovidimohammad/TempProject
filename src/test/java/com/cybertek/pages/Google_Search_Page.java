package com.cybertek.pages;

import com.cybertek.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_Search_Page {

    public Google_Search_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id = 'gbqfbb']")
    public WebElement images1;

    @FindBy(xpath = "//div[@class = 'hpuQDe']")
    public WebElement searchByVoice;





}
