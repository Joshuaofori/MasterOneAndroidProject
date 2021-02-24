package com.example.android.jobfinder.helpers;

import android.util.Log;

import com.example.android.jobfinder.pojos.Job;
import com.example.android.jobfinder.utils.Constants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;


public class JobFinderHelper{
//    Job obj = new Job();
//    Gson gson = new Gson();
//    String json = gson.toJson(obj);

// ==> json is {"value1":1,"value2":"abc"}

//    public static void getJobs()  {
//
//        URL url;
//
//        HttpURLConnection urlConnection = null;
//        try {
//            url = new URL(Constants.Jobs.JOB_URL);
//
//            urlConnection = (HttpURLConnection) url
//                    .openConnection();
//
//            InputStream in = urlConnection.getInputStream();
//
//            Log.d(TAG, in.toString());
//
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//        finally {
//            if (urlConnection != null) {
//                urlConnection.disconnect();
//            }
//        }
//    }
    public static List<Job> getJobs() throws Exception{
        // Create the HTTP Get request to Twitter servers
        final HttpURLConnection connection = getHTTPUrlConnection(Constants.Jobs.JOB_URL);
        //connection.setRequestMethod("GET");
        //connection.setRequestProperty("Content-Type", "application/json");

        final int responseCode = connection.getResponseCode();

        // If success
        if (responseCode == 200){
            // Build our Tweet list
            final Type type = new TypeToken<ArrayList<Job>>() {}.getType();
            return new Gson().fromJson(new JsonReader(new InputStreamReader(connection.getInputStream(), "UTF-8")), type);
        }
        return null;
    }
    private static HttpURLConnection getHTTPUrlConnection(String url) throws Exception {
            return (HttpURLConnection) new URL(url).openConnection();
        }
    }




