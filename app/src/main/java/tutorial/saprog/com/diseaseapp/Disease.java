package tutorial.saprog.com.diseaseapp;

import java.io.Serializable;

/**
 * Created by Aladdin on 14-Mar-18.
 */


public class Disease implements Serializable{
    private int id;
    private int title;
    private int defintion;
    private int sypmptoms;
    private int prevention;
    private int treatment;

    public Disease(int id, int title, int defintion, int sypmptoms, int prevention, int treatment) {
        this.id = id;
        this.title = title;
        this.defintion = defintion;
        this.sypmptoms = sypmptoms;
        this.prevention = prevention;
        this.treatment = treatment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getTitle() {
        return title;
    }
    public int getDefintion() {
        return defintion;
    }

    public void setDefintion(int defintion) {
        this.defintion = defintion;
    }

    public int getSypmptoms() {
        return sypmptoms;
    }

    public void setSypmptoms(int sypmptoms) {
        this.sypmptoms = sypmptoms;
    }

    public int getPrevention() {
        return prevention;
    }

    public void setPrevention(int prevention) {
        this.prevention = prevention;
    }

    public int getTreatment() {
        return treatment;
    }

    public void setTreatment(int treatment) {
        this.treatment = treatment;
    }
}
