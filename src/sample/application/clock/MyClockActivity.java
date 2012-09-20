package sample.application.clock;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MyClockActivity extends Activity {

	private int counter = 1;

	public void onClick(View v) {

		Log.d(ACTIVITY_SERVICE, "onClickが呼ばれました");

		View layout = findViewById(R.id.layout);

		if (counter == 1) {
			layout.setBackgroundResource(R.drawable.img2);
			counter = 2;
		} else {
			layout.setBackgroundResource(R.drawable.img1);
			counter = 1;
		}

	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
