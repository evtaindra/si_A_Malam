
//Pembungkus
package com.evta.hellowordl;


//Library
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	//Deklarasi Objek
	EditText nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Instatnsiasi Objek
        nama = (EditText)findViewById(R.id.et_1);
        
        //
        String tampung = "Felix";
        
        nama.setText(tampung);
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
