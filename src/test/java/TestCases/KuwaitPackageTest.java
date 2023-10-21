package TestCases;

import Base.BaseTest;
import Pages.PackagesPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class KuwaitPackageTest extends BaseTest {


    @Epic("Subscription Packages")
    @Story("Subscription Packages for Kuwait ")
    @Description("Verify Subscription LITE Packages For Kuwait Country")
    @Test
    public void TC_01_VerifyLITEPackagesForKuwaitCountry() {
        PackagesPage.SelectKuwaitCountry();
        PackagesPage.VerifySubscriptionPackages("LITE" ,"1.2 KWD/month" ,"HD");
    }

    @Epic("Subscription Packages")
    @Story("Subscription Packages for Kuwait ")
    @Description("Verify Subscription CLASSIC Packages For Kuwait Country")
    @Test(dependsOnMethods = "TC_01_VerifyLITEPackagesForKuwaitCountry")
    public void TC_02_VerifyCLASSICPackagesForKuwaitCountry() {

        PackagesPage.VerifySubscriptionPackages("CLASSIC" ,"2.5 KWD/month","Full HD");
    }


    @Epic("Subscription Packages")
    @Story("Subscription Packages for Kuwait ")
    @Description("Verify Subscription PREMIUM Packages For Kuwait Country")
    @Test(dependsOnMethods = "TC_01_VerifyLITEPackagesForKuwaitCountry")
    public void TC_03_VerifyPREMIUMPackagesForKuwaitCountry() {

        PackagesPage.VerifySubscriptionPackages("PREMIUM" ,"4.8 KWD/month" ,"4K UHD");
    }


}
