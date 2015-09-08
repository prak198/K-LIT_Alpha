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
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class ItineraryDay2 extends Fragment {
    private View view;
    private ArrayList<DaysGnS> daysGnSArray = new ArrayList<DaysGnS>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_itinerary_day2, container, false);
        //CHECK NET TOAST @PRAKASH
        if (!isNetworkOnline()==true)
        {
//            Toast.makeText(getActivity(), "No Network Connection ",
//                    Toast.LENGTH_LONG).show();
            toast();
            ProgressBar pb = (ProgressBar) view.findViewById(R.id.day2_progressBar);

            pb.setVisibility(View.INVISIBLE);
        }else{
        new Day2Async().execute("http://iidea8.webuda.com/services/itenary_service.php?date=2015-10-24");
        }
        setRetainInstance(true);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        MyApplication.getInstance().trackScreenView("Itinerary Day 2");
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

    public class Day2Async extends AsyncTask<String, Void, ArrayList<DaysGnS>> {


        ProgressBar pb = (ProgressBar) view.findViewById(R.id.day2_progressBar);

        @Override
        protected void onPreExecute() {
            pb.setVisibility(View.VISIBLE);
            super.onPreExecute();
        }

        @Override
        protected ArrayList<DaysGnS> doInBackground(String... params) {
            JSONArray rootArray = HttpManager.getData(params[0]);
            DaysGnS daysGnS = null;

            for (int i = 0; i < rootArray.length(); i++) {
                try {
                    JSONObject rootObjects = rootArray.getJSONObject(i);
                    String eventName = rootObjects.getString("event_Name");
                    String start_time = rootObjects.getString("EVENT_START_TIME");
                    String end_time = rootObjects.getString("EVENT_END_TIME");
                    JSONArray speakerArray = rootObjects.getJSONArray("Speaker_Children");
                    JSONArray moderaterArray = rootObjects.getJSONArray("moderator_Children");
                    JSONArray curaterArray = rootObjects.getJSONArray("curator_Children");

                    StringBuilder speakerStringBuilder = new StringBuilder(speakerArray.length());
                    StringBuilder moderaterStringBuilder = new StringBuilder(moderaterArray.length());
                    StringBuilder curatorStringBuilder = new StringBuilder(curaterArray.length());
                    StringBuilder moderatedBy = new StringBuilder();
                    StringBuilder curatedBy = new StringBuilder();

                    for (int m = 0; m < moderaterArray.length(); m++) {
                        JSONObject moderaterObjects = moderaterArray.getJSONObject(m);
                        String moderaterFirstName = moderaterObjects.getString("Moderator_name");
                        String moderaterLastName = moderaterObjects.getString("Moderator_last_name");
                        moderaterStringBuilder.append(moderaterFirstName).append(" ")
                                .append(moderaterLastName).append("  ");
                        moderatedBy.delete(0, 13);

                        if (moderaterFirstName.equals("")) {
                            moderatedBy.append("");

                        } else {
                            moderatedBy.append("Moderated By: ");
                        }

                    }

                    for (int c = 0; c < curaterArray.length(); c++) {
                        JSONObject curaterObjects = curaterArray.getJSONObject(c);
                        String curaterFirstName = curaterObjects.getString("curator_name");
                        String curaterLastName = curaterObjects.getString("curator_last_name");
                        curatorStringBuilder.append(curaterFirstName)
                                .append(" ").append(curaterLastName).append("  ");
                        curatedBy.delete(0, 13);

                        if (curaterFirstName.equals("")) {
                            curatedBy.append("");

                        } else {
                            curatedBy.append("Curated By: ");
                        }
                    }

                    for (int k = 0; k < speakerArray.length(); k++) {
                        JSONObject speakerObjects = speakerArray.getJSONObject(k);
                        String speakerFirstName = speakerObjects.getString("SPEAKER_NAME");
                        String speakerLastName = speakerObjects.getString("SPEAKER_LAST_NAME");
                        String speakerProf = speakerObjects.getString("SPEAKER_PROFILE");
                        if (speakerFirstName.equals("")) {
                            String speakerProfile = (" " + speakerProf);
                            speakerStringBuilder.append("").append(speakerFirstName).append(" ").append(speakerLastName)
                                    .append(speakerProfile).append("");
                        } else {
                            String speakerProfile = (", " + speakerProf);
                            speakerStringBuilder.append("\n").append(speakerFirstName).append(" ").append(speakerLastName)
                                    .append(speakerProfile).append("\n");
                        }
                    }
                    speakerStringBuilder.toString();
                    daysGnS = new DaysGnS();
                    daysGnS.setEventName(eventName);
                    daysGnS.setTime(start_time + "-" + end_time);
                    daysGnS.setSpeakers(speakerStringBuilder);
                    daysGnS.setModerator(moderatedBy.append(moderaterStringBuilder).append(curatedBy).append(curatorStringBuilder));
                    daysGnSArray.add(daysGnS);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return daysGnSArray;
        }

        @Override
        protected void onPostExecute(ArrayList<DaysGnS> result) {
            ListView listViewDay1 = (ListView) view.findViewById(R.id.list_view_day1);
            DaysAdapter daysAdapter = new DaysAdapter(getActivity().getBaseContext(), result);
            listViewDay1.setAdapter(daysAdapter);
            pb.setVisibility(View.INVISIBLE);
            super.onPostExecute(result);
        }
    }
}

