*************Flashcard******************

#Object Definitions
==============================================================================================
textOnPage                       xpath   //android.widget.TextView[contains(@resource-id,'tv_flashcard_deck_name')][contains(@text,'${val}')]
textOnButton                     xpath   //android.widget.Button[@text='${val}']
CengageSpinner                   xpath      //android.widget.ProgressBar[contains(@resource-id,'progress_bar')]
snackbar_text                    id      com.cengage.mobile.mindtap:id/snackbar_text
FlashCards_score                 xpath   //android.widget.TextView[contains(@text,'${val}')]/..//android.widget.TextView[contains(@resource-id,'tv_adapter_flashcards_mastered_cards')]
FlashCards_Name                  xpath   //android.widget.TextView[contains(@text,'${val}')]/..//android.widget.TextView[@index="1"][@text='Flashcards']
AndroidVersion6_tv_flashcards_count_out_of  xpath //android.view.ViewGroup[contains(@resource-id,'main_toolbar')]/android.widget.TextView[@index='1']
tv_flashcards_count_out_of      xpath  //android.view.View[contains(@resource-id,'main_toolbar')]/android.widget.TextView[@index='1']
tv_flashcards_front_card        id  com.cengage.mobile.mindtap:id/tv_flashcards_front_card
ib_flashcards_mastered_icon     id  com.cengage.mobile.mindtap:id/iv_flashcards_mastered_icon
tv_flashcards_back_card         id  com.cengage.mobile.mindtap:id/tv_flashcards_back_card
fm_flashcards_cards             xpath   //android.widget.FrameLayout[contains(@resource-id,'fm_flashcards_cards')]//android.widget.TextView[@enabled='true']
tv_flashcard_or_quiz_score_mastered   id       com.cengage.mobile.mindtap:id/tv_flashcard_or_quiz_score_mastered
tv_flashcard_or_quiz_score_total_number_of_questions id       com.cengage.mobile.mindtap:id/tv_flashcard_or_quiz_score_total_number_of_questions
btn_flashcard_score_take_practice_quiz  id       com.cengage.mobile.mindtap:id/btn_flashcard_score_take_practice_quiz
btn_flashcard_score_keep_studying   id       com.cengage.mobile.mindtap:id/btn_flashcard_score_keep_studying
ll_practice_quiz_layout         id  com.cengage.mobile.mindtap:id/ll_practice_quiz_layout
simpleDraweeView_flashcards_front_card	id com.cengage.mobile.mindtap:id/simpleDraweeView_flashcards_front_card
btn_FlipCard                    id    com.cengage.mobile.mindtap:id/menu_action_flip_card
btn_ShuffleCard                 id  com.cengage.mobile.mindtap:id/menu_action_shuffle_card
fm_flashcards_cards             id   com.cengage.mobile.mindtap:id/fm_flashcards_cards
Add_flashCard                   id  com.cengage.mobile.mindtap:id/fab_flashcards
final_page_text                 xpath    //android.widget.LinearLayout/..//android.widget.TextView[@text='${val}']
circle_display_flashcard_score  id    com.cengage.mobile.mindtap.dev:id/circle_display_flashcard_score
mastered                        xpath    //android.widget.LinearLayout/..//android.widget.TextView[@text='${val}']
btn_LayoutCompatView            xpath   //android.support.v7.widget.LinearLayoutCompat[@index='1']/android.widget.TextView[@content-desc='${val}']
btn_MoreOptionOnFlashcard       xpath   //android.support.v7.widget.ao[@index='2']/android.widget.ImageView[@content-desc='${val}']
moreoptions_tools               xpath   //android.widget.LinearLayout/..//..//android.widget.TextView[contains(@resource-id,'title')][@text='${val}']
Add_FlashCardBar                xpath    //android.view.View[contains(@resource-id,'main_toolbar')]/..//android.widget.TextView[@text='${val}']
btn_edit_delete                 xpath  //android.widget.LinearLayout/..//..//android.widget.TextView[contains(@resource-id,'title')][@text='${val}']
Front_Content                    id     com.cengage.mobile.mindtap:id/et_add_edit_flashcard_front_content
Definition                       id       com.cengage.mobile.mindtap:id/et_add_edit_flashcard_back_content
Save_button                      id    com.cengage.mobile.mindtap:id/menu_action_save_flashcard
btn_Edit_Delete_FlashCard        id   com.cengage.mobile.mindtap:id/iv_flashcard_front_edit_delete_menu

btn_Edit_Delete                 xpath  //android.widget.FrameLayout[contains(@resource-id,'fl_flashcards_back_card')]/..//android.widget.ImageView[contains(@resource-id,'iv_flashcard_back_edit_delete_menu')]

termtext                        xpath   //android.widget.FrameLayout[@index='0']//android.widget.ScrollView/android.widget.TextView[@clickable='true']
btn_NewCardOnFlashcard          xpath   //android.view.View/android.widget.TextView[@text='New Card']
txt_EditTextOnNewFlashcard      xpath   //android.widget.EditText[@text='${var}']
btn_nextButton                  xpath   //android.widget.Button[@text='Next']
btn_saveTextViewOnnewFlashcard  xpath   //android.support.v7.widget.LinearLayoutCompat[@index='2']/android.widget.TextView[contains(@text,'Save')]
btn_EditFlashcard               xpath   //android.support.v4.view.ViewPager[@index='1']//android.widget.ImageView[@content-desc='Edit Icon']
EditTermFlashcard               xpath   //android.support.v4.widget.DrawerLayout//android.widget.EditText[@index='0']
textOnButton                    xpath   //android.widget.Button[@text='${val}']
FlashCards_fromIndex            xpath	//android.widget.FrameLayout[contains(@index,'${val}')]//android.widget.TextView[contains(@resource-id,'tv_adapter_flashcards_mastered_cards')]
flashcards_icon                 xpath   //a[@id='app_view_flash_cards']
More_Icon                       xpath   //img[@alt="Expand Dock"]
Icon_FlashcardsOnWeb            xpath   //img[@class='icon' and @title='Flashcards']
select_FlashcardsMenuButton     xpath   //span[contains(@class,'ui-selectmenu-icon')]
List_FlashCardsChapter          xpath   //ul[contains(@class,'ui-selectmenu-menu-dropdown')]//li
tv_flashcards_got_it_tool_tip   id      com.cengage.mobile.mindtap:id/tv_flashcards_got_it_tool_tip
Flashcard_ChapterName          xpath    //android.widget.FrameLayout[contains(@index,'${val}')]//android.widget.TextView[contains(@resource-id,'tv_flashcard_deck_name')]
==============================================================================================
