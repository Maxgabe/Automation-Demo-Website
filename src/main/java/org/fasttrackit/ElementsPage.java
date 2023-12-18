package org.fasttrackit;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ElementsPage {
    private final SelenideElement ElementsButton = $("div.card.mt-4.top-card");
    private final SelenideElement TextboxButon = $("#item-0");
    private static final SelenideElement userName = $("#userName");
    private static final SelenideElement userEmail = $("#userEmail");
    private static final SelenideElement currentAddress = $("#currentAddress");
    private static final SelenideElement permanentAddress = $("#permanentAddress");
    private static final SelenideElement submitButton = $("#submit");

    public static void enterUserPermanentAddress(String address) {

    }

    public void clickOnTheElementsButton() {
        ElementsButton.click();
        System.out.println("Clicked on the Elements button");
    }

    public void clickOnTextboxButton() {
        TextboxButon.click();
        System.out.println("Clicked on the 'Text Box' button.");
    }

    public static void clickOnFullNameField() {
        userName.click();
        System.out.println("Clicked on the FullName input field.");
    }

    public static void enterUserName(String userFullName) {
        userName.setValue(userFullName);
        System.out.println("Entered user's name: " + userFullName + " into the FullName input field.");
    }

    public static void clickOnUserEmail() {
        userEmail.click();
        System.out.println("Located and clicked on the Email input field.");
    }

    public static void enterUserEmail(String email) {
        userEmail.setValue(email);
        System.out.println("Entered user's email address: " + email + " into the Email input field.");
    }

    public static void verifyUserCanTypeEmail(String email) {
        String actualEmail = userEmail.getValue();
        if (actualEmail.equals(email)) {
            System.out.println("Verification: User can type email successfully.");
        } else {
            System.out.println("Verification FAILED: User cannot type email as expected.");
        }
    }

    public static void clickOnCurrentAddressField() {
        currentAddress.click();
        System.out.println("Located and clicked on the Current Address input field.");
    }

    public static void enterCurrentAddress(String address) {
        currentAddress.setValue(address);
        System.out.println("Entered the user's current address: " + address + " into the Current Address input field.");
    }

    public static void verifyUserCanTypeCurrentAddress(String address) {
        String actualAddress = currentAddress.getValue();
        if (actualAddress.equals(address)) {
            System.out.println("Verification: User can type current address successfully.");
        } else {
            System.out.println("Verification FAILED: User cannot type current address as expected.");
        }
    }

    public static void clickOnPermanentAddressField() {
        permanentAddress.click();
        System.out.println("Located and clicked on the Permanent Address input field.");
    }

    public static void enterPermanentAddress(String address) {
        permanentAddress.setValue(address);
        System.out.println("Entered the user's permanent address: " + address + " into the Permanent Address input field.");
    }

    public static void verifyUserCanTypePermanentAddress(String address) {
        String actualAddress = permanentAddress.getValue();
        if (actualAddress.equals(address)) {
            System.out.println("Verification: User can type permanent address successfully.");
        } else {
            System.out.println("Verification FAILED: User cannot type permanent address as expected.");
        }
    }
    public static void clickOnSubmitButton() {
        if (isSubmitButtonVisible()) {
            submitButton.click();
            System.out.println("Clicked on the Submit button");
        } else {
            System.out.println("Submit button is not visible or clickable.");
        }
    }
    private static boolean isSubmitButtonVisible() {
        return submitButton.isDisplayed() && submitButton.isEnabled();
        }
    }

