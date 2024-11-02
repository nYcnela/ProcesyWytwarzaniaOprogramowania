package Zadanie3_4.konwersja_plikow;

import Zadanie3_4.Avi;
import Zadanie3_4.Mp3;
import Zadanie3_4.Mpeg;

public interface AudioExtractor {
    Mp3 extractFromAvi(Avi avi);
    Mp3 extractFromMpeg(Mpeg mpeg);
}

