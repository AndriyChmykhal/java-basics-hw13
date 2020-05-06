package com.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestWithGroups {
    @BeforeClass(groups = "Smoke Post Setup")
    public void smokePrecondition() {
        System.out.println("Complete Setup w/o OTA");
    }

    @AfterClass(groups = "Smoke Post Setup")
    public void smokePostcondition() {
        System.out.println("Remove device from the account");
    }

    @BeforeClass(groups = "Regression Post Setup")
    public void regressionPrecondition() {
        System.out.println("Complete Setup with OTA");
    }

    @AfterClass(groups = "Regression Post Setup")
    public void regressionPostcondition() {
        System.out.println("Remove device from the account");
    }

    @Test(groups = "Smoke Post Setup")
    public void completeMotionSettingsStep() {
        System.out.println("Motion Settings step is completed");
    }


    @Test(groups = "Regression Post Setup")
    public void completePhysicalInstallationStep() {
        System.out.println("Physical Installation Step is Completed");
    }

    @Test(groups = "Shared User flow")
    public void shareUserInPostSetupFlow() {
        System.out.println("Device is shared during the Post Setup flow");
    }

    @Test(groups = {"Shared User in Settings"}, dependsOnGroups = {"Shared User flow"})
    public void assertThatDeviceIsSharedInSettings(){
        System.out.println("Device is marked as shared in the Device Settings"); }
}