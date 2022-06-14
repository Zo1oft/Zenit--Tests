package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    //locators
    SelenideElement
            navigaionMenuMore = $$(".main-menu__link-text").findBy(Condition.text("Больше")),
            cardsPageButton = $$(".products-menu__link").findBy(Condition.text("Карты")),
            investPageButton = $(byText("Инвестиционные счета (ИИС)"));

    //actions
    public MainPage openPage() {
        open("https://www.zenit.ru/");
        return this;
    }

    public void cardsPageTransfer() {
      cardsPageButton.click();
    }
    public void navigationMenuExpansion() {
      navigaionMenuMore.click();
    }
    public void investmentPageTransfer() {
      investPageButton.click();
    }
}
