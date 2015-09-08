
package com.example.iidea8.k_lit;

import android.app.Fragment;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ListviewActivity extends Fragment {

    ListView listView;
    ArrayList<HashMap<String, String>> arrList;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        view = inflater.inflate(R.layout.activity_list, container, false);

        if (!isNetworkOnline()==true)
        {
//            Toast.makeText(getActivity(), "No Network Connection For Feeds",
//                    Toast.LENGTH_LONG).show();
            toast();
        }

        listView = (ListView) view.findViewById(R.id.listview);
        arrList = new ArrayList<HashMap<String, String>>();

        String json_str = getJsonData();

        try{
            JSONArray jArray = new JSONArray(json_str);

            for (int i = 0; i < jArray.length(); i++) {
                JSONObject json = null;
                json = jArray.getJSONObject(i);

                HashMap<String, String> map1 = new HashMap<String, String>();

                // adding each child node to HashMap key => value
                map1.put("EVENT_LOCATION", json.getString("EVENT_LOCATION"));
                map1.put("EVENT_START_TIME", json.getString("EVENT_START_TIME"));
                map1.put("EVENT_END_TIME", json.getString("EVENT_END_TIME"));
                map1.put("event_Name", json.getString("event_Name"));
                map1.put("EVENT_DESC", json.getString("EVENT_DESC"));



                // adding HashList to ArrayList
                arrList.add(map1);
            }

        } catch ( JSONException e) {
            e.printStackTrace();
        }

        if(!arrList.isEmpty()){
            ListAdapter adapter = new SimpleAdapter( getActivity(), arrList,
                    R.layout.list_item, new String[] { "EVENT_LOCATION", "EVENT_START_TIME", "EVENT_END_TIME", "event_Name","EVENT_DESC"},
                    new int[] { R.id.wid, R.id.name, R.id.url , R.id.one , R.id.two });

            listView.setAdapter(adapter);
        }
        setRetainInstance(true);
        return view;
    }

    private String getJsonData(){
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                .detectDiskReads()
                .detectDiskWrites()
                .detectNetwork()   // or .detectAll() for all detectable problems
                .penaltyLog()
                .build());

        String str = "";
        //url


   HttpResponse response;
       HttpClient myClient = new DefaultHttpClient();
        HttpPost myConnection = new HttpPost("http://iidea8.webuda.com/services/overview_service.php");

        try {
            response = myClient.execute(myConnection);
            str = EntityUtils.toString(response.getEntity(), "UTF-8");

        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return str;
    }
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

    public void toast() {


        //get the LayoutInflater and inflate the custom_toast layout
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup)
                view.findViewById(R.id.toast_layout_root));

        //get the TextView from the custom_toast layout
        TextView text = (TextView) layout.findViewById(R.id.toastText);
        text.setText("No Network Connection For Feeds");

        //create the toast object, set display duration,
        //set the view as layout that's inflated above and then call show()
        Toast t = new Toast(getActivity());
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(layout);
        t.show();
    }
}