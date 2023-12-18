package org.fasttrackit;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DemoWebsiteTest {

    @Test
    public void userCanEnterInputInFullNameField() {
        Config.openSite();
        Config.clickOnElementalsUrl();
        Config.clickOnTextBoxUrl();
        String userName = "John Doe";
        Config.verifyNameEnteredSuccessfully(userName);
        assertEquals(userName, "The user should be able to enter their name in the FullName input field.");
    }

    @Test
    public void userCanEnterInputInEmailField() {
        Config.openSite();
        Config.clickOnElementalsUrl();
        Config.clickOnTextBoxUrl();
        Config.clickOnTheElementsButton();
        Config.clickOnTextboxButton();
        Config.enterUserName("John Doe");
        Config.clickOnUserEmail();
        Config.enterUserEmail("john.doe@example.com");
        Config.verifyUserCanTypeEmail("john.doe@example.com");
        assertEquals("The user should be able to enter their email address in the Email input field.", "");
    }

    @Test
    public void userCanEnterInputInCurrentAddressField() {
        System.out.println("3. Test Case: User Can Enter Input in the CurrentAddress Input Field ");
        Config.openSite();
        Config.clickOnElementalsUrl();
        Config.clickOnTextBoxUrl();
        Config.clickOnTheElementsButton();
        Config.clickOnTextboxButton();
        Config.enterUserName("John Doe");
        Config.clickOnUserEmail();
        Config.enterUserEmail("john.doe@example.com");
        Config.verifyUserCanTypeEmail("john.doe@example.com");
        Config.clickOnCurrentAddressField();
        Config.enterCurrentAddress("123 Main St");
        Config.verifyUserCanTypeCurrentAddress("123 Main St");
        assertEquals("The user should be able to enter their current address in the CurrentAddress input field.", "");
    }
}