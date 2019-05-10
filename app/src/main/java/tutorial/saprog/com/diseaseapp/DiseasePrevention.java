package tutorial.saprog.com.diseaseapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Aladdin on 14-Mar-18.
 */

public class DiseasePrevention extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";


    public static DiseasePrevention newInstance(int text) {
        DiseasePrevention fragment = new DiseasePrevention();
        Bundle args = new Bundle();
        args.putInt("TEXT",text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_disease_prevention, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        int text = (int)getArguments().get("TEXT");
        textView.setText(text);
        return rootView;
    }
}
