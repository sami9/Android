package com.Tec.funesandroidp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MostrarInformación extends Activity{
	
	private String personas[] ={ "Ana","Bryan","Paola"};
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mostrar);
		
		ListView lista =(ListView) findViewById(R.id.lista);
		ArrayAdapter<String> adaptador = new ArrayAdapter<String> (this,
										android.R.layout.simple_expandable_list_item_1, personas);
		lista.setAdapter(adaptador);
		
		lista.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> padre, View v,
					int posicionSeleccionada,
					long id) {
				// TODO Auto-generated method stub
				switch(posicionSeleccionada){
				
				}
				
			}
		});
	}
	}
			
