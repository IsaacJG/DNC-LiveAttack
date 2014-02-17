package com.isaacjg.darklight.plugins.LiveAttack;

import com.ijg.darklight.sdk.core.Issue;

/*
    This file is a part of LiveAttack, a plugin for Darklight Nova Core
    Copyright (C) 2014 Isaac Grant

    License: GPLv3 (See LiveAttack.java header, or the LICENSE file)
 */

/**
 * TriggerIssue - A custom issue to work with the Triggers
 *
 * @author Isaac Grant
 */
public class TriggerIssue extends Issue {
    private Trigger trigger;

    /**
     * @param trigger Trigger corresponding to this Issue
     */
    public TriggerIssue(Trigger trigger) {
        super(trigger.getName(), trigger.getDescription());
        this.trigger = trigger;
    }

    /**
     * @return !trigger.isTriggered() (trigger is private)
     */
    @Override
    public boolean isFixed() {
        return !trigger.isTriggered();
    }
}
