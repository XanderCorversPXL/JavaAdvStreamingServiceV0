package be.pxl.ja.streamingservice.model;

public abstract class Content {
    private String title;
    private be.pxl.ja.streamingservice.model.Rating maturityRating;
    private String imageUrl;
    public static final int LONG_PLAYING_TIME = 125;

    public Content(String title, be.pxl.ja.streamingservice.model.Rating maturityRating) {
        this.title = title;
        this.maturityRating = maturityRating;
    }

    public String getTitle() {
        return title;
    }

    public be.pxl.ja.streamingservice.model.Rating getMaturityRating() {
        return maturityRating;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return title + " vanaf " + maturityRating.getMinimumAge();
    }
}
