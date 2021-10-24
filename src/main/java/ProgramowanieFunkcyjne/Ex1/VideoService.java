package ProgramowanieFunkcyjne.Ex1;

import java.util.List;
import java.util.stream.Collectors;

public class VideoService {

    List<Season> seasonList;

    public VideoService(List<Season> seasonList) {
        this.seasonList = seasonList;
    }

    // lista wszystkich epizodow
    public List<Episode> listAllEpisodes() {
        return seasonList.stream()
                .flatMap(season -> season.episodes.stream())
                .collect(Collectors.toList());
    }

    // Lista wszystkich video
    public List<Video> listAllVideos() {
        return seasonList.stream()
                .flatMap(season -> season.episodes.stream())
                .flatMap(epsiode -> epsiode.videos.stream())
                .collect(Collectors.toList());
    }

    // Lista wszystkich nazw sezonów
    public List<String> listAllNameSeason() {
        return seasonList.stream()
                .map(s -> s.seasonName)
                .collect(Collectors.toList());
    }

    // Lista wszystkich numerów sezonów
    public List<Integer> listAllSeasonsNumbers() {
        return seasonList.stream()
                .map(s -> s.seasonNumber)
                .collect(Collectors.toList());
    }

    // Lista wszystkich nazw epizodów
    public List<String> listAllEpisodesName() {
        return seasonList.stream()
                .flatMap(s -> s.episodes.stream())
                .map(e -> e.episodeName)
                .collect(Collectors.toList());
    }

    // Lista wszystkich numerów epizodów
    public List<Integer> listAllEpisodesNumber() {
        return seasonList.stream()
                .flatMap(s -> s.episodes.stream())
                .map(e -> e.episodeNumber)
                .collect(Collectors.toList());
    }

    // Lista wszystkich nazw video
    public List<String> listAllNameVideo() {
        return seasonList.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .map(v -> v.title)
                .collect(Collectors.toList());
    }

    // Lista wszystkich adresów url dla każdego video
    public List<String> listAllUrlsVideos() {
        return seasonList.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .map(v -> v.utl)
                .collect(Collectors.toList());
    }

    // Lista epizodów z parzystych sezonów
    public List<Episode> listAllEvenEpisodes() {
        return seasonList.stream()
                .flatMap(s -> s.episodes.stream())
                .filter(e -> e.episodeNumber % 2 == 0)
                .collect(Collectors.toList());
    }

    // Lista video z parzystych sezonów
    public List<Season> listAllEvenSeasons() {
        return seasonList.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<Episode> listAllEvenEpisodesAndSeasons() {
        return seasonList.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .filter(e -> e.episodeNumber % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<Video> clipVideoFromEvenEpisodesAndOddSeasons() {
        return seasonList.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .filter(e -> e.episodeNumber % 2 != 0)
                .flatMap(e -> e.videos.stream())
                .filter(v -> v.videoType == VideoType.CLIP)
                .collect(Collectors.toList());
    }

    public List<Video> previewVideoFromOddEpisodesFromEvenSeadsons() {
        return seasonList.stream()
                .filter(s -> s.seasonNumber % 2 != 0)
                .flatMap(s -> s.episodes.stream())
                .filter(e -> e.episodeNumber % 2 == 0)
                .flatMap(e -> e.videos.stream())
                .filter(v -> v.videoType == VideoType.PREVIEW)
                .collect(Collectors.toList());
    }


}





