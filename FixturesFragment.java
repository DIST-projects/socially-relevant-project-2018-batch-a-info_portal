package com.journaldev.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.layout.simple_spinner_item;

public class FixturesFragment extends Fragment implements AdapterView.OnItemSelectedListener {




    public FixturesFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);





    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      final  View v= inflater.inflate(R.layout.fragment_fixtures, container, false);
        Button b=(Button)v.findViewById(R.id.idbutton);
        Spinner s = (Spinner) v.findViewById(R.id.spinner1);
        Spinner s1 = (Spinner) v.findViewById(R.id.spinner2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner s = (Spinner) v.findViewById(R.id.spinner1);
                Spinner s1 = (Spinner) v.findViewById(R.id.spinner2);
                String e1=(String.valueOf(s.getSelectedItem()));
                String e2=(String.valueOf(s1.getSelectedItem()));
                if((e1.compareTo("CSE")==0) && (e2.compareTo("1")==0)) {
                    startActivity(new Intent(view.getContext(), IT1.class));
                }
                else if((e1.compareTo("CSE")==0) && (e2.compareTo("2")==0)) {
                    startActivity(new Intent(view.getContext(), IT2.class));
                }
                else if((e1.compareTo("CSE")==0) && (e2.compareTo("3")==0)) {
                    startActivity(new Intent(view.getContext(), IT3.class));
                }
                else if((e1.compareTo("CSE")==0) && (e2.compareTo("4")==0)) {
                    startActivity(new Intent(view.getContext(), IT4.class));
                }
                else if((e1.compareTo("CSE")==0) && (e2.compareTo("5")==0)) {
                    startActivity(new Intent(view.getContext(), IT5.class));
                }
                else if((e1.compareTo("CSE")==0) && (e2.compareTo("6")==0)) {
                    startActivity(new Intent(view.getContext(), IT6.class));
                }
                else if((e1.compareTo("CSE")==0) && (e2.compareTo("7")==0)) {
                    startActivity(new Intent(view.getContext(), IT7.class));
                }
                else if((e1.compareTo("CSE")==0) && (e2.compareTo("8")==0)) {
                    startActivity(new Intent(view.getContext(),IT8.class));
                }
                else if((e1.compareTo("IT")==0) && (e2.compareTo("1")==0)) {
                    startActivity(new Intent(view.getContext(), IT1.class));
                }
                else if((e1.compareTo("IT")==0) && (e2.compareTo("2")==0)) {
                    startActivity(new Intent(view.getContext(), IT2.class));
                }
                else if((e1.compareTo("IT")==0) && (e2.compareTo("3")==0)) {
                    startActivity(new Intent(view.getContext(), IT3.class));
                }
                else if((e1.compareTo("IT")==0) && (e2.compareTo("4")==0)) {
                    startActivity(new Intent(view.getContext(), IT4.class));
                }
                else if((e1.compareTo("IT")==0) && (e2.compareTo("5")==0)) {
                    startActivity(new Intent(view.getContext(), IT5.class));
                }
                else if((e1.compareTo("IT")==0) && (e2.compareTo("6")==0)) {
                    startActivity(new Intent(view.getContext(), IT6.class));
                }
                else if((e1.compareTo("IT")==0) && (e2.compareTo("7")==0)) {
                    startActivity(new Intent(view.getContext(), IT7.class));
                }
                else if((e1.compareTo("IT")==0) && (e2.compareTo("8")==0)) {
                    startActivity(new Intent(view.getContext(), IT8.class));
                }


            }});
     //   s.setOnItemSelectedListener(this);
    //   s1.setOnItemSelectedListener(this);

       final  ArrayList<String> categories = new ArrayList<String>();
        categories.add("CSE");
        categories.add("IT");
       // categories.add("ECE");

       final ArrayList<String> categories1 = new ArrayList<String>();
        categories1.add("1");
        categories1.add("2");
        categories1.add("3");
        categories1.add("4");
        categories1.add("5");
        categories1.add("6");
        categories1.add("7");
        categories1.add("8");

        // Creating adapter for spinner

       ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(),simple_spinner_item,categories);
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(getActivity(),simple_spinner_item,categories1);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        s.setAdapter(new ArrayAdapter<String>(getActivity(),simple_spinner_item,categories));
       s1.setAdapter(new ArrayAdapter<String>(getActivity(),simple_spinner_item,categories1));
   /*     b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((validate())&&(evalidate()))
                {
//uploadd to database

                    final Context context=Register.this;
                    startActivity(new Intent(context,Navigationpage.class));
                } }}); */
        return v;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
       String item = parent.getItemAtPosition(position).toString();
      /*  if(item.equals("CSE"))
            startActivity(new Intent(view.getContext(),cse.class));
        if(item.equals("IT"))
            startActivity(new Intent(view.getContext(),it.class));
        if(item.equals("ECE"))
            startActivity(new Intent(view.getContext(),ece.class)); */

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item,Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    // TODO: Rename method, update argument and hook method into UI event

}
