package tj.pensum.PersonalPensum.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tj.pensum.R;

/**
 * Created by Thomas-PC on 13/09/2018.
 */

public class PensumList extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pensumlist, container, false);

        startOnClickListener();

        return view;
    }

    private void startOnClickListener() {

    }

    @Override
    public void onClick(View v) {

    }
}
