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

public class db extends AppCompatActivity {
    String s[]={"DATABASE_2014","DATABASE_2015","DATABASE_2016","DATABASE_2017"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db);
        ListView listview=(ListView)findViewById(R.id.idlistdb);
        CustomAdapter customAdapter=new CustomAdapter();
        listview.setAdapter(customAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    String url="https://drive.google.com/open?id=1rZz-nx4Ju-_KuC-wApjib-hZoXAeYJ62";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==1)
                {
                    String url="https://drive.google.com/open?id=167kumCaD6qHHVWJJiylP5x3uHotnqan-";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==2)
                {
                    String url="https://drive.google.com/open?id=1CNgl5DeZnVmKGvBP0Rlcd0yl5_TXRdCx";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==3)
                {
                    String url="https://drive.google.com/open?id=1IUgB3wzVAtfyjCH9n3Wl1Et5ORkl38mF";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
          /*      if(i==2)
                {
                    Intent intent=new Intent(view.getContext(),itessentials.class);
                    startActivityForResult(intent,2);
                }
                if(i==3)
                {
                    Intent intent=new Intent(view.getContext(),ds.class);
                    startActivityForResult(intent,3);
                }
                if(i==4)
                {
                    Intent intent=new Intent(view.getContext(),techeng.class);
                    startActivityForResult(intent,4);
                } */
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
            view=getLayoutInflater().inflate(R.layout.dblayout,null);
            TextView t=(TextView)view.findViewById(R.id.iddbtext);
            t.setText(s[i]);
            return view;
        }
    }
}
