package com.bytedance.android.lesson.restapi.solution.bean;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:18
 */

public class Feed {
    // TODO-C2 (1) Implement your Feed Bean here according to the response json
    String student_id;
    String user_name;
    String image_url;
    String _id;
    String video_url;
    String createdAt;
    String updatedAt;

    public String getImage_url(){
        return image_url;
    }
}
// response
// {
//    "feeds":[
//        {
//            "student_id":"2220186666",
//            "user_name":"doudou",
//            "image_url":"https://sf6-hscdn-tos.pstatp
//            .com/obj/developer-baas/baas/tt7217xbo2wz3cem41/9c6bbc2aa5355504_1560563154279
//            .jpg",
//            "_id":"5d044dd222e26f0024157401",
//            "video_url":"https://lf1-hscdn-tos.pstatp
//            .com/obj/developer-baas/baas/tt7217xbo2wz3cem41/a8efa55c5c22de69_1560563154288
//            .mp4",
//            "createdAt":"2019-06-15T01:45:54.368Z",
//            "updatedAt":"2019-06-15T01:45:54.368Z",
//        }
//        ...
//    ],
//    "success":true
//}
