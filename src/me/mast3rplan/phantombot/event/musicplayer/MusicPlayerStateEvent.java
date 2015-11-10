/* 
 * Copyright (C) 2015 www.phantombot.net
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
package me.mast3rplan.phantombot.event.musicplayer;

import me.mast3rplan.phantombot.jerklib.Channel;
import me.mast3rplan.phantombot.musicplayer.MusicPlayerState;

public class MusicPlayerStateEvent extends MusicPlayerEvent
{

    private final MusicPlayerState state;

    /**
     * 
     * @param state 
     * 
     * @deprecated Use a version which accepts the channel argument instead
     */
    @Deprecated public MusicPlayerStateEvent(MusicPlayerState state)
    {
        this.state = state;
    }

    public MusicPlayerStateEvent(MusicPlayerState state, Channel channel)
    {
        super(channel);
        this.state = state;
    }

    public MusicPlayerState getState()
    {
        return state;
    }

    public int getStateId()
    {
        return state.i;
    }
}
