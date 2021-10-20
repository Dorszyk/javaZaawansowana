package TypyGeneryczne.Ex4;


import lombok.Data;

@Data
abstract class MediaConten {
    protected String title;

    public MediaConten(String title) {
        this.title = title;
    }

}


