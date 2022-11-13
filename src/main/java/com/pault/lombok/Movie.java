package com.pault.lombok;

import lombok.*;
import lombok.experimental.Accessors;

import java.net.URL;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @NonNull
    private Long id;
    @NonNull
    private String title;
    private String description;
    private String country;
    @NonNull
    private int rating;
    @Getter(AccessLevel.PROTECTED)
    private URL officialSite;
    private String language;
    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PRIVATE)
    private final int minutes = 120;

    public int getMinutesPlusX(@NonNull int x) {
        return getMinutes() + x;
    }
}
