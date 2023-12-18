package org.fasttrackit;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

public class Config {
    public static final String DemoUrl = "https://demoqa.com/";
    public static final String ElementalsUrl = "https://demoqa.com/elements";
    public static final String TextBoxUrl = "https://demoqa.com/text-box";

    public static void openSite() {
        System.out.println("1. Open the website using the provided URL: " + DemoUrl);
        open(DemoUrl);
        // Adăugați codul necesar pentru a deschide site-ul
    }

    public static void clickOnElementalsUrl() {
        open(ElementalsUrl);
        System.out.println("2. Click on the 'Elementals' link.");
        // Adăugați codul necesar pentru a face clic pe link-ul 'Elementals'
    }

    public static void clickOnTextBoxUrl() {
        open(TextBoxUrl);
        System.out.println("3. Click on the 'Text Box' link.");
        // Adăugați codul necesar pentru a face clic pe link-ul 'Text Box'
    }

    public static void clickOnTheElementsButton() {
        System.out.println("4. Click on the 'Elements' button.");

        // Adăugați codul necesar pentru a face clic pe butonul 'Elements'
    }

    public static void clickOnTextboxButton() {
        System.out.println("5. Click on the 'Text Box' button.");
        // Adăugați codul necesar pentru a face clic pe butonul 'Text Box'
    }

    public static void enterUserName(String johnDoe) {
        System.out.println("6. Enter user's name: " + johnDoe + " into the FullName input field.");
        // Adăugați codul necesar pentru a introduce numele utilizatorului în câmpul FullName
    }

    public static void clickOnUserEmail() {
        System.out.println("7. Click on the Email input field.");
        // Adăugați codul necesar pentru a face clic pe câmpul de email
    }

    public static void enterUserEmail(String mail) {
        System.out.println("8. Enter the user's email address: " + mail + " into the Email input field.");
        // Adăugați codul necesar pentru a introduce adresa de email a utilizatorului în câmpul Email
    }

    public static void verifyUserCanTypeEmail(String mail) {
        System.out.println("9. Verify that the user can successfully type their email address: " + mail + " in the input field.");
        // Adăugați codul necesar pentru a verifica dacă utilizatorul poate introduce cu succes adresa de email
    }

    public static void verifyNameEnteredSuccessfully(String userName) {
        // Implementați logica pentru a verifica dacă numele a fost introdus cu succes
    }

    public static void clickOnCurrentAddressField() {
        System.out.println("10. Click on the 'Current Address' field.");
        // Adăugați codul pentru a face clic pe câmpul 'Current Address'
    }

    public static void enterCurrentAddress(String address) {
        System.out.println("11. Enter the user's current address: " + address + " into the 'Current Address' input field.");
        // Adăugați codul pentru a introduce adresa curentă în câmpul 'Current Address'
    }

    public static void verifyUserCanTypeCurrentAddress(String address) {
        System.out.println("12. Verify that the user can successfully type their current address: " + address);
        // Adăugați codul pentru a verifica dacă utilizatorul poate introduce cu succes adresa curentă
    }

    public static void clickOnPermanentAddressField() {
        ElementsPage.clickOnPermanentAddressField();
    }

    public static void enterUserPermanentAddress(String address) {
        ElementsPage.enterUserPermanentAddress(address);
    }

    public static void verifyUserCanTypePermanentAddress(String address) {
        ElementsPage.verifyUserCanTypePermanentAddress(address);
    }

    public static void clickOnSubmitButton() {
        ElementsPage.clickOnSubmitButton();
    }


    }














