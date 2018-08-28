package ro.dg.bookservice.domain;

import lombok.Data;

@Data
public class Rating {
    private long id;
    private Long bookId;
    private int stars;
}
