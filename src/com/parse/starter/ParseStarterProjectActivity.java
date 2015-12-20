package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;

import com.parse.ParseAnalytics;
import com.parse.ParseInstallation;
import com.parse.PushService;

public class ParseStarterProjectActivity extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		// To track statistics around application
		ParseAnalytics.trackAppOpened(getIntent());

		// inform the Parse Cloud that it is ready for notifications
		PushService.setDefaultPushCallback(this, ParseStarterProjectActivity.class);
		ParseInstallation.getCurrentInstallation().saveInBackground();

	}
}
