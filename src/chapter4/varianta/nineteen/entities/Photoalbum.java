package chapter4.varianta.nineteen.entities;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */

public class Photoalbum {
    private List<PartPhotoalbum> partsPhotoalbum;
    private int amountPages ;
    private int amountPhotos ;
    private String caption = "";

     public Photoalbum() {
          partsPhotoalbum = new ArrayList<PartPhotoalbum>();
     }

     public Photoalbum(String text) {
          partsPhotoalbum = new ArrayList<PartPhotoalbum>();
     }
     
     

    public List<PartPhotoalbum> getPartPhotoalbums() {
        return partsPhotoalbum;
    }

   public void setPartPhotoalbums (List<PartPhotoalbum> partsPhotoalbum) {
        if (partsPhotoalbum!=null) {
            this.partsPhotoalbum = partsPhotoalbum;
        }
    }

    public int getAmountPages() {
        if (this.partsPhotoalbum!=null) {
            int amount = 0;
            for (PartPhotoalbum partPhotoalbum : partsPhotoalbum){
                if (partPhotoalbum.getClass().getName() == "chapter4.varianta.nineteen.entities.Page")
                amount++;
        }
            return amount;
        } else 
        {
            return 0 ;
        }
        
    }

    public void setAmountPages(int amountPages) {
        this.amountPages = amountPages;
    }

    public int getAmountPhotos() {
        if (this.partsPhotoalbum!=null) {
            int amount = 0;
            for (PartPhotoalbum partPhotoalbum : partsPhotoalbum){
                if (partPhotoalbum.getClass().getName() == "chapter4.varianta.nineteen.entities.Photo")
                amount++;
        }
            return amount;
        } else 
        {
            return 0 ;
        }
        
    }

    public void setAmountPhotos(int amountPhotos) {
        this.amountPhotos = amountPhotos;
    }

   
    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
   
    public void addPartPhotoalbum(PartPhotoalbum part) {
         if (part!=null) {
            getPartPhotoalbums().add(part);
            System.out.println("Фотография добавлена в фотоальбом");
         }
         
     }
    
    @Override
   public String toString() {
       StringBuilder str = new StringBuilder(this.getCaption());
       for (PartPhotoalbum part : getPartPhotoalbums()) {
           str.append(part.toString());
       }
       return  str.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Photoalbum other = (Photoalbum) obj;
        if (this.partsPhotoalbum != other.partsPhotoalbum && (this.partsPhotoalbum == null || !this.partsPhotoalbum.equals(other.partsPhotoalbum))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (this.partsPhotoalbum != null ? this.partsPhotoalbum.hashCode() : 0);
        return hash;
    }
   

}

