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

public class FixturesFragment1 extends Fragment {
    public FixturesFragment1() {
    }
    ListView lst;
    String[]  symponame={"TECHOFES","KURUKSHETRA","AGNI","VYUHA"
    };
    String[] sympodept={ "EVEN SEMESTER",
            "EVEN SEMESTER",
            "ODD SEMESTER",
            "ODD SEMESTER"};
    Integer[] sympoimg={R.drawable.techo,R.drawable.kuru,R.drawable.agni,R.drawable.vyuha};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_fixtures_fragment1, container, false);
        lst=(ListView)rootView.findViewById(R.id.listculs);
        CustomListview customListview=new CustomListview(getActivity(),symponame,sympodept,sympoimg);
        lst.setAdapter(customListview);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    String url="https://www.facebook.com/techofes.org/";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==1)
                {
                    String url="https://www.facebook.com/kurukshetra.org.in/";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==2)
                {
                    String url="https://www.facebook.com/ArtsSocietyCEG/";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==3)
                {
                    String url="https://www.facebook.com/pg/vyuhaa.ctf/posts/";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }

            }
        });
        return rootView;
    }
}
