package jkatto.cse.edu.learningfragments;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements  FirstFragment.OnFragmentInteractionListener {

	//10-
	FirstFragment firstFragment = null;
	//-11
	SecondFragment secondFragment = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//12-
		FragmentManager fragmentManager = getSupportFragmentManager();
		firstFragment = (FirstFragment) fragmentManager.findFragmentById(R.id.firstFragmnet);
		secondFragment = (SecondFragment) fragmentManager.findFragmentById(R.id.SecondFragment);
	}



	//8-
	public void setMessageText(String  text){
		secondFragment.setMessageText(text);

 	}

	//9-
	public void setMessageTextSize(int size){
	   secondFragment.setMessageTextSize(size);
 	}
}
