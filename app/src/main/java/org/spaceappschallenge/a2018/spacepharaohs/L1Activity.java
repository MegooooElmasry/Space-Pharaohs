package org.spaceappschallenge.a2018.spacepharaohs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class L1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_l1);

        // Find the View that shows the rockets category
        RelativeLayout location1 = (RelativeLayout) findViewById(R.id.l1);

        // Set a click listener on that View
        location1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Baikonur_Cosmodrome";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location2 = (RelativeLayout) findViewById(R.id.l2);

        // Set a click listener on that View
        location2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Cape_Canaveral_Air_Force_Station";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location3 = (RelativeLayout) findViewById(R.id.l3);

        // Set a click listener on that View
        location3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Edwards_Air_Force_Base";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location4 = (RelativeLayout) findViewById(R.id.l4);

        // Set a click listener on that View
        location4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Guiana_Space_Centre";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location5 = (RelativeLayout) findViewById(R.id.l5);

        // Set a click listener on that View
        location5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Jiuquan_Satellite_Launch_Center";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location6 = (RelativeLayout) findViewById(R.id.l6);

        // Set a click listener on that View
        location6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Kennedy_Space_Center#Location";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location7 = (RelativeLayout) findViewById(R.id.l7);

        // Set a click listener on that View
        location7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Rocket_Lab_Launch_Complex_1";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location8 = (RelativeLayout) findViewById(R.id.l8);

        // Set a click listener on that View
        location8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Mojave_Air_and_Space_Port";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location9 = (RelativeLayout) findViewById(R.id.l9);

        // Set a click listener on that View
        location9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Semnan_Space_Center";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location10 = (RelativeLayout) findViewById(R.id.l10);

        // Set a click listener on that View
        location10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Taiyuan_Satellite_Launch_Center";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location11 = (RelativeLayout) findViewById(R.id.l11);

        // Set a click listener on that View
        location11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Uchinoura_Space_Center";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location12 = (RelativeLayout) findViewById(R.id.l12);

        // Set a click listener on that View
        location12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Vandenberg_Air_Force_Base#Geography";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location13 = (RelativeLayout) findViewById(R.id.l13);

        // Set a click listener on that View
        location13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Plesetsk_Cosmodrome";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location14 = (RelativeLayout) findViewById(R.id.l14);

        // Set a click listener on that View
        location14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Pacific_Spaceport_Complex_%E2%80%93_Alaska";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location15 = (RelativeLayout) findViewById(R.id.l15);

        // Set a click listener on that View
        location15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Naval_Air_Station_Point_Mugu";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location16 = (RelativeLayout) findViewById(R.id.l16);

        // Set a click listener on that View
        location16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Wallops_Flight_Facility";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location17 = (RelativeLayout) findViewById(R.id.l17);

        // Set a click listener on that View
        location17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Wenchang_Spacecraft_Launch_Site";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location18 = (RelativeLayout) findViewById(R.id.l18);

        // Set a click listener on that View
        location18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Xichang_Satellite_Launch_Center";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location19 = (RelativeLayout) findViewById(R.id.l19);

        // Set a click listener on that View
        location19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Vostochny_Cosmodrome#Location";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        RelativeLayout location20 = (RelativeLayout) findViewById(R.id.l20);

        // Set a click listener on that View
        location20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Tanegashima_Space_Center";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Find the View that shows the rockets category
        Button rockets = (Button) findViewById(R.id.roc);

        // Set a click listener on that View
        rockets.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocketsIntent = new Intent(L1Activity.this, MainActivity.class);

                // Start the new activity
                startActivity(rocketsIntent);
            }
        });



    }




}
