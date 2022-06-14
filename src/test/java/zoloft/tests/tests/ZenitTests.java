package zoloft.tests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import zoloft.tests.helpers.DriverUtils;

import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class ZenitTests extends TestBase {

    @Test
    @Description("Проверка работы страницы кредитных и дебетовых карт")
    @DisplayName("Карты Web Test")
    void cardsPageTest() {
        step("Открываем сайт банка 'Зенит'", () -> {
           mainPage.openPage();
        });

        step("Нажимаем на кнопку 'Карты'", () -> {
            mainPage.cardsPageTransfer();
        });

        step("Проверяем, что мы на верной странице", () -> {
            cardsPage.cardsPageCheck();
        });
    }

    @Test
    @Description("Проверка работы страницы ИИС")
    @DisplayName("ИИС Web Test")
    void investPageTest() {
        step("Открываем сайт банка 'Зенит'", () -> {
            mainPage.openPage();
        });

        step("Открываем большое навигационное меню по нажатию 'Больше'", () -> {
            mainPage.navigationMenuExpansion();
        });

        step("Переходим на страницу 'Инвестиционные счета'", () -> {
           mainPage.investmentPageTransfer();
        });

        step("Проверяем, что мы на верной странице", () -> {
            investPage.investPageCheck();
        });
    }

    @Test
    @Description("Проверка наличия Title на странице")
    @DisplayName("Работоспособность сайта")
    void titleTest() {
        step("Открываем сайт банка 'Зенит'", () -> {
            mainPage.openPage();
        });
        step("Проверяем наличие Title", () -> {
            String expectedTitle = "Банк ЗЕНИТ — финансовые услуги";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Проверка наличия ошибок в консоли")
    @DisplayName("Логи консоли страницы не должны содержать ошибок")
    void consoleShouldNotHaveErrorsTest() {
        step("Открываем сайт банка 'Зенит'", () -> {
            mainPage.openPage();
        });

        step("Логи в консоле не должны иметь 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}