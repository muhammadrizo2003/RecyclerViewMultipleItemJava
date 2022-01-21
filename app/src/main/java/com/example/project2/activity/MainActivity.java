package com.example.project2.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.project2.R;
import com.example.project2.adapters.CustomAdapter;
import com.example.project2.models.Member;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        refreshAdapter(prepareMemberList());

    }

    void initViews() {
        context = this;
        recyclerView = findViewById(R.id.recycler_view);
    }

    void refreshAdapter(ArrayList<Member> members) {
        CustomAdapter customAdapter = new CustomAdapter(context, members);
        recyclerView.setAdapter(customAdapter);
    }

    ArrayList<Member> prepareMemberList() {
        ArrayList<Member> members = new ArrayList<>();

        for (int i = 0; i <= 20; i++) {
            if (i == 0 || i == 10 || i == 17) {
                members.add(new Member("Muhammadrizo" + i, "Nurullaxo'jayev" + i, false));
            } else {
                members.add(new Member("Muhammadrizo" + i, "Nurullaxo'jayev" + i, true));
            }
        }
        return members;
    }
}

