package org.hexa;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandle {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adhid\\eclipse-workspace\\Windows\\div\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.makemytrip.com/hotels/");
		dr.manage().window().maximize();
		Thread.sleep(8000);
		WebElement c1 = dr.findElement(By.xpath("(//p[@class='blackText font18 lineHeight22 appendBottom10 '])[1]"));
		c1.click();
		Thread.sleep(8000);
		WebElement c2 = dr.findElement(By.xpath("(//p[@class='blackText font18 lineHeight22 appendBottom10 '])[2]"));
		c2.click();
		Set<String> allwid = dr.getWindowHandles();
		System.out.println(allwid);
		List<String> li = new ArrayList<String>();
		li.addAll(allwid);
		String id = li.get(1);
		dr.switchTo().window(id);
		Actions a = new Actions(dr);
		Robot r = new Robot();
		WebElement make = dr.findElement(By.xpath("//a[text()='MakeMyTrip Home']"));

		a.contextClick(make).perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
