package com.example.iidea8.k_lit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.login.LoginManager;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Abhigyan on 7/25/2015.
 */
public class LogoutActivity extends Activity {

    UserLocalStore userLocalStore;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userLocalStore = new UserLocalStore(this);
        LoginManager.getInstance().logOut();

//        Toast.makeText(this, "Successfully Logged Out", Toast.LENGTH_LONG).show();
        toast();
        userLocalStore.clearUserData();
        userLocalStore.setUserLoggedIn(false);


        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    }

    public void toast() {


        //get the LayoutInflater and inflate the custom_toast layout
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup)
                findViewById(R.id.toast_layout_root));

        //get the TextView from the custom_toast layout
        TextView text = (TextView) layout.findViewById(R.id.toastText);
        text.setText("Successfully Logged Out");

        //create the toast object, set display duration,
        //set the view as layout that's inflated above and then call show()
        Toast t = new Toast(getApplicationContext());
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(layout);
        t.show();
    }
}
