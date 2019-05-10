package tutorial.saprog.com.diseaseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class DiseaseActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    private  Disease disease;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        Intent bundle = getIntent();

        int id = bundle.getIntExtra("ID",0);
        int title = bundle.getIntExtra("TITLE",0);
        int symptom = bundle.getIntExtra("SYMPTOMS",0);
        int definition =bundle.getIntExtra("DEFINITION",0);
        int prevention = bundle.getIntExtra("PREVENTION",0);
        int treatment = bundle.getIntExtra("TREATMENT",0);
        Disease disease = new Disease(id,title,definition,symptom,prevention,treatment);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(),disease);

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_disease, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {


        private Disease disease;
        public SectionsPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);

        }
        public SectionsPagerAdapter(FragmentManager fm,Disease disease) {
            super(fm);
            this.disease = disease;

        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    DiseaseDefintion diseaseDefintion = DiseaseDefintion.newInstance(disease.getDefintion());
                    return diseaseDefintion;

                case 1:
                    DiseaseSymptoms diseaseSymptoms = DiseaseSymptoms.newInstance(disease.getSypmptoms());
                    return diseaseSymptoms;
                case 2:
                    DiseasePrevention diseasePrevention = DiseasePrevention.newInstance(disease.getPrevention());
                    return diseasePrevention;
                case 3:
                    DiseaseTreatment diseaseTreatment = DiseaseTreatment.newInstance(disease.getTreatment());
                    return diseaseTreatment;
                default:
                    DiseaseDefintion diseaseDefintion1 = DiseaseDefintion.newInstance(disease.getDefintion());
                    return diseaseDefintion1;
            }
        }



        @Override
        public int getCount() {
            // Show 4 total pages.
            return 4;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Definition";
                case 1:
                    return "Symptoms";
                case 2:
                    return "Prevention";
                case 3:
                    return "Treatment";
            }
            return null;
        }
    }
}
