package com.example.whatsappc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Frag2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Frag2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Frag2() {
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
    public static Frag2 newInstance(String param1, String param2) {
        Frag2 fragment = new Frag2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] Name ={"Roni_786","Sheri","Saad","Ahmad","Faisal","Husnain","Izhan","Hammad","Ashir","Roni_786","Sheri","Saad","Ahmad","Faisal","Husnain","Izhan","Hammad","Ashir"};
        String[] Status ={" 2 minutes ago"," 5 minutes ago","Today, 2:02 pm"," Today, 11:00 pm"," Yesterday, 1:10 pm", "22 july, 9:58 pm", " 20 July, 10:50 am"," 19 July, 9:50 pm"," 17 July, 1:50 pm",
                " 2 minutes ago"," 5 minutes ago","Today, 2:02 pm"," Today, 11:00 pm"," Yesterday, 1:10 pm", "22 july, 9:58 pm", " 20 July, 10:50 am"," 19 July, 9:50 pm"," 17 July, 1:50 pm"};
        int[] Photo = {R.drawable.roni,R.drawable.sheri,R.drawable.saad,R.drawable.ahmad,R.drawable.faisal,R.drawable.husnain,R.drawable.izhan,R.drawable.hammad,R.drawable.ashir,R.drawable.roni,
                R.drawable.sheri,R.drawable.saad,R.drawable.ahmad,R.drawable.faisal,R.drawable.husnain,R.drawable.izhan,R.drawable.hammad,R.drawable.ashir};
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        RecyclerView statusRecyclerView = view.findViewById(R.id.Status_list);
        statusRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        StatusAdapter statusAdapter = new StatusAdapter(Name,Status,Photo);
        statusRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        statusRecyclerView.setAdapter(statusAdapter);
        return view;
    }
}