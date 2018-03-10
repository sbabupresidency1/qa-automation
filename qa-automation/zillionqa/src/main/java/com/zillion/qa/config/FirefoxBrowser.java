package com.zillion.qa.config;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Class to configure and get Details for Firefox Browser
 */
public class FirefoxBrowser extends DefaultBrowser implements Browser {
    @Override
    protected Capabilities createRemoteCapabilities() {
    /*    final DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("marionette",true);
        caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
      */  
    	WebDriver dd=new FirefoxDriver();
    	return null;
    }

    @Override
    protected RemoteWebDriver createLocalDriver() {
        return new FirefoxDriver();
    }
}
