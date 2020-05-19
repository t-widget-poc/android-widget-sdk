package com.example.androidsdk;

import okhttp3.Response;

public interface WidgetsCallback {
    void onSuccess(Response response);

    void onFailure(Exception exception);

}
