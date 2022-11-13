package com.pault.lombok;

import lombok.*;


import java.net.URL;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
//@Slf4j(topic = "MovieDAO")
@CustomLog
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
    @Getter(AccessLevel.PRIVATE)
    @Builder.Default
    private final int minutes = 120;
    @Singular("cast")
    private List<String> cast;

    public int getMinutesPlusX(@NonNull int x) {
        log.info("Adding {}" + x);
        return getMinutes() + x;
    }
}
