package com.journaldev.navigationdrawer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class eg extends AppCompatActivity {
String s[]={"EG_2014","EG_2015","EG_2016","EG_2017"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eg);
        ListView listview=(ListView)findViewById(R.id.idlisteg);
        CustomAdapter customAdapter=new CustomAdapter();
        listview.setAdapter(customAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    String url="https://drive.google.com/open?id=1zmyJgiYyjgbH-y51kC2dE-1uEqUBqm_2";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==1)
                {
                    String url="https://drive.google.com/open?id=1DqfwlMscfgKmtmQvR5GFicZBPMpH8KcN";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==2)
                {
                    String url="https://drive.google.com/open?id=1q-6HJL1eVkZicZaongRomIlAst_dX2tY";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==3)
                {
                    String url="https://drive.google.com/open?id=17MeAPqbrWOxwRA4ddPQswJ7f6W-HeL73";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }

            }
        });
    }
    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return s.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=getLayoutInflater().inflate(R.layout.eglayout,null);
            TextView t=(TextView)view.findViewById(R.id.idegtext);
            t.setText(s[i]);
            return view;
        }
    }
}
