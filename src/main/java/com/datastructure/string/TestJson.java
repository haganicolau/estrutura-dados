package com.datastructure.string;

//import org.json.JSONArray;
//import org.json.JSONObject;
//
//public class TestJson {
//
//    public static void main(String[] args) {
//
//        String jsonString = "{ \"error\": { \"code\": 404, \"message\": \"Requested entity was not found.\", \"status\": \"NOT_FOUND\", \"details\": [ { \"@type\": \"type.googleapis.com/google.firebase.fcm.v1.FcmError\", \"errorCode\": \"UNREGISTERED\" } ] } }";
//
//        JSONObject jsonObject = new JSONObject(jsonString);
//        JSONObject errorObject = jsonObject.getJSONObject("error");
//        JSONArray detailsArray = errorObject.getJSONArray("details");
//
//        if (detailsArray.length() > 0) {
//            JSONObject firstDetailObject = detailsArray.getJSONObject(0);
//            String errorCode = firstDetailObject.getString("errorCode");
//            System.out.println("errorCode: " + errorCode);
//        } else {
//            System.out.println("The details array is empty.");
//        }
//    }
//}
