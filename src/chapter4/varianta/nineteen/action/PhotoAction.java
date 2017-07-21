package chapter4.varianta.nineteen.action;

import chapter4.varianta.nineteen.entities.Photo;
import chapter4.varianta.nineteen.entities.Photoalbum;
import chapter4.varianta.nineteen.exception.PhotoException;

/**
 *
 * @author Sukhocheva Maryana
 */
public class PhotoAction {
   public PhotoAction() {
       }
 
   public static void addPhotoToPhotoalbum(Photoalbum photoalbum, Photo photo) throws PhotoException{
        if (photoalbum!=null && photo!=null) {
            photoalbum.addPartPhotoalbum(photo);
            
        } else {
            throw new PhotoException("Photo's parameters incorrect");
        }
     }
   
      public static void setPhotoTitle(Photo photo, String title) throws PhotoException{
        if (photo!=null && title!=null && !title.isEmpty()) {
            photo.setName(title);
        } else {
            throw new PhotoException("Photo's parameters incorrect");
        }
     }
 
}
