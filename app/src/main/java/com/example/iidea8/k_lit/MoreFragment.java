package com.example.iidea8.k_lit;


import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;


public class MoreFragment extends Fragment {
    View view;
    private GoogleApiClient mGoogleApiClient;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.more_fragment, container, false);


        ImageView book = (ImageView) view.findViewById(R.id.bookhotel);
       book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something
                if (!isNetworkOnline()==true)
                {
//            Toast.makeText(getActivity(), "No Network Connection ",
//                    Toast.LENGTH_LONG).show();
                    toast();
                }else{
                    toast3();
                }
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.gohimalayan.com/events/event-detail/kumaon-literary-festival/"));
                startActivity(intent);



            }
        });
//
        ImageView reg = (ImageView) view.findViewById(R.id.register);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something
                if (!isNetworkOnline()==true)
                {
//            Toast.makeText(getActivity(), "No Network Connection ",
//                    Toast.LENGTH_LONG).show();
                    toast();
                }else{
toast2();
                }
                Intent intent2 = new Intent();
                intent2.setAction(Intent.ACTION_VIEW);
                intent2.addCategory(Intent.CATEGORY_BROWSABLE);
                intent2.setData(Uri.parse("http://kumaonliteraryfestival.org/registration_form.php"));
                startActivity(intent2);


            }
        });



        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        MyApplication.getInstance().trackScreenView("More");
    }


    public void toast() {


        //get the LayoutInflater and inflate the custom_toast layout
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup)
                view.findViewById(R.id.toast_layout_root));

        //get the TextView from the custom_toast layout
        TextView text = (TextView) layout.findViewById(R.id.toastText);
        text.setText("No Network Connection");

        //create the toast object, set display duration,
        //set the view as layout that's inflated above and then call show()
        Toast t = new Toast(getActivity());
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(layout);
        t.show();
    }
    public void toast3() {


        //get the LayoutInflater and inflate the custom_toast layout
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup)
                view.findViewById(R.id.toast_layout_root));

        //get the TextView from the custom_toast layout
        TextView text = (TextView) layout.findViewById(R.id.toastText);
        text.setText("Checkout The Hotel in The Valley");

        //create the toast object, set display duration,
        //set the view as layout that's inflated above and then call show()
        Toast t = new Toast(getActivity());
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(layout);
        t.show();
    }
    public void toast2() {


        //get the LayoutInflater and inflate the custom_toast layout
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup)
                view.findViewById(R.id.toast_layout_root));

        //get the TextView from the custom_toast layout
        TextView text = (TextView) layout.findViewById(R.id.toastText);
        text.setText("Register For Kumaon Festival !!");

        //create the toast object, set display duration,
        //set the view as layout that's inflated above and then call show()
        Toast t = new Toast(getActivity());
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(layout);
        t.show();
    }
    //CHECK NET METHOD @PRAKASH
    public boolean isNetworkOnline() {
        boolean status = false;
        try {
            ConnectivityManager cm = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo netInfo = cm.getNetworkInfo(0);
            if (netInfo != null && netInfo.getState() == NetworkInfo.State.CONNECTED) {
                status = true;
            } else {
                netInfo = cm.getNetworkInfo(1);
                if (netInfo != null && netInfo.getState() == NetworkInfo.State.CONNECTED)
                    status = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return status;

    }


}