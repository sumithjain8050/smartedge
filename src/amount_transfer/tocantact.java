package amount_transfer;

import org.openqa.selenium.chrome.ChromeDriver;

public class tocantact {

	public static void main(String[] args) throws InterruptedException
	{
		String key ="webdriver.chrome.driver";
		String value ="./selenium softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver cro=new ChromeDriver();
		Thread.sleep(3000);
		cro.quit();

	}

}
