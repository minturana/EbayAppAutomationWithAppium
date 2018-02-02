activityPage



#Object Definitions
==============================================================================================
textOnPage                  xpath       //android.widget.TextView[@text='${val}']
ActivityOnPage              xpath       //android.widget.TextView[contains(@text,'${val}')]
CengageSpinner              xpath       //android.widget.ProgressBar[contains(@resource-id,'progress_bar')]
main_toolbar_Header         xpath       //android.view.View[contains(@resource-id,'main_toolbar')]/..//android.widget.TextView[contains(@text,'${val}')][@enabled ='true']
AboveVersion6_main_toolbar_Header      xpath      //android.view.ViewGroup[contains(@resource-id,'main_toolbar')]/..//android.widget.TextView[contains(@text,'${val}')][@enabled ='true']
main_toolbar_image_Header   xpath      //android.view.View[contains(@resource-id,'main_toolbar')]/android.widget.ImageButton[@content-desc='${val}'][@enabled ='true']
tv_week_name                xpath      //android.widget.TextView[contains(@resource-id,'tv_week_name')][@text='${val}'][@enabled ='true']
action_view_calendar        id         com.cengage.mobile.mindtap.dev:id/action_view_calendar
view_calendar_Header        xpath      //android.widget.FrameLayout[@index='0']/android.widget.TextView[@text='${val}']
tab_user_activities         xpath      //android.widget.HorizontalScrollView[contains(@resource-id,'tab_user_activities')]/..//android.widget.TextView[@text='${val}']
tv_activity_due_date        id 	      com.cengage.mobile.mindtap.dev:id/tv_activity_due_date
tv_activity_available_date  id        com.cengage.mobile.mindtap.dev:id/tv_activity_available_date
action_today		    id	      com.cengage.mobile.mindtap.dev:id/action_today
calendar_month_year_textview id	      com.cengage.mobile.mindtap.dev:id/calendar_month_year_textview
tv_custom_calendar_date	    xpath	(//android.widget.TextView[contains(@resource-id,'tv_custom_calendar_date')][@text='${val}'])[1]
tv_learning_path_node_title  xpath   //android.widget.TextView[contains(@resource-id,'tv_learning_path_node_title')]
ll_adapter_week_view_user_activity_layout  id   com.cengage.mobile.mindtap.dev:id/ll_adapter_week_view_user_activity_layout
ActivityName_WeekView       xpath      //android.widget.TextView[contains(@resource-id,'tv_activity_name')]
FirstActivityName_WeekView  xpath            (//android.widget.TextView[contains(@resource-id,'tv_activity_name')])[1]
ActivityTitle               xpath            android.widget.LinearLayout[contains(@index,'${val}')]/../..//android.widget.TextView[contains(@text,'${val})]
tv_activity_name            id         com.cengage.mobile.mindtap.dev:id/tv_activity_name
Month_Activity              xpath      //android.widget.TextView[contains(@resource-id,'tv_month_short_name')]
activityMonth_Index         xpath      (//android.widget.TextView[contains(@resource-id,'tv_month_short_name')])[1]
tv_month_short_name         id         com.cengage.mobile.mindtap.dev:id/tv_month_short_name
dateList_Activities         xpath      //android.widget.TextView[contains(@resource-id,'tv_date')]
date_Activity               xpath           //android.widget.TextView[@text='${val}']/../..//android.widget.LinearLayout[contains(@resource-id,'ll_adapter_week_view_user_activity_layout')]//android.widget.TextView[contains(@resource-id,'tv_date)]
tv_date                     id               com.cengage.mobile.mindtap.dev:id/tv_date
activity_tileOnActivityDetailPage  id        com.cengage.mobile.mindtap.dev:id/tv_activity_title
tv_activity_type            id               com.cengage.mobile.mindtap.dev:id/tv_activity_type	
tv_activity_reminder_date   id               com.cengage.mobile.mindtap.dev:id/tv_activity_reminder_date
sw_activity_reminder_switch id               com.cengage.mobile.mindtap.dev:id/sw_activity_reminder_switch
alertTitle                  id               com.cengage.mobile.mindtap.dev:id/alertTitle
day_Duedate                 id               com.cengage.mobile.mindtap.dev:id/day
Hour_DueDate                id               com.cengage.mobile.mindtap.dev:id/hour
Mins_DueDate                id               com.cengage.mobile.mindtap.dev:id/mins
AmPm_DueDate                id               com.cengage.mobile.mindtap.dev:id/ampm
btn_DueDateReminderAlert    xpath            //android.widget.Button[contains(@text,'${val}')]
ll_adapter_user_activities_layout  id        com.cengage.mobile.mindtap.dev:id/ll_adapter_user_activities_layout
tv_adapter_user_activities_activity_name  id  com.cengage.mobile.mindtap.dev:id/tv_adapter_user_activities_activity_name
tv_adapter_week_view_week_name      xpath     //android.widget.TextView[contains(@resource-id,'tv_adapter_week_view_week_name')][@text='${val}']
btn_activity_launch_mt_pronounce    xpath     //android.widget.Button[contains(@resource-id,'btn_activity_launch_mt_pronounce')][contains(@text,'${val}')]
spinner_OnActivitiesScreen           id       com.cengage.mobile.mindtap.dev:id/progress_bar
Refreshed_Spinner                    xpath    //android.widget.ImageView[@bounds=[320,326][400,406]]
Activities_Weekview                  xpath    //android.widget.LinearLayout[contains(@resource-id,'ll_adapter_week_view_user_activity_layout')
Status_Activity                       id       com.cengage.mobile.mindtap.dev:id/tv_activity_status
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

==============================================================================================

