package org.example.hw5;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;


public class RemoveTest extends AbstractTest{


    //   @Order(4)
    @DisplayName("Test 4")
    @Test
    public void removeTest() {

        WebElement webElement = getDriver().findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        webElement.click();

       WebElement webElement1 = getDriver().findElement(By.xpath("//div[@id='shopping_cart_container']"));
        webElement1.click();

        WebElement webElement2 = getDriver().findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
        webElement2.click();

        //Проверка корзины после удаления из нее товара (что нет баджа с кол-вом товара в корзине)
         Assertions.assertThrows(NoSuchElementException.class,()-> getDriver().findElement(By.xpath("//span[@class='shopping_cart_badge']")));

    }

}

