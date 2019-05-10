package tutorial.saprog.com.diseaseapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Aladdin on 14-Mar-18.
 */

class DiseaseListAdapter  extends BaseAdapter{
    private Context context;
    private DiseaseList diseaseList;
    public DiseaseListAdapter(Context context, DiseaseList diseaseList) {
        this.context = context;
        this.diseaseList = diseaseList;

    }

    @Override
    public int getCount() {
        return diseaseList.size();
    }

    @Override
    public Object getItem(int i) {
        return diseaseList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return diseaseList.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Disease disease = diseaseList.get(i);
        LayoutInflater inflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.diease_list_item,null);
        TextView title = (TextView) v.findViewById(R.id.diseaseListTitle);
        title.setText(disease.getTitle());




        return v;
    }
}
