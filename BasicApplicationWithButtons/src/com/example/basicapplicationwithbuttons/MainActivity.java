package com.example.basicapplicationwithbuttons;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

	Button button, button2;
	ToggleButton togbutton;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        addListenerOnButton1();
        addListenerOnToggleButton1();
        addListenerOnButton2();
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    public void addListenerOnButton1(){
    	button = (Button) findViewById(R.id.button1);
    	
    	OnClickListener listener = new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				EditText ET = (EditText) findViewById(R.id.editText1);
				ET.setText("button clicked");
			}
    		
    	};
    	
    	button.setOnClickListener(listener);
    }
    
    public void addListenerOnToggleButton1(){
    	togbutton = (ToggleButton) findViewById(R.id.toggleButton1);
    	
    	OnClickListener listener2 = new OnClickListener(){
    		@Override
    		public void onClick(View v) {

    			ImageView IV = (ImageView) findViewById(R.id.imageView1);
    			
    			if(IV.getVisibility() == View.VISIBLE){
    				IV.setVisibility(View.GONE);
    			}
    			else{
    				IV.setVisibility(View.VISIBLE);
    			}
    		}
    	};
    	
    	togbutton.setOnClickListener(listener2);
    }
    
    public void addListenerOnButton2(){
    	button2 = (Button) findViewById(R.id.button2);
    	
    	OnClickListener listener3 = new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=TYuz5oXgJK0"));
				startActivity(web);
			}
    		
    	};
    	
    	button2.setOnClickListener(listener3);
    }
    
    
    
}
