package org.spaceappschallenge.a2018.spacepharaohs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the rockets category
        LinearLayout rocket1 = (LinearLayout) findViewById(R.id.r1);

        // Set a click listener on that View
        rocket1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket1Intent = new Intent(MainActivity.this, R1Activity.class);

                // Start the new activity
                startActivity(rocket1Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket2 = (LinearLayout) findViewById(R.id.r2);

        // Set a click listener on that View
        rocket2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket2Intent = new Intent(MainActivity.this, R2Activity.class);

                // Start the new activity
                startActivity(rocket2Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket3 = (LinearLayout) findViewById(R.id.r3);

        // Set a click listener on that View
        rocket3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket3Intent = new Intent(MainActivity.this, R3Activity.class);

                // Start the new activity
                startActivity(rocket3Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket4 = (LinearLayout) findViewById(R.id.r4);

        // Set a click listener on that View
        rocket4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket4Intent = new Intent(MainActivity.this, R4Activity.class);

                // Start the new activity
                startActivity(rocket4Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket5 = (LinearLayout) findViewById(R.id.r5);

        // Set a click listener on that View
        rocket5.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket5Intent = new Intent(MainActivity.this, R5Activity.class);

                // Start the new activity
                startActivity(rocket5Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket6 = (LinearLayout) findViewById(R.id.r6);

        // Set a click listener on that View
        rocket6.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket6Intent = new Intent(MainActivity.this, R6Activity.class);

                // Start the new activity
                startActivity(rocket6Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket7 = (LinearLayout) findViewById(R.id.r7);

        // Set a click listener on that View
        rocket7.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket7Intent = new Intent(MainActivity.this, R7Activity.class);

                // Start the new activity
                startActivity(rocket7Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket8 = (LinearLayout) findViewById(R.id.r8);

        // Set a click listener on that View
        rocket8.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket8Intent = new Intent(MainActivity.this, R8Activity.class);

                // Start the new activity
                startActivity(rocket8Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket9 = (LinearLayout) findViewById(R.id.r9);

        // Set a click listener on that View
        rocket9.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket9Intent = new Intent(MainActivity.this, R9Activity.class);

                // Start the new activity
                startActivity(rocket9Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket10 = (LinearLayout) findViewById(R.id.r10);

        // Set a click listener on that View
        rocket10.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket10Intent = new Intent(MainActivity.this, R10Activity.class);

                // Start the new activity
                startActivity(rocket10Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket11 = (LinearLayout) findViewById(R.id.r11);

        // Set a click listener on that View
        rocket11.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket11Intent = new Intent(MainActivity.this, R11Activity.class);

                // Start the new activity
                startActivity(rocket11Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket12 = (LinearLayout) findViewById(R.id.r12);

        // Set a click listener on that View
        rocket12.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket12Intent = new Intent(MainActivity.this, R12Activity.class);

                // Start the new activity
                startActivity(rocket12Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket13 = (LinearLayout) findViewById(R.id.r13);

        // Set a click listener on that View
        rocket13.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket13Intent = new Intent(MainActivity.this, R13Activity.class);

                // Start the new activity
                startActivity(rocket13Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket14 = (LinearLayout) findViewById(R.id.r14);

        // Set a click listener on that View
        rocket14.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket14Intent = new Intent(MainActivity.this, R14Activity.class);

                // Start the new activity
                startActivity(rocket14Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket15 = (LinearLayout) findViewById(R.id.r15);

        // Set a click listener on that View
        rocket15.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket15Intent = new Intent(MainActivity.this, R15Activity.class);

                // Start the new activity
                startActivity(rocket15Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket16 = (LinearLayout) findViewById(R.id.r16);

        // Set a click listener on that View
        rocket16.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket16Intent = new Intent(MainActivity.this, R16Activity.class);

                // Start the new activity
                startActivity(rocket16Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket17 = (LinearLayout) findViewById(R.id.r17);

        // Set a click listener on that View
        rocket17.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket17Intent = new Intent(MainActivity.this, R17Activity.class);

                // Start the new activity
                startActivity(rocket17Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket18 = (LinearLayout) findViewById(R.id.r18);

        // Set a click listener on that View
        rocket18.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket18Intent = new Intent(MainActivity.this, R18Activity.class);

                // Start the new activity
                startActivity(rocket18Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket19 = (LinearLayout) findViewById(R.id.r19);

        // Set a click listener on that View
        rocket19.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket19Intent = new Intent(MainActivity.this, R19Activity.class);

                // Start the new activity
                startActivity(rocket19Intent);
            }
        });
        // Find the View that shows the rockets category
        LinearLayout rocket20 = (LinearLayout) findViewById(R.id.r20);

        // Set a click listener on that View
        rocket20.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent rocket20Intent = new Intent(MainActivity.this, R20Activity.class);

                // Start the new activity
                startActivity(rocket20Intent);
            }
        });

        // Find the View that shows the rockets category
        Button locations = (Button) findViewById(R.id.loc);

        // Set a click listener on that View
        locations.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent locationsIntent = new Intent(MainActivity.this, L1Activity.class);

                // Start the new activity
                startActivity(locationsIntent);
            }
        });
    }
}
