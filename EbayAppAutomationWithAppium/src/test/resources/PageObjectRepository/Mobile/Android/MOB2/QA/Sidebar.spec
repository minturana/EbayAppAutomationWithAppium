****************************Sidebar****************************

#Object Definitions
==============================================================================================
textOnPage                  xpath    //android.widget.TextView[@text='${val}']
btn_CloseNavigateDrawer     xpath    //android.widget.ImageButton[@content-desc='Close navigation drawer']
btn_OpenNavigateDrawer      xpath    //android.widget.ImageButton[@content-desc='Open navigation drawer']
sidebarListView             xpath    //android.widget.TextView[contains(@resource-id,'tv_dashboard_item_name')and contains(@text,'${val}')][@enabled ='true']
single_course_name_on_header   xpath     //android.widget.TextView[@text='Automation course 1']
spinner_dashboard_course_items id        com.cengage.mobile.mindtap.dev:id/spinner_dashboard_course_items
tab_CourseActivity          xpath  	 //android.view.View[@index='0']/android.widget.TextView[@text='${val}']
CourseOnDropDown    xpath   //android.widget.Spinner[contains(@resource-id,'spinner_dashboard_course_items')]/android.widget.TextView[contains(@text,'${val}')]
main_toolbar    xpath        //android.view.View[contains(@resource-id,'main_toolbar')]/android.widget.ImageButton[@enabled ='true']
AboveVersion6_main_toolbar  xpath  //android.view.ViewGroup[contains(@resource-id,'main_toolbar')]/android.widget.ImageButton[@enabled ='true']
sidebar_Item_Icon            id      com.cengage.mobile.mindtap.dev:id/iv_dashboard_item_icon
Course_CheckedTextView  xpath     //android.widget.CheckedTextView[contains(@text,'${val}')]
imgTab						xpath	//android.widget.ImageView[@content-desc='${val}']
buttonTag					xpath	//android.widget.Button[@text='${val}']
textView_ImageOnSidebar     xpath   //android.widget.TextView[@text='${val}'][contains(@resource-id,'textView')]/../android.widget.ImageView
rv_notifications_list       id   com.cengage.mobile.mindtap.dev:id/rv_notifications_list
activities_view             id  com.cengage.mobile.mindtap.dev:id/activities_viewpager
rv_course_list              id  com.cengage.mobile.mindtap.dev:id/rv_course_list
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
==============================================================================================
