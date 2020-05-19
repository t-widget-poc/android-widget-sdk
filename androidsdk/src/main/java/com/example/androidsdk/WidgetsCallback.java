package com.example.androidsdk;

import okhttp3.Response;

public interface WidgetsCallback {
    // 引数部分はList<Widget>とかにすべき
    void onSuccess(Response response);

    void onFailure(Exception exception);

}
