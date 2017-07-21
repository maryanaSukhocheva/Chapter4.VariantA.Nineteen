package chapter4.varianta.nineteen.entities;

import java.util.Objects;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Photo extends PartPhotoalbum {
    private String name;

    public Photo() {
    }
    public Photo(String name) {
        this.name = name;
    }
    public Photo(double width, double height) {
        super(width, height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
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
        final Photo other = (Photo) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Photo{" + "name=" + name + '}';
    }

    
    
    
    
    
}
