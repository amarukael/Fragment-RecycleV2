package com.fahmiamaru.fragmentrecyclev2;

import android.os.Bundle;
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

public class fragmentHero extends Fragment {

    View v1;
    private RecyclerView recyclerView1;
    private List<hero> heroList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v1 = inflater.inflate(R.layout.fragment_hero,container,false);
        recyclerView1 = (RecyclerView) v1.findViewById(R.id.myRecycleHero);
        RecycleAdapterHero recycleAdapterhero = new RecycleAdapterHero(getContext(),heroList);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView1.setAdapter(recycleAdapterhero);

        return v1;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        heroList = new ArrayList<>();
        heroList.add(new hero("Axe", R.drawable.axe));
        heroList.add(new hero("Bristleback", R.drawable.bristleback));
        heroList.add(new hero("Doom", R.drawable.doom));
        heroList.add(new hero("Huskar", R.drawable.huskar));
        heroList.add(new hero("Invoker", R.drawable.invoker));
        heroList.add(new hero("Tusk", R.drawable.tusk));
        heroList.add(new hero("Zeus", R.drawable.zeus));
    }

}
