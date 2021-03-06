package com.github.instagram4j.instagram4j.models.direct.item;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.github.instagram4j.instagram4j.models.media.Media;

import lombok.Data;

@Data
@JsonTypeName("media_share")
public class ThreadMediaShareItem extends ThreadItem {
    private Media media;
}
