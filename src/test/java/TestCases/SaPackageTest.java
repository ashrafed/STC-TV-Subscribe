package TestCases;

import Base.BaseTest;
import Pages.PackagesPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class SaPackageTest extends BaseTest {



    @Epic("Subscription Packages")
    @Story("Subscription Packages for SA ")
    @Description("Verify Subscription LITE Packages For SA Country")
    @Test
    public void TC_01_VerifyLITEPackagesForSaCountry() {
        PackagesPage.VerifySubscriptionPackages("lite" ,"15 SAR/month" ,"HD");
    }


    @Epic("Subscription Packages")
    @Story("Subscription Packages for SA ")
    @Description("Verify Subscription CLASSIC Packages For SA Country")
    @Test
    public void TC_02_VerifyCLASSICackagesForSaCountry() {
        PackagesPage.VerifySubscriptionPackages("CLASSIC" ,"25 SAR/month" ,"Full HD");
    }


    @Epic("Subscription Packages")
    @Story("Subscription Packages for SA ")
    @Description("Verify Subscription PREMIUM Packages For SA Country")
    @Test
    public void TC_03_VerifyPREMIUMpackagesForSaCountry() {
        PackagesPage.VerifySubscriptionPackages("PREMIUM" ,"60 SAR/month" ,"4K UHD");
    }


}
