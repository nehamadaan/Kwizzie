package com.kwizzie.android;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.splash, menu);
        return true;
    }
    
    public void onClick(View v){
    	switch(v.getId()){
    	case R.id.LoginB :
    		Intent intentLogin = new Intent(this,LoginActivity.class);
    		startActivity(intentLogin);
    	break;
    	case R.id.signUpB :
    		Intent intentSignUp = new Intent(this,RegistrationActivity.class);
    		startActivity(intentSignUp);
    	break;	
    	
    	
    	}
    	
    }
}
