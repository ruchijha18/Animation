package ruchi.digipodium.animation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN=5000;

    Animation topAnim, bottomAnim;
    ImageView image;
    TextView logo, slogan;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context;
        topAnim=AnimationUtils.loadAnimation(this,R.anim.first_animation);
        bottomAnim=AnimationUtils.loadAnimation(this,R.anim.down_animation);
        image=findViewById(R.id.imageView2);
        logo=findViewById(R.id.textView);
        slogan=findViewById(R.id.textView2);
        image.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);
        slogan.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                    Intent intent = new Intent(MainActivity.this, Dashboard.class);
                                    startActivity(intent);
                                    finish();

                                      }
                                  }, SPLASH_SCREEN);


    }

}