package com.example.iidea8.k_lit;

/**
 * Created by prakash on 9/8/2015.
 */

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by prakash on 9/8/2015.
 */


public class fragmentaddmore extends Fragment {
    GridView grid;
    String[] web = {
            "Travel Tips",
            "Book Hotel",
            "Register",
            "More",
            "Map",
            "Rate Us !!",
            "Live Stream"


    } ;

    int[] imageId = {
            R.mipmap.tips ,
            R.mipmap.bookhotel ,
            R.mipmap.register,
            R.mipmap.more,
            R.mipmap.map,
            R.mipmap.rate,
            R.mipmap.video


    };
View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.addmore, container, false);

        addmore_adapter adapter = new addmore_adapter(getActivity(), web, imageId);

        grid=(GridView)view.findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setVerticalScrollBarEnabled(false);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0)

                {

                    getFragmentManager().beginTransaction().replace(R.id.frame_layout, new traveltips()).addToBackStack("tra").commit();

                }
                if (position == 6)

                {

                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.24framesdigital.com/kumaonlitfest/"));
                    startActivity(intent);
                }


                if (position == 1)

                {

                    toast3();
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.gohimalayan.com/events/event-detail/kumaon-literary-festival/"));
                    startActivity(intent);

                }


                if (position == 2)

                {
                    toast2();
                    Intent intent2 = new Intent();
                    intent2.setAction(Intent.ACTION_VIEW);
                    intent2.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent2.setData(Uri.parse("http://kumaonliteraryfestival.org/registration_form.php"));
                    startActivity(intent2);

                }


                if (position == 3)

                {
                    getFragmentManager().beginTransaction().replace(R.id.frame_layout, new forwardmore()).addToBackStack("for").commit();

                }


                if (position == 4)

                {


                    getFragmentManager().beginTransaction().replace(R.id.frame_layout, new map()).addToBackStack("map").commit()
                    ;
                }


                if (position == 5)

                {
                    Toast.makeText(getActivity(), "App is Not on Play Store ", Toast.LENGTH_SHORT).show();
                }

            }


        });
        return view;
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

}