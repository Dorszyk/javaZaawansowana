package ProgramowanieFunkcyjne.Ex1;

import java.util.Arrays;
import java.util.List;

public class Library {

    public static List<Season> getData() {

        Video video = new Video("Got1", "got1.com", VideoType.CLIP);
        Video video1 = new Video("Got2", "got2.com", VideoType.EPISODE);
        Video video2 = new Video("Got3", "got3.com", VideoType.PREVIEW);
        Video video3 = new Video("Got4", "got4.com", VideoType.PREVIEW);
        Video video4 = new Video("Got5", "got5.com", VideoType.CLIP);
        Video video5 = new Video("Got6", "got6.com", VideoType.EPISODE);

        Episode episode = new Episode("got1", 1, Arrays.asList(video, video1));
        Episode episode1 = new Episode("got2", 2, Arrays.asList(video2, video3));
        Episode episode2 = new Episode("got3", 1, Arrays.asList(video4, video5));

        Season season = new Season("GOTS1", 1, Arrays.asList(episode, episode1));
        Season season1 = new Season("GOTS1", 2, Arrays.asList(episode2));

        return List.of(season,season1);


    }
}
