package com.journaldev.navigationdrawer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class ConnectFragment1 extends Fragment {
    public ConnectFragment1() {
    }
ListView lst;
    String[]  symponame={"ITRIX","ABACUS",
            "PINNACLE","QUANTA","GEOHORIZON",
            "VISION",
            "WAVES","CIVILISATION"
    };
    String[] sympodept={ "IT Department",
    "CSE Department",
    "Mechanical Department",
    "Material Science Department",
    "GeoInformatics Department",
            "ECE Department",
            "EEE Department",
            "Civil Department"};
    Integer[] sympoimg={R.drawable.itrix,R.drawable.abacus,R.drawable.pinnacle,R.drawable.quanta,R.drawable.geohorizon,
    R.drawable.vision,R.drawable.waves,R.drawable.civilisation};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_connect_fragment1, container, false);
lst=(ListView)rootView.findViewById(R.id.listsympo);
 CustomListview customListview=new CustomListview(getActivity(),symponame,sympodept,sympoimg);
      lst.setAdapter(customListview);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    String url="https://www.facebook.com/itrixceg/";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==1)
                {
                    String url="https://www.facebook.com/abacus.cse/";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==2)
                {
                    String url="https://www.facebook.com/PinnacleCEG/";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==3)
                {
                    String url="https://www.facebook.com/PinnacleCEG/";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==4)
                {
                    String url="https://www.facebook.com/geohorizon.ceg/";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==5)
                {
                    String url="https://www.facebook.com/visionceg/";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==6)
                {
                    String url="https://www.facebook.com/wavesceg/";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==7)
                {
                    String url="https://www.facebook.com/Civilisation.AU/";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            }
        });
        return rootView;
    }
}
