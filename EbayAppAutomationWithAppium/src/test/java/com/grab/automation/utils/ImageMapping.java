package com.grab.automation.utils;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import java.util.function.Predicate;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.basics.Debug;
import org.sikuli.basics.Settings;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.TouchShortcuts;


public class ImageMapping {

	protected WebDriver driver;
	File classpathRoot;
	private static double DEFAULT_MIN_SIMILARITY = 0.6;
	private	String 	imgDir;
	String path;

	public ImageMapping(WebDriver driver) {
		this.driver = driver;
		init();
	}
	
	public void init()
	{
	//	Settings.MinSimilarity = DEFAULT_MIN_SIMILARITY;
		classpathRoot = new File(System.getProperty("user.dir"));
		//imgDir = System.getProperty("user.dir");
		imgDir = new File(classpathRoot, "/src/test/resources/testdata/img").getPath();
	}

	private BufferedImage convertImgFileToBufferedImage(String imagePath){
		BufferedImage in = null;
		try {
			in = ImageIO.read(new File(imagePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return in;
	}

	/**
	 * clickByImage is the main method that you should be using to tap on elements on screen using an image.
	 * @param targetImgPath takes path to the screenshot of an element that you want to find.
	 */
	public void clickByImage(String targetImgPath) {
		Reporter.log("sikuli init . . . .");
		String imgPath	=	new File(imgDir+"/"+targetImgPath).getAbsolutePath();
		System.out.println("Image Path--> "+imgPath);
		Point2D coords = getCoords(takeScreenshot(), imgPath);
		if ((coords.getX() >= 0) && (coords.getY() >= 0)) {
			((AppiumDriver) driver).tap(1, (int) coords.getX(), (int) coords.getY(), 100);
		} else {
			throw new ElementNotVisibleException("Element not found - " + targetImgPath);
		}
	}

	public void clickByImage(String targetImgPath, double minSimilarityValue) {
		Point2D coords = getCoords(takeScreenshot(), targetImgPath, minSimilarityValue);
		if ((coords.getX() >= 0) && (coords.getY() >= 0)) {
			((AppiumDriver) driver).tap(1, (int) coords.getX(), (int) coords.getY(), 100);
		} else {
			throw new ElementNotVisibleException("Element not found - " + targetImgPath);
		}
	}

	// Convenience method to long press an element on screen with 1 second press duration
	public void longPressByImage(String targetImgPath) {
		Point2D coords = getCoords(takeScreenshot(), targetImgPath);
		if ((coords.getX() >= 0) && (coords.getY() >= 0)) {
			TouchAction touchA = new TouchAction((MobileDriver) driver);
			touchA.longPress((int) coords.getX(), (int) coords.getY(), 1000).release().perform();
		} else {
			throw new ElementNotVisibleException("Element not found - " + targetImgPath);
		}
	}

	// Convenience method to long press an element on screen with customisable press duration
	public void longPressByImage(String targetImgPath, int pressDuration) {
		Point2D coords = getCoords(takeScreenshot(), targetImgPath);
		if ((coords.getX() >= 0) && (coords.getY() >= 0)) {
			TouchAction touchA = new TouchAction((MobileDriver) driver);
			touchA.longPress((int) coords.getX(), (int) coords.getY(), pressDuration).release().perform();
		} else {
			throw new ElementNotVisibleException("Element not found - " + targetImgPath);
		}
	}

	
	public BufferedImage resize(BufferedImage img, int newW, int newH) { 
	    Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
	    BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g2d = dimg.createGraphics();
	    g2d.drawImage(tmp, 0, 0, null);
	    g2d.dispose();
	    return dimg;
	}  


	public Point2D getCoords(BufferedImage baseImg, String targetImgPath, double minSimilarityValue) {
		//set new minimum similarity
		Settings.MinSimilarity = minSimilarityValue;
		Match m;
		Finder f = new Finder(baseImg);
		Point2D coords = new Point2D.Double(-1, -1);

		f.find(targetImgPath);
		if (f.hasNext()) {
			m = f.next();
			coords.setLocation(m.getTarget().getX(), m.getTarget().getY());
		}
		//revert to default similarity
		Settings.MinSimilarity = DEFAULT_MIN_SIMILARITY;
		return coords;
	}


	/**
	 * getCoords returns a list of coordinates of all the matches found for the element specified
	 * @param targetImgPath is the image of the element that you want to find
	 * @return list of coordinates of the matches found for the element specified
	 */
	public List<Point2D> getCoordsForAllMatchingElements(String targetImgPath) {
		Finder f = new Finder(takeScreenshot());
		List<Point2D> coordsList = new ArrayList<>();
		Match m;
		f.findAll(targetImgPath);

		while (f.hasNext()) {
			m = f.next();
			coordsList.add(new Point2D.Double(m.getTarget().getX(), m.getTarget().getY()));
		}
		return coordsList;
	}


	/**
	 * Convenience method that takes a screenshot of the device and returns a BufferedImage for further processing.
	 * @return screenshot from the device as BufferedImage
	 */
	public BufferedImage takeScreenshot() {
		Debug.setDebugLevel(3);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(imgDir+"/test.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		BufferedImage bufferedImage = null;
		try {
			bufferedImage = ImageIO.read(scrFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bufferedImage;
	}

	/**
	 * Convenience method that returns true if the element is visible on the screen.
	 * Used as an expected condition in waitUntilImageExists
	 */
	public Boolean elementExists(String targetImgPath) {
		Point2D coords = getCoords(takeScreenshot(), new File(imgDir+"/"+targetImgPath).getAbsolutePath());
		return (coords.getX() >= 0) && (coords.getY() >= 0);
	}


//	  /**
//     * Custom explicit wait method that waits for @timeoutDuration until element is visible.
//     */
//    public void waitUntilImageExists(final String targetImgPath, long timeoutDuration) {
//        new WebDriverWait((WebDriver)driver, timeoutDuration).until((WebDriver driver) -> elementExists(targetImgPath));
//    }
	
	/**
	 * getCoords returns the coordinates of the FIRST element that matches the specified
	 * @param baseImg is the screenshot of the device
	 * @param targetImgPath is the image of the element that you want to find
	 * @return coordinates of the centre of the element found as Point2D
	 */
	public Point2D getCoords(BufferedImage baseImg2, String targetImgPath) {
		Match m;
		Finder f=null;
		String imgpath	=	imgDir + File.separator + "test1.png";
		String resizePath	=	imgDir+ File.separator +"resize1.png";
		try {
			f = new Finder(imgDir+ File.separator +"test.png");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Point2D coords = new Point2D.Double(-1, -1);
		f.find(targetImgPath.toString());
		if (f.hasNext()) {
			m = f.next();
			coords.setLocation(m.getTarget().getX(), m.getTarget().getY());
		}
		try {
			f.destroy();
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		return coords;
	}
	
	
	/**
    * Resizes an image by a percentage of original size (proportional).
    * @param inputImagePath Path of the original image
    * @param outputImagePath Path to save the resized image
    * @param percent a double number specifies percentage of the output image
    * over the input image.
    * @throws IOException
    */
   public  void resize(String inputImagePath,
           String outputImagePath, double percent) throws IOException {
	   System.out.println("InputImagePath equivalent to test1 png path--> "+inputImagePath);
	   System.out.println("Output Image path equivalent to resize1 png path --> "+outputImagePath);
       File inputFile = new File(inputImagePath);
       BufferedImage inputImage = ImageIO.read(inputFile);
       int scaledWidth = (int) (inputImage.getWidth() * percent);
       int scaledHeight = (int) (inputImage.getHeight() * percent);
       resize(inputImagePath, outputImagePath, scaledWidth, scaledHeight);
   }
   
   /**
    * Resizes an image to a absolute width and height (the image may not be
    * proportional)
    * @param inputImagePath Path of the original image
    * @param outputImagePath Path to save the resized image
    * @param scaledWidth absolute width in pixels
    * @param scaledHeight absolute height in pixels
    * @throws IOException
    */
   public void resize(String inputImagePath,
           String outputImagePath, int scaledWidth, int scaledHeight)
           throws IOException {
       // reads input image
	   BufferedImage inputImage = ImageIO.read(getClass().getResourceAsStream(inputImagePath));
       // creates output image
       BufferedImage outputImage = new BufferedImage(scaledWidth,
               scaledHeight, inputImage.getType());
       // scales the input image to the output image
       Graphics2D g2d = outputImage.createGraphics();
       g2d.drawImage(inputImage, 0, 0, scaledWidth, scaledHeight, null);
       g2d.dispose();
       // extracts extension of output file
       String formatName = outputImagePath.substring(outputImagePath
               .lastIndexOf(".") + 1);
       // writes to output file
       ImageIO.write(outputImage, formatName, new File(outputImagePath));
   }
   
	public String imageCropForElement(WebElement ele)   {
		try{ 
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			BufferedImage  fullImg = ImageIO.read(screenshot);
			Point point = ele.getLocation();
			int eleWidth = ele.getSize().getWidth();
			int eleHeight = ele.getSize().getHeight();
			System.out.println("Crop Image : Xstart Point : "+point.getX() +" Starting X Point : " +point.getY()+"Width : "+ eleWidth +" Hight : "+eleHeight);
			BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
			ImageIO.write(eleScreenshot, "png", screenshot);
			String 	loca	=	imgDir + File.separator +System.currentTimeMillis()+".png";
			System.out.println("Local Path--> "+loca);
			FileUtils.copyFile(screenshot, new File(loca));
			return loca;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public void clickByImageUsingElement (WebElement ele) {
		path	=		imageCropForElement(ele);
		System.out.println("Path returned--> "+path);
		clickByImage(new File(path));
	}
	
	/**
	 * clickByImage is the main method that you should be using to tap on elements on screen using an image.
	 * @param targetImgPath takes path to the screenshot of an element that you want to find.
	 */
	public void clickByImage(File targetImgPath) {
		Reporter.log("sikuli init . . . .");
		String imgPath	=	targetImgPath.getAbsolutePath();
		System.out.println("Image Path--> "+imgPath);
		Point2D coords = getCoords(takeScreenshot(), imgPath);
		if ((coords.getX() >= 0) && (coords.getY() >= 0)) {
			((AppiumDriver) driver).tap(1, (int) coords.getX(), (int) coords.getY(), 100);
		} else {
			throw new ElementNotVisibleException("Element not found - " + targetImgPath);
		}
	}
}
