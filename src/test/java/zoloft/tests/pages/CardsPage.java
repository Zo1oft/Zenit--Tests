package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CardsPage {

    //locators
    SelenideElement
    cardsHeader = $(".title_size-h1");


    //actions
    public void cardsPageCheck() {
        cardsHeader.shouldHave(Condition.text("Кредитные и дебетовые карты"));
    }
}
