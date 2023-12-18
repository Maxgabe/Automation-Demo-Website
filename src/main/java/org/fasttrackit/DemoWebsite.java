package org.fasttrackit;



public class DemoWebsite {

    private static String emailAddress;

    public static void main(String[] args) {

        System.out.println("Demo Website");

        System.out.println("-------------------------------------------");
        System.out.println("==== ELEMENTS TEST SUITE ====");

        System.out.println("1. Test Case: User Can Enter Input in the FullName Input Field");
        Config.openSite();
        Config.clickOnElementalsUrl();
        Config.clickOnTextBoxUrl();
        String userName = "John Doe";
        Config.verifyNameEnteredSuccessfully(userName);
        System.out.println("The user should be able to enter their name in the FullName input field.");
        System.out.println("---------------------------------------------");


        System.out.println("2. User can enter input in the email input field");
        Config.openSite();
        Config.clickOnElementalsUrl();
        Config.clickOnTextBoxUrl();
        Config.clickOnTheElementsButton();
        Config.clickOnTextboxButton();
        Config.enterUserName("John Doe");
        Config.clickOnUserEmail();
        Config.enterUserEmail("john.doe@example.com");
        Config.verifyUserCanTypeEmail("john.doe@example.com");
        System.out.println("The user should be able to enter their email address in the Email input field.");
        System.out.println("--------------------------------------------------");

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
        Config.enterCurrentAddress("123 Main St");
        Config.verifyUserCanTypeCurrentAddress("123 Main St");
        System.out.println("The user should be able to enter their current address in the CurrentAddress input field");
        System.out.println("---------------------------------------------");
    }
}






















            // ================================ ELEMENTS TEST SUITE  ================================

            // ------------------------------- TEXT BOX tests ----------------------------------------
            // 1. User can type input into the Full Name input field
            // 2. User can type input into the email input field
            // 3. User can type input into CurrentAddress input field
            // 4. User can type input into PermanentAddress input field
            // 5. User can click on the Elements's submit button.
            // ---------------------------------------------------------------------------------------

            // ----------------------------- CHECK BOX TEST SUITE #2 --------------------------------
            // 6. User can click on the Home check box
            // 7. User can click on the Documents check box
            // 8. User can click on the Download check box
            // 9. User can click on the Home check box
            // ---------------------------------------------------------------------------------------

            // ------------------------------ RADIO BUTTON TEST SUITE #3 -----------------------------
            // 10. user can select Yes button
            // 11. user can select No button
            // 12. user can select impressive button
            // ---------------------------------------------------------------------------------------

            // ------------------------------- Upload & Download TEST SUITE #4 -----------------------
            // 11. user can upload a picture
            // 12. user can upload a pdf
            // 13. user can upload a video
            // 14. user can upload a song
            // 15. user clicks the download button
            //-----------------------------------------------------------------------------------------
