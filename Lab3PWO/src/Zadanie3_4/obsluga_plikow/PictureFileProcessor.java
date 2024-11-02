package Zadanie3_4.obsluga_plikow;

import Zadanie3_4.Jpeg;

import java.io.File;

public interface PictureFileProcessor {
    Jpeg loadPicture(File f);
    void savePicture(File f);
}

