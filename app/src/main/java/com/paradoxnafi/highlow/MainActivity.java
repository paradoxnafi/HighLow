package com.paradoxnafi.highlow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

	int randNum;

	public String HighLow(int n, int r) {

		if(n > r) {
			return "Too high";
		} else if(n < r){
			return "Too low";
		} else {
			randNum = (int) (Math.random() * 50 + 1);
			return "Correct!!!";
		}

	}

	public void onClickCheck(View view) {

		EditText editTextInputNum = (EditText) findViewById(R.id.editTextInputNum);
		int number = Integer.parseInt(editTextInputNum.getText().toString());

		String displayToast = HighLow(number, randNum);
		Toast.makeText(MainActivity.this, displayToast, Toast.LENGTH_SHORT).show();
	}



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		randNum = (int) (Math.random() * 50 + 1);
	}
}
