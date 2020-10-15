package be.pxl.ja.streamingservice.model;

public final class TVShow extends Content {
    private int numbersOfSeasons;

    public TVShow(String title, be.pxl.ja.streamingservice.model.Rating maturityRating, int numbersOfSeasons) {
        super(title, maturityRating);
        this.numbersOfSeasons = numbersOfSeasons;
    }

    public int getNumbersOfSeasons() {
        return numbersOfSeasons;
    }
}
