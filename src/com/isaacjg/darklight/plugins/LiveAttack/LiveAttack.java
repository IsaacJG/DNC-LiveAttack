package com.isaacjg.darklight.plugins.LiveAttack;

import com.ijg.darklight.sdk.core.LiveAttackAccessHandler;
import com.ijg.darklight.sdk.core.Plugin;

/*
 * LiveAttack - A plugin for Darklight Nova Core
 * Copyright © 2014 Isaac Grant
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * LiveAttack is a pluign for Darklight Nova Core that simulates being attacked by a hacker
 * Using "Triggers"
 *
 * @author Isaac Grant
 */

public class LiveAttack extends Plugin {
    private Trigger[] triggers;
    private LiveAttackAccessHandler accessHandler;

    public LiveAttack(LiveAttackAccessHandler accessHandler) {
        super(accessHandler);
        this.accessHandler = accessHandler; // May be redundant, but keeping it here just to be safe
    }

    /**
     * @param triggers Initalized Trigger objects to use
     */
    public void setTriggers(Trigger[] triggers) {
        this.triggers = triggers;
    }

    @Override
    protected void start() {
        accessHandler.injectTriggers(triggers);
    }

    @Override
    protected void kill() {
    }
}
