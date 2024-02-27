public class BeerSong {
    String sing(int verseNumber, int versenext) {
        if (verseNumber > 99) {
            verseNumber = 99;
        }
        int control = verseNumber;
        StringBuilder song = new StringBuilder();

        for (int i = 0; i < versenext; i++) {
            song.append(versos(control));
            control--;
        }
        return song.toString();
    }
    String versos(int verse) {
        return (verse == 0 ? "No more":verse) + " bottle" + ((verse == 1) ? "" : "s") + " of beer on the wall, " + (verse == 0 ? "no more":verse) + " bottle" + ((verse == 1) ? "" : "s") + " of beer.\n" +
                ( verse == 0 ?"Go to the store and buy some more, " : "Take " + (verse - 1 == 0 ? "it" : "one") + " down and pass it around, ") + ((verse - 1) > 0 ? (verse-1): ((verse - 1) < 0 ? 99 : "no more")) + " bottle" + ((verse - 1) == 1 ? "" : "s") + " of beer on the wall.\n\n";
    }
    String singSong() {
        StringBuilder canc = new StringBuilder();
        for (int j = 99; j >= 0; j--) {
            canc.append(versos(j));
        }
        return canc.toString();
    }
}