package jkatto.cse.edu.learningfragments;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SecondFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {

	//1-
	   //   MainActivity mainActivity = null;

//-2
 TextView messageText=null;
	private OnFragmentInteractionListener mListener;

	public SecondFragment() {
		// Required empty public constructor
	}

	/**
	 * Use this factory method to create a new instance of
	 * this fragment using the provided parameters.
	 *
	 * @param param1 Parameter 1.
	 * @param param2 Parameter 2.
	 * @return A new instance of fragment SecondFragment.
	 */
	// TODO: Rename and change types and number of parameters
	public static SecondFragment newInstance(String param1, String param2) {
		SecondFragment fragment = new SecondFragment();
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
		// 3- 4 - 5 -
		// change the 3 lines below
		ViewGroup view =(ViewGroup) inflater.inflate(R.layout.fragment_second, container, false);
		messageText = view.findViewById(R.id.messgeText);
		return view;
	}

	// TODO: Rename method, update argument and hook method into UI event
	public void onButtonPressed(Uri uri) {
		if (mListener != null) {
			mListener.onFragmentInteraction(uri);
		}
	}

//	@Override
//	public void onAttach(Context context) {
	//	super.onAttach(context);
	//	mainActivity = (MainActivity)context;
	//	if (context instanceof OnFragmentInteractionListener) {
	//		mListener = (OnFragmentInteractionListener) context;
	//	} else {
	//		throw new RuntimeException(context.toString()
	//				+ " must implement OnFragmentInteractionListener");
//		}
//	}

	@Override
	public void onDetach() {
		super.onDetach();
		mListener = null;
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
		// TODO: Update argument type and name
		void onFragmentInteraction(Uri uri);
	}


	//6-
	public void setMessageText(String  text){
		messageText.setText(text);
	}

	//7-
	public void setMessageTextSize(int size){
		messageText.setTextSize((float) size);
	}
}
