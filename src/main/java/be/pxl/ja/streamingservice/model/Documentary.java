package be.pxl.ja.streamingservice.model;

public class Documentary extends be.pxl.ja.streamingservice.model.Movie {

    private String topic;

    public Documentary(String title, be.pxl.ja.streamingservice.model.Rating maturityRating) {
        super(title, maturityRating, Genre.DOCUMENTARY);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public void play() {
        super.play();
        System.out.println(" met topic " + topic);
    }

    @Override
    public void pause() {
        super.pause();
        System.out.println(" met topic " + topic);
    }
}
