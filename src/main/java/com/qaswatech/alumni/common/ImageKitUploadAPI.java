package com.qaswatech.alumni.common;

import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ImageKitUploadAPI {

    public static final String PRIVATE_KEY = "UHpKeDI5dENLTU5udTExZWlwTFEwc01OdGtRPTo=";
    public static final String URL = "https://upload.imagekit.io/api/v1/files/upload";

    public ImageKitResponse2 uploadImage(String file, String fileName, String useUniqueFileName, String folder) {
        ImageKitResponse2 imageKitResponse2 = new ImageKitResponse2();
        Response response = null;
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            MediaType mediaType = MediaType.parse("text/plain");

            RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                    .addFormDataPart(
                            "file",
                            file,
                            RequestBody.create(MediaType.parse("application/octet-stream"
                            ),
                                    new File(file)
                            )
                    )
                    .addFormDataPart("fileName", fileName)
                    .addFormDataPart("useUniqueFileName", useUniqueFileName)
                    .addFormDataPart("folder", folder)
                    .build();

            Request request = new Request.Builder()
                    .url(URL)
                    .method("POST", body)
                    .addHeader("Authorization", "Basic " + PRIVATE_KEY)
                    .build();

            response = client.newCall(request).execute();
            if (response.message().equals("Bad Request")) {
                System.out.println("Response : " + response.message());
                System.out.println("Response : " + response.isSuccessful());
                throw new RuntimeException("Image with URL : " + file + " | and with Name : " + fileName + " cannot be upload");
            }

            Gson gson = new Gson();
            Scanner scanner = new Scanner(response.body().byteStream());
            imageKitResponse2 = gson.fromJson(scanner.nextLine(), ImageKitResponse2.class);
        } catch (IOException | RuntimeException e) {
            System.out.println("ImageKitUploadAPI : " + e.getMessage());
        } finally {
            response.close();
        }
        return imageKitResponse2;
    }

    public static void main(String[] args) {
        ImageKitUploadAPI im = new ImageKitUploadAPI();
        System.out.println(im.uploadImage("C:\\Users\\Zoya\\Downloads\\3.jpeg", "zzz", "true", "test"));
    }

}
