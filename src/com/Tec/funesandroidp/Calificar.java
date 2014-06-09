package com.Tec.funesandroidp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class Calificar extends Activity {
	
	// llamamos cuando la actividad que se creo primero
	
	private EditText et1;

	
	TextView tv;
	RadioGroup rg;
	RadioButton r1, r2;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calificar);
		
		
		final RatingBar rt = (RatingBar) findViewById(R.id.ratingBar1);
		Button bt = (Button)findViewById(R.id.button1);
		
		bt.setOnClickListener(new View.OnClickListener(){
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				float k;
				k = rt.getRating();
				String text ="" + k;
				Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
				
			}
		});
	
		
	}
	
	public void VálidarGuardar (View v) {
		EditText txtname = (EditText) findViewById(R.id.editText1);
		EditText txtcomentario = (EditText) findViewById(R.id.et1);
		
		
		
	}
}