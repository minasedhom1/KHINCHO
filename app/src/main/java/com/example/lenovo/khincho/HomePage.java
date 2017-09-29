package com.example.lenovo.khincho;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.lenovo.khincho.fragments.HomeFragment;
import com.example.lenovo.khincho.fragments.SearchFragment;
import com.example.lenovo.khincho.fragments.UploadFragment;

public class HomePage extends AppCompatActivity {
    public Fragment fragment = null;
    public Class fragmentClass = null;
    public FragmentManager fragmentManager = getSupportFragmentManager();
    //private TextView mTextMessage;


            private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                    = new BottomNavigationView.OnNavigationItemSelectedListener() {

                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.navigation_home:
                            fragmentClass = HomeFragment.class;
                            frag_trans();
                  //          mTextMessage.setText(R.string.title_home);
                            return true;
                        case R.id.navigation_search:
                            fragmentClass = SearchFragment.class;
                            frag_trans();
                    //        mTextMessage.setText(R.string.title_search);
                            return true;
                        case R.id.navigation_upload:
                            fragmentClass = UploadFragment.class;
                            frag_trans();
/*
                            mTextMessage.setText(R.string.title_upload);
*/
                            return true;
                        case R.id.navigation_activity:
                          //  mTextMessage.setText(R.string.title_activity);
                            return true;
                        case R.id.navigation_profile:
                         //   mTextMessage.setText(R.string.title_profile);
                            return true;
                    }

            return false;
        }

    };



    void frag_trans()
    {
        try
        {
            fragment = (Fragment) fragmentClass.newInstance();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        fragmentManager.beginTransaction().replace(R.id.frag_holder, fragment).commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        getSupportActionBar().hide();

        fragmentClass = HomeFragment.class;
        frag_trans();

      //  mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
