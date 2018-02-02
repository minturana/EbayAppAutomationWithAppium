Pronounce


#Object Definitions
==============================================================================================
textOnPage                       xpath   	//android.widget.TextView[contains(@text,'${val}')]
textOnButton                     xpath   	//android.widget.Button[contains(@text,'${val}')]
textOnImage                      xpath   	//android.widget.ImageView[@text='${val}']
CengageSpinner                   xpath      //android.widget.ProgressBar[contains(@resource-id,'progress_bar')]
ActivitiesName_PronounceScreen   xpath   	//android.widget.LinearLayout[@index='${val}']/android.widget.TextView[contains(@resource-id,'tv_activity_name')]
ActivitiesType_PronounceScreen   xpath 		//android.widget.LinearLayout[@index='${val}']/android.widget.TextView[contains(@resource-id,'tv_activity_status')]
InProgress_Attempt               xpath  	//android.widget.TextView[contains(@resource-id,'tv_attempt_status') and @text="In Progress"]
Status_Attempt_InProgress        xpath  	//android.widget.TextView[contains(@resource-id,'tv_attempt_status') and @text="In Progress"]/..//android.widget.LinearLayout/..//android.widget.LinearLayout/android.widget.TextView[contains(@resource-id,'tv_attempt_name')]
BackButton                       xpath     	//android.widget.ImageButton[@content-desc='Navigate up']
Initial_AttemptScore             id       	com.cengage.mobile.mindtap:id/tv_terms_list_attempt_score
Term_TermsScreen                 xpath    	//android.widget.TextView[contains(@resource-id,'tv_adapter_terms_list_term_name')][@index='${val}']
termText	                     id	 		com.cengage.mobile.mindtap:id/tv_terms_detail_term
Initial_ProgressBar_Term         xpath   	//android.widget.SeekBar/following-sibling::android.view.View
termNumber	                     id	      	com.cengage.mobile.mindtap:id/tv_terms_detail_selected_out_of
customized_seekbar_term_detail   id       	com.cengage.mobile.mindtap:id/customized_seekbar_term_detail
microphoneButton                 id       	com.cengage.mobile.mindtap:id/sdv_terms_detail_microphone
PressAndHoldToolTip              xpath    	//android.widget.ImageView[contains(@resource-id,'iv_term_details_tool_tip')]
NextButton                       id         com.cengage.mobile.mindtap:id/btn_terms_detail_next
termPlayer	                     id	 		com.cengage.mobile.mindtap:id/ib_terms_detail_speaker
termNarrator	                 id	 		com.cengage.mobile.mindtap:id/ll_terms_detail_emphasize_text
termsdetailRecordingModeEar      id      	com.cengage.mobile.mindtap:id/ib_terms_detail_recording_mode_ear
SubmitButton                     id        	com.cengage.mobile.mindtap:id/btn_terms_list_screen_submit
SubmitScreenText                 id      	com.cengage.mobile.mindtap:id/tv_submit_attempt_count_towards_grade
submitAttemptCancelButton        id      	com.cengage.mobile.mindtap:id/tv_submit_attempt_cancel
submitAttemptScreenSubmit        id      	com.cengage.mobile.mindtap:id/btn_submit_attempt_screen_submit
tv_submit_attempt_title          id      	com.cengage.mobile.mindtap:id/tv_submit_attempt_title
circle_display_submit_attempt_score  id  	com.cengage.mobile.mindtap:id/circle_display_submit_attempt_score
rl_terms_detail_record_mode      id      	com.cengage.mobile.mindtap:id/rl_terms_detail_record_mode
termNarrator_text_Size           xpath    	//android.view.View[contains(@resource-id,'ll_terms_detail_emphasize_text')]/android.widget.TextView
newAttempt                       id      	com.cengage.mobile.mindtap:id/btn_new_attempt_attemptlist_screen
CountOfAttempts                  xpath  	//android.support.v7.widget.RecyclerView[contains(@resource-id,'recycler_view')]/android.widget.LinearLayout
Attempt_Name                     xpath   	//android.support.v7.widget.RecyclerView[contains(@resource-id,'recycler_view')]/android.widget.LinearLayout[@index='${val}']/android.widget.TextView[contains(@resource-id,'tv_attempt_name')]
Score_Attempts                   xpath 		//android.support.v7.widget.RecyclerView[contains(@resource-id,'recycler_view')]/android.widget.LinearLayout[@index='${val}']//android.widget.TextView[contains(@resource-id,'tv_attempt_score')]  
PronunciationActivityType        xpath   	//android.widget.TextView[contains(@resource-id,'tv_activity_name') and contains(@text,'${val}')]/following-sibling::android.widget.TextView[contains(@resource-id,'tv_activity_status')]
listOfActivities                 xpath      //android.support.v7.widget.RecyclerView[contains(@resource-id,'recycler_view')]
