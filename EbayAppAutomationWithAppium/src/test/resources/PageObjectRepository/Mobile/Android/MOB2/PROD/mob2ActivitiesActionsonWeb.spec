#Object Definitions
==============================================================================================
DateManagerView        	 			xpath               //li[contains(@title,'Date Manager View')]
ListView                			xpath               //li[@title="List View"]
AvailableDate           			xpath               (//li[contains(@id,'lpn_dm_node') and not(contains(@class,'hidden'))]//img)[1]
DueDate                 			xpath               (//li[contains(@id,'lpn_dm_node') and not(contains(@class,'hidden'))]//img)[2]
currentDate             			xpath               //div[@id='ui-datepicker-div' and contains(@style,'display: block')]//a[contains(@class,'ui-state-highlight')]
dateToBeSelected        			xpath               //div[@id='ui-datepicker-div' and contains(@style,'display: block')]//a[contains(@class,'ui-state-highlight')]/../following-sibling::td[3]
next_IconOnCalendar     			xpath               //span[contains(@class,'ui-icon ui-icon-circle-triangle-e')]
Firstdate_NextMonth     			xpath               (//div[@id='ui-datepicker-div' and contains(@style,'display: block')]//a[contains(@class,'ui-state-default')])[1]
button_DoneOnCalendar   			xpath               //div[contains(@id,'ui-datepicker-div') and contains(@style,'display: block')]//button[text()='Done']
time_picker             			xpath               //div[@class="ui_tpicker_hour_slider"]//select[@class="ui-timepicker-select"]
time_HourSlider                     xpath               //div[@class="ui_tpicker_hour_slider"]//select[@class="ui-timepicker-select"]//option[contains(@value,'${val}')]
ActivityDueDate                     xpath               //a[contains(@class,'ui-state-default') and contains(@title,'${val}')]
Name_ActivityOnListView             xpath        		(//div[contains(@class,'lpn_dm_activity_name')])[1]
DueMonth_Activity                   xpath        		(//div[contains(@class,'lpn_dm_activity_endDate')]/a[contains(@class,' datemanageractivity_duedate')])[1]
ArtInStoneAge_DueDateButton         xpath        		//div[contains(@title,'${val}') and contains(@class,'lpn_dm_activity_name')]/../following-sibling::li[1]//img[contains(@class, 'datemanageractivity_enddate')]
MOBv2_Activitiy_DueDateButton       xpath               //div[@title='${val}' and contains(@class,'lpn_dm_activity_name')]/..//img[contains(@class, 'datemanageractivity_enddate')]
AvailableDateButton_ArtInStoneAge   xpath        		//div[@title=${val} and contains(@class, 'lpn_dm_activity_name')]/../following-sibling::li[1]//img[contains(@class, 'datemanager_selectdate')]
ReadingActivityName                 xpath         		//div[contains(@title,'${val}') and contains(@class,'lpn_dm_activity_name')]/../following-sibling::li[1]/div[1]
ActivityNameMOBv2                   xpath               //div[@title='${val}' and contains(@class,'lpn_dm_activity_name')]
PronounceActivityName               xpath       		//div[@title='${val}']
activityToScroll                    xpath       		//span[@title='${val}']
PronounceActivity_DueDateButton     xpath       		//div[@title='${val}']/following-sibling::div[2]/img
UserName_Pronounce_web              xpath       		//div[@data-e2e-class="StudentName" and text()="term, Med"]
Score_Activity_ProgressApp_Web      xpath       		//span[@title='${val}']/ancestor::div[contains(@class,' ag-cell-no-focus')]/following-sibling::div[contains(@class,'ag-cell-value score')]
CountOfAttempts_Web                 xpath       		//span[@title='${val}']/ancestor::div[contains(@class,' ag-cell-no-focus')]/following-sibling::div[contains(@class,'ag-cell-value submitted')]
StudentNameFilterInput              xpath        		//input[@data-e2e-id="StudentNameFilterInput"]
Score_Activity_ListView_Web         xpath        		//span[@title="${val}"]/ancestor::div[contains(@class,'lpn_cv_activity_name')]/span[contains(@class,'studentlist_score')]
CourseDropdown                      css                 .user-menu-link.tb_item
CourseSettingsLink                  xpath               //a[text()="Course Settings" and contains(@class,"menuItem")]
DashboardCollapseIcon               xpath               //div[@id='dashboard-settings']//h3//span[@class="collapse-settings-group-icon"]
DisableWeekViewCheckBox             xpath               //input[@type="checkbox" and contains(@name,"weekviewCheckbox")]
SaveSettingsButton                  css                 #dashboard-settings-save-btn
