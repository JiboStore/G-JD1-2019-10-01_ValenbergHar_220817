package ua.kh.em.desl.ui.bottomnav;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.View;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import ua.kh.em.desl.R;

public class BottomNavActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.bn_info_fragment)
    FrameLayout bnInfoFragment;
    @BindView(R.id.bottom_nav)
    BottomNavigationView bottomNav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        bottomNav.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.bn_item_about:
                    updateFragment(new BottomNavInfoFragment());
                    break;
                case R.id.bn_item_transport:
                    bnInfoFragment.setVisibility(View.GONE);
                    updateFragment(new BottomNavTransportFragment());
                    break;
                case R.id.bn_item_place:
                    bnInfoFragment.setVisibility(View.GONE);
                    updateFragment(new BottomNavPlaceFragment());
                    break;
            }
            return true;
        });

    }

    private void updateFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.bnav_frame_container,fragment).commit();
    }

}
