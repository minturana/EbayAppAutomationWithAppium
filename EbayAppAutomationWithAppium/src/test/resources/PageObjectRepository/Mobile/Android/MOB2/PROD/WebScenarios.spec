#Object Definitions


==============================================================================================
view_tab          						xpath                	//li[contains(@title,'${val}')]
AddIcon           						xpath                	//span[@class='lpn_create']
AddActivityIcon   						xpath                	//ul[@class='menu' and contains(@style, 'display: block')]//a[text()='Add Activity']
Activity_FlashCards 					xpath                	//h3[@id="Flashcards"]
FlashCards_List     					xpath                	//ul[contains(@class,'plain')]/li/input[@title=" "]
Flashcard_Chapter   					xpath                	(//ul[contains(@class,'plain')]/li/input)[1]
btn_Continue        					xpath                	//div[@class="buttons"]/input[@value="Continue"]
AvailableDateTextField  				xpath                	//input[@id="startDate"]
DueDateTextField        				xpath                	//input[@id="endDate"]
currentDate             				xpath                	//div[@id='ui-datepicker-div' and contains(@style,'display: block')]//a[contains(@class,'ui-state-highlight')]
time_picker             				xpath                	//div[@class="ui_tpicker_hour_slider"]//select[@class="ui-timepicker-select"]
time_HourSlider         				xpath                	//div[@class="ui_tpicker_hour_slider"]//select[@class="ui-timepicker-select"]//option[contains(@value,'${val}')]
button_DoneOnCalendar   				xpath                	//div[contains(@id,'ui-datepicker-div') and contains(@style,'display: block')]//button[text()='Done']
Location_Order_Picker   				xpath                	//a[@id="order-button"]/span[contains(@class,'ui-selectmenu-icon')]
selectPosition          				xpath                	//ul[@id='order-menu']//li['${position}']
dateToBeSelected        				xpath                	//div[@id='ui-datepicker-div' and contains(@style,'display: block')]//a[contains(@class,'ui-state-highlight')]/../following-sibling::td[3]
btn_Save                				xpath                	//div[@class="buttons"]//span[@id="init_save"]
ActivityDueDate         				xpath                	//a[@class="ui-state-default" and contains(@title,'${val}')]
selectMenu_Order        				xpath                	//label[text()='Order']/..//a
order                   				css                  	.ui-selectmenu-item-focus.ui-state-hover>a
option_dropdown							xpath			 		//ul[@id="order-menu"]//li[2]//a
Activities_List         				xpath            		//div[@class="lpn_thumbTitle"]
List_EditButton         				xpath            		//div[@class="lpn_thumbTitle"]//following-sibling::div[@class="nb_edit"]//a[contains(@class,'buttonsejs_edit')]
edit_ButtonForActivity  				xpath            		(//div[@class="lpn_thumbTitle"]//following-sibling::div[@class="nb_edit"]//a[contains(@class,'buttonsejs_edit')])[1]
FirstActivityByIndex    				xpath            		(//div[@class='lpn_thumbTitle'])[1]
NameOfFirstactivtyByIndex  				xpath            		(//div[@class='lpn_thumbTitle'])[1]/h3/a
DescriptionOfFirstActivity  			xpath            		(//span[@class="lpn_description"])[1]
title_Activity          				xpath            		//form[@class="adminForm"]//input[@id="name"]
DescriptionActivity     				xpath            		//form[@class="adminForm"]//textarea[@id="description"]
flashcards_icon         				xpath            		//a[@id='app_view_flash_cards']
createAcard_Button       				id               		create-card
flashcard_bar           				xpath            		//input[@id='create_term_id']
flashcard_detail_bar    				xpath            		//textarea[@id='create_def_id']
save_button             				xpath            		//button[@id='card-form-save']
edit_button            	 				xpath            		(//a[@class='editcustomcard'])[${val}]
delete_this_card_button    				xpath             		//button[@id='card-form-delete']
SecondActivityByIndex      				xpath             		(//div[@class='lpn_thumbTitle'])[2]
NameOfSecondactivtyByIndex  			xpath            		(//div[@class='lpn_thumbTitle'])[2]/h3/a
hide_buttonForActivity     				xpath             		(//img[@class='hide buttonsejs_hide'])[2]
chapter1_activity          				xpath             		//*[contains(text(),'Chapter 1: Art in the Stone Age')] 
quiz_click                 				xpath             		(//h3[@class='lpn_name group'])[4] 
countTowardsGrade          				xpath             		//img[@class='gradeIcon submissioninfoejs_grade']
practice                  	 			xpath             		(//img[@class='gradeIcon submissioninfoejs_practice'])[5]
hoverChapterQuiz1          				xpath             		(//div[@class='lpn_thumbTitle'])[28]
quizEditClickButton        				xpath             		(//a[@class='buttons_editHover ui-button clui-edit buttonsejs_edit' and contains(@title,'Edit')])[28]
EditOptionsButton      	   				xpath             		//div[@class="snap"]/input[@value="Edit Options"] 
practiceCheck              				xpath             		(//input[@value="on"])[1]
doneButton                 				xpath             		//input[@id='doneButton']
saveQuizButton             				xpath            		//span[@id='init_save']         
expanded_folders	       				xpath			 		//div[contains(@class,'lpn_group_expanded')]
activity_details_save_frame       		xpath    				//div[contains(@class,'form_area lpn_form mxui_layout_modal nb_math')]
practice                          		xpath               	(//img[@class='gradeIcon submissioninfoejs_practice'])[5]
CountOfTotalFlashcards     				xpath           		(//span[contains(@class,'cardcount-count')]/span[@aria-hidden="true"])[${val}]
FlashcardCount_OnAddingAFlashcard   	xpath            		(//span[contains(@class,'cardcount-count')]/span[@aria-hidden="true"])[${val}]
QuizTypeActivityOnLPn     				xpath            		//div[contains(@class,'lpn_manager')]/div[contains(@class,'scroll_area')]
EmailIdForInstructorLogin 				xpath            		//input[@id="emailId"]
PasswordIdForInstructorLogin			xpath     				//input[@id="password"]
SignInbtn                    			xpath     				//button[@value='Sign In']
btn_CreateCourse             			xpath     				//div[@class="csmCourseOption baseCourseCreation"]/a
Header_CreateCourse          			xpath     				//div[@id="columnMain"]/h3
radioBtn_CreateNewCourse     			xpath     				//div/input[@id="createNewCourse"]
radiobtn_CopyAnExistingCourse 			xpath    				//div/input[@id="copyExistingCourse"]
ContinueBtnForCreateNewCourse 			xpath    				//a[@onclick="submitForm();"]
NewCourse_bookTitle           			xpath    				//div[@class="bookDetails"]/h3
Activityname_ActivityModal_UnitView   	xpath  					//form[@class="adminForm"]//h3[@class="formtext"]
CourseNameField               		  	xpath    				//input[@id="courseName"]
BeginDate_Course              		  	xpath    				//label[@for="beginDate"]/following-sibling::input[@id="beginDate"]
EndDate_Course                		  	xpath    				//label[@for="endDate"]/following-sibling::input[@id="endDate"]
CreateCoursebtn_OnCoursedetailPage    	xpath    				//div[@class="btns_lt"]/a[@onclick="showWait();submitForm();"]
Message_CourseCreated         			xpath     				//div[@id="create_Course"]/h1
StudentRegistrationUrl        			xpath    				(//p[@class="distributionOptions"]/a)[1]
CourseKey_NewCourse           			xpath    				(//p[@class="distributionOptions"]/a)[1]
Student_EmailIdField          			xpath    				(//span[@class="input-group-addon"]/following-sibling::input[@id="email"])[1]
PasswordField_Student         			xpath    				//span[@class="input-group-addon"]/following-sibling::input[@id="fmPassword"]
LoginBtn                      			xpath    				//a[@onclick="login()"]
temporaryAccess_btn           			xpath    				//a[text()="Start Temporary Access"]
NameOfCourseOnMyHomePage      			xpath    				//p[@class="splash_snapInfo"]/span
DropDown_Selctcourse          			xpath    				//div[@id="courses"]/select[@id="select_location"]
ExistingCourse                			xpath    				//option[contains(text(),'${val}')]
Enter_btn                      			css     				.cancel.splash_close.nb_closeIcon
CoureNameOnStudentDashBoard   			xpath    				//div[@class="courseDetails"]/h1
More_Icon                     			xpath   				//img[@alt="Expand Dock"]
selectButton_FlashcardChapter 			xpath    				//a[@id="select_chapter-button"]/span[contains(@class,'ui-selectmenu-icon')]
FlashcardChapter              			xpath     				(//ul[@id="select_chapter-menu"]/li)[2]
TextArea_SendNotificationMsg  			xpath    				//form[@class="send_message"]/textarea[@id="message"]
btn_message_submit            			xpath   				//input[@id="message_submit"]
messagetext                   			xpath   				(//div[@class="messagetext"])[1]
AnchorText                    			xpath   				//a[contains(text(),'${val}')]
PronounceUnit                 			xpath   				//a[contains(text(),'${val}')]/ancestor::div[contains(@class,'lpn_thumbTitle')]
ActivityAtFirstLocation       			xpath   				(//h3[@class="lpn_name"]/a)[1]
NavLink_Web                   			xpath   				//a[@class="navLink"]
EditButton_HoverActivity      			xpath   				//div[@class="nb_edit" and @style="display: block;"]//img[@alt="Edit"]
InputTitle_Activity           			xpath   				//input[@id="txtTitle"]
selectGradeavleButton         			xpath   				//select[@id="selGradeable"]
selectGradeableOption         			xpath   				//select[@id="selGradeable"]/option[@value='${val}']
Btn_Update                    			xpath   				//input[@id="editUpdate"]
manageCourseButton             			xpath      				//div[@class="csmCourseOption manageCourses"]/a
editButton                    			xpath      				//a[@title='${str}']/../../../td[10]
beginDate                       		id       				beginDate
endDate                         		id       				endDate
SaveChangesButton            			xpath       			//a[contains(text(),'Save Changes')]
coursePickerTriangle                    css                     .ui-selectmenu-icon.ui-icon.ui-icon-triangle-1-s
selectFirstChapterOfFlashcardOnWeb      css                     .ui-selectmenu-menu.ui-selectmenu-open>ul>li:nth-child(1)
DeleteCourse_button                     xpath                   //a[@title='${val}']/../../../td/a[@title="Delete Course"]
CourseLinkForLaunching                  xpath                   (//div[@class="stepContent"]/a)[1]
dropStudentButton                       xpath                   //button[@data-e2e-id='DropStudentButton']
confirmDropStudentButton                xpath                   //button[@data-e2e-id="ConfirmDropStudentButton"]
closeTourButton                         css                     .close.mxui_layout_positionable
studentLinkOnProgressApp                xpath                   //div[@data-e2e-class='StudentName']
selectActivityOnWeb                     xpath                   (//a[contains(text(),'${val}')])[1]
modelOptionsEditFrame                   id                      modelOptionsEditFrame
typeDropDownOnEditPage                  css                     .edit_pstype
SaveBtnOnEditPage                       xpath                   //a[@id="btnEditActivity"]/span[contains(text(),Save)]
adminSaveButton                         css                     .adminButton.save
previous_Button       				    id               		previous-card



