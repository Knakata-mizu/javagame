package com.example.new_game;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	ImageView dorobig,dorored,dorogreen,doroblue;
	TextView tv,tv2;

	int kodoro=0; //子ドロイドの識別用
	int boss=0; //親ドロイドに割り当て

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		dorogreen=(ImageView)findViewById(R.id.imageView2);
		dorogreen.setOnClickListener(this);

		dorored=(ImageView)findViewById(R.id.imageView3);
		dorored.setOnClickListener(this);

		doroblue=(ImageView)findViewById(R.id.imageView4);
		doroblue.setOnClickListener(this);

		dorobig=(ImageView)findViewById(R.id.imageView1);
		dorobig.setOnClickListener(this);

		tv=(TextView)findViewById(R.id.textView1);
		tv2=(TextView)findViewById(R.id.textView2);
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()){
		case R.id.imageView2:tv.setText("みどろいどが選ばれています");
			kodoro=1;
			tv2.setText("1");
		break;
		case R.id.imageView3:tv.setText("あかどろいどが選ばれています");
			kodoro=2;
			tv2.setText("2");
		break;
		case R.id.imageView4:tv.setText("あおどろいどが選ばれています");
			kodoro=3;
			tv2.setText("3");
		break;

		case
			R.id.imageView1:
				if(kodoro==0){
					tv.setText("子どろいどを選んでください");
				}else if(kodoro==1){
					tv.setText("緑は吸収される");
				}else if(kodoro==2){
					tv.setText("赤が弱点のようだ");
				}else{
					tv.setText("何も起きなかった");
				}
				break;
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

}
