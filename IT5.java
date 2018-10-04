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

public class IT5 extends AppCompatActivity {
    String[] sub={"Compiler Engineering",
            "Computer Networks","Embedded Systems","Unix Internals"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it5);
        ListView listview=(ListView)findViewById(R.id.idlistit5);
        CustomAdapter customAdapter=new CustomAdapter();
        listview.setAdapter(customAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Intent intent=new Intent(view.getContext(),ce.class);
                    startActivityForResult(intent,0);
                }
                if(i==1)
                {
                    Intent intent=new Intent(view.getContext(),cn.class);
                    startActivityForResult(intent,1);
                }
                if(i==2)
                {
                    Intent intent=new Intent(view.getContext(),embed.class);
                    startActivityForResult(intent,2);
                }
                if(i==3)
                {
                    Intent intent=new Intent(view.getContext(),unix.class);
                    startActivityForResult(intent,3);
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
            view=getLayoutInflater().inflate(R.layout.it5layout,null);
            TextView t=(TextView)view.findViewById(R.id.idtextit5);
            t.setText(sub[i]);
            return view;
        }
    }
}
