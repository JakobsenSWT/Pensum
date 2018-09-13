package tj.pensum.PersonalPensum;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import tj.pensum.PersonalPensum.Fragments.PensumList;
import tj.pensum.R;

import static tj.pensum.Frontpage.pensum_expand_key;

/**
 * Created by Thomas-PC on 10/09/2018.
 */

public class Activity_PensumOverview extends AppCompatActivity {

    private Fragment pensumlist, expanded_pensum;
    private String choosen_pensum_to_expand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pensum_overview);

        Bundle bundle = new Bundle();
        bundle.putString(choosen_pensum_to_expand, pensum_expand_key);

        pensumlist = new PensumList();
        getSupportFragmentManager().beginTransaction().
                replace(R.id.MiddleContainer, pensumlist).
                commit();
    }

}
