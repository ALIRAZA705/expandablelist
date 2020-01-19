package com.example.expandablelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ExpandableListView listView;
    private expandablelist listdataadapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    public int currentimages;
    int[] images={R.drawable.beforetravel,R.drawable.duringtravelliing,R.drawable.beforetask,R.drawable.duringtask};
    Button starttravel,starttask;
    ImageView starttravelimge,starttaskimage;
    public static FragmentManager fm;
    FragmentTransaction ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =  findViewById(R.id.exp);
        init();
        listdataadapter= new expandablelist(this,listDataHeader,listHash);
        listView.setAdapter(listdataadapter);
        starttaskfrag m11 = new starttaskfrag();
        fm=getSupportFragmentManager();
        ft=fm.beginTransaction();
        ft.add(R.id.fragment_container,m11);

        ft.commit();
onstarttravelclick();
onstarttaskclick();
    }
    private  void init(){
        listDataHeader=new ArrayList<>();
        listHash=new HashMap<>();
        listDataHeader.add("Details");
        listDataHeader.add("Contact Person");
        listDataHeader.add("Address");
      //  listDataHeader.add("UMP");

        List<String> emdtdev =new ArrayList<>();
        emdtdev.add("Troubleshoot and repair the server rocks in cabinet#7. Troubleshooting Server issues. Overview. The HES Digital Lighting SERVER computer");

        List<String> androidstudio =new ArrayList<>();
        androidstudio.add("Muhammad Fasial" );
        androidstudio.add("Director Customer Support");
        androidstudio.add("muhammad.faisal@abc.com");
        androidstudio.add("+92-300-745-4342");
        List<String> xamarin =new ArrayList<>();
        xamarin.add("EME NUST ");
//        xamarin.add("abc2 whatsapp");
//        xamarin.add("abc2 eme");
////        xamarin.add("abc2 eaaa");
//        List<String> ump =new ArrayList<>();
//        ump.add("abc2 expand list view");
//        ump.add("abc2 whatsapp");
//        ump.add("abc2 eme");
//        ump.add("abc2 eaaa");
//        listHash.put(listdataadapter.get(0),abc1);
//        listHash.put(listdataadapter.get(1),abc2);
        //hashMap.put(ls.get(0),abc3);
        listHash.put(listDataHeader.get(0),emdtdev);
        listHash.put(listDataHeader.get(1),androidstudio);
        listHash.put(listDataHeader.get(2),xamarin);
//        listHash.put(listDataHeader.get(3),ump);
        /////////////////


    }
    public void onstarttaskclick()
    {
        starttravelimge=findViewById(R.id.image_travel);
        starttravel=findViewById(R.id.start_travel);
        starttravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
currentimages++;
//currentimages=currentimages%images.length;
               // starttravelimge.setImageResource(images[currentimages]);
                starttravelimge.setImageResource(images[1]);
            }
        });

    }

    public void onstarttravelclick()
    {
        starttaskimage=findViewById(R.id.image_task);
        starttask=findViewById(R.id.start_task);
        starttask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name ="You are Working";
                currentimages++;
//currentimages=currentimages%images.length;
                // starttravelimge.setImageResource(images[currentimages]);
                starttaskimage.setImageResource(images[3]);


                FragmentTransaction ft;
                fm=getSupportFragmentManager();
                ft=fm.beginTransaction();
                Bundle b1 = new Bundle();
                starttaskfrag m13= new starttaskfrag();
                b1.putString("name",name);

                m13.setArguments(b1);
                ft.add(R.id.fragment_container,m13);
                ft.commit();

            }
        });

    }



}
