SettingsPage


#Object Definitions
==============================================================================================
textOnPage                      xpath   //android.widget.TextView[@text='${val}']
CengageSpinner              xpath      //android.widget.ProgressBar[contains(@resource-id,'progress_bar')]
textOnButton                    xpath   //android.widget.Button[@text='${val}']
textOnImage                     xpath   /android.widget.ImageView[@text='${val}']
adapter_my_settings_item_name   xpath   //android.widget.TextView[contains(@resource-id,'tv_adapter_my_settings_item_name')][@text='${val}']
tv_my_settings_versioncode      id      com.cengage.mobile.mindtap.dev:id/tv_my_settings_versioncode
MoreOptionImage                 xpath   //android.widget.ImageView[@content-desc='More options']        
checkAlwaysOnControlPanel       xpath   //android.widget.TextView[contains(@text,'${val}')]/../../android.widget.LinearLayout[@resource-id='android:id/button_bar']        
AndroidGmId                     xpath   //android.widget.MultiAutoCompleteTextView[@resource-id='com.google.android.gm:id/to']
subject                         id      com.google.android.gm:id/subject      
tv_adapter_my_settings_indicator xpath  //android.widget.TextView[contains(@resource-id,'tv_adapter_my_settings_indicator')]
button_MySettings               id      com.cengage.mobile.mindtap.dev:id/tv_view_course_not_found_my_settings
FAQ_Updates_2ndQues            xpath   //android.webkit.WebView/android.view.View[@index=2][@content-desc="${val}"]
FAQ_Updates_3ndAns             xpath   //android.webkit.WebView/android.view.View[@index=5][@content-desc="${val}"]
==============================================================================================
