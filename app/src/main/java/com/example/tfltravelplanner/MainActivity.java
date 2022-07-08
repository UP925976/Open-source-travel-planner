package com.example.tfltravelplanner;

import static com.example.tfltravelplanner.DecisionMapTest.navigateMap;
import static com.example.tfltravelplanner.DecisionMapTest.node;
import static com.example.tfltravelplanner.DecisionMapTest.stations;
import static com.example.tfltravelplanner.DijkstrasAlgorithm.calculateShortestPathFromSource;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    protected static MainActivity instance;
    public static Context context;

    Button findRoute;
    TextView routeMessage;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instance = this;

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.blue)));
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.tfl);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

      //  DecisionMapTest navigation = new DecisionMapTest();

        //DecisionMap DecisionMap = new DecisionMap(this);
        context = getApplicationContext();
        //DecisionMap mClass = new DecisionMap(context);
        csvRead();


        AutoCompleteTextView array_spinner;
        array_spinner = (AutoCompleteTextView)findViewById(R.id.start_destination);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, stations);
        array_spinner.setAdapter(adapter);

        AutoCompleteTextView array_spinner2;
        array_spinner = (AutoCompleteTextView)findViewById(R.id.end_destination);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, stations);
        array_spinner.setAdapter(adapter);


        Button btn = findViewById(R.id.find_route);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Calculating", Toast.LENGTH_LONG).show();
            }
        });

        routeMessage = (TextView)findViewById(R.id.route);
        findRoute = (Button)findViewById(R.id.find_route);
        findRoute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Graph graph = new Graph();
                Node nodeA = new Node("A");
                graph.addNode(nodeA);

                graph = DijkstrasAlgorithm.calculateShortestPathFromSource(graph, nodeA);
                Log.d("message",graph.getNodes().toArray().toString());
                //routeMessage.setText((CharSequence) DijkstrasAlgorithm.calculateShortestPathFromSource(graph,nodeA));
            }
        });


        drawerLayout=findViewById(R.id.Background);
        navigationView = findViewById(R.id.nav_view);
        toolbar=findViewById(R.id.toolbar);

        //setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setCheckedItem(R.id.nav_home);


    }


    public static Resources getCSVResources() {
        return instance.getResources();
    }

    public static void csvRead() {
        com.example.tfltravelplanner.Utils u = new com.example.tfltravelplanner.Utils();
        Scanner choice = new Scanner(System.in);
        DecisionMap perec;
        try {
            perec = new DecisionMap();
            u.console("File Found");
        } catch(FileNotFoundException fe){
            u.console("File not found");return;
        }

        //u.lineBreak();
        u.console("Start...");

        navigateMap(u, perec);

//        Log.d("anything", String.valueOf(stations));
    }


    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }

        super.onBackPressed();
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.nav_home:
                break;
            case R.id.TFL_status:
                Intent intent = new Intent(MainActivity.this,TFLstatus.class);
                startActivity(intent);
                break;
            case R.id.map:
                Intent intent2 = new Intent(MainActivity.this,Map.class);
                startActivity(intent2);
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);
         return true;
        }


}