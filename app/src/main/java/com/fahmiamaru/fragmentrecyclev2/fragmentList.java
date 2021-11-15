package com.fahmiamaru.fragmentrecyclev2;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

//M. Fahmi Amaruddin
//19.11.3008

public class fragmentList extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<list> listList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_list,container,false);
        recyclerView = (RecyclerView) v.findViewById(R.id.myRecycle);
        RecycleAdapter recycleAdapter = new RecycleAdapter(getContext(),listList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recycleAdapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listList = new ArrayList<>();
        listList.add(new list("Axe","Axe adalah hero strength",R.drawable.axe));
        listList.add(new list("Bristleback","Bristleback adalah hero strength",R.drawable.bristleback));
        listList.add(new list("Doom","Doom adalah hero strength",R.drawable.doom));
        listList.add(new list("Huskar","Huskar adalah hero strength",R.drawable.huskar));
        listList.add(new list("Invoker","Invoker adalah hero intellegent",R.drawable.axe));
        listList.add(new list("Tusk","Tusk adalah hero strength",R.drawable.tusk));
        listList.add(new list("Zeus","Zeus adalah hero intellegent",R.drawable.axe));
    }
}
