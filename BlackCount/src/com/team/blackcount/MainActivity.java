package com.team.blackcount;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
	Button button1;
	Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(listener);
        
        button2 = (Button) findViewById(R.id.button1);
        button2.setOnClickListener(listener);
    }


    Button.OnClickListener listener = new Button.OnClickListener()
     {
      public void onClick(View v)
      {
       Uri uri = Uri.parse("http://blackcount.bl.ee/");
       Intent it  = new Intent(Intent.ACTION_VIEW,uri);
       startActivity(it);
      }
	  {
	   switch(v.getId()){
	   case R.id.button2:
	   Intent myintent = new Intent(MainActivity.this, Website.class);
	   startActivity(myintent);
	   break;
	  }
     };
     
 	Button.OnClickListener listener1 = new Button.OnClickListener()
	 {
	  public void onClick(View v)
	  {
	   switch(v.getId()){
	   case R.id.button2:
	    Intent myintent = new Intent(MainActivity.this, Website.class);
	    startActivity(myintent);
	   break;
	   }
	  }
	 };
	 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
