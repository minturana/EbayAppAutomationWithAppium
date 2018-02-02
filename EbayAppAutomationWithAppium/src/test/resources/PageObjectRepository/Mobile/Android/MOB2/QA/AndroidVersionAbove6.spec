activityPage

#Object Definitions
==============================================================================================
textOnPage                  xpath       //android.widget.TextView[@text='${val}']
textOnButton                xpath       //android.widget.Button[contains(@text,'${val}')]
ActivityOnPage              xpath       //android.widget.TextView[contains(@text,'${val}')]
CengageSpinner              xpath      //android.widget.ProgressBar[contains(@resource-id,'progress_bar')]
main_toolbar_Header         xpath       //android.view.View[contains(@resource-id,'main_toolbar')]/..//android.widget.TextView[contains(@text,'${val}')][@enabled ='true']
AboveVersion6_main_toolbar_Header     xpath      //android.view.ViewGroup[contains(@resource-id,'main_toolbar')]/..//android.widget.TextView[contains(@text,'${val}')][@enabled ='true']
main_toolbar_image_Header   xpath   //android.view.View[contains(@resource-id,'main_toolbar')]/android.widget.ImageButton[@content-desc='${val}'][@enabled ='true']
tv_week_name                xpath   //android.widget.TextView[contains(@resource-id,'tv_week_name')][@text='${val}'][@enabled ='true']
action_view_calendar         id     com.cengage.mobile.mindtap:id/action_view_calendar
AboveVersion6_main_toolbar  xpath  //android.view.ViewGroup[contains(@resource-id,'main_toolbar')]/android.widget.ImageButton[@enabled ='true']
view_calendar_Header        xpath   //android.widget.FrameLayout[@index='0']/android.widget.TextView[@text='${val}']
tab_user_activities         xpath   //android.widget.HorizontalScrollView[contains(@resource-id,'tab_user_activities')]/..//android.widget.TextView[@text='${val}']
tv_activity_due_date		 id 	com.cengage.mobile.mindtap:id/tv_activity_due_date
tv_activity_available_date   id     com.cengage.mobile.mindtap:id/tv_activity_available_date
action_today		 		 id		com.cengage.mobile.mindtap:id/action_today
calendar_month_year_textview id		com.cengage.mobile.mindtap:id/calendar_month_year_textview
tv_custom_calendar_date	    xpath	(//android.widget.TextView[contains(@resource-id,'tv_custom_calendar_date')][@text='${val}'])[1]
tv_learning_path_node_title                        xpath   //android.widget.TextView[contains(@resource-id,'tv_learning_path_node_title')]
ll_adapter_week_view_user_activity_layout  id   com.cengage.mobile.mindtap:id/ll_adapter_week_view_user_activity_layout
ActivityName_WeekView                xpath      //android.widget.TextView[contains(@resource-id,'tv_activity_name')]
FirstActivityName_WeekView          xpath            (//android.widget.TextView[contains(@resource-id,'tv_activity_name')])[1]
ActivityTitle               xpath            android.widget.LinearLayout[contains(@index,'${val}')]/../..//android.widget.TextView[contains(@text,'${val})]
tv_activity_name             id               com.cengage.mobile.mindtap:id/tv_activity_name
Month_Activity               xpath            //android.widget.TextView[contains(@resource-id,'tv_month_short_name')]
activityMonth_Index          xpath            (//android.widget.TextView[contains(@resource-id,'tv_month_short_name')])[1]
tv_month_short_name          id               com.cengage.mobile.mindtap:id/tv_month_short_name
dateList_Activities          xpath            //android.widget.TextView[contains(@resource-id,'tv_date')]
date_Activity           xpath           //android.widget.TextView[@text='${val}']/../..//android.widget.LinearLayout[contains(@resource-id,'ll_adapter_week_view_user_activity_layout')]//android.widget.TextView[contains(@resource-id,'tv_date)]
tv_date                      id               com.cengage.mobile.mindtap:id/tv_date
activity_tileOnActivityDetailPage                id               com.cengage.mobile.mindtap:id/tv_activity_title
tv_activity_type            id                com.cengage.mobile.mindtap:id/tv_activity_type	
tv_activity_reminder_date   id                com.cengage.mobile.mindtap:id/tv_activity_reminder_date
sw_activity_reminder_switch id                com.cengage.mobile.mindtap:id/sw_activity_reminder_switch
alertTitle                  id                com.cengage.mobile.mindtap:id/alertTitle
day_Duedate                 id                com.cengage.mobile.mindtap:id/day
Hour_DueDate                id                com.cengage.mobile.mindtap:id/hour
Mins_DueDate                id                com.cengage.mobile.mindtap:id/mins
AmPm_DueDate                id                com.cengage.mobile.mindtap:id/ampm
btn_DueDateReminderAlert    xpath            //android.widget.Button[contains(@text,'${val}')]
ll_adapter_user_activities_layout  id        com.cengage.mobile.mindtap:id/ll_adapter_user_activities_layout
tv_adapter_user_activities_activity_name  id  com.cengage.mobile.mindtap:id/tv_adapter_user_activities_activity_name
tv_adapter_week_view_week_name      xpath     //android.widget.TextView[contains(@resource-id,'tv_adapter_week_view_week_name')][@text='${val}']
btn_activity_launch_mt_pronounce    xpath     //android.widget.Button[contains(@resource-id,'btn_activity_launch_mt_pronounce')][contains(@text,'${val}')]
spinner_OnActivitiesScreen           id       com.cengage.mobile.mindtap:id/progress_bar
Refreshed_Spinner                    xpath    //android.widget.ImageView[@bounds=[320,326][400,406]]
Activities_Weekview                  xpath    //android.widget.LinearLayout[contains(@resource-id,'ll_adapter_week_view_user_activity_layout')
Status_Activity                       id       com.cengage.mobile.mindtap:id/tv_activity_status
Activity_UnitName                  xpath     //android.widget.LinearLayout[@index="0"]/android.widget.TextView[contains(@resource-id,'tv_learning_path_node_title')]
btn_addtoAndroidCalendar             id        com.cengage.mobile.mindtap:id/tv_add_to_native_cal
AddEvent_action_bar_spinner         id          android:id/action_bar_spinner
AddEventButton                    xpath        //android.widget.TextView[contains(@resource-id,'text1') and contains(@text,'Add event)]
action_cancel                      id          com.android.calendar:id/action_cancel
action_done                        id          com.android.calendar:id/action_done
calendars_label                    id          com.android.calendar:id/calendars_label
calendars_selected_item            id          com.android.calendar:id/calendars_selected_item
Activity_Title_AddToCalendar_Screen id          com.android.calendar:id/title
alertTitle_Calendar                id           android:id/alertTitle
CountOfCalendars                   id           com.android.calendar:id/calendar_name
Calendar_Name_By_index             xpath       //android.widget.LinearLayout[@index=${val}]//android.widget.TextView[contains(@resource-id,'calendar_name')]
Calendar_radioButton_By_Index      xpath       //android.widget.LinearLayout[@index=${val}]//android.widget.RadioButton[contains(@resource-id,'radiobutton')]                   
btn_cancel_selectCalendarAlert    xpath       //android.widget.Button[contains(@text,'Cancel')]
action_bar_title                   id         android:id/action_bar_title
event_info_delete                  id         com.android.calendar:id/event_info_delete
btn_OkThanks                       xpath      //android.widget.Button[contains(@resource-id,'btn_user_activities_dialog') and contains(@text,'OK, Thanks!')]
tv_adapter_course_list_title    xpath   //android.widget.TextView[contains(@resource-id,'tv_adapter_course_list_title')][@text='${val}']
iv_adapter_course_list_book_cover   xpath   //android.widget.TextView[contains(@resource-id,'tv_adapter_course_list_title')][@text='${val}']/../../android.widget.ImageView[contains(@resource-id,'iv_adapter_course_list_book_cover')]
courseInfo      xpath   //android.widget.TextView[@text='${val}']/../android.widget.TextView[@text='#{val}']    
tv_course_expire_warning_message    xpath   //android.widget.LinearLayout[contains(@resource-id,'ll_adapter_course_list_layout')][@text='${val}']/../../..//android.widget.TextView[contains(@resource-id,'tv_course_expire_warning_message')][@text='${val}']

course_expireMessage       xpath    //android.widget.TextView[contains[@resource-id,'tv_course_expire_warning_message') and contains(@text,'${val}')]

Expired_Course            xpath    //android.widget.TextView[contains(@resource-id,'tv_adapter_course_list_title') and @text='${val}']/../..//
tv_course_Chapter_Name   xpath  //android.widget.LinearLayout/../..//android.widget.TextView[contains(@resource-id,'tv_adapter_course_list_title')][@text='${val}']

slideBarNameAndIndicator    xpath   //android.widget.TextView[@text='${val}']/../android.widget.TextView[@resource-id='com.cengage.mobile.mindtap:id/indicator']
slideBarNameAndIcon         xpath   //android.widget.TextView[@text='${val}']/../android.widget.ImageView[@resource-id='com.cengage.mobile.mindtap:id/imageView']
TemporaryAccessBar         xpath  //android.widget.LinearLayout//android.widget.TextView[@resource-id='com.cengage.mobile.mindtap:id/tv_course_warning_message']
main_toolbar_Text       xpath //android.view.View[contains(@resource-id,'id/main_toolbar')]/android.widget.TextView[@index='1'][@text='${val}']
MindTapImageOnLayOut   xpath   //android.widget.LinearLayout[@index='0']/android.widget.ImageView[@content-desc='Image Content Description']
btn_register    id    com.cengage.mobile.mindtap:id/btn_register
section_info    xpath   //android.widget.TextView[@text='${val}']/../android.widget.TextView[contains(@resource-id,'id/section_info')]
getIndexValue    xpath   //android.widget.TextView[@text='${val}']/preceding-sibling::android.widget.LinearLayout[contains(@resource-id,'course_trial_period_warning_message']//android.widget.LinearLayout[contains(@resource-id,'course_warning_message')]
tv_course_warning_message    xpath   //android.widget.LinearLayout['${val}'][contains(@resource-id,'ll_course_trial_period_warning_message')]//android.widget.TextView[contains(@resource-id,'tv_course_warning_message']
EULA_AcceptButton           xpath       //android.widget.Button[@text='Accept']
EULA_DeclineButton          xpath       //android.widget.Button[@text='Decline']
allAtags                    xpath       //a
EULAPageVersion             xpath       //p[@class='version']
terms-of-use-list           xpath       //ol[@class='terms-of-use-list']/li
intro-section               xpath       //section[@class='intro-section']/h2[text()='${val}']
PageText                    xpath       //p
registerButton               id        com.cengage.mobile.mindtap:id/btn_register
button_MySettings            id        com.cengage.mobile.mindtap:id/tv_view_course_not_found_my_settings
snackbar_text       id      com.cengage.mobile.mindtap:id/snackbar_text
FlashCards_score   xpath   //android.widget.TextView[contains(@text,'${val}')]/..//android.widget.TextView[contains(@resource-id,'tv_adapter_flashcards_mastered_cards')]
FlashCards_Name    xpath   //android.widget.TextView[contains(@text,'${val}')]/..//android.widget.TextView[@index="1"][@text='Flashcards']
tv_flashcards_count_out_of  xpath  //android.view.View[contains(@resource-id,'main_toolbar')]/android.widget.TextView[@index='1']
tv_flashcards_front_card    id  com.cengage.mobile.mindtap:id/tv_flashcards_front_card
ib_flashcards_mastered_icon id  com.cengage.mobile.mindtap:id/iv_flashcards_mastered_icon
tv_flashcards_back_card     id  com.cengage.mobile.mindtap:id/tv_flashcards_back_card
fm_flashcards_cards         xpath   //android.widget.FrameLayout[contains(@resource-id,'fm_flashcards_cards')]//android.widget.TextView[@enabled='true']
tv_flashcard_or_quiz_score_mastered   id       com.cengage.mobile.mindtap:id/tv_flashcard_or_quiz_score_mastered
tv_flashcard_or_quiz_score_total_number_of_questions id       com.cengage.mobile.mindtap:id/tv_flashcard_or_quiz_score_total_number_of_questions
btn_flashcard_score_take_practice_quiz  id       com.cengage.mobile.mindtap:id/btn_flashcard_score_take_practice_quiz
btn_flashcard_score_keep_studying   id       com.cengage.mobile.mindtap:id/btn_flashcard_score_keep_studying
ll_practice_quiz_layout id  com.cengage.mobile.mindtap:id/ll_practice_quiz_layout
simpleDraweeView_flashcards_front_card	id com.cengage.mobile.mindtap:id/simpleDraweeView_flashcards_front_card
btn_FlipCard  id    com.cengage.mobile.mindtap:id/menu_action_flip_card
btn_ShuffleCard  id  com.cengage.mobile.mindtap:id/menu_action_shuffle_card
fm_flashcards_cards   id   com.cengage.mobile.mindtap:id/fm_flashcards_cards
Add_flashCard         id  com.cengage.mobile.mindtap:id/fab_flashcards
final_page_text                 xpath    //android.widget.LinearLayout/..//android.widget.TextView[@text='${val}']
circle_display_flashcard_score  xpath    //android.view.View[contains(@resource-id,'circle_display_flashcard_score')]
mastered                        xpath    //android.widget.LinearLayout/..//android.widget.TextView[@text='${val}']
btn_LayoutCompatView            xpath   //android.support.v7.widget.LinearLayoutCompat[@index='1']/android.widget.TextView[@content-desc='${val}']
btn_MoreOptionOnFlashcard       xpath   //android.support.v7.widget.LinearLayoutCompat[@index='2']/..//android.widget.ImageView[@content-desc='${val}']
moreoptions_tools    xpath   //android.widget.LinearLayout/..//..//android.widget.TextView[contains(@resource-id,'title')][@text='${val}']
Add_FlashCardBar   xpath    //android.view.View[contains(@resource-id,'main_toolbar')]/..//android.widget.TextView[@text='${val}']
btn_edit_delete   xpath  //android.widget.LinearLayout/..//..//android.widget.TextView[contains(@resource-id,'title')][@text='${val}']
Front_Content     id     com.cengage.mobile.mindtap:id/et_add_edit_flashcard_front_content
Definition        id       com.cengage.mobile.mindtap:id/et_add_edit_flashcard_back_content
Save_button  id    com.cengage.mobile.mindtap:id/menu_action_save_flashcard
btn_Edit_Delete_FlashCard   id   com.cengage.mobile.mindtap:id/iv_flashcard_front_edit_delete_menu

btn_Edit_Delete   xpath  //android.widget.FrameLayout[contains(@resource-id,'fl_flashcards_back_card')]/..//android.widget.ImageView[contains(@resource-id,'iv_flashcard_back_edit_delete_menu')]

termtext                        xpath   //android.widget.FrameLayout[@index='0']//android.widget.ScrollView/android.widget.TextView[@clickable='true']
btn_NewCardOnFlashcard          xpath   //android.view.View/android.widget.TextView[@text='New Card']
txt_EditTextOnNewFlashcard      xpath   //android.widget.EditText[@text='${var}']
btn_nextButton                  xpath   //android.widget.Button[@text='Next']
btn_saveTextViewOnnewFlashcard  xpath   //android.support.v7.widget.LinearLayoutCompat[@index='2']/android.widget.TextView[contains(@text,'Save')]
btn_EditFlashcard               xpath   //android.support.v4.view.ViewPager[@index='1']//android.widget.ImageView[@content-desc='Edit Icon']
EditTermFlashcard               xpath   //android.support.v4.widget.DrawerLayout//android.widget.EditText[@index='0']
FlashCards_fromIndex            xpath	//android.widget.FrameLayout[contains(@index,'${val}')]//android.widget.TextView[contains(@resource-id,'tv_adapter_flashcards_mastered_cards')]
flashcards_icon                 xpath   //a[@id='app_view_flash_cards']
More_Icon                       xpath   //img[@alt="Expand Dock"]
Icon_FlashcardsOnWeb            xpath   //img[@class='icon' and @title='Flashcards']
select_FlashcardsMenuButton     xpath   //span[contains(@class,'ui-selectmenu-icon')]
List_FlashCardsChapter          xpath   //ul[contains(@class,'ui-selectmenu-menu-dropdown')]//li
tv_flashcards_got_it_tool_tip   id      com.cengage.mobile.mindtap:id/tv_flashcards_got_it_tool_tip
Flashcard_ChapterName          xpath    //android.widget.FrameLayout[contains(@index,'${val}')]//android.widget.TextView[contains(@resource-id,'tv_flashcard_deck_name')]
main_toolbar_Header  xpath   //android.view.View[contains(@resource-id,'main_toolbar')]/..//android.widget.TextView[contains(@text,'${val}')][@enabled ='true']
inputLayout_enter_passcode  xpath    //android.widget.LinearLayout[contains(@resource-id,'inputLayout_enter_passcode') and contains(@text,'${val}')]
et_enter_passcode            id      com.cengage.mobile.mindtap:id/et_enter_passcode
et_confirm_passcode          xpath   //android.widget.EditText[contains(@resource-id,'et_confirm_passcode')]
inputLayout_confirm_passcode  xpath  //android.widget.LinearLayout[contains(@resource-id,'inputLayout_confirm_passcode') and contains(@text,'${val}')]
progress_bar                xpath    //android.widget.ProgressBar[contains(@resource-id,'progress_bar')]
circleDisplay_percentage     id     com.cengage.mobile.mindtap:id/circleDisplay_percentage
action_bar_root              id     com.cengage.mobile.mindtap:id/action_bar_root
tv_gradebook_categories_title  xpath  //android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_title') and contains(@text,'${val}')]
recycler_view_gradebook     id      com.cengage.mobile.mindtap:id/recycler_view_gradebook
categories_OnGradebook      xpath   //android.support.v7.widget.RecyclerView[contains(@resource-id,'recycler_view_gradebook')]/android.widget.LinearLayout
tv_gradebook_categories_name  xpath  (//android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_name')])[${val}]
tv_gradebook_categories_weight xpath  //android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_weight')]
Overall_CategoryWeight         xpath  //android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_name') and contains(@text,'${val}')]/following-sibling::android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_weight')]
circle_display_gradebook_categories_percent_score  xpath  //android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_name') and contains(@text,'${val}')]/../following-sibling::android.view.View[contains(@resource-id,'circle_display_gradebook_categories_percent_score')]
tv_gradebook_points         xpath    //android.widget.TextView[contains(@resource-id,'tv_gradebook_points')]
tv_gradebook_categories_points  xpath  //android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_points')]
circleDisplay_percentage_categories  xpath  //android.view.View[contains(@resource-id,'circleDisplay_percentage_categories')]
recycler_view_gradebook_categories   xpath  //android.support.v7.widget.RecyclerView[contains(@resource-id,'recycler_view_gradebook_categories')]
Activities_UnderCategory       xpath        //android.support.v7.widget.RecyclerView[contains(@resource-id,'recycler_view_gradebook_categories')]/android.widget.LinearLayout
tv_gradebook_sub_categories_name   xpath  (//android.widget.TextView[contains(@resource-id,'tv_gradebook_sub_categories_name')])[${val}]
categories_name_GradebookPage xpath   //android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_name') and contains(@text,'${val}')]
tv_gb_activities_details_name      xpath  //android.widget.TextView[contains(@resource-id,'tv_gb_activities_details_name')]
ll_gradebook_activity_detail_grade  xpath  //android.widget.LinearLayout[contains(@resource-id,'ll_gradebook_activity_detail_grade')]
tv_gb_activities_percent_score     xpath  //android.widget.TextView[contains(@resource-id,'tv_gb_activities_percent_score')]
ll_gradebook_activity_detail_points  xpath //android.widget.LinearLayout[contains(@resource-id,'ll_gradebook_activity_detail_points')]
tv_gb_activities_details_points    xpath   //android.widget.TextView[contains(@resource-id,'tv_gb_activities_details_points')]
ll_gradebook_activity_detail_duedate xpath //android.widget.LinearLayout[contains(@resource-id,'ll_gradebook_activity_detail_duedate')]
tv_gb_activities_details_due_date   xpath  //android.widget.TextView[contains(@resource-id,'tv_gb_activities_details_due_date')]
tv_gradebook_activity_comment_section_title  xpath  //android.widget.TextView[contains(@resource-id,'tv_gradebook_activity_comment_section_title') and contains(@text,'${val}')]
tv_gradebook_activity_comment_description    xpath  //android.widget.TextView[contains(@resource-id,'tv_gradebook_activity_comment_description')]
tv_gradebook_activity_comment_title  xpath  //android.widget.TextView[contains(@resource-id,'tv_gradebook_activity_comment_title')]
tv_gradebook_activity_comment_description_index    xpath  (//android.widget.TextView[contains(@resource-id,'tv_gradebook_activity_comment_description')])[${val}] 
tv_gradebook_activity_comment_title_index  xpath  (//android.widget.TextView[contains(@resource-id,'tv_gradebook_activity_comment_title')])[${val}]
btn_Categorize                      xpath    //a[@class="topTab"]/div[@class="ng-binding" and text()="Categorize"]
toggle_btn_Off                      xpath    //span[contains(@class,'toggle-off') and @label="Category Weighting"]//span[@class="onoffswitch-switch"]
toogle_Button                       xpath   //span[contains(@class,'toggle-on') and @label="Category Weighting"]//span[@class="onoffswitch-switch"]
FirstCategory_categoryWeight          xpath   //div[@class="categoryWeightCol"]/input[@data-e2e-id="Category-1-Weight"]
SecondCategory_CategoryWeight        xpath   //div[@class="categoryWeightCol"]/input[@data-e2e-id="Category-2-Weight"]
btn_Save                            xpath   //button[@data-e2e-id="SaveButton"]
Message_recalculationOfGrades       xpath   //div[@class="modal-box"]/p[@class="detail ng-binding"]
btn_Continue                        xpath   //button[@data-e2e-id="RecalcContinueButton"]
gradebook_icon_on_web               xpath   //a[@id='app_viewProgress']
categories_On_Gradebook_Page        xpath   //android.widget.LinearLayout[@index=${val}]/android.widget.LinearLayout/android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_name')]
CategoryWeights_On_Gradebook_Page   xpath  //android.widget.LinearLayout[@index=${val}]/android.widget.LinearLayout/android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_weight')]
circleDisplayPercent_Category_On_Gradebook_Page  xpath  //android.view.View[contains(@resource-id,'circle_display_gradebook_categories_percent_score')]
Gradebook_OverviewTab_Web          xpath    //div[@data-e2e-id="OverviewTab"]
Gradebook_Activity_Web             xpath    //div[@class="ag-body-container"]/div[4]//span[@class="activity"]/following-sibling::span
Student_OverviewTab_ProgressApp    xpath    //div[contains(@class,'ag-cell-no-focus') and contains(.,'AutomationStudmobile')]
StudentName_ActivityModal          xpath    //h3[@data-e2e-id="CurrentModalTitle"]/span
ActivityDetailName_Modal           xpath    //div[@data-e2e-id="ActivityDetailName"]
ActivityDetailOpenDateSelect_Modal xpath    //button[@data-e2e-id="ActivityDetailOpenDateSelect"]
SelectDate                         xpath    //button[@data-e2e-class="DateButton"]/span[@class="ng-binding" and contains(.,'${val}')]
nextMonthIcon                      xpath    //button[contains(@class,'pull-right')]/i
DatePickerDoneButton               xpath    //button[@data-e2e-id="DatePickerDoneButton"]
EditScoreButton                    xpath    //button[@data-e2e-id="EditScoreButton"]
Score_Input                        xpath    //input[@data-e2e-id="PointsInput"]
PercentScore_Input                 xpath    //input[@ data-e2e-id="PercentInput"]
SaveScoreButton                    xpath    //button[@data-e2e-id="SaveScoreButton"]
WarningContinueButton              xpath    //button[@data-e2e-id="WarningContinueButton"]
RecordedScore_Details              xpath    //div[@data-e2e-id="RecordedScore"]/strong[${val}]
RemoveScoreLink                    xpath    //button[@data-e2e-id="RemoveScoreLink"]
CommentDescription_Duedate         xpath   //ul[@class="comments extensions"]/li[1]//strong[@data-e2e-class="CommentDescription"]
CommentText                        xpath   //ul[@class="comments extensions"]/li[1]//div[@data-e2e-class="CommentText"]
CommentDescription_Scorechange     xpath   //ul[@class="comments extensions"]/li[1]//div[@data-e2e-class="CommentDescription"]
AddCommentLink                     xpath   //a[@data-e2e-id="AddCommentLink"]
CommentInput_textarea              xpath   //textarea[@data-e2e-id="CommentInput"]
SaveCommentButton                  xpath  //button[@data-e2e-id="SaveCommentButton"]
EditCommentLink                    xpath  (//ul[@class="comments extensions"]//a[@data-e2e-id="EditCommentLink"])[1]
btn_confirm                        xpath  //button[text()="Confirm"]
txt_username                id   com.cengage.mobile.mindtap:id/et_login_email
txt_password                id   com.cengage.mobile.mindtap:id/et_login_password
btn_login                   id   com.cengage.mobile.mindtap:id/btn_login
cliebtLOGO                  xpath   //android.widget.ImageView[@index='0']
tv_login_forgot_password    id  com.cengage.mobile.mindtap:id/tv_login_forgot_password
snackbar_text   id         com.cengage.mobile.mindtap:id/snackbar_text
ImageOntheForgetPage    xpath    //android.widget.FrameLayout[contains(@resource-id,'content_container')]//android.widget.ImageView
et_forgotpassword_email id           com.cengage.mobile.mindtap:id/et_forgotpassword_email
btn_forgotpassword_submit   id  com.cengage.mobile.mindtap:id/btn_forgotpassword_submit
snackbar_action             id      com.cengage.mobile.mindtap:id/snackbar_action
message_NoActiveCourse      id       android:id/message
tv_login_info_message       id      com.cengage.mobile.mindtap:id/tv_login_info_message
iv_tour_screen_person       id      com.cengage.mobile.mindtap:id/iv_tour_screen_person
iv_tour_screen_icon         id      com.cengage.mobile.mindtap:id/iv_tour_screen_icon
tv_tour_screen_title       xpath   //android.widget.TextView[contains(@resource-id,'tv_tour_screen_title') and contains(@text,'${val}')]
tv_tour_screen_message     xpath   //android.widget.TextView[contains(@resource-id,'tv_tour_screen_message') and contains(@text,'${val}')]
ll_circleIndicators        xpath   //android.widget.LinearLayout[contains(@resource-id,'ll_circleIndicators')]/android.widget.ImageView[@index='${val}']
#web
email			id			email
fmPassword		id			fmPassword
Login 			xpath 				//a[text()='Log In']
openCoursesButton	xpath	//span[contains(text(),'Automation course 1')]/../..//a[text()='Open']
courseURL	id	courseURL
nb_toolbar	id		nb_toolbar
DateManagerView         xpath                //li[contains(@title,'Date Manager View')]
ListView                xpath                //li[@title="List View"]
AvailableDate           xpath                (//li[contains(@id,'lpn_dm_node') and not(contains(@class,'hidden'))]//img)[1]
DueDate                 xpath                (//li[contains(@id,'lpn_dm_node') and not(contains(@class,'hidden'))]//img)[2]
currentDate             xpath                //div[@id='ui-datepicker-div' and contains(@style,'display: block')]//a[contains(@class,'ui-state-highlight')]
dateToBeSelected        xpath                //div[@id='ui-datepicker-div' and contains(@style,'display: block')]//a[contains(@class,'ui-state-highlight')]/../following-sibling::td[3]
next_IconOnCalendar     xpath                //span[contains(@class,'ui-icon ui-icon-circle-triangle-e')]
Firstdate_NextMonth     xpath                (//div[@id='ui-datepicker-div' and contains(@style,'display: block')]//a[contains(@class,'ui-state-default')])[1]
button_DoneOnCalendar   xpath                //div[contains(@id,'ui-datepicker-div') and contains(@style,'display: block')]//button[text()='Done']
time_picker             xpath               //div[@class="ui_tpicker_hour_slider"]//select[@class="ui-timepicker-select"]
time_HourSlider         xpath               //div[@class="ui_tpicker_hour_slider"]//select[@class="ui-timepicker-select"]//option[contains(@value,'${val}')]
ActivityDueDate                      xpath               //a[contains(@class,'ui-state-default') and contains(@title,'${val}')]
Name_ActivityOnListView             xpath        (//div[contains(@class,'lpn_dm_activity_name')])[1]
DueMonth_Activity                   xpath        (//div[contains(@class,'lpn_dm_activity_endDate')]/a[contains(@class,' datemanageractivity_duedate')])[1]
ArtInStoneAge_DueDateButton         xpath        //div[@title="Chapter 1: Art in the Stone Age" and contains(@class,'lpn_dm_activity_name')]/../following-sibling::li[1]//img[contains(@class, 'datemanageractivity_enddate')]
AvailableDateButton_ArtInStoneAge   xpath        //div[@title="Chapter 1: Art in the Stone Age" and contains(@class, 'lpn_dm_activity_name')]/../following-sibling::li[1]//img[contains(@class, 'datemanager_selectdate')]
Reading_ActivityName                xpath         //div[@title='Chapter 1: Art in the Stone Age' and contains(@class,'lpn_dm_activity_name')]/../following-sibling::li[1]/div[1]
PronounceActivityName               xpath       //div[@title="Chapter 1 Pronunciation Test"]
activityToScroll                    xpath       //span[@title="Chapter 1 Pronunciation Test"]
PronounceActivity_DueDateButton     xpath       //div[@title="Chapter 1 Pronunciation Test"]/following-sibling::div[2]/img
UserName_Pronounce_web              xpath       //div[@data-e2e-class="StudentName" and text()="term, Med"]
Score_Activity_ProgressApp_Web                  xpath       //span[@title="Chapter 1 Pronunciation Test"]/ancestor::div[contains(@class,' ag-cell-no-focus')]/following-sibling::div[contains(@class,'ag-cell-value score')]
CountOfAttempts_Web                xpath       //span[@title="Chapter 1 Pronunciation Test"]/ancestor::div[contains(@class,' ag-cell-no-focus')]/following-sibling::div[contains(@class,'ag-cell-value submitted')]
StudentNameFilterInput            xpath        //input[@data-e2e-id="StudentNameFilterInput"]
Score_Activity_ListView_Web       xpath        //span[@title="Chapter 1 Pronunciation Test"]/ancestor::div[contains(@class,'lpn_cv_activity_name')]/span[contains(@class,'studentlist_score')]
textOnImage                                          xpath                   //android.widget.ImageView[@text='${val}']
recycler_view			                              id	                   com.cengage.mobile.mindtap:id/recycler_view
progress_bar_Notifications                            id                       com.cengage.mobile.mindtap.dev:id/progress_bar
messageNumber			                             xpath	                //android.support.v7.widget.RecyclerView[contains(@resource-id,'recycler_view')]/android.widget.LinearLayout[@index='${val}']
action_notification_delete	                          id	                   com.cengage.mobile.mindtap:id/action_notification_delete
tv_notification_details_content	                      id	                   com.cengage.mobile.mindtap:id/tv_notification_details_content
tv_notification_details_title	                      id	                   com.cengage.mobile.mindtap:id/tv_notification_details_title
tv_notification_details_date_time                     id	                   com.cengage.mobile.mindtap:id/tv_notification_details_date_time
iv_notification_details_category                      id	                   com.cengage.mobile.mindtap:id/iv_notification_details_category
progressbar_container	                              id	                   com.cengage.mobile.mindtap:id/progressbar_container
checkOnTheNotification                               xpath 	               //android.support.v7.widget.RecyclerView[contains(@resource-id,'recycler_view')]/android.widget.LinearLayout[@index='${val}']/android.widget.ImageView[contains(@resource-id,'iv_notification_status')]
checkGetNotifications                                xpath                 //android.widget.TextView[contains(@resource-id, 'tv_easy_notification_item')][contains(@text,'${val}')]                   
enable_GetNotification                               xpath                 //android.widget.Button[contains(@resource-id, 'btn_easy_notification_enable')][contains(@text,'${val}')]   
CheckBox_DoNotShowMeAgainMessage                    id             com.cengage.mobile.mindtap:id/cb_easy_notification_donot_show_again_message                                        
check_pleaseDontAskMeAgain                           xpath                 //android.widget.CheckBox[contains(@text,'${val}')]
txt_viewGetNotifications			                 xpath 	            //android.widget.TextView[contains(@text,'${val}')]
sidebarListView                                      xpath                 //android.widget.TextView[contains(@resource-id,'tv_dashboard_item_name')][@text='${val}'][@enabled ='true']
pushNotification                                     xpath                  //android.widget.TextView[contains(@resource-id,'tv_adapter_my_settings_item_name') and contains(@text,'Push Notifications')]
pushNotificationsTypes                               xpath                 //android.widget.TextView[contains(@resource-id,'title')and contains(@text,'${val}')]
pushNotificationsTypes_enable                        xpath                 (//android.widget.Switch[contains(@resource-id,'switchWidget') and contains(@text,'ON')])
Notifications_FrameLayout                            xpath          //android.widget.FrameLayout[contains(@resource-id,'content')]/../..//android.widget.FrameLayout[@index='0']
main_toolbar_Header                                  xpath   //android.view.View[contains(@resource-id,'main_toolbar')]/..//android.widget.TextView[contains(@text,'${val}')][@enabled ='true']
Notification_Msg                                   xpath        //android.widget.TextView[contains(@resource-id,'tv_notification_content') and @text='${val}']
content_container                                   id          com.cengage.mobile.mindtap:id/content_container
ButtonOnPage                      xpath   //android.widget.Button[contains(@text,'${val}')]
practice_quiz_score     xpath   //android.widget.TextView[contains(@text,'${val}')]/..//android.widget.TextView[contains(@resource-id,'tv_adapter_flashcards_practice_quiz_score')]
practice_quiz_Name      xpath   //android.widget.TextView[contains(@text,'${val}')]/..//android.widget.TextView[@index="1"][contains(@text,'Practice Quiz')]
tv_practice_quiz_progress   id  com.cengage.mobile.mindtap:id/tv_practice_quiz_progress
tv_practice_quiz_correct_answers_total  id  com.cengage.mobile.mindtap:id/tv_practice_quiz_correct_answers_total
tv_practice_quiz_question id  com.cengage.mobile.mindtap:id/tv_practice_quiz_question
ll_practice_quiz_option    id  com.cengage.mobile.mindtap:id/ll_practice_quiz_option_${val}
quiz_option_name    xpath  //android.widget.TextView[contains(@resource-id,'ll_practice_quiz_option_${val}')]/android.widget.TextView
iv_practice_quiz_option_image   id  com.cengage.mobile.mindtap:id/iv_practice_quiz_option_image
tv_practice_quiz_option   xpath   //android.widget.TextView[contains(@resource-id,'tv_practice_quiz_option')][contains(@text,'${val}')]
tv_flashcard_or_quiz_score_title      xpath  //android.widget.TextView[contains(@text,'${val}')]
tv_flashcard_or_quiz_score_mastered     id  com.cengage.mobile.mindtap:id/tv_practice_quiz_score_mastered
tv_flashcard_or_quiz_score_total_number_of_questions id      com.cengage.mobile.mindtap:id/tv_practice_quiz_score_total_number_of_questions
btn_practice_quiz_score_study_flashcards     id  com.cengage.mobile.mindtap:id/btn_practice_quiz_score_study_flashcards
btn_practice_quiz_score_take_practice_quiz  id       com.cengage.mobile.mindtap:id/btn_practice_quiz_score_take_practice_quiz
ActivitiesName_PronounceScreen  xpath   //android.widget.LinearLayout[@index='${val}']/android.widget.TextView[contains(@resource-id,'tv_activity_name')]
ActivitiesType_PronounceScreen   xpath //android.widget.LinearLayout[@index='${val}']/android.widget.TextView[contains(@resource-id,'tv_activity_status')]
InProgress_Attempt               xpath  //android.widget.TextView[contains(@resource-id,'tv_attempt_status') and @text="In Progress"]
Status_Attempt_InProgress        xpath  //android.widget.TextView[contains(@resource-id,'tv_attempt_status') and @text="In Progress"]/..//android.widget.LinearLayout/..//android.widget.LinearLayout/android.widget.TextView[contains(@resource-id,'tv_attempt_name')]
BackButton                       xpath     //android.widget.ImageButton[@content-desc='Navigate up']
Initial_AttemptScore               id       com.cengage.mobile.mindtap:id/tv_terms_list_attempt_score
Term_TermsScreen                 xpath    //android.widget.TextView[contains(@resource-id,'tv_adapter_terms_list_term_name')][@index='${val}']
termText	                  id	 com.cengage.mobile.mindtap:id/tv_terms_detail_term
Initial_ProgressBar_Term         xpath   //android.widget.SeekBar/following-sibling::android.view.View
termNumber	                 id	      com.cengage.mobile.mindtap:id/tv_terms_detail_selected_out_of
customized_seekbar_term_detail   id       com.cengage.mobile.mindtap:id/customized_seekbar_term_detail
microphoneButton                 id       com.cengage.mobile.mindtap:id/sdv_terms_detail_microphone
PressAndHoldToolTip              xpath    //android.widget.ImageView[contains(@resource-id,'iv_term_details_tool_tip')]
NextButton                       id         com.cengage.mobile.mindtap:id/btn_terms_detail_next
termPlayer	                 id	 com.cengage.mobile.mindtap:id/ib_terms_detail_speaker
termNarrator	                 id	 com.cengage.mobile.mindtap:id/ll_terms_detail_emphasize_text
termsdetailRecordingModeEar      id      com.cengage.mobile.mindtap:id/ib_terms_detail_recording_mode_ear
SubmitButton                     id        com.cengage.mobile.mindtap:id/btn_terms_list_screen_submit
SubmitScreenText                 id      com.cengage.mobile.mindtap:id/tv_submit_attempt_count_towards_grade
submitAttemptCancelButton        id      com.cengage.mobile.mindtap:id/tv_submit_attempt_cancel
submitAttemptScreenSubmit        id      com.cengage.mobile.mindtap:id/btn_submit_attempt_screen_submit
tv_submit_attempt_title          id      com.cengage.mobile.mindtap:id/tv_submit_attempt_title
circle_display_submit_attempt_score  id  com.cengage.mobile.mindtap:id/circle_display_submit_attempt_score
rl_terms_detail_record_mode      id      com.cengage.mobile.mindtap:id/rl_terms_detail_record_mode
termNarrator_text_Size           xpath    //android.view.View[contains(@resource-id,'ll_terms_detail_emphasize_text')]/android.widget.TextView
newAttempt                       id      com.cengage.mobile.mindtap:id/btn_new_attempt_attemptlist_screen
CountOfAttempts                  xpath  //android.support.v7.widget.RecyclerView[contains(@resource-id,'recycler_view')]/android.widget.LinearLayout
Attempt_Name                     xpath   //android.support.v7.widget.RecyclerView[contains(@resource-id,'recycler_view')]/android.widget.LinearLayout[@index='${val}']/android.widget.TextView[contains(@resource-id,'tv_attempt_name')]
Score_Attempts                   xpath //android.support.v7.widget.RecyclerView[contains(@resource-id,'recycler_view')]/android.widget.LinearLayout[@index='${val}']//android.widget.TextView[contains(@resource-id,'tv_attempt_score')]  
PronunciationActivityType        xpath   //android.widget.TextView[contains(@resource-id,'tv_activity_name') and contains(@text,'${val}')]/following-sibling::android.widget.TextView[contains(@resource-id,'tv_activity_status')]
simple_drawee_view_ebook_cover_page	id		com.cengage.mobile.mindtap:id/simple_drawee_view_ebook_cover_page
tv_ebook_title	id		com.cengage.mobile.mindtap:id/tv_ebook_title
tv_ebook_author	id		com.cengage.mobile.mindtap:id/tv_ebook_author
btn_ebook_download	id		com.cengage.mobile.mindtap:id/btn_ebook_download
alertTitle	id		com.cengage.mobile.mindtap:id/alertTitle
message	        id	android:id/message
button2	id		android:id/button2
button1	id		android:id/button1
btn_ebook_read	id		com.cengage.mobile.mindtap:id/btn_ebook_read
my_awesome_toolbar	id		com.cengage.mobile.mindtap:id/my_awesome_toolbar
body	id	android:id/body
progress	id		android:id/progress

tv_ebook_cancel_download	id		com.cengage.mobile.mindtap:id/tv_ebook_cancel_download
pb_ebook_download	id		com.cengage.mobile.mindtap:id/pb_ebook_download
tv_ebook_download_progress_message	id		com.cengage.mobile.mindtap:id/tv_ebook_download_progress_message

reader_toolbar    id     com.cengage.mobile.mindtap:id/reader_toolbar
search_button     id     com.cengage.mobile.mindtap:id/search_button 
dairy_icon        id     com.cengage.mobile.mindtap:id/action_inputs
font_icon  id  com.cengage.mobile.mindtap:id/action_accessibility
action_bookmark       id  com.cengage.mobile.mindtap:id/action_bookmark
appbar      id  com.cengage.mobile.mindtap:id/appbar
User_inputs_toolbar   xpath  //android.widget.LinearLayout[contains(@resource-id,'appbar')]/..//android.widget.TextView[@text='${val}']
user_inputs_message                     xpath   //android.widget.TextView[contains(@text,'${val}')]
navigate_back   xpath  //android.widget.LinearLayout[contains(@resource-id,'appbar')]/..//android.widget.ImageButton[@content-desc='Navigate up']
checkAlwaysOnReadControlPanel   xpath  //android.widget.LinearLayout/..//android.widget.TextView[contains(@resource-id,'text1')][@text='${val}']
btn_Always   xpath   //android.widget.Button[contains(@resource-id,'button_always')]
btn_Ok    xpath  //android.widget.Button[contains(@resource-id,'button1')]

seekBar      xpath   //android.widget.SeekBar[contains(@resource-id,'seekBar')]
font_spinner  id  com.cengage.mobile.mindtap:id/font_spinner
white_button  id  com.cengage.mobile.mindtap:id/white_button
sepia_button  id   com.cengage.mobile.mindtap:id/sepia_button
clear_button  id    com.cengage.mobile.mindtap:id/clear_button
page_mode_simple  id    com.cengage.mobile.mindtap:id/page_mode_simple
page_mode_double  id    com.cengage.mobile.mindtap:id/page_mode_double

snackbar_text	id		com.cengage.mobile.mindtap:id/snackbar_text
sidebar_icon    xpath         //android.widget.ImageButton[@content-desc='Navigate up']
sidebar_title_view  id     com.cengage.mobile.mindtap:id/sidebar_title_view
sidebar_cell_text_view   xpath  //android.widget.TextView[contains(@resource-id,'sidebar_cell_text_view')][@text='${val}']
nav_helper_bottom_right_icon  xpath  //android.widget.ImageView[contains(@resource-id,'nav_helper_bottom_right_icon')]
nav_helper_bottom_left_icon   xpath  //android.widget.ImageView[contains(@resource-id,'nav_helper_bottom_left_icon')]
nav_helper_text_left   xpath  //android.widget.LinearLayout[contains(@resource-id,'nav_helper_bottom_left')]//android.widget.TextView[contains(@resource-id,'nav_helper_text')]
nav_helper_text_right   xpath  //android.widget.LinearLayout[contains(@resource-id,'nav_helper_bottom_right')]/..//android.widget.TextView[contains(@resource-id,'nav_helper_text')]
user_inputs                             xpath   //android.widget.HorizontalScrollView[contains(@resource-id,'tabs')]//android.widget.TextView[@text='${val}']
title_RemoveEBook                       id     com.cengage.mobile.mindtap:id/title
search_Tab                              id     com.cengage.mobile.mindtap:id/search_src_text
search_close_btn                        id     com.cengage.mobile.mindtap:id/search_close_btn
MoreOptionImage                        xpath   //android.widget.ImageView[@content-desc='More options']  
iv_adapter_ebook_settings       id      com.cengage.mobile.mindtap:id/iv_adapter_ebook_settings
btn_DeleteEbook                 xpath   //android.widget.TextView[contains(@resource-id,'title') and contains(@text,'Delete')]
tv_adapter_ebook_title           id     com.cengage.mobile.mindtap:id/tv_adapter_ebook_title
adapter_my_settings_item_name   xpath   //android.widget.TextView[contains(@resource-id,'tv_adapter_my_settings_item_name')][@text='${val}']
tv_my_settings_versioncode      id      com.cengage.mobile.mindtap:id/tv_my_settings_versioncode
MoreOptionImage                 xpath   //android.widget.ImageView[@content-desc='More options']        
checkAlwaysOnControlPanel       xpath   //android.widget.TextView[contains(@text,'${val}')]/../../android.widget.LinearLayout[contains(@resource-id,'button_bar')]        
AndroidGmId                     xpath   //android.widget.MultiAutoCompleteTextView[@resource-id='com.google.android.gm:id/to']
subject                         id      com.google.android.gm:id/subject      
tv_adapter_my_settings_indicator xpath  //android.widget.TextView[contains(@resource-id,'tv_adapter_my_settings_indicator')]
Feedback_Survey_URL             id      com.android.chrome:id/url_bar
FAQ_Updates_2ndQues            xpath   //android.webkit.WebView/android.view.View[@index=2][@content-desc="${val}"]
FAQ_Updates_3ndAns             xpath   //android.webkit.WebView/android.view.View[@index=5][@content-desc="${val}"]
btn_CloseNavigateDrawer     xpath    //android.widget.ImageButton[@content-desc='Close navigation drawer']
btn_OpenNavigateDrawer      xpath    //android.widget.ImageButton[@content-desc='Open navigation drawer']
sidebarListView             xpath    //android.widget.TextView[contains(@resource-id,'tv_dashboard_item_name')and contains(@text,'${val}')][@enabled ='true']
single_course_name_on_header   xpath     //android.widget.TextView[@text='Automation course 1']
spinner_dashboard_course_items id        com.cengage.mobile.mindtap:id/spinner_dashboard_course_items
tab_CourseActivity          xpath  	 //android.view.View[@index='0']/android.widget.TextView[@text='${val}']
CourseOnDropDown    xpath   //android.widget.Spinner[contains(@resource-id,'spinner_dashboard_course_items')]/android.widget.TextView[contains(@text,'${val}')]
main_toolbar    xpath        //android.view.View[contains(@resource-id,'main_toolbar')]/android.widget.ImageButton[@enabled ='true'][@clickable='true'][@content-desc="Navigate up"]
sidebar_Item_Icon            id      com.cengage.mobile.mindtap:id/iv_dashboard_item_icon

Course_CheckedTextView  xpath     //android.widget.CheckedTextView[contains(@text,'${val}')]
imgTab						xpath	//android.widget.ImageView[@content-desc='${val}']
buttonTag					xpath	//android.widget.Button[@text='${val}']
textView_ImageOnSidebar     xpath   //android.widget.TextView[@text='${val}'][contains(@resource-id,'textView')]/../android.widget.ImageView
rv_notifications_list       id   com.cengage.mobile.mindtap:id/rv_notifications_list
activities_view             id  com.cengage.mobile.mindtap:id/activities_viewpager
rv_course_list              id  com.cengage.mobile.mindtap:id/rv_course_list
listViewOnMainMenu          xpath  //android.widget.TextView[contains(@resource-id,'tv_dashboard_item_name')and contains(@text,'${val}')][@enabled ='true']/..//android.widget.LinearLayout
installApp_Options     xpath     //android.widget.TextView[contains(@resource-id,'text1') and contains(@text,'${val}')]
PronounceTitle_OnPlayStore  xpath  //android.widget.TextView[contains(@resource-id,'title_title') and contains(@text,'MindTap Pronounce')]
MindTap_PronounceIcon       xpath  //android.widget.ImageView[contains(@resource-id,'title_thumbnail') and contains(@content-desc,'Image of app or game icon for MindTap Pronounce')]
InstallButton               xpath  //android.widget.Button[contains(@resource-id,'buy_button') and contains(@text,'INSTALL')]
Accept_button               xpath  //android.widget.Button[contains(@resource-id,'continue_button') and contains(@text,'ACCEPT')]
IconPronounce               xpath  //android.widget.ImageView[contains(@resource-id,'bucket_icon')]
progressbar                 xpath  //android.widget.ProgressBar[contains(@resource-id,'progress_bar')]
Open_Button                 xpath  //android.widget.Button[contains(@resource-id,'launch_button')
Logo_MindTapPronounce       xpath  //android.widget.ImageView[contains(@content-desc,'Image Description') and @index="0"]
CountOfCourses              xpath  //android.widget.ListView/android.widget.CheckedTextView[contains(@resource-id,'text1')]
NameOfCourses               xpath  (//android.widget.ListView/android.widget.CheckedTextView[contains(@resource-id,'text1')])[${val}]
btn_Always   xpath   //android.widget.Button[contains(@resource-id,'button_always')]
view_tab          xpath                  //li[contains(@title,'${val}')]
AddIcon           xpath                  //span[@class='lpn_create']
AddActivityIcon   xpath                  //ul[@class='menu' and contains(@style, 'display: block')]//a[text()='Add Activity']
Activity_FlashCards xpath                //h3[@id="Flashcards"]
FlashCards_List     xpath                //ul[contains(@class,'plain')]/li/input[@title=" "]
Flashcard_Chapter   xpath                (//ul[contains(@class,'plain')]/li/input)[1]
btn_Continue        xpath                //div[@class="buttons"]/input[@value="Continue"]
AvailableDateTextField  xpath            //input[@id="startDate"]
DueDateTextField        xpath            //input[@id="endDate"]
currentDate             xpath                //div[@id='ui-datepicker-div' and contains(@style,'display: block')]//a[contains(@class,'ui-state-highlight')]
time_picker             xpath               //div[@class="ui_tpicker_hour_slider"]//select[@class="ui-timepicker-select"]
time_HourSlider         xpath               //div[@class="ui_tpicker_hour_slider"]//select[@class="ui-timepicker-select"]//option[contains(@value,'${val}')]
button_DoneOnCalendar   xpath                //div[contains(@id,'ui-datepicker-div') and contains(@style,'display: block')]//button[text()='Done']
Location_Order_Picker   xpath                //a[@id="order-button"]/span[contains(@class,'ui-selectmenu-icon')]
Location_Order_List     xpath               //div[@class="order_select"]//select[@id="order"]/option[@value="0"]
selectPosition          xpath                //ul[@id='order-menu']//li['${position}']
dateToBeSelected        xpath               //div[@id='ui-datepicker-div' and contains(@style,'display: block')]//a[contains(@class,'ui-state-highlight')]/../following-sibling::td[3]
btn_Save                xpath               //div[@class="buttons"]//span[@id="init_save"]
ActivityDueDate         xpath               //a[@class="ui-state-default" and contains(@title,'${val}')]
selectMenu_Order        xpath               //label[text()='Order']/..//a
order                   css                    .ui-selectmenu-item-focus.ui-state-hover>a
option_dropdown			xpath				//ul[@id="order-menu"]//li[2]//a
Activities_List         xpath               //div[@class="lpn_thumbTitle"]
List_EditButton         xpath               //div[@class="lpn_thumbTitle"]//following-sibling::div[@class="nb_edit"]//a[contains(@class,'buttonsejs_edit')]
edit_ButtonForActivity  xpath              (//div[@class="lpn_thumbTitle"]//following-sibling::div[@class="nb_edit"]//a[contains(@class,'buttonsejs_edit')])[1]
FirstActivityByIndex    xpath              (//div[@class='lpn_thumbTitle'])[1]
NameOfFirstactivtyByIndex  xpath           (//div[@class='lpn_thumbTitle'])[1]/h3/a
DescriptionOfFirstActivity  xpath           (//span[@class="lpn_description"])[1]
title_Activity          xpath              //form[@class="adminForm"]//input[@id="name"]
DescriptionActivity     xpath              //form[@class="adminForm"]//textarea[@id="description"]
flashcards_icon         xpath              //a[@id='app_view_flash_cards']
createAcard_Button      xpath               //div[@class='cardnav']//following-sibling::div[@class='co txtC']//input[contains(@id,'create-card')]
flashcard_bar           xpath               //input[@id='create_term_id']
flashcard_detail_bar    xpath              //textarea[@id='create_def_id']
save_button             xpath              //button[@id='card-form-save']
edit_button             xpath              (//a[@class='editcustomcard'])[1]
delete_this_card_button    xpath            //button[@id='card-form-delete']
SecondActivityByIndex      xpath           (//div[@class='lpn_thumbTitle'])[2]
NameOfSecondactivtyByIndex  xpath          (//div[@class='lpn_thumbTitle'])[2]/h3/a
hide_buttonForActivity     xpath            (//img[@class='hide buttonsejs_hide'])[2]
chapter1_activity          xpath            //*[contains(text(),'Chapter 1: Art in the Stone Age')] 
quiz_click                 xpath             (//h3[@class='lpn_name group'])[4] 
countTowardsGrade          xpath               //img[@class='gradeIcon submissioninfoejs_grade']
practice                   xpath               (//img[@class='gradeIcon submissioninfoejs_practice'])[5]
hoverChapterQuiz1          xpath              (//div[@class='lpn_thumbTitle'])[28]
quizEditClickButton        xpath            (//a[@class='buttons_editHover ui-button clui-edit buttonsejs_edit' and contains(@title,'Edit')])[28]
EditOptionsButton      xpath                //div[@class="snap"]/input[@value="Edit Options"] 
practiceCheck             xpath              (//input[@value="on"])[1]
doneButton                 xpath               //input[@id='doneButton']
saveQuizButton             xpath                //span[@id='init_save']         
expanded_folders	 xpath				//div[contains(@class,'lpn_group_expanded')]
activity_details_save_frame       xpath          //div[contains(@class,'form_area lpn_form mxui_layout_modal nb_math')]
practice                   xpath               (//img[@class='gradeIcon submissioninfoejs_practice'])[5]
CountOfTotalFlashcards     xpath            (//span[@class="cardcount-count"]/span[@aria-hidden="true"])[2]
FlashcardCount_OnAddingAFlashcard    xpath  (//span[@class="cardcount-count"]/span[@aria-hidden="true"])[1]
QuizTypeActivityOnLPn     xpath        //div[contains(@class,'lpn_manager')]/div[contains(@class,'scroll_area')]
EmailIdForInstructorLogin xpath        //form[@id="loginFormId"]/input[@id="emailId"]
PasswordIdForInstructorLogin xpath     //form[@id="loginFormId"]/input[@id="password"]
SignInbtn                    xpath     //form[@id="loginFormId"]/input[@type="submit"]
btn_CreateCourse             xpath     //a[@class="greenBtn"]
Header_CreateCourse          xpath     //div[@id="columnMain"]/h3
radioBtn_CreateNewCourse     xpath     //div/input[@id="createNewCourse"]
radiobtn_CopyAnExistingCourse xpath    //div/input[@id="copyExistingCourse"]
ContinueBtnForCreateNewCourse xpath    //a[@onclick="submitForm();"]
NewCourse_bookTitle           xpath    //div[@class="bookDetails"]/h3
Activityname_ActivityModal_UnitView   xpath  //form[@class="adminForm"]//h3[@class="formtext"]
CourseNameField               xpath    //input[@id="courseName"]
BeginDate_Course              xpath    //label[@for="beginDate"]/following-sibling::input[@id="beginDate"]
EndDate_Course                xpath    //label[@for="endDate"]/following-sibling::input[@id="endDate"]
CreateCoursebtn_OnCoursedetailPage   xpath    //div[@class="btns_lt"]/a[@onclick="showWait();submitForm();"]
Message_CourseCreated         xpath     //div[@id="create_Course"]/h1
StudentRegistrationUrl        xpath    (//p[@class="distributionOptions"]/a)[1]
CourseKey_NewCourse           xpath    //p[@class="distributionOptions"]/strong[text()="Course Key:"]
Student_EmailIdField          xpath    (//span[@class="input-group-addon"]/following-sibling::input[@id="email"])[1]
PasswordField_Student         xpath    //span[@class="input-group-addon"]/following-sibling::input[@id="fmPassword"]
LoginBtn                      xpath    //a[@onclick="login()"]
temporaryAccess_btn           xpath    //a[text()="Start Temporary Access"]
NameOfCourseOnMyHomePage      xpath    //p[@class="splash_snapInfo"]/span
DropDown_Selctcourse          xpath    //div[@id="courses"]/select[@id="select_location"]
ExistingCourse                xpath    //option[contains(text(),'${val}')]
Enter_btn                     xpath    //input[@id="nb_enter"]
CoureNameOnStudentDashBoard   xpath    //div[@class="courseDetails"]/h1
More_Icon                     xpath   //img[@alt="Expand Dock"]
selectButton_FlashcardChapter xpath    //a[@id="select_chapter-button"]/span[contains(@class,'ui-selectmenu-icon')]
FlashcardChapter              xpath     (//ul[@id="select_chapter-menu"]/li)[2]
TextArea_SendNotificationMsg  xpath    //form[@class="send_message"]/textarea[@id="message"]
btn_message_submit            xpath   //input[@id="message_submit"]
messagetext                   xpath   (//div[@class="messagetext"])[1]
AnchorText                    xpath   //a[contains(text(),'${val}')]
PronounceUnit                 xpath   //a[contains(text(),'${val}')]/ancestor::div[contains(@class,'lpn_thumbTitle')]
ActivityAtFirstLocation       xpath   (//h3[@class="lpn_name"]/a)[1]
NavLink_Web                   xpath   //a[@class="navLink"]
EditButton_HoverActivity      xpath   //div[@class="nb_edit" and @style="display: block;"]//img[@alt="Edit"]
InputTitle_Activity           xpath   //input[@id="txtTitle"]
selectGradeavleButton         xpath   //select[@id="selGradeable"]
selectGradeableOption         xpath   //select[@id="selGradeable"]/option[@value='${val}']
Btn_Update                    xpath   //input[@id="editUpdate"]


==============================================================================================


