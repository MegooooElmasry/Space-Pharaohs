package org.spaceappschallenge.a2018.spacepharaohs;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class R6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r1);
        TextView time = (TextView) findViewById(R.id.time);
        time.setText(R.string.t6);
        Button wtch = (Button) findViewById(R.id.wtch);
        wtch.setVisibility(View.VISIBLE);
        wtch.setBackgroundColor(Color.TRANSPARENT);
        wtch.setTextColor(Color.TRANSPARENT);
        wtch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        Button act = (Button) findViewById(R.id.act);
        act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Long_March_2C";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        ImageView lv = (ImageView)findViewById(R.id.lv);
        lv.setImageResource(R.drawable.a);
        TextView l = (TextView) findViewById(R.id.l);
        l.setText(R.string.l6);
        TextView d = (TextView) findViewById(R.id.d);
        d.setText(R.string.d6);

    }
}