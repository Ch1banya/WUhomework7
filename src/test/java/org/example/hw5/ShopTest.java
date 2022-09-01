package org.example.hw5;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ShopTest extends AbstractTest{


    //   @Order(3)
    @DisplayName("Test 3")
    @Test
    public void shopTest() {

        WebElement webElement = getDriver().findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        webElement.click();

        //Проверка корзины после добавления в нее товара
        Assertions.assertNotEquals("0",getDriver().findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText());


    }

}
