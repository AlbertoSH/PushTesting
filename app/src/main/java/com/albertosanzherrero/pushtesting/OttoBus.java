package com.albertosanzherrero.pushtesting;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

public class OttoBus {

    private static Bus bus = null;

    public static Bus getInstance() {
        if (bus == null)
            bus = new Bus(ThreadEnforcer.ANY);
        return bus;
    }
}
