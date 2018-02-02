/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grab.automation.utils;

import static com.grab.automation.utils.ConfigPropertyReader.getProperty;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.opencv.core.Core;
import org.opencv.core.Core.MinMaxLocResult;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.Reporter;

/**
 *
 * @author prashantshukla
 */
public class TakeScreenshot {

	WebDriver driver;
	String testname;
	String screenshotPath = "/target/Screenshots";

	public TakeScreenshot(String testname, WebDriver driver) {
		this.driver = driver;
		this.testname = testname;
	}

	public void imageCropForElement(WebElement ele)   {
		try{ 
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			BufferedImage  fullImg = ImageIO.read(screenshot);
			Point point = ele.getLocation();

			int eleWidth = ele.getSize().getWidth();
			int eleHeight = ele.getSize().getHeight();
			System.out.println("Crop Image : Xstart Point : "+point.getX() +" Starting X Point : " +point.getY()+"Width : "+ eleWidth +" Hight : "+eleHeight);
			BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
			ImageIO.write(eleScreenshot, "png", screenshot);
			FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir")
					+ File.separator + screenshotPath + File.separator
					+ this.testname + File.separator +ele.getText()));
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @param inFile	full Image path
	 * @param templateFile	Temp Image Path
	 * @param outFile	Compare Image Path
	 * @param match_method	=	CV_TM_SQDIFF_NORMED , CV_TM_SQDIFF , CV_TM_CCORR
	 * CV_TM_CCORR_NORMED, CV_TM_CCOEFF and CV_TM_CCOEFF_NORMED
	 */
	public void compareImage(String inFile, String templateFile, String outFile, int match_method) {
		System.loadLibrary("opencv_java246");

		Mat img = Highgui.imread(inFile);
		Mat templ = Highgui.imread(templateFile);    

		int result_cols = img.cols() - templ.cols() + 1;
		int result_rows = img.rows() - templ.rows() + 1;
		Mat result = new Mat(result_rows, result_cols, CvType.CV_32FC1);

		// / Do the Matching and Normalize
		Imgproc.matchTemplate(img, templ, result, match_method);
		Core.normalize(result, result, 0, 1, Core.NORM_MINMAX, -1, new Mat());


		// / Localizing the best match with minMaxLoc
		MinMaxLocResult mmr = Core.minMaxLoc(result);

		org.opencv.core.Point matchLoc;
		if (match_method == Imgproc.TM_SQDIFF || match_method == Imgproc.TM_SQDIFF_NORMED) {
			matchLoc = mmr.minLoc;
		} else {
			matchLoc = mmr.maxLoc;
		}
		// / Show me what you got
		Core.rectangle(img, matchLoc, new org.opencv.core.Point(matchLoc.x + templ.cols(), matchLoc.y + templ.rows()), new Scalar(0, 255, 0));
		// Save the visualized detection.
		System.out.println("Writing "+ outFile);
		Highgui.imwrite(outFile, img);

	}


	public void takeScreenshot() {
		screenshotPath = (getProperty("screenshot-path") != null) ? getProperty("screenshot-path")
				: screenshotPath;
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_hh_mm_a");
		Date date = new Date();
		String date_time = dateFormat.format(date);
		File file = new File(System.getProperty("user.dir") + File.separator
				+ screenshotPath + File.separator + this.testname
				+ File.separator + date_time);
		boolean exists = file.exists();
		if (!exists) {
			new File(System.getProperty("user.dir") + File.separator
					+ screenshotPath + File.separator + this.testname
					+ File.separator + date_time).mkdir();
		}

		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		try {
			String saveImgFile = System.getProperty("user.dir")
					+ File.separator + screenshotPath + File.separator
					+ this.testname + File.separator + date_time
					+ File.separator + "screenshot.png";
			Reporter.log("Save Image File Path : " + saveImgFile, true);
			FileUtils.copyFile(scrFile, new File(saveImgFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void takeScreenShotOnException(ITestResult result) {
		String takeScreenshot = getProperty("take-screenshot");
		if (result.getStatus() == ITestResult.FAILURE) {
			Reporter.log(
					"FAILURE occured at "
							+ DateUtil.converttimestamp(System
									.currentTimeMillis()), true);
			if (takeScreenshot.equalsIgnoreCase("true")
					|| takeScreenshot.equalsIgnoreCase("yes")) {
				try {
					if (driver != null) {
						takeScreenshot();
					}
				} catch (Exception ex) {
					Reporter.log("Driver is null while taking screen shot",
							true);
				}
			}
		}
	}

}
