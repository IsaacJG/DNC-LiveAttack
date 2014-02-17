package com.isaacjg.darklight.plugins.LiveAttack;

import com.ijg.darklight.sdk.core.IssueData;

/*
    This file is a part of LiveAttack, a plugin for Darklight Nova Core
    Copyright (C) 2014 Isaac Grant

    License: GPLv3 (See LiveAttack.java header, or the LICENSE file)
 */

/**
 * Triggers are subclassed from this, and implement the {@link #isTriggered()} functions
 *
 * @author Isaac Grant
 */
public abstract class Trigger {
    private static int id = 0;

    // Use IssueData because it already exists, does what is needed here
    private IssueData data;

    /**
     * @param description What to disallow in order to prevent the trigger from being activated
     */
    protected Trigger(String description) {
        data = new IssueData("Trigger" + Trigger.id++, description);
    }

    /**
     * Check if this trigger has been hit (triggered)
     * This function must be overrided per Trigger
     * @return True if the trigger has been activated, false otherwise
     */
    public abstract boolean isTriggered();

    /**
     * @return The name of the trigger
     */
    public String getName() {
        return data.getName();
    }

    /**
     * @return The description of the trigger
     */
    public String getDescription() {
        return data.getDescription();
    }

    /**
     * @return The IssueData belonging to this Trigger
     */
    public IssueData getData() {
        return data;
    }
}
