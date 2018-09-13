package tj.pensum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import tj.pensum.PersonalPensum.Activity_PensumOverview;

public class Frontpage extends AppCompatActivity implements View.OnClickListener {

    public static String pensum_expand_key = "shit";

    private ImageButton LoginShortcut_imgBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage);

        LoginShortcut_imgBtn = findViewById(R.id.loginShortcut);

        StartOnClickListener();
    }

    private void StartOnClickListener () {
        LoginShortcut_imgBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.loginShortcut:
                Intent intentLogin = new Intent(this, Activity_PensumOverview.class);
                startActivity(intentLogin);
                break;
            default:
                System.out.print("On click error.");
        }
    }
}
