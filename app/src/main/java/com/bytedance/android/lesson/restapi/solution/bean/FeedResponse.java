package com.bytedance.android.lesson.restapi.solution.bean;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:17
 */
public class FeedResponse {
    List<Feed> feeds;
    Boolean success;

    public List<Feed> getFeeds() {
        return feeds;
    }

    // TODO-C2 (2) Implement your FeedResponse Bean here according to the response json
}
