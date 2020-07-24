package com.trendyol.test;


import com.trendyol.base.BaseTest;
import com.trendyol.constants.Constants;
import com.trendyol.page.Trendyol;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TrendyolTest extends BaseTest {

    Trendyol trendyol;
    private static final String EMAIL = "ersintopcu19@hotmail.com";
    private static final String PASSWORD = "147258ersin";
    private static final String SEARCH_KEY = "bilgisayar";
    private boolean isIncrease = false;
    private String productPrice = null;
    private String totalPrice = null;
    private int basketCount;
    @Before
    public void before(){
        trendyol = new Trendyol(getWebDriver());
    }

    @Test
    public void test() throws Exception {
        /*trendyol.closeFancyBox();
        trendyol.hoverToLogin();
        trendyol.openLoginPopup();
        trendyol.fillEmail();
        trendyol.fillPassword();
        trendyol.clickLoginButton();*/

        trendyol._click(Constants.CLOSE_FANCY_BOX_CLASSNAME);
        trendyol._hover(Constants.HOVER_LOGIN_BUTTON_ID);
        trendyol._click(Constants.OPEN_LOGIN_POPUP_BUTTON_CLASSNAME);
        trendyol._sendKeys(EMAIL, Constants.EMAIL_INPUT_ID);
        trendyol._sendKeys(PASSWORD, Constants.PASSWORD_INPUT_ID);
        trendyol._click(Constants.LOGIN_BUTTON_ID);
        Thread.sleep(4000);
        /*if(trendyol.getElementsCount(Constants.ERROR_BOX_ID) > 0){
            throw new Exception("Giris basarisiz");
        }*/
        trendyol._sendKeys(SEARCH_KEY, Constants.SEARCH_INPUT_CLASSNAME);
        Thread.sleep(2000);
        trendyol._click(Constants.SEARCH_BUTTON_CLASSNAME);
        trendyol._clickRandom(Constants.PRODUCT_CLASSNAME);
        productPrice = trendyol._getText(Constants.PRODUCT_PRICE_CLASSNAME);
        trendyol._click(Constants.ADD_BASKET_BUTTON_CLASSNAME);
        trendyol._click(Constants.BASKET_BUTTON_CLASSNAME);
        trendyol._clear(Constants.INCREASE_PRODUCT_CLASSNAME);
        Thread.sleep(3000);
        trendyol._sendKeys("2", Constants.INCREASE_PRODUCT_CLASSNAME);
        Thread.sleep(2000);
        totalPrice = trendyol._getText(Constants.BASKET_TOTAL_PRICE_CLASSNAME);
        if(productPrice != null && totalPrice != null){
            if(!productPrice.isEmpty() && !totalPrice.isEmpty()){
                int product, total;
                product = Integer.parseInt(productPrice.replace(" ", "").replace("TL", "").replace(".", ""));
                total = Integer.parseInt(totalPrice.replace(" ", "").replace("TL", "").replace(".", ""));
                if(product*2 != total){
                    throw new Exception("Tutarlar esit degil");
                }
            }
        }
        Thread.sleep(3000);
        trendyol._click(Constants.EMPTY_BASKET_CLASSNAME);
        Thread.sleep(2000);
        trendyol._click(Constants.APPROVE_EMPTY_BASKET_CLASSNAME);
        Thread.sleep(2000);
        basketCount = trendyol.getElementsCount(Constants.EMPTY_BASKET_CLASSNAME);
        if(basketCount != 1){
            throw new Exception("Sepet bos degil");
        }
    }

    @After
    public void after(){
        //tearDown()
    }
}
