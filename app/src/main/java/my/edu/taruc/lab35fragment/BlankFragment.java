package my.edu.taruc.lab35fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    private TextView textViewMessage;

    public BlankFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank,container,false);
        textViewMessage = view.findViewById(R.id.textViewMessage);
        Button buttonShow = view.findViewById(R.id.buttonShow);
        buttonShow.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                textViewMessage.setText("Hello World");
            }
        });

        return view;
    }

}
