package lincyu.chapter6_horoscope3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SetBirthdayActivity extends ActionBarActivity {

	private EditText etName;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setbirthday);
		Button back = (Button)findViewById(R.id.submit);
		back.setOnClickListener(showhoroscope);
		etName= (EditText)findViewById(R.id.etName);
		etName.setText("");
	}
	
	private OnClickListener showhoroscope = new OnClickListener() {
		public void onClick(View v) {

			String Name = (etName.getText().toString());

			
			Intent intent = new Intent();
			intent.putExtra("KEY_NAME", Name);
			setResult(RESULT_OK, intent);
			finish();
		}
	};
}