package com.androidapp.resistancecalculator;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class FinalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		TextView textview;
		final Button okButton;
		String string1, string2;
		double n1, n2, n3, n4;
		
		setContentView(R.layout.activity_final);
		
		textview = (TextView) findViewById(R.id.finalTextView);
		okButton = (Button) findViewById(R.id.okButton);
		string1= getIntent().getStringExtra("COLOR_VALUE");
		string2 = getIntent().getStringExtra("COLOR_VALUE1");
		n1=Double.valueOf(string2)-Double.valueOf(string1);
		n2 =  Double.valueOf(string1)+Double.valueOf(string2);
		n3=(Double.valueOf(string2)-Double.valueOf(string1))/1000;
		n4=(Double.valueOf(string1)+Double.valueOf(string2))/1000;
		
		
		NumberFormat formatter = new DecimalFormat("#0.000");
		
		textview.setText(formatter.format(n1) + "ohm\nto\n" + formatter.format(n2) +"ohm\n\nOR\n\n"+formatter.format(n3) +"k-ohm\nto\n" + formatter.format(n4)+"k-ohm");
		
		okButton.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					okButton.getBackground().setAlpha(100);
					break;
					
				case MotionEvent.ACTION_UP:
					Intent intent = new Intent(FinalActivity.this, WelcomePageActivity.class);
					startActivity(intent);
					okButton.getBackground().setAlpha(255);
					finish();
					
					break;

				default:
					break;
				}
				
				return false;
			}
			
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_final, menu);
		return true;
	}

}
