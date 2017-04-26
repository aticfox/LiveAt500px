<<<<<<< HEAD
package com.example.anfield.liveat500px.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.example.anfield.liveat500px.R;
import com.example.anfield.liveat500px.adapter.PhotoListAdapter;
import com.example.anfield.liveat500px.dao.PhotoItemCollectionDao;
import com.example.anfield.liveat500px.managet.Contextor;
import com.example.anfield.liveat500px.managet.HttpManager;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by nuuneoi on 11/16/2014.
 */
public class MainFragment extends Fragment {

    ListView listView;
    PhotoListAdapter listAdapter;

    public MainFragment() {
        super();
    }

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {
        // Init 'View' instance(s) with rootView.findViewById here
        listView = (ListView) rootView.findViewById(R.id.listView);
        listAdapter = new PhotoListAdapter();
        listView.setAdapter(listAdapter);

        Call<PhotoItemCollectionDao> call = HttpManager.getInstance().getService().loadPhotoList();
        call.enqueue(new Callback<PhotoItemCollectionDao>() {

            //ถูกเรียกเมื่อติดต่อ server สำเร็จและได้ข้อมูลกลับมา ข้อมูลกลับมาไม่จำเป็นต้อง json อาจเป็น 404 not found ต้องฟิวเตอก่อนตั้ง if แบบข้างล่าง
            @Override
            public void onResponse(Call<PhotoItemCollectionDao> call,
                                   Response<PhotoItemCollectionDao> response) {
                //เช็คว่าข้อมูลกลับมาได้ไหม และสามารถแปลงเป็น DAO กลับมาให้เราใช้งานได้
                if(response.isSuccessful()){
                    PhotoItemCollectionDao dao = response.body();
                    Toast.makeText(Contextor.getInstance().getContext(),
                            dao.getData().get(0).getCaption(),
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    //Handle
                    try {
                        Toast.makeText(Contextor.getInstance().getContext(),
                                response.errorBody().string(),
                                Toast.LENGTH_SHORT).show();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }

            //
            @Override
            public void onFailure(Call<PhotoItemCollectionDao> call,
                                  Throwable t) {
                    //Handle
                Toast.makeText(Contextor.getInstance().getContext(),
                        t.toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    /*
     * Save Instance State Here
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save Instance State here
    }

    /*
     * Restore Instance State Here
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            // Restore Instance State here
        }
    }
}
=======
package com.example.anfield.liveat500px.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.example.anfield.liveat500px.R;
import com.example.anfield.liveat500px.adapter.PhotoListAdapter;
import com.example.anfield.liveat500px.dao.PhotoItemCollectionDao;
import com.example.anfield.liveat500px.managet.Contextor;
import com.example.anfield.liveat500px.managet.HttpManager;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by nuuneoi on 11/16/2014.
 */
public class MainFragment extends Fragment {

    ListView listView;
    PhotoListAdapter listAdapter;

    public MainFragment() {
        super();
    }

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {
        // Init 'View' instance(s) with rootView.findViewById here
        listView = (ListView) rootView.findViewById(R.id.listView);
        listAdapter = new PhotoListAdapter();
        listView.setAdapter(listAdapter);

        Call<PhotoItemCollectionDao> call = HttpManager.getInstance().getService().loadPhotoList();
        call.enqueue(new Callback<PhotoItemCollectionDao>() {

            //ถูกเรียกเมื่อติดต่อ server สำเร็จและได้ข้อมูลกลับมา ข้อมูลกลับมาไม่จำเป็นต้อง json อาจเป็น 404 not found ต้องฟิวเตอก่อนตั้ง if แบบข้างล่าง
            @Override
            public void onResponse(Call<PhotoItemCollectionDao> call,
                                   Response<PhotoItemCollectionDao> response) {
                //เช็คว่าข้อมูลกลับมาได้ไหม และสามารถแปลงเป็น DAO กลับมาให้เราใช้งานได้
                if(response.isSuccessful()){
                    PhotoItemCollectionDao dao = response.body();
                    Toast.makeText(Contextor.getInstance().getContext(),
                            dao.getData().get(0).getCaption(),
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    //Handle
                    try {
                        Toast.makeText(Contextor.getInstance().getContext(),
                                response.errorBody().string(),
                                Toast.LENGTH_SHORT).show();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }

            //
            @Override
            public void onFailure(Call<PhotoItemCollectionDao> call,
                                  Throwable t) {
                    //Handle
                Toast.makeText(Contextor.getInstance().getContext(),
                        t.toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    /*
     * Save Instance State Here
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save Instance State here
    }

    /*
     * Restore Instance State Here
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            // Restore Instance State here
        }
    }
}
>>>>>>> 5136052bc9fa7ae6b7b20dfdfbc6b801bc20de51
