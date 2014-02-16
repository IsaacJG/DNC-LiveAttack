package com.isaacjg.darklight.plugins.LiveAttack;

import com.ijg.darklight.sdk.core.AccessHandler;
import com.ijg.darklight.sdk.core.CoreEngine;

/*
    This file is a part of LiveAttack, a plugin for Darklight Nova Core
    Copyright (C) 2014 Isaac Grant

    License: GPLv3 (See LiveAttack.java header, or the LICENSE file)
 */

/**
 * This is a custom AccessHandler designed for LiveAttack to directly manipulate issues
 * in order to properly score a LiveAttack session
 */
public class LiveAttackAccessHandler extends AccessHandler {

    public LiveAttackAccessHandler(CoreEngine engine) {
        super(engine);
    }
}
