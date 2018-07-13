package textfont.com.textdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yasic.library.particletextview.MovingStrategy.BidiHorizontalStrategy;
import com.yasic.library.particletextview.MovingStrategy.BidiVerticalStrategy;
import com.yasic.library.particletextview.MovingStrategy.CornerStrategy;
import com.yasic.library.particletextview.MovingStrategy.VerticalStrategy;
import com.yasic.library.particletextview.Object.ParticleTextViewConfig;
import com.yasic.library.particletextview.View.ParticleTextView;

import textfont.com.textdemo.R;

public class ItemFirstActivity extends AppCompatActivity {

    private ParticleTextView tvParticleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_first);

        tvParticleTextView = findViewById(R.id.tv_particle);
        //https://github.com/BrothersUnion666/and_ui_font.git
        String text = "多读书、多看报";
        //使用如下，依赖particletextview
        //showResult1(text);
        //showResult2(text);
        showResult3(text);
        //showResult4(text);
        //showResult5(text);
    }

    private void showResult1(String text) {
        ParticleTextViewConfig config1 = new ParticleTextViewConfig.Builder()
                .setTargetText(text)
                .setReleasing(0.1)       //修改这个控制动画快慢,值越小越慢
                .setParticleRadius(4)
                .setMiniDistance(1)
                .setTextSize(150)
                .setRowStep(9)
                .setColumnStep(9)
                .instance();
        tvParticleTextView.setConfig(config1);
        tvParticleTextView.startAnimation();
    }

    private void showResult2(String text) {
        VerticalStrategy verticalStrategy = new VerticalStrategy();
        ParticleTextViewConfig config2 = new ParticleTextViewConfig.Builder()
                .setTargetText(text)
                .setReleasing(0.1)
                .setParticleRadius(3)
                .setTextSize(120)
                .setMiniDistance(0.5)
                .setColumnStep(5)
                .setRowStep(5)
                .setParticleColorArray(new String[]{"#333333", "#222222", "#111111"})
                .setMovingStrategy(verticalStrategy)
                .instance();
        tvParticleTextView.setConfig(config2);
        tvParticleTextView.startAnimation();
    }



    private void showResult3(String text) {
        CornerStrategy cornerStrategy = new CornerStrategy();
        ParticleTextViewConfig config3 = new ParticleTextViewConfig.Builder()
                .setTargetText(text)
                .setReleasing(0.1)
                .setParticleRadius(4)
                .setTextSize(150)
                .setColumnStep(6)
                .setRowStep(6)
                .setMovingStrategy(cornerStrategy)
                .setParticleColorArray(new String[]{"#9933ff"})
                .instance();
        tvParticleTextView.setConfig(config3);
        tvParticleTextView.startAnimation();
    }

    private void showResult4(String text) {
        BidiVerticalStrategy movingStrategy4 = new BidiVerticalStrategy();
        ParticleTextViewConfig config4 = new ParticleTextViewConfig.Builder()
                .setTargetText(text)
                .setReleasing(0.3)
                .setTextSize(150)
                .setMiniDistance(0.01)
                .setParticleRadius(4)
                .setColumnStep(6)
                .setRowStep(6)
                .setDelay((long) 500)
                .setParticleColorArray(new String[]{"#99ff33"})
                .setMovingStrategy(movingStrategy4)
                .instance();
        tvParticleTextView.setConfig(config4);
        tvParticleTextView.startAnimation();
    }

    private void showResult5(String text) {
        BidiHorizontalStrategy movingStrategy5 = new BidiHorizontalStrategy();
        ParticleTextViewConfig config5 = new ParticleTextViewConfig.Builder()
                .setTargetText("Canvas")
                .setReleasing(0.3)
                .setTextSize(150)
                .setMiniDistance(0.01)
                .setParticleRadius(4)
                .setColumnStep(8)
                .setRowStep(8)
                .setMovingStrategy(movingStrategy5)
                .instance();
        tvParticleTextView.setConfig(config5);
        tvParticleTextView.startAnimation();
    }
}
