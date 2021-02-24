package com.example.android.jobfinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.android.jobfinder.helpers.JobFinderHelper;
import com.example.android.jobfinder.model.JobDao;
import com.example.android.jobfinder.model.JobFinderDatabase;
import com.example.android.jobfinder.model.UserDao;
import com.example.android.jobfinder.pojos.Job;
import com.example.android.jobfinder.utils.Constants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;


import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {

    Executor executor = Executors.newSingleThreadExecutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        executor.execute(() -> {
            JobFinderDatabase db = Room.databaseBuilder(getApplicationContext(),
                    JobFinderDatabase.class, "database-name").build();
        UserDao userDao = db.userDao();
        JobDao jobDao = db.jobDao();
            Log.d(MainActivity.class.getName(), "onCreate: ");
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                    (Request.Method.GET,Constants.Jobs.JOB_URL , null, new Response.Listener<JSONObject>() {

                        @Override
                        public void onResponse(JSONObject response) {
                            Log.d(TAG, response.toString());
                        }
                    }, new Response.ErrorListener() {

                        @Override
                        public void onErrorResponse(VolleyError error) {
                            // TODO: Handle error

                        }
                    });

//            JobFinderHelper.getJobs();
//            Log.d(MainActivity.class.getName(), "onCreate: ");
       // URL url;

       // HttpURLConnection urlConnection = null;
       // try {
//            url = new URL(Constants.Jobs.JOB_URL);
//
//            urlConnection = (HttpURLConnection) url
//                    .openConnection();
//
//            InputStream in = urlConnection.getInputStream();
//
//            InputStreamReader isw = new InputStreamReader(in);
//            final Type type = new TypeToken<ArrayList<Job>>() {}.getType();
            //new Gson().fromJson(new JsonReader(new InputStreamReader(in, "UTF-8")), type);
           // Log.d(MainActivity.class.getName(),  new Gson().fromJson(new JsonReader(new InputStreamReader(in, "UTF-8")), type));
//            int data = isw.read();
//            while (data != -1) {
//                String current =  data;
//                data = isw.read();
//                Log.d(MainActivity.class.getName(), current);
 //           }

//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//        finally {
//            if (urlConnection != null) {
//                urlConnection.disconnect();
//            }
//        }
//        }
//            try {
//                JobFinderHelper.getJobs();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
            //Log.d(MainActivity.class.getName(),);





    });
}
}