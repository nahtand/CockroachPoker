public enum CardType {
    BAT, COCKROACH, FLY, RAT, SCORPION, SPIDER, STINKBUG, TOAD;

    public static String getFilePath(CardType type) {
        switch(type) {
            case BAT: return "sprites/Bat.jpg";
            case COCKROACH: return "sprites/CockRoach.jpg";
            case FLY: return "sprites/Fly.jpg";
            case RAT: return "sprites/Rat.jpg";
            case SCORPION: return "sprites/Scorpion.jpg";
            case SPIDER: return "sprites/Spider.jpg";
            case STINKBUG: return "sprites/StinkBug.jpg";
            case TOAD: return "sprites/Toad.jpg";
            default: return "sprites/back.jpg";
        }
    }



}
