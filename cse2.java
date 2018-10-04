package com.journaldev.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class cse2 extends AppCompatActivity {
    String[] sub={"Technical English II",
            "Mathematics II",


            "Physics for Information Science ",

            "Digital Principles and System Design",
            "Programming using C++"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse2);
        ListView listview=(ListView)findViewById(R.id.idlistcse2);
        CustomAdapter customAdapter=new CustomAdapter();
        listview.setAdapter(customAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Intent intent=new Intent(view.getContext(),cse21.class);
                    startActivityForResult(intent,0);
                }
                if(i==1)
                {
                    Intent intent=new Intent(view.getContext(),cse22.class);
                    startActivityForResult(intent,1);
                }
                if(i==2)
                {
                    Intent intent=new Intent(view.getContext(),cse23.class);
                    startActivityForResult(intent,2);
                }
                if(i==3)
                {
                    Intent intent=new Intent(view.getContext(),cse24.class);
                    startActivityForResult(intent,3);
                }
                if(i==4)
                {
                    Intent intent=new Intent(view.getContext(),cse25.class);
                    startActivityForResult(intent,4);
                }
            }
        });
    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return sub.length;
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
            view=getLayoutInflater().inflate(R.layout.cse2layout,null);
            TextView t=(TextView)view.findViewById(R.id.idtextcse2);
            t.setText(sub[i]);
            return view;
        }
    }
}
