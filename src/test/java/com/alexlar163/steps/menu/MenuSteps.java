package com.alexlar163.steps.menu;

import com.alexlar163.screens.menu.MenuScreen;
import net.serenitybdd.annotations.Step;
import org.junit.Assert;

public class MenuSteps {
    MenuScreen menuScreen;

    @Step
    public void validateMenuOption(String option) {
        Assert. assertTrue("The option is not displayed", menuScreen.isMenuOptionDisplayed(option));
    }

    @Step
    public void validateCloseMenuBtn() {
        Assert.assertTrue("The close menu button is not displayed", menuScreen.isCloseMenuBtnDisplayed());
    }

    @Step
   public void tapMenuOption (String option) {
        menuScreen.tapMenuOption(option);
    }

}
