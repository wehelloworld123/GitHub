package com.fc.test.model.poiData;

import com.deepoove.poi.data.PictureRenderData;
import lombok.Data;

@Data
public class SegmentData {
    private String title;

    private String content;

    private PictureRenderData picture;

}
