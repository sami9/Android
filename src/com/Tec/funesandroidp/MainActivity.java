package com.Tec.funesandroidp;


import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}	
	
	public void VálidarLogin (View v) {
		EditText txtLogin = (EditText) findViewById(R.id.EditUsers);
		EditText txtClave = (EditText) findViewById(R.id.EditPassword);
		
		if (txtLogin.getText().toString().equals("Carlos") &&  txtClave.getText().toString().equals("123")){
			Intent intent = new Intent(this, Calificar.class);
			intent.putExtra("Resultado",txtLogin.getText().toString());
			startActivity(intent);} // para ejecutar la siguiente actividad
		
		else{
			Toast.makeText(getBaseContext(), "Usuario Incorrecto", Toast.LENGTH_SHORT).show();
			
		}
		if (txtLogin.getText().toString().equals("Angel") &&  txtClave.getText().toString().equals("123")){
			Intent intent = new Intent(this, Calificar.class);
			intent.putExtra("Resultado",txtLogin.getText().toString());
			startActivity(intent);} // para ejecutar la siguiente actividad
		
		else{
			Toast.makeText(getBaseContext(), "Usuario Incorrecto", Toast.LENGTH_SHORT).show();
			
		}
		if (txtLogin.getText().toString().equals("Sara") &&  txtClave.getText().toString().equals("123")){
			Intent intent = new Intent(this, Calificar.class);
			intent.putExtra("Resultado",txtLogin.getText().toString());
			startActivity(intent);} // para ejecutar la siguiente actividad
		
		else{
			Toast.makeText(getBaseContext(), "Usuario Incorrecto", Toast.LENGTH_SHORT).show();
			
		}
			
	}
	
}
