package com.androidapp.resistancecalculator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class FourthBandActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_fourth_band);
		
		final String thirdBandValue= getIntent().getStringExtra("COLOR_VALUE");
		
		
		final Button redButton4=(Button) findViewById(R.id.redButton4);
		final Button goldButton4=(Button) findViewById(R.id.goldButton4);
		final Button silverButton4=(Button) findViewById(R.id.silverButton4);
		final Button noColorButton=(Button) findViewById(R.id.noColorButton);
		
		
		redButton4.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					redButton4.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string1 = new String();
					
					double n1 = (Double.valueOf(thirdBandValue))*.02;
					string1= String.valueOf(n1);
					
					Intent intent = new Intent(FourthBandActivity.this, FinalActivity.class);
					intent.putExtra("COLOR_VALUE", string1);
					intent.putExtra("COLOR_VALUE1", thirdBandValue);
					
					startActivity(intent);
					redButton4.getBackground().setAlpha(255);
					finish();
					break;

				case MotionEvent.ACTION_MOVE:

					break;

				default:
					break;
				}
				
				return false;
			}
			
		});
		
		goldButton4.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					goldButton4.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string2 = new String();
					
					double n2 = (Double.valueOf(thirdBandValue))*.05;
					string2= String.valueOf(n2);
					
					Intent intent = new Intent(FourthBandActivity.this, FinalActivity.class);
					intent.putExtra("COLOR_VALUE", string2);
					intent.putExtra("COLOR_VALUE1", thirdBandValue);
					
					startActivity(intent);
					goldButton4.getBackground().setAlpha(255);
					finish();
					break;

				case MotionEvent.ACTION_MOVE:

					break;

				default:
					break;
				}
				
				return false;
			}
			
		});
		
		silverButton4.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					silverButton4.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string3 = new String();
					
					double n3 = (Double.valueOf(thirdBandValue))*.1;
					string3= String.valueOf(n3);
					
					Intent intent = new Intent(FourthBandActivity.this, FinalActivity.class);
					intent.putExtra("COLOR_VALUE", string3);
					intent.putExtra("COLOR_VALUE1", thirdBandValue);
					
					startActivity(intent);
					silverButton4.getBackground().setAlpha(255);
					finish();
					break;

				case MotionEvent.ACTION_MOVE:

					break;

				default:
					break;
				}
				
				return false;
			}
			
		});
		
		noColorButton.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					noColorButton.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string4 = new String();
					
					double n4 = (Double.valueOf(thirdBandValue))*.2;
					string4= String.valueOf(n4);
					
					Intent intent = new Intent(FourthBandActivity.this, FinalActivity.class);
					intent.putExtra("COLOR_VALUE", string4);
					intent.putExtra("COLOR_VALUE1", thirdBandValue);
					
					startActivity(intent);
					redButton4.getBackground().setAlpha(255);
					finish();
					break;

				case MotionEvent.ACTION_MOVE:

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
		getMenuInflater().inflate(R.menu.activity_fourth_band, menu);
		return true;
	}

}
