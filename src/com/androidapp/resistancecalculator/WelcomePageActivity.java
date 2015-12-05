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

public class WelcomePageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		
		setContentView(R.layout.activity_welcome_page);
		
		final Button playButton=(Button) findViewById(R.id.playButton);
		final Button exitButton=(Button) findViewById(R.id.exitButton);
		final Button detailsButton=(Button) findViewById(R.id.detailsButton);
		final Button documentButton=(Button) findViewById(R.id.documentButton);
		
		
		playButton.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					playButton.getBackground().setAlpha(100);
					break;
					
				case MotionEvent.ACTION_UP:
					playButton.getBackground().setAlpha(255);					
					Intent intent = new Intent(WelcomePageActivity.this, FirstBandActivity.class);
					startActivity(intent);
					finish();
					break;

				default:
					break;
				}
				
				return false;
			}
		});
		
		
		exitButton.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					exitButton.getBackground().setAlpha(100);
					break;
					
				case MotionEvent.ACTION_UP:
					exitButton.getBackground().setAlpha(255);
					finish();
					
					break;

				default:
					break;
				}
				
				return false;
			}
		});
		
detailsButton.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					detailsButton.getBackground().setAlpha(100);
					break;
					
				case MotionEvent.ACTION_UP:
					detailsButton.getBackground().setAlpha(255);
					Intent intent = new Intent(WelcomePageActivity.this, DetailsActivity.class);
					startActivity(intent);
					break;

				default:
					break;
				}
				
				return false;
			}
		});

documentButton.setOnTouchListener(new OnTouchListener() {
	
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			documentButton.getBackground().setAlpha(100);
			break;
			
		case MotionEvent.ACTION_UP:
			documentButton.getBackground().setAlpha(255);
			Intent intent = new Intent(WelcomePageActivity.this, DocumentActivity.class);
			startActivity(intent);
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
		getMenuInflater().inflate(R.menu.activity_welcome_page, menu);
		return true;
	}

}
