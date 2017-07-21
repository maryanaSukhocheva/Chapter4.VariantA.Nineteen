package chapter4.varianta.nineteen.action;

import chapter4.varianta.nineteen.entities.Page;
import chapter4.varianta.nineteen.entities.PartPhotoalbum;
import chapter4.varianta.nineteen.entities.Photo;
import chapter4.varianta.nineteen.entities.Photoalbum;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Sukhocheva Maryana
 */
public class InputData {
   
 
    public static List<PartPhotoalbum> generatePartsPhotoalbum(Photoalbum album)  {
        List<PartPhotoalbum> arrayOfPartPhotoalbum = new ArrayList<PartPhotoalbum>();
        try {
            int amountPages = 10;
            for (int i =0; i<10; i++) {
                Page page = new Page(i+1);
                arrayOfPartPhotoalbum.add(page);

            }
            Photo photo1 = new Photo("Мама");
            arrayOfPartPhotoalbum.add(photo1);
            Photo photo2 = new Photo("Папа");
            arrayOfPartPhotoalbum.add(photo2);
            Photo photo3 = new Photo("Я");
            arrayOfPartPhotoalbum.add(photo3);
            Photo photo4 = new Photo("Наша семья");
            arrayOfPartPhotoalbum.add(photo4);
            Photo photo5 = new Photo();
            arrayOfPartPhotoalbum.add(photo5);
            
             
         } catch (Exception ex) {
            System.err.println("Error when creating parts of the album");
        }
        System.out.println("Создан массив частей фотоальбома");
        return arrayOfPartPhotoalbum;

    }
   
}
