package com.fahmiamaru.fragmentrecyclev2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
//M. Fahmi Amaruddin
//19.11.3008

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bot_nav);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedfragment = null;
                switch (item.getItemId()){
                    case R.id.nav_list:
                        selectedfragment = new fragmentList();
                        break;

                    case R.id.nav_hero:
                        selectedfragment = new fragmentHero();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,selectedfragment).commit();
                return true;
            }
        });
    }
}