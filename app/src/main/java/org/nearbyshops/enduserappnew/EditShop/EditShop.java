package org.nearbyshops.enduserappnew.EditShop;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import org.nearbyshops.enduserappnew.R;


public class EditShop extends AppCompatActivity {

    public static final String TAG_FRAGMENT_EDIT = "fragment_edit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_shop_new);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if(getSupportFragmentManager().findFragmentByTag(TAG_FRAGMENT_EDIT)==null)
        {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_container,new EditShopFragment(),TAG_FRAGMENT_EDIT)
                    .commit();
        }
    }


}
