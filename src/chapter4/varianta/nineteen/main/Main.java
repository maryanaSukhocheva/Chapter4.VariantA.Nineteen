package chapter4.varianta.nineteen.main;

import chapter4.varianta.nineteen.action.InputData;
import chapter4.varianta.nineteen.action.PhotoAction;
import chapter4.varianta.nineteen.entities.PartPhotoalbum;
import chapter4.varianta.nineteen.entities.Photo;
import chapter4.varianta.nineteen.entities.Photoalbum;
import chapter4.varianta.nineteen.exception.PhotoException;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws PhotoException {
        Photoalbum photoalbum = new Photoalbum();
        System.out.println("Создан фотоальбом"); 
        List<PartPhotoalbum> partsPhotoalbum= InputData.generatePartsPhotoalbum(photoalbum);
        photoalbum.setPartPhotoalbums(partsPhotoalbum);
        Photo photo = new Photo();
        PhotoAction.setPhotoTitle(photo, "Отпуск в Египте");
        photoalbum.addPartPhotoalbum(photo);
        System.out.println("Количество фотографий" + photoalbum.getAmountPhotos());
       
    }
}
