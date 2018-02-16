package com.example.ricky52194.listviewdemo;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import android.widget.Toast;

        import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    //private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.class_schedule);
        Course course;
        ArrayList<Course> courses = new ArrayList<>();

        course = new Course();
        course.setCourseName("Programming II");
        course.setCourseNumber("CSCI221");
        course.setProfessor("Dr. Buhler");
        courses.add(course);

        course = new Course();
        course.setCourseName("Digital Logic and Computer Organization");
        course.setCourseNumber("CSCI350");
        course.setProfessor("Dr. Munsell");
        courses.add(course);

        course = new Course();
        course.setCourseName("Programming Language Concepts");
        course.setCourseNumber("CSCI320");
        course.setProfessor("Dr. Pothering");
        courses.add(course);

        course = new Course();
        course.setCourseName("Data Structures and Algorithms");
        course.setCourseNumber("CSCI230");
        course.setProfessor("Dr. Van Delden");
        courses.add(course);

        //String[] stringArray = {"CSCI221","CSCI350", "CSCI320", "CSCI230", "CSCI332", "CSCI490", "CSCI462", "CSCI490", "CSCI310", "DATA210"};
        //adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, stringArray);

        CourseAdapter adapter = new CourseAdapter(this, courses);

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
