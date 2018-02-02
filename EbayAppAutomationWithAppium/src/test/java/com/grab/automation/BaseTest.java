package com.grab.automation;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	
	protected Map <String ,String> features = new HashMap<String, String>(){{put("Activities","Activities");}
	{put("Messages","Messages");}{put("Study Tools","Study Tools");}
	{put("Reader","Reader");}{put("Gradebook","Gradebook");}
	{put("Settings","Settings");}{put("Pronounce","Pronounce");}
	{put("Attendance","Attendance");}{put("Polling","Polling");}};
	
	protected Map <String ,String> headers = new HashMap<String, String>(){{put("Activities","Activities");}
	{put("Messages","Messages");}{put("Study Tools","Study Tools");}
	{put("Reader","Reader");}{put("Gradebook","Create passcode");}
	{put("Settings","Settings");}{put("Pronounce","Pronounce");}
	{put("Attendance_Student","My Attendance");}{put("Polling","Polls");}
	{put("Attendance_Inst","Attendance");}{put("IMOB_Courses","My Courses");}
	{put("Flashcards","Flashcards");}{put("CourseInformation","Course Information");}
	{put("Practice Quiz","Practice Quiz");}{put("FAQs","FAQs");}
	{put("Feedback","Feedback");}{put("View EULA","View EULA");}};
	
	protected Map <String ,String> activitiesTab = new HashMap<String, String>(){{put("Week","Week");}
	{put("Calendar","Calendar");}{put("Unit","Unit");}};
	
	@BeforeMethod(alwaysRun = true)
	public void logTestMethod(Method method) {
		String className = method.getDeclaringClass().getName();
		className = className.substring(className.lastIndexOf('.') + 1);
		System.out
		
		.println("**********************************************************"
				+ "\n"
				+ "Running Test:"
				+ className
				+ "."
				+ method.getName()
				+ "\n"
				+ "**********************************************************");
	}
	
}
