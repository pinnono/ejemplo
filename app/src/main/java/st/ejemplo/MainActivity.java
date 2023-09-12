package st.ejemplo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private itemAdapter itemAdap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        itemAdap = new itemAdapter(this);

        LinearLayoutManager llm = new LinearLayoutManager(this);

        itemAdap.setData(getData());
        recyclerView.setAdapter(itemAdap);
        recyclerView.setLayoutManager(llm);
    }
    private List<item> getData(){
        List<item> list = new ArrayList<>();
        list.add(new item(R.drawable.hk, "Hollow Knight"));
        list.add(new item(R.drawable.cat, "Gato"));
        return list;
    }
}