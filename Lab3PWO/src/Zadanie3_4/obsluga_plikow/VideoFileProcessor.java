package Zadanie3_4.obsluga_plikow;

import Zadanie3_4.Mpeg;

import java.io.File;

public interface VideoFileProcessor {
    Mpeg loadVideoFile(File f);
    void saveVideoFile(File f);
}

