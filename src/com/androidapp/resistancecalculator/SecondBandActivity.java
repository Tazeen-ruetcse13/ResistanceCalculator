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

public class SecondBandActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_second_band);
		
		final String firstBandValue= getIntent().getStringExtra("COLOR_VALUE");
		
		
		final Button blackButton2=(Button) findViewById(R.id.blackButton2);
		final Button brownButton2=(Button) findViewById(R.id.brownButton2);
		final Button redButton2=(Button) findViewById(R.id.redButton2);
		final Button orangeButton2=(Button) findViewById(R.id.orangeButton2);
		final Button yellowButton2=(Button) findViewById(R.id.yellowButton2);
		final Button greenButton2=(Button) findViewById(R.id.greenButton2);
		final Button blueButton2=(Button) findViewById(R.id.blueButton2);
		final Button violetButton2=(Button) findViewById(R.id.violetButton2);
		final Button grayButton2=(Button) findViewById(R.id.grayButton2);
		final Button whiteButton2=(Button) findViewById(R.id.whiteButton2);
		
		
		blackButton2.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					blackButton2.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string1 = new String();
		
					string1= String.valueOf((Integer.valueOf(firstBandValue))*10+0);
					
					Intent intent = new Intent(SecondBandActivity.this, ThirdBandActivity.class);
					intent.putExtra("COLOR_VALUE", string1);
					startActivity(intent);
					blackButton2.getBackground().setAlpha(255);
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
		
		brownButton2.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					brownButton2.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string2 = new String();
					string2= String.valueOf((Integer.valueOf(firstBandValue))*10+1);
					
					Intent intent = new Intent(SecondBandActivity.this, ThirdBandActivity.class);
					intent.putExtra("COLOR_VALUE", string2);
					startActivity(intent);
					brownButton2.getBackground().setAlpha(255);
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
		
		
		redButton2.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					redButton2.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string3 = new String();
					string3= String.valueOf((Integer.valueOf(firstBandValue))*10+2);
					
					Intent intent = new Intent(SecondBandActivity.this, ThirdBandActivity.class);
					intent.putExtra("COLOR_VALUE", string3);
					startActivity(intent);
					redButton2.getBackground().setAlpha(255);
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

		
		orangeButton2.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					orangeButton2.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string4 = new String();
					string4= String.valueOf((Integer.valueOf(firstBandValue))*10+3);
					
					Intent intent = new Intent(SecondBandActivity.this, ThirdBandActivity.class);
					intent.putExtra("COLOR_VALUE", string4);
					startActivity(intent);
					orangeButton2.getBackground().setAlpha(255);
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

		
		yellowButton2.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					yellowButton2.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string5 = new String();
					string5= String.valueOf((Integer.valueOf(firstBandValue))*10+4);
					
					Intent intent = new Intent(SecondBandActivity.this, ThirdBandActivity.class);
					intent.putExtra("COLOR_VALUE", string5);
					startActivity(intent);
					yellowButton2.getBackground().setAlpha(255);
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

		
		greenButton2.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					greenButton2.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string6 = new String();
					string6= String.valueOf((Integer.valueOf(firstBandValue))*10+5);
					
					Intent intent = new Intent(SecondBandActivity.this, ThirdBandActivity.class);
					intent.putExtra("COLOR_VALUE", string6);
					startActivity(intent);
					greenButton2.getBackground().setAlpha(255);
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

		blueButton2.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					blueButton2.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string7 = new String();
					string7= String.valueOf((Integer.valueOf(firstBandValue))*10+6);
					
					Intent intent = new Intent(SecondBandActivity.this, ThirdBandActivity.class);
					intent.putExtra("COLOR_VALUE", string7);
					startActivity(intent);
					blueButton2.getBackground().setAlpha(255);
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
		
		violetButton2.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					violetButton2.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string8 = new String();
					string8= String.valueOf((Integer.valueOf(firstBandValue))*10+7);
					
					Intent intent = new Intent(SecondBandActivity.this, ThirdBandActivity.class);
					intent.putExtra("COLOR_VALUE", string8);
					startActivity(intent);
					violetButton2.getBackground().setAlpha(255);
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
		
		
		grayButton2.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					grayButton2.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string9 = new String();
					string9= String.valueOf((Integer.valueOf(firstBandValue))*10+8);
					
					Intent intent = new Intent(SecondBandActivity.this, ThirdBandActivity.class);
					intent.putExtra("COLOR_VALUE", string9);
					startActivity(intent);
					grayButton2.getBackground().setAlpha(255);
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

		
		whiteButton2.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					whiteButton2.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string10 = new String();
					string10= String.valueOf((Integer.valueOf(firstBandValue))*10+9);
					
					Intent intent = new Intent(SecondBandActivity.this, ThirdBandActivity.class);
					intent.putExtra("COLOR_VALUE", string10);
					startActivity(intent);
					whiteButton2.getBackground().setAlpha(255);
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
		getMenuInflater().inflate(R.menu.activity_second_band, menu);
		return true;
	}

}
