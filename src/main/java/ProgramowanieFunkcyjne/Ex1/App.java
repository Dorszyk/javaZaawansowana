package ProgramowanieFunkcyjne.Ex1;

public class App {

    public static void main(String[] args) {

        VideoService videoService = new VideoService(Library.getData());

        System.out.println(videoService.listAllEpisodes());
        System.out.println(videoService.listAllVideos());
        System.out.println(videoService.listAllNameSeason());
        System.out.println(videoService.listAllSeasonsNumbers());
        System.out.println(videoService.listAllEpisodesName());
        System.out.println(videoService.listAllEpisodesNumber());
        System.out.println(videoService.listAllNameVideo());
        System.out.println(videoService.listAllUrlsVideos());
        System.out.println(videoService.listAllEvenEpisodes());
        System.out.println(videoService.listAllEvenSeasons());
        System.out.println(videoService.listAllEvenEpisodesAndSeasons());
        System.out.println(videoService.clipVideoFromEvenEpisodesAndOddSeasons());
        System.out.println(videoService.previewVideoFromOddEpisodesFromEvenSeadsons());


    }
}

