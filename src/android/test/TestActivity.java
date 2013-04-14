package android.test;

import android.app.Activity;
import android.os.Bundle;
import android.test.R.id;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class TestActivity extends Activity implements OnClickListener {
	TextView mText;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		findViewById(id.button1).setOnClickListener(this);
	}

	public void onClick(View v) {
		mText = (TextView) findViewById(id.textView1);
		mText.setText("セット！");
	}
}