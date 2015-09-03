package com.example.iidea8.k_lit;


import android.app.Fragment;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Home extends Fragment {
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        //@PRAKASH CHECK NETWORK TOAST
        if (!isNetworkOnline()==true)
        {
            Toast.makeText(getActivity(), "No Network Connection",
                    Toast.LENGTH_LONG).show();
            ProgressBar pb = (ProgressBar) view.findViewById(R.id.homeProgressBar);

            pb.setVisibility(View.INVISIBLE);



        }else
        {
            new HomeAsync().execute("http://iidea8.webuda.com/services/home_screen_service.php?home");

        }



        return view;
    }
    public class HomeAsync extends AsyncTask<String,Void, String>{

        ProgressBar pb = (ProgressBar) view.findViewById(R.id.homeProgressBar);

        @Override
        protected void onPreExecute() {
            pb.setVisibility(View.VISIBLE);
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... params) {
            JSONArray rootArray = HttpManager.getData(params[0]);
            String home = null;
            try {
                JSONObject rootObject = rootArray.getJSONObject(0);
                home = rootObject.getString("home");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return home;
        }

        @Override
        protected void onPostExecute(String result) {
            TextView tvHomeDesc = (TextView) view.findViewById(R.id.tvHomeDesc);
            tvHomeDesc.setText(result);
            pb.setVisibility(View.INVISIBLE);
            super.onPostExecute(result);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        MyApplication.getInstance().trackScreenView("Home");
    }
//NETWORK CHECK METHOD @PRAKASH
    public boolean isNetworkOnline() {
        boolean status=false;
        try{
            ConnectivityManager cm = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo netInfo = cm.getNetworkInfo(0);
            if (netInfo != null && netInfo.getState()==NetworkInfo.State.CONNECTED) {
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
}
