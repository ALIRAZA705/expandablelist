package com.example.expandablelist;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.rgb;
import static android.graphics.ColorSpace.Model.RGB;


/**

 */
public class starttaskfrag extends Fragment {

 //  public Button starttravel,starttask;
    TextView t1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_starttaskfrag, container, false);
        t1=  view.findViewById(R.id.frag_travellingtext);
        Bundle b2 = getArguments();
        if(b2!=null)
        {
            String name=b2.getString("name");

            t1.setText(name);

        }
//        starttravel=view.findViewById(R.id.start_travel);
//        starttask=view.findViewById(R.id.start_task);
//        //////////////////////////////
//        //start travel/////////////
//        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//
//
//        builder.setMessage("You are Travelling !");
//        builder.setTitle("Status in process");
//
//        //Setting message manually and performing action on button click
//        builder.setMessage("You are Travelling !");
//    //    CWinApp::SetDialogBkColor(COLORREF clrCtlBk, COLORREF clrCtlText)
//      //  builder.SetDialogBkColor(RGB(255, 0, 0), RGB(0, 255, 0));
//        //This will not allow to close dialogbox until user selects an option
//        builder.setCancelable(false);
//        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int id) {
//                Toast.makeText(getActivity(), "positive button", Toast.LENGTH_SHORT).show();
//                //builder.finish();
//            }
//        });
//        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int id) {
//                //  Action for 'NO' Button
//                Toast.makeText(getActivity(), "negative button", Toast.LENGTH_SHORT).show();
//                dialog.cancel();
//            }
//        });

      //  MainActivity.starttravel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AlertDialog alert = builder.create();
//                alert.show();
//
//            }
//        });
////
////////////////////////////////
//        //start task/////////////
//        //Creating dialog box
//
//
//
//        final AlertDialog.Builder builder1 = new AlertDialog.Builder(getActivity());
//
//
//        builder1.setMessage("You are Travelling !");
//        builder1.setTitle("Status in process");
//
//        //Setting message manually and performing action on button click
//        builder1.setMessage("Your are Working!");
//        //    CWinApp::SetDialogBkColor(COLORREF clrCtlBk, COLORREF clrCtlText)
//        //  builder.SetDialogBkColor(RGB(255, 0, 0), RGB(0, 255, 0));
//        //This will not allow to close dialogbox until user selects an option
//        builder1.setCancelable(false);
//        builder1.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int id) {
//                Toast.makeText(getActivity(), "positive button", Toast.LENGTH_SHORT).show();
//                //builder.finish();
//            }
//        });
//        builder1.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int id) {
//                //  Action for 'NO' Button
//                Toast.makeText(getActivity(), "negative button", Toast.LENGTH_SHORT).show();
//                dialog.cancel();
//            }
//        });
//        starttask.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AlertDialog alert = builder1.create();
//
//                alert.show();
//                starttask.setText("End task");
//
//            }
//        });
        //Setting the title manually
        //alert.setTitle("AlertDialogExample");

        return view;
    }
}
