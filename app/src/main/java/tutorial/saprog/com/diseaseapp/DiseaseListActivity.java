package tutorial.saprog.com.diseaseapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class DiseaseListActivity extends Activity {

    private DiseaseList diseaseList = null;
    private DiseaseListAdapter diseaseListAdapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_list);
        setDiseaseList();
    }

    private void setDiseaseList() {
        diseaseList = new DiseaseList();
        diseaseListAdapter = new DiseaseListAdapter(this,diseaseList);
        ListView listView = (ListView)findViewById(R.id.diseaseList);
        listView.setAdapter(diseaseListAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Disease disease = diseaseList.get(i);
                int id = disease.getId();
                int title = disease.getTitle();
                int definition = disease.getDefintion();
                int symptoms = disease.getSypmptoms();
                int prevention = disease.getPrevention();
                int treatment = disease.getTreatment();

                Intent intent = new Intent(DiseaseListActivity.this,DiseaseActivity.class);
                intent.putExtra("ID",id);
                intent.putExtra("TITLE",title);
                intent.putExtra("DEFINITION",definition);
                intent.putExtra("SYMPTOMS",symptoms);
                intent.putExtra("PREVENTION",prevention);
                intent.putExtra("TREATMENT",treatment);

                startActivity(intent);
            }
        });
    }
}
