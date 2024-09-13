package com.svc.listview;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.widget.AdapterView.*;
import android.view.*;
import android.content.*;
import android.net.*;

import java.util.*;


public class MainActivity extends Activity 
{
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		Toast.makeText(this, "SAVCI-19 | SVC SOFTWARE", Toast.LENGTH_LONG).show();
		
		String[] secenekler = {"Uygulamayı kapat", "Yeniden başlat", "Instagram", "Dialog", "Arkaplanı değiştir", "ActionBar Değiştir", "ActionBar Gizle", "ActionBar Göster", "Deneme"};
		
		ListView listView = findViewById(R.id.listView);
		ListAdapter adapter = new ArrayAdapter(this, R.layout.entry, R.id.entryTextView1, secenekler);
		listView.setAdapter(adapter);
		
		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> l, View v, int position, long id) {
				
				switch(position) {
					case 0:
						finish();
						break;
						
					case 1:
						finish();
						Intent intent = new Intent(MainActivity.this, MainActivity.class);
						startActivity(intent);
						break;
						
					case 2:
						Uri uri = Uri.parse("https://instagram.com/svc_software");
						Intent intent2 = new Intent(Intent.ACTION_VIEW, uri);
						startActivity(intent2);
						break;
						
					case 3:
						dialog();
						break;
						
					case 4:
						ListView listView = findViewById(R.id.listView);
						listView.setBackgroundResource(R.drawable.ic_launcher);
						break;
						
					case 5:
						ActionBar actionBar = getActionBar();
						actionBar.setSubtitle("ActionBar");
						actionBar.setTitle("SVC SOFTWARE");
						break;
						
					case 6:
						ActionBar actionBar2 = getActionBar();
						actionBar2.hide();
						break;
						
					case 7:
						ActionBar actionBar3 = getActionBar();
						actionBar3.show();
						break;
						
					case 8:
						
						break;
				}
				
				
			}
				
		});
		
    }
	
	public void dialog () {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		
		builder.setTitle("SVC SOFTWARE");
		builder.setMessage("Hi!");
		
		builder.setPositiveButton(getString(R.string.tamam), new DialogInterface.OnClickListener() {
			@Override
			public void onClick (DialogInterface dialog, int id) {
				//
			}
		});
		
		builder.show();
		
	}
	
}
