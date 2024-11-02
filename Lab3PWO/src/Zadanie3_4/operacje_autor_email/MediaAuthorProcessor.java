package Zadanie3_4.operacje_autor_email;

import Zadanie3_4.Jpeg;
import Zadanie3_4.MediaFile;

public interface MediaAuthorProcessor {
    void addAuthor(MediaFile mf);
    Jpeg addAuthorToPicture(Jpeg jpeg);
}

