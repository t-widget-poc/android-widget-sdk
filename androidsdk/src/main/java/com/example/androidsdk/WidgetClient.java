package com.example.androidsdk;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class WidgetClient {

    private static final String url = "https://intense-temple-71236.herokuapp.com/";

    private final OkHttpClient client = new OkHttpClient.Builder().build();
    private final Request request = new Request.Builder().url(url).build();

    public void getWidgets(final WidgetsCallback callback){

        client.newCall(request).enqueue(new okhttp3.Callback() {

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) {
                callback.onSuccess(response);
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                callback.onFailure(e);
            }
        });

    }
}
