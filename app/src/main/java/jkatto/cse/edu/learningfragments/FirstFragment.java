package jkatto.cse.edu.learningfragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;




public class FirstFragment extends Fragment {



	private OnFragmentInteractionListener mListener;

	EditText messageText = null;
	SeekBar seekBar = null;
	Button setTextButton = null;

	public FirstFragment() {
		// Required empty public constructor
	}



	/**
	 * Use this factory method to create a new instance of
	 * this fragment using the provided parameters.
	 *
	 * @param param1 Parameter 1.
	 * @param param2 Parameter 2.
	 * @return A new instance of fragment FirstFragment.
	 */
	// TODO: Rename and change types and number of parameters
	public static FirstFragment newInstance(String param1, String param2) {
		FirstFragment fragment = new FirstFragment();
		Bundle args = new Bundle();
		fragment.setArguments(args);
		return fragment;
	}



	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (getArguments() != null) {

		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_first, container, false);
	 messageText = view.findViewById(R.id.messgeText);
	 seekBar = view.findViewById(R.id.seekBar);
	 setTextButton = view.findViewById(R.id.setTextButton);

	 //to make the click on the button active 
	 setTextButton.setOnClickListener(new View.OnClickListener() {
		 @Override
		 public void onClick(View v) {
		 	
		 	//-13   read it then call it
			 String  message = messageText.getText().toString();
             mListener.setMessageText(message);
		 }
	 });


	 //to change the seekbar
	 seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
		 @Override
		 public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
		 	mListener.setMessageTextSize(progress);
 		 }






		 @Override
		 public void onStartTrackingTouch(SeekBar seekBar) {

		 }

		 @Override
		 public void onStopTrackingTouch(SeekBar seekBar) {

		 }
	 });

		return view;
	}




	//it passes the context
	@Override
	public void onAttach(Context context) {
		super.onAttach(context);
 	//	if (context instanceof OnFragmentInteractionListener) {
//		} else {
	//		throw new RuntimeException(context.toString()
	//				+ " must implement OnFragmentInteractionListener");
	//	}
	}


	//
	@Override
	public void onDetach() {
		super.onDetach();
	//	mListener = null;
 	}

	/**
	 * This interface must be implemented by activities that contain this
	 * fragment to allow an interaction in this fragment to be communicated
	 * to the activity and potentially other fragments contained in that
	 * activity.
	 * <p>
	 * See the Android Training lesson <a href=
	 * "http://developer.android.com/training/basics/fragments/communicating.html"
	 * >Communicating with Other Fragments</a> for more information.
	 */
	public interface OnFragmentInteractionListener {
	//	TODO: Update argument type and name
		void  setMessageText(String text);
		void  setMessageTextSize(int size);
	}
}
