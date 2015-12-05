package com.androidapp.resistancecalculator;




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

public class FirstBandActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_first_band);
		
		
		final Button blackButton1=(Button) findViewById(R.id.blackButton1);
		final Button brownButton1=(Button) findViewById(R.id.brownButton1);
		final Button redButton1=(Button) findViewById(R.id.redButton1);
		final Button orangeButton1=(Button) findViewById(R.id.orangeButton1);
		final Button yellowButton1=(Button) findViewById(R.id.yellowButton1);
		final Button greenButton1=(Button) findViewById(R.id.greenButton1);
		final Button blueButton1=(Button) findViewById(R.id.blueButton1);
		final Button violetButton1=(Button) findViewById(R.id.violetButton1);
		final Button grayButton1=(Button) findViewById(R.id.grayButton1);
		final Button whiteButton1=(Button) findViewById(R.id.whiteButton1);
		
		
		blackButton1.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					blackButton1.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string1 = new String();
					string1 = "0";
					
					Intent intent = new Intent(FirstBandActivity.this, SecondBandActivity.class);
					intent.putExtra("COLOR_VALUE", string1);
					startActivity(intent);
					blackButton1.getBackground().setAlpha(255);
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
		
		brownButton1.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					brownButton1.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string2 = new String();
					string2 = "1";
					
					Intent intent = new Intent(FirstBandActivity.this, SecondBandActivity.class);
					intent.putExtra("COLOR_VALUE", string2);
					startActivity(intent);
					brownButton1.getBackground().setAlpha(255);
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
		
		
		
		
		redButton1.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					redButton1.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string3 = new String();
					string3 = "2";
					
					Intent intent = new Intent(FirstBandActivity.this, SecondBandActivity.class);
					intent.putExtra("COLOR_VALUE", string3);
					startActivity(intent);
					redButton1.getBackground().setAlpha(255);
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

		
		orangeButton1.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					orangeButton1.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string4 = new String();
					string4 = "3";
					
					Intent intent = new Intent(FirstBandActivity.this, SecondBandActivity.class);
					intent.putExtra("COLOR_VALUE", string4);
					startActivity(intent);
					orangeButton1.getBackground().setAlpha(255);
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

		
		yellowButton1.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					yellowButton1.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string5 = new String();
					string5 = "4";
					
					Intent intent = new Intent(FirstBandActivity.this, SecondBandActivity.class);
					intent.putExtra("COLOR_VALUE", string5);
					startActivity(intent);
					yellowButton1.getBackground().setAlpha(255);
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

		
		greenButton1.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					greenButton1.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string6 = new String();
					string6 = "5";
					
					Intent intent = new Intent(FirstBandActivity.this, SecondBandActivity.class);
					intent.putExtra("COLOR_VALUE", string6);
					startActivity(intent);
					greenButton1.getBackground().setAlpha(255);
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

		blueButton1.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					blueButton1.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string7 = new String();
					string7 = "6";
					
					Intent intent = new Intent(FirstBandActivity.this, SecondBandActivity.class);
					intent.putExtra("COLOR_VALUE", string7);
					startActivity(intent);
					blueButton1.getBackground().setAlpha(255);
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
		
		violetButton1.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					violetButton1.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string8 = new String();
					string8 = "7";
					
					Intent intent = new Intent(FirstBandActivity.this, SecondBandActivity.class);
					intent.putExtra("COLOR_VALUE", string8);
					startActivity(intent);
					violetButton1.getBackground().setAlpha(255);
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
		
		
		grayButton1.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					grayButton1.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string9 = new String();
					string9 = "8";
					
					Intent intent = new Intent(FirstBandActivity.this, SecondBandActivity.class);
					intent.putExtra("COLOR_VALUE", string9);
					startActivity(intent);
					grayButton1.getBackground().setAlpha(255);
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

		
		whiteButton1.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				
				switch (event.getAction()) {

				case MotionEvent.ACTION_DOWN:
					whiteButton1.getBackground().setAlpha(100);
					break;

				case MotionEvent.ACTION_UP:
					String string10 = new String();
					string10 = "9";
					
					Intent intent = new Intent(FirstBandActivity.this, SecondBandActivity.class);
					intent.putExtra("COLOR_VALUE", string10);
					startActivity(intent);
					whiteButton1.getBackground().setAlpha(255);
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
		getMenuInflater().inflate(R.menu.activity_first_band, menu);
		return true;
	}

}
