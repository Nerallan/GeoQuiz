package android.nerallan.com.geoquiz;

/**
 * Created by Nerallan on 9/24/2018.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(){
    }

    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

}
