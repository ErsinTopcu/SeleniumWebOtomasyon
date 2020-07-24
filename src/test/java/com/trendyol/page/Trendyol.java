package com.trendyol.page;

import com.trendyol.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Trendyol extends BasePage {

    public Trendyol(WebDriver driver){
        super(driver);
    }

    public Trendyol _click(By by){
        click(by);
        return this;
    }

    public Trendyol _clickRandom(By by){
        clickElementRandomInList(by);
        return this;
    }

    public Trendyol _sendKeys(String key, By by){
        sendKeys(by, key);
        return this;
    }

    public Trendyol _clear(By by){
        clear(by);
        return this;
    }

    public Trendyol _hover(By by){
        hoverElement(by);
        return this;
    }

    public String _getText(By by){
        return getText(by);
    }

    //Kod tekrarından ve tek kullanımlık methodlardan kaçındık.
    /*public LoginPage hoverToLogin(){
        hoverElement(HOVER_LOGIN_BUTTON_ID);
        return this;
    }

    public LoginPage openLoginPopup(){
        click(OPEN_LOGIN_POPUP_BUTTON_CLASSNAME);
        return this;
    }

    public LoginPage fillEmail(){
        sendKeys(EMAIL_INPUT_ID,"ersintopcu19@hotmail.com");
        return this;
    }

    public LoginPage fillPassword(){
        sendKeys(PASSWORD_INPUT_ID,"147258ersin");
        return this;
    }

    public LoginPage clickLoginButton(){
        click(LOGIN_BUTTON_ID);
        return this;
    }

    public LoginPage closeFancyBox(){
        click(CLOSE_FANCY_BOX_CLASSNAME);
        return this;
    }

    public LoginPage search(){
        sendKeys(SEARCH_AREA,"bilgisayar");
        return this;
    }

    public LoginPage clickButton(){
        click(CLICK_BUTTON);
        return this;
    }*/
}
