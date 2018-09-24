package android.nerallan.com.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


// AppCompatActivity subclass of Activity for old android versions support
public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;

    // called when an activity subclass instance is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // fills (inflates) layout and displays it on the screen.
        setContentView(R.layout.activity_quiz);

        // getting links to filled View objects (widgets)
        mTrueButton = (Button) findViewById(R.id.true_button);

        // method setOnClickListener get listener(object) in argument that implements interface View.OnClickListener
        // listener is implemented as an anonymous inner class
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // A Context contains an instance of Activity (Activity is a subclass of Context)
                // Toast class requires Context parameter to find and use a string resource identifier
                Toast.makeText(QuizActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT).show();
            }
        });

        mFalseButton = (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // it's impossible to pass "this" in context argument, this denotes View.OnClickListener()
                Toast.makeText(QuizActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
