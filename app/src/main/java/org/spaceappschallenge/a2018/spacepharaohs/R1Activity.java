package org.spaceappschallenge.a2018.spacepharaohs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class R1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r1);
        TextView time = (TextView) findViewById(R.id.time);
        time.setText(R.string.t1);
        Button wtch = (Button) findViewById(R.id.wtch);
        wtch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://youtu.be/Fy4TjF_zNmk";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button act = (Button) findViewById(R.id.act);
        act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Ariane_5";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        ImageView lv = (ImageView)findViewById(R.id.lv);
        lv.setImageResource(R.drawable.a1);
        TextView l = (TextView) findViewById(R.id.l);
        l.setText(R.string.l1);
        TextView mt = (TextView) findViewById(R.id.mt);
        mt.setText(R.string.mt1);
        TextView m = (TextView) findViewById(R.id.m);
        m.setText(R.string.m1);
        TextView md = (TextView) findViewById(R.id.md);
        md.setText(R.string.md1);
        TextView d = (TextView) findViewById(R.id.d);
        d.setText(R.string.d1);

    }
}
