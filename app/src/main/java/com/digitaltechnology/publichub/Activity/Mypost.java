package com.digitaltechnology.publichub.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.digitaltechnology.publichub.Adapter.PostAdapter;
import com.digitaltechnology.publichub.Item.MyPost;
import com.digitaltechnology.publichub.R;

import java.util.List;

public class Mypost extends AppCompatActivity {
    public final static String MyPost_URL = "http://gmusodza.kacee.co.zw/foodcart/api2.php";
    private Object Volley;
RecyclerView recyclerView;
PostAdapter adapter;
List<MyPost> myPostLst;
    public Mypost(int id, String name, String email, double phone, double subject, String message) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_mypost);
  //loadPost();
//        ListView listView = (ListView) findViewById(R.id.listView);
//        ArrayList<>
    }
//    private void loadPost(){
//
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, MyPost_URL,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        try {
//                            //converting the string to json array object
//                            JSONArray mypost = new JSONArray(response);
//
//                            //traversing through all the object
//                            for (int i = 0; i < mypost.length(); i++)  {
//
//                                //getting product object from json array
//                                JSONObject product = mypost.getJSONObject(i);
//
//                                //adding the product to product list
//
//                               myPostLst.add(new MyPost(
//                                      product.getInt("id"),
//                                     product.getString("name"),
//                                     product.getString("email"),
//                                    product.getString("phone"),
//                                     product.getString("subject"),
//                                product.getString("message")));
//                              //  MyPost myPost =new MyPost(id,name,email,phone,subject,message);
//                          //myPostLst.add(myPostLst);
//                            }
//
//                           // creating adapter object and setting it to recyclerview
//                            PostAdapter adapter = new PostAdapter(Mypost.this,myPostLst );
//                            recyclerView.setAdapter(adapter);
//                        } catch (JSONException  e) {
//                            e.printStackTrace();
//                            }
//                    }
//                },
//
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Toast.makeText(Mypost.this, error.getMessage(),Toast.LENGTH_SHORT).show();
//                    }
//                });
//                com.android.volley.toolbox.Volley.newRequestQueue(this).add(stringRequest);
//                    //adding our stringrequest to queue
//       // Volley.newRequestQueue(this).add(stringRequest);
//    }
}
