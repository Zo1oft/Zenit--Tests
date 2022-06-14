package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class InvestPage {

    //locator
    SelenideElement
            investPageHeader = $(".title_size-h1 ");

    //action
    public void investPageCheck() {
       investPageHeader.shouldHave(Condition.text("Индивидуальные инвестиционные счета"));
    }
}