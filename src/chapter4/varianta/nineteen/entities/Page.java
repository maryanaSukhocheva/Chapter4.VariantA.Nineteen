package chapter4.varianta.nineteen.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Page extends PartPhotoalbum {
    private int numberPage;
    List <Photo> arrayOfPohotos;

    public Page() {
        arrayOfPohotos = new ArrayList<Photo>();
    }

    public Page(double width, double height) {
        super(width, height);
        arrayOfPohotos = new ArrayList<Photo>();
    }

    public Page(int numberPage) {
        this.numberPage = numberPage;
        arrayOfPohotos = new ArrayList<Photo>();
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public List<Photo> getArrayOfPohotos() {
        return arrayOfPohotos;
    }

    public void setArrayOfPohotos(List<Photo> arrayOfPohotos) {
        this.arrayOfPohotos = arrayOfPohotos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.numberPage;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Page other = (Page) obj;
        if (this.numberPage != other.numberPage) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Page{" + "numberPage=" + numberPage + '}';
    }
    
    
}
