package com.example.ricky52194.listviewdemo;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.class_schedule);
        String[] stringArray = {"CSCI221","CSCI350", "CSCI320", "CSCI230", "CSCI332", "CSCI490", "CSCI462", "CSCI490", "CSCI310", "DATA210"};
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, stringArray);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Short click", Toast.LENGTH_SHORT).show();
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Looooooong click", Toast.LENGTH_SHORT).show();

                return false;
            }
        });


    }
}
