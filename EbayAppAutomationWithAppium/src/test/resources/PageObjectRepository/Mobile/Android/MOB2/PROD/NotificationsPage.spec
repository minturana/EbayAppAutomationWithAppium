NotificationsPage



#Object Definitions
==============================================================================================
textOnPage                                           xpath                   //android.widget.TextView[@text='${val}']
textOnButton                                         xpath                   //android.widget.Button[@text='${val}']
textOnImage                                          xpath                   //android.widget.ImageView[@text='${val}']
CengageSpinner                                       xpath      			//android.widget.ProgressBar[contains(@resource-id,'progress_bar')]
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
CheckBox_DoNotShowMeAgainMessage                      id                  com.cengage.mobile.mindtap:id/cb_easy_notification_donot_show_again_message                                        
check_pleaseDontAskMeAgain                           xpath                 //android.widget.CheckBox[contains(@text,'${val}')]
txt_viewGetNotifications			                 xpath 	            //android.widget.TextView[contains(@text,'${val}')]
sidebarListView                                      xpath                 //android.widget.TextView[contains(@resource-id,'tv_dashboard_item_name')][@text='${val}'][@enabled ='true']
pushNotification                                     xpath                  //android.widget.TextView[contains(@resource-id,'tv_adapter_my_settings_item_name') and contains(@text,'Push Notifications')]
pushNotificationsTypes                               xpath                 //android.widget.TextView[contains(@resource-id,'title')and contains(@text,'${val}')]
pushNotificationsTypes_enable                        xpath                  (//android.widget.Switch[contains(@resource-id,'switchWidget') and contains(@text,'ON')])
Notifications_FrameLayout                            xpath               //android.widget.FrameLayout[contains(@resource-id,'content')]/../..//android.widget.FrameLayout[@index='0']
main_toolbar_Header                                  xpath               //android.view.View[contains(@resource-id,'main_toolbar')]/..//android.widget.TextView[contains(@text,'${val}')][@enabled ='true']
main_toolbar_image_Header                            xpath              //android.view.View[contains(@resource-id,'main_toolbar')]/android.widget.ImageButton[@content-desc='${val}'][@enabled ='true']
Notification_Msg                                     xpath              //android.widget.TextView[contains(@resource-id,'tv_notification_content') and @text='${val}']
content_container                                     id                com.cengage.mobile.mindtap:id/content_container
==============================================================================================
