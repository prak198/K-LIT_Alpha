package com.example.iidea8.k_lit;


import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Home extends Fragment {
    View view;
    TextView tvHomeDesc = (TextView) view.findViewById(R.id.tvHomeDesc);
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        //@PRAKASH CHECK NETWORK TOAST
        if (!isNetworkOnline()==true)
        {
//            Toast.makeText(getActivity(), "No Network Connection",
//                    Toast.LENGTH_LONG).show();
            toast();

            ProgressBar pb = (ProgressBar) view.findViewById(R.id.homeProgressBar);

            pb.setVisibility(View.INVISIBLE);

          //cache





    }else
        {
            new HomeAsync().execute("http://iidea8.webuda.com/services/home_screen_service.php?home");

        }
        button();

        return view;
    }

    public void button(){

        Button button = (Button) view.findViewById(R.id.bt_login_ideaWebClick2);



        button .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.iidea8.com/"));
                startActivity(intent);



            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        MyApplication.getInstance().trackScreenView("Home");
    }

    //NETWORK CHECK METHOD @PRAKASH
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
//    public void webClick2(View v) {
//        Uri uri = Uri.parse("http://www.iidea8.com/");
//        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//        startActivity(intent);
//    }
    public void home(View v)
    {
        Uri uri = Uri.parse("http://www.iidea8.com/");
        Intent intent3 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent3);

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

            tvHomeDesc.setText(result);
            pb.setVisibility(View.INVISIBLE);
            super.onPostExecute(result);
        }
    }
}
