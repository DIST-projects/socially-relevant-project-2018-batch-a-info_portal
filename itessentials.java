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

public class itessentials extends AppCompatActivity {
    String s[]={"ITESSENTIALS_2013","ITESSENTIALS_2014","ITESSENTIALS_2015","ITESSENTIALS_2016","ITESSENTIALS_2017"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itessentials);
        ListView listview=(ListView)findViewById(R.id.idlistitessentials);
        CustomAdapter customAdapter=new CustomAdapter();
        listview.setAdapter(customAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    String url="https://drive.google.com/open?id=1ca5GV2J9op05ipFwdtvCr5JLsELoW82k";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==1)
                {
                    String url="https://drive.google.com/open?id=1ca5GV2J9op05ipFwdtvCr5JLsELoW82k";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==2)
                {
                    String url="https://drive.google.com/open?id=1ca5GV2J9op05ipFwdtvCr5JLsELoW82k";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==3)
                {
                    String url="https://drive.google.com/open?id=1ca5GV2J9op05ipFwdtvCr5JLsELoW82k";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(i==4)
                {
                    String url="https://drive.google.com/open?id=1ca5GV2J9op05ipFwdtvCr5JLsELoW82k";
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
            view=getLayoutInflater().inflate(R.layout.itessentialslayout,null);
            TextView t=(TextView)view.findViewById(R.id.iditessentialstext);
            t.setText(s[i]);
            return view;
        }
    }
}
