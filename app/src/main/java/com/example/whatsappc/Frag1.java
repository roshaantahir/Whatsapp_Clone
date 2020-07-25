package com.example.whatsappc;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Frag1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Frag1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public Frag1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Frag1.
     */
    // TODO: Rename and change types and number of parameters
    public static Frag1 newInstance(String param1, String param2) {
        Frag1 fragment = new Frag1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

//        // TODO: Rename and change types of parameters


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] Name ={"Roni_786","Sheri","Saad","Ahmad","Faisal","Husnain","Izhan","Hammad","Ashir","Roni_786","Sheri","Saad","Ahmad","Faisal","Husnain","Izhan","Hammad","Ashir"};
        String[] Status ={"I am Roni","I am Sheri","I am Saad","I am Ahmad","I am Faisal","I am Husnain","I am Izhan","I am Hammad","I am Ashir","I am Roni","I am Sheri","I am Saad","I am Ahmad","I am Faisal","I am Husnain","I am Izhan","I am Hammad","I am Ashir"};
        String[] Time ={"10:30","08:45","09:56","02:58","12:40","04:58","01:00","05:00","06:08","10:30","08:45","09:56","02:58","12:40","04:58","01:00","05:00","06:08"};
        int[] Photo = {R.drawable.roni,R.drawable.sheri,R.drawable.saad,R.drawable.ahmad,R.drawable.faisal,R.drawable.husnain,R.drawable.izhan,R.drawable.hammad,R.drawable.ashir,R.drawable.roni,R.drawable.sheri,R.drawable.saad,R.drawable.ahmad,R.drawable.faisal,R.drawable.husnain,R.drawable.izhan,R.drawable.hammad,R.drawable.ashir};
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        RecyclerView chatRecyclerView = view.findViewById(R.id.Chat_list);
        chatRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ChatAdapter chatAdapter = new ChatAdapter(Name,Status,Time,Photo);
        chatRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        chatRecyclerView.setAdapter(chatAdapter);
        return view;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}


