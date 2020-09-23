package ch.heigvd.amt.fishing;

import ch.heigvd.amt.fishing.equipment.Bait;
import ch.heigvd.amt.fishing.equipment.Boat;
import ch.heigvd.amt.fishing.equipment.Boots;
import ch.heigvd.amt.fishing.equipment.FishingRod;

public class God {
    private Fisherman fisherman;

    public void createWorld() {
        fisherman = new Fisherman(new Boots(), new FishingRod(), new Bait(), new Boat());
    }

    public Fisherman lookupFisherman() {
        return fisherman;
    }
}
