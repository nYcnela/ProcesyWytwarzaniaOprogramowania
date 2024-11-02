package Zadanie3_4.obsluga_plikow;

import Zadanie3_4.Mp3;

import java.io.File;

public interface MusicFileProcessor {
    Mp3 loadMusicFile(File f);
    void saveMusicFile(File f);
}

