public class Fish {
    private String type;
    private String feed;

    protected void show_identity(){
        System.out.println("Saya Ikan dengan detail, Jenis " + type +
                " makanan " + feed);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }
}

