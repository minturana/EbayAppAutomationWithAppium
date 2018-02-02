CourseInfo


#Object Definitions
==============================================================================================
textOnPage                          xpath    //android.widget.TextView[@text='${val}']
tv_adapter_course_list_title        xpath    //android.widget.TextView[contains(@resource-id,'tv_adapter_course_list_title')][@text='${val}']
iv_adapter_course_list_book_cover   xpath   //android.widget.TextView[contains(@resource-id,'tv_adapter_course_list_title')][@text='${val}']/../../android.widget.ImageView[contains(@resource-id,'iv_adapter_course_list_book_cover')]
courseInfo                          xpath   //android.widget.TextView[@text='${val}']/../android.widget.TextView[@text='#{val}']    
tv_course_expire_warning_message    xpath   //android.widget.LinearLayout[contains(@resource-id,'ll_adapter_course_list_layout')][@text='${val}']/../../..//android.widget.TextView[contains(@resource-id,'tv_course_expire_warning_message')][@text='${val}']

tv_course_Chapter_Name              xpath   //android.widget.LinearLayout/../..//android.widget.TextView[contains(@resource-id,'tv_adapter_course_list_title')][@text='${val}']
course_expireMessage       xpath    //android.widget.TextView[contains[@resource-id,'tv_course_expire_warning_message') and contains(@text,'${val}')]
slideBarNameAndIndicator            xpath   //android.widget.TextView[@text='${val}']/../android.widget.TextView[@resource-id='com.cengage.mobile.mindtap.dev:id/indicator']
slideBarNameAndIcon                 xpath   //android.widget.TextView[@text='${val}']/../android.widget.ImageView[@resource-id='com.cengage.mobile.mindtap.dev:id/imageView']
TemporaryAccessBar                  xpath   //android.widget.LinearLayout//android.widget.TextView[@resource-id='com.cengage.mobile.mindtap.dev:id/tv_course_warning_message']
main_toolbar_Text                   xpath   //android.view.View[contains(@resource-id,'id/main_toolbar')]/android.widget.TextView[@index='1'][@text='${val}']
MindTapImageOnLayOut                xpath   //android.widget.LinearLayout[@index='0']/android.widget.ImageView[@content-desc='Image Content Description']
btn_register                        id      com.cengage.mobile.mindtap.dev:id/btn_register
section_info                        xpath   //android.widget.TextView[@text='${val}']/../android.widget.TextView[contains(@resource-id,'id/section_info')]
getIndexValue                       xpath   //android.widget.TextView[@text='${val}']/preceding-sibling::android.widget.LinearLayout[contains(@resource-id,'course_trial_period_warning_message']//android.widget.LinearLayout[contains(@resource-id,'course_warning_message')]
tv_course_warning_message           xpath   //android.widget.LinearLayout['${val}'][contains(@resource-id,'ll_course_trial_period_warning_message')]//android.widget.TextView[contains(@resource-id,'tv_course_warning_message']
==============================================================================================
