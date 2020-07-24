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
 * Use the {@link Frag3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Frag3 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Frag3() {
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
    public static Frag3 newInstance(String param1, String param2) {
        Frag3 fragment = new Frag3();
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
        // Inflate the layout for this fragment
        String[] Name ={"Roni_786","Sheri","Saad","Ahmad","Faisal","Husnain","Izhan","Hammad","Ashir","Roni_786","Sheri","Saad","Ahmad","Faisal","Husnain","Izhan","Hammad","Ashir"};
        int[] callStatus ={R.drawable.ic_baseline_call_made_24,R.drawable.ic_baseline_call_received_24,R.drawable.ic_baseline_call_received_24,R.drawable.ic_baseline_call_made_24,R.drawable.ic_baseline_call_received_24,R.drawable.ic_baseline_call_made_24,R.drawable.ic_baseline_call_made_24,R.drawable.ic_baseline_call_received_24,R.drawable.ic_baseline_call_received_24,
                R.drawable.ic_baseline_call_made_24,R.drawable.ic_baseline_call_received_24,R.drawable.ic_baseline_call_received_24,R.drawable.ic_baseline_call_made_24,R.drawable.ic_baseline_call_received_24,R.drawable.ic_baseline_call_made_24,R.drawable.ic_baseline_call_made_24,R.drawable.ic_baseline_call_received_24,R.drawable.ic_baseline_call_received_24,};
        String[] callTime ={"(2) 2 minutes ago","5 minutes ago","Today, 2:02 pm","(4) Today, 11:00 pm","Yesterday, 1:10 pm", "22 july, 9:58 pm", "(3) 20 July, 10:50 am","19 July, 9:50 pm","(5) 17 July, 1:50 pm",
                "(2) 2 minutes ago","5 minutes ago","Today, 2:02 pm","(4) Today, 11:00 pm","Yesterday, 1:10 pm", "22 july, 9:58 pm", "(3) 20 July, 10:50 am","19 July, 9:50 pm","(5) 17 July, 1:50 pm"};
        int[] Photo = {R.drawable.roni,R.drawable.sheri,R.drawable.saad,R.drawable.ahmad,R.drawable.faisal,R.drawable.husnain,R.drawable.izhan,R.drawable.hammad,R.drawable.ashir,
                R.drawable.roni,R.drawable.sheri,R.drawable.saad,R.drawable.ahmad,R.drawable.faisal,R.drawable.husnain,R.drawable.izhan,R.drawable.hammad,R.drawable.ashir};
        View view = inflater.inflate(R.layout.fragment_3, container, false);

        RecyclerView callsRecyclerView = view.findViewById(R.id.Call_list);
        callsRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        CallsAdapter callsAdapter = new CallsAdapter(Name,callStatus,callTime,Photo);
        callsRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        callsRecyclerView.setAdapter(callsAdapter);
        return view;
    }
}