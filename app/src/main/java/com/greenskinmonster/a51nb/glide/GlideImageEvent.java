package com.greenskinmonster.a51nb.glide;

import com.greenskinmonster.a51nb.utils.Constants;

/**
 * Image loading event
 * Created by GreenSkinMonster on 2015-08-27.
 */
public class GlideImageEvent {

    private int mStatus = -1;
    private String mUrl;
    private int mProgress;
    private String mMessage;

    public GlideImageEvent(String url, int progress, int status) {
        mUrl = url;
        mStatus = status;
        mProgress = progress;
    }

    public GlideImageEvent(String url, int progress, int status, String message) {
        mUrl = url;
        mStatus = status;
        mProgress = progress;
        mMessage = message;
    }

    public String getImageUrl() {
        return mUrl;
    }

    public int getProgress() {
        return mProgress;
    }

    public int getStatus() {
        return mStatus;
    }

    public boolean isInProgress() {
        return mStatus == Constants.STATUS_IN_PROGRESS;
    }

    public String getMessage() {
        return mMessage;
    }

}
