package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class);

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()=\"Desktops\"]")
    WebElement pageTitle;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortBy;

    @CacheLookup
    @FindBy(id = "products-pagesize")
    WebElement display;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']/a")
    List<WebElement> productTitleList;


    public String getPageTitleText() {
        String message = getTextFromElement(pageTitle);

        log.info("Get pageTitle text " + pageTitle.getText());
        return message;
    }

    public void selectSortBy(String position) {
        selectByVisibleTextFromDropDown(sortBy, position);
        log.info("Sort by '" + position + "' position");
    }

    public void selectDisplayPerPage(String number) {
        selectByVisibleTextFromDropDown(display, number);

        log.info("Display product '" + number + "' per page");
    }

    public void selectProduct(String productName) {
        for (WebElement product : productTitleList) {
            if (product.getText().equals(productName)) {

                log.info("Click on product '" + productName + "' : " + product.getText());
                clickOnElement(product);
                break;
            }
        }
    }

}

