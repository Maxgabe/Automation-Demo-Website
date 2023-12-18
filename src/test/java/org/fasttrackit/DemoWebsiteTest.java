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
        sleep(4000);
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
        sleep(4000);
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
        sleep(4000);
    }
    @Test
    public void user_Can_Type_Input_Into_PermanentAddresss_Input_Field () {
        Config.openSite();
        Config.clickOnElementalsUrl();
        Config.clickOnTextBoxUrl();
        Config.clickOnPermanentAddressField();
        Config.enterUserPermanentAddress("john.doe@example.com");
        Config.verifyUserCanTypePermanentAddress("john.doe@example.com");
        assertEquals("The user should be able to enter their permanent address in the PermanentAddress input field", "");
        sleep(4000);
    }


      @Test
        public void user_Can_Click_On_The_Elements_submit_button () {
        System.out.println("5. User can click on the Elements's submit button.");
        Config.openSite();
        Config.clickOnElementalsUrl();
        Config.clickOnTextBoxUrl();
        Config.clickOnSubmitButton();
        System.out.println("The user should be able to click submit");
        sleep(4000);
}

    private void sleep(int i) {
    }
}