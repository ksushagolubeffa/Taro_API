package org.example.models.dto.zodiac;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class FriendLoveMatcher {

    private String zodiac;
    private Integer love;
    private Integer friendship;

}
