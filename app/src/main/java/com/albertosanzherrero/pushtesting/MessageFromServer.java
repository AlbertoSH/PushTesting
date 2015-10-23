package com.albertosanzherrero.pushtesting;

import android.os.Bundle;

/**
 * Created by albertosanzherrero on 6/10/15.
 */
public class MessageFromServer {

    private final Bundle intent;

    public MessageFromServer(Bundle intent) {
        this.intent = intent;
    }

    public Bundle getIntent() {
        return intent;
    }
}
