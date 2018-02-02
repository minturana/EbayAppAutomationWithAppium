****************************Gradebook****************************

#Object Definitions
==============================================================================================
textOnPage                          					xpath    //android.widget.TextView[@text='${val}']
main_toolbar_Header                 					xpath    //android.view.View[contains(@resource-id,'main_toolbar')]/..//android.widget.TextView[contains(@text,'${val}')][@enabled ='true']
CengageSpinner                      					xpath    //android.widget.ProgressBar[contains(@resource-id,'progress_bar')]bar')]/..//android.widget.TextView[contains(@text,'${val}')][@enabled ='true']
inputLayout_enter_passcode  							xpath    //android.widget.LinearLayout[contains(@resource-id,'inputLayout_enter_passcode') and contains(@text,'${val}')]
et_enter_passcode            							id       com.cengage.mobile.mindtap:id/et_enter_passcode
et_confirm_passcode          							xpath    //android.widget.EditText[contains(@resource-id,'et_confirm_passcode')]
inputLayout_confirm_passcode  							xpath    //android.widget.LinearLayout[contains(@resource-id,'inputLayout_confirm_passcode') and contains(@text,'${val}')]
progress_bar                							xpath    //android.widget.ProgressBar[contains(@resource-id,'progress_bar')]
circleDisplay_percentage     							id       com.cengage.mobile.mindtap:id/circleDisplay_percentage
action_bar_root              							id       com.cengage.mobile.mindtap:id/action_bar_root
tv_gradebook_categories_title  							xpath    //android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_title') and contains(@text,'${val}')]
recycler_view_gradebook     							id       com.cengage.mobile.mindtap:id/recycler_view_gradebook
categories_OnGradebook      							xpath    //android.support.v7.widget.RecyclerView[contains(@resource-id,'recycler_view_gradebook')]/android.widget.LinearLayout
tv_gradebook_categories_name  							xpath    (//android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_name')])[${val}]
tv_gradebook_categories_weight 							xpath    //android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_weight')]
Overall_CategoryWeight         							xpath    //android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_name') and contains(@text,'${val}')]/following-sibling::android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_weight')]
circle_display_gradebook_categories_percent_score  		xpath    //android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_name') and contains(@text,'${val}')]/../following-sibling::android.view.View[contains(@resource-id,'circle_display_gradebook_categories_percent_score')]
tv_gradebook_points         							xpath    //android.widget.TextView[contains(@resource-id,'tv_gradebook_points')]
tv_gradebook_categories_points  						xpath    //android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_points')]
circleDisplay_percentage_categories  					xpath    //android.view.View[contains(@resource-id,'circleDisplay_percentage_categories')]
recycler_view_gradebook_categories   					xpath    //android.support.v7.widget.RecyclerView[contains(@resource-id,'recycler_view_gradebook_categories')]
Activities_UnderCategory       							xpath    //android.support.v7.widget.RecyclerView[contains(@resource-id,'recycler_view_gradebook_categories')]/android.widget.LinearLayout
tv_gradebook_sub_categories_name   						xpath    (//android.widget.TextView[contains(@resource-id,'tv_gradebook_sub_categories_name')])[${val}]
categories_name_GradebookPage 							xpath    //android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_name') and contains(@text,'${val}')]
tv_gb_activities_details_name      						xpath    //android.widget.TextView[contains(@resource-id,'tv_gb_activities_details_name')]
ll_gradebook_activity_detail_grade  					xpath    //android.widget.LinearLayout[contains(@resource-id,'ll_gradebook_activity_detail_grade')]
tv_gb_activities_percent_score     						xpath    //android.widget.TextView[contains(@resource-id,'tv_gb_activities_percent_score')]
ll_gradebook_activity_detail_points  					xpath    //android.widget.LinearLayout[contains(@resource-id,'ll_gradebook_activity_detail_points')]
tv_gb_activities_details_points    						id       com.cengage.mobile.mindtap:id/tv_gb_activities_details_points
ll_gradebook_activity_detail_duedate 					xpath    //android.widget.LinearLayout[contains(@resource-id,'ll_gradebook_activity_detail_duedate')]
tv_gb_activities_details_due_date   					xpath    //android.widget.TextView[contains(@resource-id,'tv_gb_activities_details_due_date')]
tv_gradebook_activity_comment_section_title  			xpath    //android.widget.TextView[contains(@resource-id,'tv_gradebook_activity_comment_section_title') and contains(@text,'${val}')]
tv_gradebook_activity_comment_description    			xpath    //android.widget.TextView[contains(@resource-id,'tv_gradebook_activity_comment_description')]
tv_gradebook_activity_comment_title  					xpath    //android.widget.TextView[contains(@resource-id,'tv_gradebook_activity_comment_title')]

tv_gradebook_activity_comment_description_index    		xpath    //android.widget.LinearLayout[@index='${val}']/android.widget.TextView[contains(@resource-id,'tv_gradebook_activity_comment_description')]

tv_gradebook_activity_comment_title_index  				xpath    //android.widget.LinearLayout[@index='${val}']/android.widget.TextView[contains(@resource-id,'tv_gradebook_activity_comment_title')]

btn_Categorize                      					xpath    //a[@class="topTab"]/div[@class="ng-binding" and text()="Settings"]
toggle_btn_Off                      					xpath    //span[contains(@class,'toggle-off') and @label="Category Weighting"]//span[@class="onoffswitch-switch"]
toogle_Button                       					xpath    //span[contains(@class,'toggle-on') and @label="Category Weighting"]//span[@class="onoffswitch"]
FirstCategory_categoryWeight          					xpath    //div[@class="categoryWeightCol"]/input[@data-e2e-id="Category-1-Weight"]
SecondCategory_CategoryWeight        					xpath    //div[@class="categoryWeightCol"]/input[@data-e2e-id="Category-2-Weight"]
btn_Save                           	 					xpath    //button[@data-e2e-id="SaveButton"]
Message_recalculationOfGrades       					xpath    //div[@class="modal-box"]/p[@class="detail ng-binding"]
btn_Continue                        					xpath    //button[@data-e2e-id="RecalcContinueButton"]
gradebook_icon_on_web               					xpath    //a[@id='app_viewProgress']
categories_On_Gradebook_Page        					xpath    //android.widget.LinearLayout[@index=${val}]/android.widget.LinearLayout/android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_name')]
CategoryWeights_On_Gradebook_Page   					xpath  	 //android.widget.LinearLayout[@index=${val}]/android.widget.LinearLayout/android.widget.TextView[contains(@resource-id,'tv_gradebook_categories_weight')]
circleDisplayPercent_Category_On_Gradebook_Page  		xpath  	 //android.view.View[contains(@resource-id,'circle_display_gradebook_categories_percent_score')]
Gradebook_OverviewTab_Web          						xpath    //div[@data-e2e-id="OverviewTab"]
Gradebook_Activity_Web             						xpath    //div[@class="ag-body-container"]/div[4]//span[@class="activity"]/following-sibling::span
Student_OverviewTab_ProgressApp    						xpath    //div[contains(@class,'ag-cell-no-focus') and contains(.,'AutomationStudmobile')]
StudentName_ActivityModal          						xpath    //h3[@data-e2e-id="CurrentModalTitle"]/span
ActivityDetailName_Modal           						xpath    (//h1[@data-e2e-id="ActivityName"])[2]
ActivityDetailOpenDateSelect_Modal 						xpath    //button[@data-e2e-id="ActivityDetailOpenDateSelect"]
SelectDate                         						xpath    //button[@data-e2e-class="DateButton"]/span[@class="ng-binding" and contains(.,'${val}')]
nextMonthIcon                      						xpath    //button[contains(@class,'pull-right')]/i
DatePickerDoneButton               						xpath    //button[@data-e2e-id="DatePickerDoneButton"]
EditScoreButton                    						xpath    //button[@data-e2e-id="EditScoreButton"]
Score_Input                        						xpath     //input[@data-e2e-id="PointsInput"]
PercentScore_Input                 						xpath     //input[@ data-e2e-id="PercentInput"]
SaveScoreButton                    						xpath     //button[@data-e2e-id="SaveScoreButton"]
WarningContinueButton              						xpath     //button[@data-e2e-id="WarningContinueButton"]
RecordedScore_Details              						xpath     //div[@data-e2e-id="RecordedScore"]/strong[${val}]
RemoveScoreLink                   	 					xpath     //button[@data-e2e-id="RemoveScoreLink"]
CommentDescription_Duedate        				 		xpath     //ul[@class="comments extensions"]/li[1]//strong[@data-e2e-class="CommentDescription"]
CommentText                        						xpath     //ul[@class="comments extensions"]/li[1]//div[@data-e2e-class="CommentText"]
CommentDescription_Scorechange     						xpath     //ul[@class="comments extensions"]/li[1]//div[@data-e2e-class="CommentDescription"]
AddCommentLink                     						xpath     //a[@data-e2e-id="AddCommentLink"]
CommentInput_textarea              						xpath     //textarea[@data-e2e-id="CommentInput"]
SaveCommentButton                  						xpath     //button[@data-e2e-id="SaveCommentButton"]
EditCommentLink                    						xpath     (//ul[@class="comments extensions"]//a[@data-e2e-id="EditCommentLink"])[1]
btn_confirm                        						xpath     //button[text()="Confirm"]
error_msg_gradebook                						xpath     //android.widget.TextView[contains(@resource-id,'gradebook_not_available')]
