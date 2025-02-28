package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Common.WaitWrapper;
import Utility.Logs.Log;

public class AddCarriers extends BasePage {

	public AddCarriers(WebDriver driver) {
		super(driver);
	}

	By CarrierAppTab = By.xpath("//*[@class='sidemenu']//li[5]");
	By StateAlabama = By.xpath("//*[@class='state-list']//li[1]");
	By StateAlaska = By.xpath("//*[@class='state-list']//li[2]");
	By Statelowa = By.xpath("//*[@class='state-list']//li[11]");

	public AddCarriers AddCarrierAppointments() throws Exception {
		//WaitWrapper.waiter(10000, "New Carrier Appointments Creation", driver);
		Log.info("New Carrier Appointments Creation");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		click(CarrierAppTab);
		if (driver.findElement(StateAlabama).isSelected()) {
			click(StateAlabama);
		} else if (driver.findElement(StateAlaska).isSelected()) {
			click(StateAlaska);
		} else if (driver.findElement(Statelowa).isSelected()) {
			click(Statelowa);
		}
		js.executeScript("window.scrollBy(0,2000)");

		return this;
	}

}
