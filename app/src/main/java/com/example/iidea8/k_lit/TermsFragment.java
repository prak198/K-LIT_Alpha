package com.example.iidea8.k_lit;

import android.app.Fragment;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Abhigyan on 8/31/2015.
 */
public class TermsFragment extends Fragment {
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.terms_conditions, container, false);
        Button btDecline = (Button) view.findViewById(R.id.bt_decline);
        Button btAccept = (Button) view.findViewById(R.id.bt_accept);
        btAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isNetworkOnline()==true) {
//                    Toast.makeText(getActivity(), "Contest Require Net Connection",
//                            Toast.LENGTH_LONG).show();
                    toast();

                }
                else
                { getFragmentManager().beginTransaction()
                            .replace(R.id.frame_layout, new Contest()).commit();}



            }
        });
        btDecline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.frame_layout, new Home()).commit();
            }
        });
        return view;
    }
    public boolean isNetworkOnline() {
        boolean status=false;
        try{
            ConnectivityManager cm = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo netInfo = cm.getNetworkInfo(0);
            if (netInfo != null && netInfo.getState()== NetworkInfo.State.CONNECTED) {
                status= true;
            }else {
                netInfo = cm.getNetworkInfo(1);
                if(netInfo!=null && netInfo.getState()== NetworkInfo.State.CONNECTED)
                    status= true;
            }
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return status;

    }

    public void toast() {


        //get the LayoutInflater and inflate the custom_toast layout
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup)
                view.findViewById(R.id.toast_layout_root));

        //get the TextView from the custom_toast layout
        TextView text = (TextView) layout.findViewById(R.id.toastText);
        text.setText("Contest Require Net Connection");

        //create the toast object, set display duration,
        //set the view as layout that's inflated above and then call show()
        Toast t = new Toast(getActivity());
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(layout);
        t.show();
    }
}

