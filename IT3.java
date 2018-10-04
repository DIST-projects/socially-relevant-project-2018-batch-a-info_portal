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

public class IT3 extends AppCompatActivity {
    String[] sub={"DIGITAL_PRINCIPLES_&_DESIGN",
            "DATABASE","PROBABILITY_&_QUEUEING_THEORY",
            "OBJECT_ORIENTED_PROGRAMMING","EVS"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it3);
        ListView listview=(ListView)findViewById(R.id.idlistit3);
        CustomAdapter customAdapter=new CustomAdapter();
        listview.setAdapter(customAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Intent intent=new Intent(view.getContext(),dpd.class);
                    startActivityForResult(intent,0);
                }
                if(i==1)
                {
                    Intent intent=new Intent(view.getContext(),db.class);
                    startActivityForResult(intent,1);
                }
                if(i==2)
                {
                    Intent intent=new Intent(view.getContext(),pqt.class);
                    startActivityForResult(intent,2);
                }
                if(i==3)
                {
                    Intent intent=new Intent(view.getContext(),oops.class);
                    startActivityForResult(intent,3);
                }
                if(i==4)
                {
                    Intent intent=new Intent(view.getContext(),evs.class);
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
            view=getLayoutInflater().inflate(R.layout.it3layout,null);
            TextView t=(TextView)view.findViewById(R.id.idtextit3);
            t.setText(sub[i]);
            return view;
        }
    }
}
