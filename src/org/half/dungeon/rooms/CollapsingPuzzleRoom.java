package org.half.dungeon.rooms;

import org.half.dungeon.doors.Door;

import java.awt.*;

public class CollapsingPuzzleRoom extends PuzzleRoom
{
    protected CollapsingPuzzleRoom(final Rectangle bounds, final Point coordinates, final Door[] doors)
    {
        super(bounds, coordinates, doors);
    }
}
