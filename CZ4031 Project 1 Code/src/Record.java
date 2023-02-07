class Record {
    private final String key;
    private final String avgRating;
    private final String numVotes;

    public Record(String key, String avgRating, String numVotes) {
        this.key = key;
        this.avgRating = avgRating;
        this.numVotes = numVotes;
    }

    public String getKey() {
        return key;
    }

    public String getAvgRating() {
        return avgRating;
    }

    public String getNumVotes() {
        return numVotes;
    }
}
