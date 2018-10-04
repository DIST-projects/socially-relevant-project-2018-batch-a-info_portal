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

public class embed extends AppCompatActivity {
    String s[]={"Embedded-Systems_2016","Embedded-Systems_2017"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embed);
        ListView listview=(ListView)findViewById(R.id.idlistembed);
        CustomAdapter customAdapter=new CustomAdapter();
        listview.setAdapter(customAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    String url="https://drive.google.com/open?id=1YkeSIFytOZF6tJ9XxtBqGzrCuiV_zwHE";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==1)
                {
                    String url="https://drive.google.com/open?id=1YkeSIFytOZF6tJ9XxtBqGzrCuiV_zwHE";
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
            view=getLayoutInflater().inflate(R.layout.embedlayout,null);
            TextView t=(TextView)view.findViewById(R.id.idembedtext);
            t.setText(s[i]);
            return view;
        }
    }
}
