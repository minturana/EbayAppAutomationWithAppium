SettingsPage


#Object Definitions
==============================================================================================
textOnPage                        xpath   		//android.widget.TextView[contains(@text,'${val}')]
CengageSpinner                    xpath      	//android.widget.ProgressBar[contains(@resource-id,'progress_bar')]
textOnButton                      xpath   		//android.widget.Button[contains(@text,'${val}')]
textOnImage                       xpath   		//android.widget.ImageView[@text='${val}']
adapter_my_settings_item_name     xpath  		//android.widget.TextView[contains(@resource-id,'tv_adapter_my_settings_item_name')][@text='${val}']
tv_my_settings_versioncode        id      		com.cengage.mobile.mindtap:id/tv_my_settings_versioncode
MoreOptionImage                   xpath   		//android.widget.ImageView[@content-desc='More options']        
checkAlwaysOnControlPanel         xpath   		//android.widget.TextView[contains(@text,'${val}')]/../../android.widget.LinearLayout[contains(@resource-id,'button_bar')]        
AndroidGmId                       xpath   		//android.widget.MultiAutoCompleteTextView[@resource-id='com.google.android.gm:id/to']
subject                           id      		com.google.android.gm:id/subject      
tv_adapter_my_settings_indicator  xpath  		//android.widget.TextView[contains(@resource-id,'tv_adapter_my_settings_indicator')]
Feedback_Survey_URL               id      		com.android.chrome:id/url_bar
FAQ_Updates_2ndQues               xpath   		//android.view.View[@index=2][@content-desc="${val}"]
FAQ_Updates_3rdAns                xpath   		//android.view.View[@index=5][@content-desc="${val}"]

==============================================================================================
