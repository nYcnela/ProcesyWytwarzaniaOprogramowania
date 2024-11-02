package Zadanie3_4.przetwarzanie;

import Zadanie3_4.Mp3;
import Zadanie3_4.Mpeg;

public interface MediaFilter {
    Mp3 filterMusic(Mp3 mp3);
    Mpeg filterVideo(Mpeg mpeg);
}

