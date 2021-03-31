package SingletonCheck;

import org.openqa.selenium.WebDriver;

public class Mainclass {

	public static void main(String[] args) {
		
		/*
		 * SingletonClass object = SingletonClass.getinstance(); object.showMessage();
		 */
		
		SingletonBrowser object = SingletonBrowser.getinstance();
		WebDriver driver1 = object.getdriver();
		
		}

}
