package com.lennonjesus.crazydrivers.TacaCrazyDrivers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void showCampeonatoPilotos(View view) {

        Intent intent = new Intent(this, CampeonatoPilotosActivity.class);
        startActivity(intent);

    }

    public void showCampeonatoEquipes(View view) {

        Intent intent = new Intent(this, CampeonatoEquipesActivity.class);
        startActivity(intent);

    }
}
