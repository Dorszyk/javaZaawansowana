package ProgramowanieFunkcyjne.Ex1;

import lombok.Data;

import java.util.Objects;

@Data
public class Video {

   public String title;
   public String utl;
   public VideoType videoType;

    public Video(String title, String utl, VideoType videoType) {
        this.title = title;
        this.utl = utl;
        this.videoType = videoType;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", utl='" + utl + '\'' +
                ", videoType=" + videoType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Video)) return false;
        Video video = (Video) o;
        return Objects.equals(title, video.title) &&
                Objects.equals(utl, video.utl) &&
                videoType == video.videoType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, utl, videoType);
    }
}
