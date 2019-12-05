package com.sajjad.fragments;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.sajjad.fragments.FragmentsPackage.FragmentOne;
import com.sajjad.fragments.FragmentsPackage.FragmentTwo;

public class MainActivity extends AppCompatActivity {

    Toolbar mainToolbar;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainToolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(mainToolbar);

    }

    void beginTransaction() {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
    }

    void showFragment(Fragment fragment) {
        fragmentTransaction.replace(R.id.fragmentContainer, fragment).addToBackStack("back")
                .commit();
    }

    public void showFragmentOne(View view) {
        beginTransaction();
        showFragment(new FragmentOne());
    }

    public void showFragmentTow(View view) {
        beginTransaction();
        showFragment(new FragmentTwo());
    }
}