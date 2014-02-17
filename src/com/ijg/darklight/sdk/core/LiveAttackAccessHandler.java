package com.ijg.darklight.sdk.core;

/*
    This file is a part of LiveAttack, a plugin for Darklight Nova Core
    Copyright (C) 2014 Isaac Grant

    License: GPLv3 (See LiveAttack.java header, or the LICENSE file)
 */

import com.isaacjg.darklight.plugins.LiveAttack.Trigger;
import com.isaacjg.darklight.plugins.LiveAttack.TriggerIssue;

/**
 * This is a custom AccessHandler designed for LiveAttack to directly manipulate issues
 * in order to properly score a LiveAttack session
 *
 * @author Isaac Grant
 */
public class LiveAttackAccessHandler extends AccessHandler {
    private Issue[] savedIssues;
    private CoreEngine engine;

    public LiveAttackAccessHandler(CoreEngine engine, Issue[] savedIssues) {
        super(engine);
        this.savedIssues = savedIssues;
        this.engine = engine;
    }

    /**
     * @param triggers Triggers to inject into the scoring system as {@link com.isaacjg.darklight.plugins.LiveAttack.TriggerIssue}
     */
    public void injectTriggers(Trigger[] triggers) {
        Issue[] combinedIssues = new Issue[triggers.length + savedIssues.length];
        for (int i = 0; i < triggers.length; i++) {
            combinedIssues[i] = new TriggerIssue(triggers[i]);
        }
        for (int i = triggers.length; i < savedIssues.length; i++) {
            combinedIssues[i] = savedIssues[i-triggers.length];
        }
        engine.issueHandler = new IssueHandler(combinedIssues);
    }
}
