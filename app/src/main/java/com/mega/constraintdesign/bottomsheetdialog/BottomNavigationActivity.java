package com.mega.constraintdesign.bottomsheetdialog;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.mega.constraintdesign.R;
import com.mega.constraintdesign.fragment.CardsFragment;
import com.mega.constraintdesign.fragment.ExploreFragment;
import com.mega.constraintdesign.fragment.HomeFragment;
import com.mega.constraintdesign.fragment.MoreFragment;
import com.mega.constraintdesign.fragment.RewardsFragment;

public class BottomNavigationActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    CardsFragment cardsFragment = new CardsFragment();
    ExploreFragment exploreFragment= new ExploreFragment();
    HomeFragment homeFragment = new HomeFragment();
    MoreFragment moreFragment =new MoreFragment();
    RewardsFragment rewardsFragment= new RewardsFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.home);
        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            switch(id){
                case R.id.card:
                    getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, cardsFragment).commit();
                    break;
                case R.id.rewards:
                    getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, rewardsFragment).commit();
                    break;
                case R.id.home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, homeFragment).commit();
                    break;
                case R.id.explore:
                    getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, exploreFragment).commit();
                    break;
                case R.id.more:
                    getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, moreFragment).commit();
                    break;
                default: break;

            }
            return true;
        });

    }


}