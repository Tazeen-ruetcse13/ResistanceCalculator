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

public class ThirdBandActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_third_band);
		
		final String secondBandValue= getIntent().getStringExtra("COLOR_VALUE");
		
		
		final Button blackButton3=(Button) findViewById(R.id.blackButton3);
		final Button brownButton3=(Button) findViewById(R.id.brownButton3);
		final Button redButton3=(Button) findViewById(R.id.redButton3);
		final Button orangeButton3=(Button) findViewById(R.id.orangeButton3);
		final Button yellowButton3=(Button) findViewById(R.id.yellowButton3);
		final Button greenButton3=(Button) findViewById(R.id.greenButton3);
		final Button blueButton3=(Button) findViewById(R.id.blueButton3);
		final Button violetButton3=(Button) findViewById(R.id.violetButton3);
		final Button grayButton3=(Button) findViewById(R.id.grayButton3);
		final Button whiteButton3=(Button) findViewById(R.id.whiteButton3);
		final Button goldButton3=(Button) findViewById(R.id.goldButton3);
		final Button silverButton3=(Button) findViewById(R.id.silverButton3);
		
		
		blackButton3.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					blackButton3.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string1 = new String();
		
					string1= String.valueOf((Integer.valueOf(secondBandValue))*1);
					
					Intent intent = new Intent(ThirdBandActivity.this, FourthBandActivity.class);
					intent.putExtra("COLOR_VALUE", string1);
					startActivity(intent);
					blackButton3.getBackground().setAlpha(255);
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
		
		brownButton3.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					brownButton3.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string2 = new String();
					string2= String.valueOf((Integer.valueOf(secondBandValue))*10);
					
					Intent intent = new Intent(ThirdBandActivity.this, FourthBandActivity.class);
					intent.putExtra("COLOR_VALUE", string2);
					startActivity(intent);
					brownButton3.getBackground().setAlpha(255);
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
		
		
		redButton3.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					redButton3.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string3 = new String();
					string3= String.valueOf((Integer.valueOf(secondBandValue))*100);
					
					Intent intent = new Intent(ThirdBandActivity.this, FourthBandActivity.class);
					intent.putExtra("COLOR_VALUE", string3);
					startActivity(intent);
					redButton3.getBackground().setAlpha(255);
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

		
		orangeButton3.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					orangeButton3.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string4 = new String();
					string4= String.valueOf((Integer.valueOf(secondBandValue))*1000);
					
					Intent intent = new Intent(ThirdBandActivity.this, FourthBandActivity.class);
					intent.putExtra("COLOR_VALUE", string4);
					startActivity(intent);
					orangeButton3.getBackground().setAlpha(255);
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

		
		yellowButton3.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					yellowButton3.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string5 = new String();
					string5= String.valueOf((Integer.valueOf(secondBandValue))*10000);
					
					Intent intent = new Intent(ThirdBandActivity.this, FourthBandActivity.class);
					intent.putExtra("COLOR_VALUE", string5);
					startActivity(intent);
					yellowButton3.getBackground().setAlpha(255);
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

		
		greenButton3.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					greenButton3.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string6 = new String();
					string6= String.valueOf((Integer.valueOf(secondBandValue))*100000);
					
					Intent intent = new Intent(ThirdBandActivity.this, FourthBandActivity.class);
					intent.putExtra("COLOR_VALUE", string6);
					startActivity(intent);
					greenButton3.getBackground().setAlpha(255);
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

		blueButton3.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					blueButton3.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string7 = new String();
					string7= String.valueOf((Integer.valueOf(secondBandValue))*1000000);
					
					Intent intent = new Intent(ThirdBandActivity.this, FourthBandActivity.class);
					intent.putExtra("COLOR_VALUE", string7);
					startActivity(intent);
					blueButton3.getBackground().setAlpha(255);
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
		
		violetButton3.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					violetButton3.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string8 = new String();
					string8= String.valueOf((Integer.valueOf(secondBandValue))*10000000);
					
					Intent intent = new Intent(ThirdBandActivity.this, FourthBandActivity.class);
					intent.putExtra("COLOR_VALUE", string8);
					startActivity(intent);
					violetButton3.getBackground().setAlpha(255);
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
		
		
		grayButton3.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					grayButton3.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string9 = new String();
					string9= String.valueOf((Integer.valueOf(secondBandValue))*100000000);
					
					Intent intent = new Intent(ThirdBandActivity.this, FourthBandActivity.class);
					intent.putExtra("COLOR_VALUE", string9);
					startActivity(intent);
					grayButton3.getBackground().setAlpha(255);
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

		
		whiteButton3.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					whiteButton3.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string10 = new String();
					string10= String.valueOf((Integer.valueOf(secondBandValue))*1000000000);
					
					Intent intent = new Intent(ThirdBandActivity.this, FourthBandActivity.class);
					intent.putExtra("COLOR_VALUE", string10);
					startActivity(intent);
					whiteButton3.getBackground().setAlpha(255);
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

		
		goldButton3.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					goldButton3.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string11 = new String();
					string11= String.valueOf((Integer.valueOf(secondBandValue))*0.10);
					
					Intent intent = new Intent(ThirdBandActivity.this, FourthBandActivity.class);
					intent.putExtra("COLOR_VALUE", string11);
					startActivity(intent);
					goldButton3.getBackground().setAlpha(255);
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

		
		silverButton3.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					silverButton3.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string12 = new String();
					string12= String.valueOf((Integer.valueOf(secondBandValue))*0.01);
					
					Intent intent = new Intent(ThirdBandActivity.this, FourthBandActivity.class);
					intent.putExtra("COLOR_VALUE", string12);
					startActivity(intent);
					silverButton3.getBackground().setAlpha(255);
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
		getMenuInflater().inflate(R.menu.activity_third_band, menu);
		return true;
	}

}
