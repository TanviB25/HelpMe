package com.tanvi.myway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.tanvi.myway.R;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchDonor extends AppCompatActivity {

    Button button8;

    String[]donors;

    ArrayList<String>listItems;
    ArrayAdapter<String>adapter;

    ListView listView;


    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_donor);



        listView = (ListView) findViewById(R.id.listView);

        editText = (EditText) findViewById(R.id.txtsearch);


        initList();


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s.toString().equals("")){  //reset listview

                    initList();

                }

                else
                {
                    searchItem(s.toString());
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    public void searchItem(String textToSearch){

        for(String item:donors){

            if (!item.contains(textToSearch)){
                listItems.remove(item);
            }
        }

        adapter.notifyDataSetChanged();
    }




       // ListView listView= (ListView)findViewById(R.id.ListViewDonor);

      //  ArrayList<String>arrayDonor= new ArrayList<>();
        //arrayDonor.addAll(Arrays.asList(getResources().getStringArray(R.array.array_donor)));


        //adapter= new ArrayAdapter<>(SearchDonor.this,android.R.layout.simple_list_item_1,arrayDonor);

       // listView.setAdapter(adapter);


    public void initList(){
        donors=new String[]{"Roven Lobo   A+ Frazer Town, bangalore Reena Julian   A+ OMBR Layout, bangalore", "Biju George    O+ Cambridge Road, bangalore",
                "Prakash    O+ Vijaynagar, bangalore",
                "Shridhar   AB+    doddabommasandra, bangalore",
               " Naozad AB+    yelahanka, bangalore,vivek A+ brookfield, bangalore",
                       "Imran syed A+ CV Raman Nagar, bangalore",
                       "Sai    A+ Marathahalli, bangalore",
                       "Sivalingam gunasekaran A+ sarjapur, bangalore",
                       "T.manideep kumar reddy A+ Agb layout,chikbanavara, bangalore",
                       "Manoj deep patel   A+ rt nagar, bangalore",
                       "Naveen singh   A+ Bangalore, bangalore",
                       "SHREESHAIL metri   A+ h s r layout, bangalore",
                       "karthik    A+ bommasandra, bangalore",
                       "Burton Sunny D&apos;Almeida    A+ Banaswadi, bangalore",
                       "Rajender Kumar A+ 4th cross, bangalore",
                       "Ranjini M Ramesh   A+ Vishveshwaraiah layout, bangalore",
                       "NAVEEN KUMAR S A+ Sahakaranagar, bengaluru",
                "nirmala lobo george    O+ cambridge road, ulsoor, bangalore",
                "Shanmugam TN   O+ Vidyaranyapura, bangalore",
                "Amit Daga  O+ Marathahallli, bangalore",
                "KIRAN K N  O+ SAPTAGIRI LAYOUT, VIDYARANYAPURA",
                "Ramya  O+ Shirdi Sai Nagar, K Narayanpura",
                "kushal verma   O+ old airport road, bangalore",
                "Subramanya Sharma  O+ Jayanagar, bangalore"};

        listItems=new ArrayList<>(Arrays.asList(donors));

        adapter=new ArrayAdapter<>(this,R.layout.list_item,R.id.txtitem,listItems);

        listView.setAdapter(adapter);
    }
}
