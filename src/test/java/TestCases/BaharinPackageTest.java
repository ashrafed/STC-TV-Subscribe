package TestCases;

import Base.BaseTest;
import Pages.PackagesPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class BaharinPackageTest extends BaseTest {

    @Epic("Subscription Packages")
    @Story("Subscription Packages for Baharin ")
    @Description("Verify Subscription LITE Packages For Baharin Country")
    @Test
    public void TC_01_VerifyLITEPackagesForBaharinCountry() {
        PackagesPage.SelectBaharinCountry();
        PackagesPage.VerifySubscriptionPackages("LITE" ,"2 BHD/month" ,"HD");
    }


    @Epic("Subscription Packages")
    @Story("Subscription Packages for Baharin ")
    @Description("Verify Subscription CLASSIC Packages For Baharin Country")
    @Test(dependsOnMethods = "TC_01_VerifyLITEPackagesForBaharinCountry")

    public void TC_02_VerifyCLASSICPackagesForBaharinCountry() {
        PackagesPage.VerifySubscriptionPackages("CLASSIC" ,"3 BHD/month" ,"Full HD");
    }


    @Epic("Subscription Packages")
    @Story("Subscription Packages for Baharin ")
    @Description("Verify Subscription PREMIUM Packages For Baharin Country")
    @Test(dependsOnMethods = "TC_01_VerifyLITEPackagesForBaharinCountry")

    public void TC_03_VerifyPREMIUMPackagesForBaharinCountry() {
        PackagesPage.VerifySubscriptionPackages("PREMIUM" ,"6 BHD/month" ,"4K UHD");
    }


}
