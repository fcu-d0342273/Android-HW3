package lincyu.chapter6_horoscope3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class HoroscopeActivity extends ActionBarActivity {

    private TextView result;
    private ImageView symbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoscope);
        result = (TextView)findViewById(R.id.tv_horoscope);
        symbol = (ImageView)findViewById(R.id.iv_horoscope);
        Button button = (Button)findViewById(R.id.btn_setbirthday);
        button.setOnClickListener(setBirthday);
    }

    private static final int ACTIVITY_SET_BIRTHDAY = 1;

    private OnClickListener setBirthday = new OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(HoroscopeActivity.this,
                    SetBirthdayActivity.class);
            startActivityForResult(intent, ACTIVITY_SET_BIRTHDAY);
        }
    };

    protected void onActivityResult(int requestCode,int resultCode, Intent intent) {



        if (intent == null)
            return;

        super.onActivityResult(requestCode,resultCode, intent);

        switch (requestCode){
            case 1:
                String input = intent.getStringExtra("KEY_NAME");
                Toast.makeText(HoroscopeActivity.this,"Hello "+ input, Toast.LENGTH_LONG).show();
        }
        }
    }



