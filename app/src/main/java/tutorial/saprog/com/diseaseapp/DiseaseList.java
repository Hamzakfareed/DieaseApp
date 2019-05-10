package tutorial.saprog.com.diseaseapp;

import java.util.ArrayList;

/**
 * Created by Aladdin on 14-Mar-18.
 */

public class DiseaseList extends ArrayList<Disease> {

    public DiseaseList() {
        add(new Disease(1,R.string.title,R.string.definition,R.string.symptoms,R.string.prevention,R.string.treatment));
        add(new Disease(2,R.string.title1,R.string.definition1,R.string.symptom1,R.string.prevention1,R.string.treatment1));
        add(new Disease(3,R.string.title2,R.string.definition2,R.string.symptoms2,R.string.prevention2,R.string.treatment2));
        add(new Disease(4,R.string.title3,R.string.definition3,R.string.symptoms3,R.string.prevention3,R.string.treatment3));
        add(new Disease(5,R.string.title4,R.string.definition4,R.string.symptom4,R.string.prevention4,R.string.treatment4));
        add(new Disease(6,R.string.title5,R.string.definition5,R.string.symptom5,R.string.prevention1,R.string.treatment5));
        add(new Disease(7,R.string.title6,R.string.definition1,R.string.symptoms6,R.string.prevention6,R.string.treatment6));


    }
}
