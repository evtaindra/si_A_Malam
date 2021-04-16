package com.evta.lifecylceactivity;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends Activity {
	
	//Variabel yang digunakan
	CharSequence[] items = {"Evta","Indra","Fera","Erlina"};
	boolean[] itemChecked = new boolean[items.length]; 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);      
        setContentView(R.layout.activity_main);
        
        Button tombol = (Button)findViewById(R.id.btncek);
        tombol.setText("Klik untuk menampilkan Dialog");
        
        tombol.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				createDialog(0).show();				
			}
		});        
    }   
 

	protected Dialog createDialog(int i) {
		switch(i) {
	    case 0:
	    	boolean[] itemsChecked = null;
			return new AlertDialog.Builder(this)
	    	.setIcon(R.drawable.ic_launcher)
	    	.setTitle("Dialog sederhana")
	    	.setPositiveButton("OK",new DialogInterface.OnClickListener()
	    	{
	    		public void onClick(DialogInterface dialog, int whichButton)
	    		{
	    			Toast.makeText(getBaseContext(), "OK diklik", Toast.LENGTH_SHORT).show();
	    		}
	    	} )
	    	.setNegativeButton("Batal", new DialogInterface.OnClickListener()
	    	{
	    		public void onClick(DialogInterface dialog, int whichButton)
	    		{
	    			Toast.makeText(getBaseContext(), "Batal diklik", Toast.LENGTH_SHORT).show();
	    		}
	    	} )
	    	.setMultiChoiceItems(items, itemsChecked, new DialogInterface.OnMultiChoiceClickListener() 
	    	{
	    		public void onClick(DialogInterface dialog, int which, boolean isChecked) {
					Toast.makeText(getBaseContext(), items[which] + (isChecked ? " dicentang!":" tidak dicentang!"), 
					Toast.LENGTH_SHORT).show();
				}
			})
			.create();
	    }
	    return null;
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
