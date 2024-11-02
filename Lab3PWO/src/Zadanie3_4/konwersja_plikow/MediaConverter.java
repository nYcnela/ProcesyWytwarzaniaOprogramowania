package Zadanie3_4.konwersja_plikow;

import Zadanie3_4.Avi;
import Zadanie3_4.Mp3;
import Zadanie3_4.Mpeg;
import Zadanie3_4.Wave;

public interface MediaConverter {
    Mp3 convertToMp3(Wave wave);
    Avi convertToAvi(Mpeg mpeg);
}

