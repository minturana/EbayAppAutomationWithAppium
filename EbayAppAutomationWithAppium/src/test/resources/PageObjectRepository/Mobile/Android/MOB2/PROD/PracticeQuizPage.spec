
*************PracticeQuizPage******************

#Object Definitions
==============================================================================================
textOnPage                      xpath   //android.widget.TextView[contains(@text,'${val}')]
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


==============================================================================================
