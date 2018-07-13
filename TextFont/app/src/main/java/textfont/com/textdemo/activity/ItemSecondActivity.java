package textfont.com.textdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import net.frakbot.jumpingbeans.JumpingBeans;

import textfont.com.textdemo.R;

public class ItemSecondActivity extends AppCompatActivity {

    private TextView mJump1;
    private TextView mJump2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_jump);

        mJump1 = findViewById(R.id.tv_jump1);
        mJump2 = findViewById(R.id.tv_jump2);
        //使用
        JumpingBeans jumping1 = JumpingBeans.with(mJump1)
                .appendJumpingDots()
                .build();

        JumpingBeans jumping2 = JumpingBeans.with(mJump2)
                .makeTextJump(0, mJump2.getText().toString().length())
                .setIsWave(false)
                .setLoopDuration(1000)  // ms
                .build();

    }
}
