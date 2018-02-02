Page Title: LoginPage

#Object Definitions
==============================================================================================
txt_username                id      com.cengage.mobile.mindtap.dev:id/et_login_email
txt_password                id      com.cengage.mobile.mindtap.dev:id/et_login_password
btn_login                   id      com.cengage.mobile.mindtap.dev:id/btn_login
CengageSpinner              xpath      //android.widget.ProgressBar[contains(@resource-id,'progress_bar')]
cliebtLOGO                  xpath   //android.widget.ImageView[@index='0']
textOnPage                  xpath   //android.widget.TextView[contains(@text,'${val}')]
textOnButton                xpath   //android.widget.Button[@text='${val}']
tv_login_forgot_password    id      com.cengage.mobile.mindtap.dev:id/tv_login_forgot_password
snackbar_text               id      com.cengage.mobile.mindtap.dev:id/snackbar_text
ImageOntheForgetPage        xpath   //android.widget.FrameLayout[contains(@resource-id,'content_container')]//android.widget.ImageView
et_forgotpassword_email     id      com.cengage.mobile.mindtap.dev:id/et_forgotpassword_email
btn_forgotpassword_submit   id      com.cengage.mobile.mindtap.dev:id/btn_forgotpassword_submit
snackbar_action             id      com.cengage.mobile.mindtap.dev:id/snackbar_action
tv_login_info_message       id     com.cengage.mobile.mindtap.dev:id/tv_login_info_message
message_NoActiveCourse      id       android:id/message
iv_tour_screen_person       id      com.cengage.mobile.mindtap.dev:id/iv_tour_screen_person
iv_tour_screen_icon         id      com.cengage.mobile.mindtap.dev:id/iv_tour_screen_icon
tv_tour_screen_title       xpath   //android.widget.TextView[contains(@resource-id,'tv_tour_screen_title') and contains(@text,'${val}')]
tv_tour_screen_message     xpath   //android.widget.TextView[contains(@resource-id,'tv_tour_screen_message') and contains(@text,'${val}')]
ll_circleIndicators        xpath   //android.widget.LinearLayout[contains(@resource-id,'ll_circleIndicators')]/android.widget.ImageView[@index='${val}']

#web
email			id			email
fmPassword		id			fmPassword
Login 			xpath 				//a[text()='Log In']
openCoursesButton	xpath	                //span[contains(text(),'Automation course 1')]/../..//a[text()='Open']
courseURL	        id	               courseURL
nb_toolbar	        id		       nb_toolbar
==============================================================================================


@logo
--------------------------------
cliebtLOGO:
    width: 1000 to 1400px
    height: 10 to 20px
