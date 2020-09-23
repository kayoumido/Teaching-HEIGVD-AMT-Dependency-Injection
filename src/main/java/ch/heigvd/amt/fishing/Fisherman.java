package ch.heigvd.amt.fishing;

import ch.heigvd.amt.fishing.equipment.Bait;
import ch.heigvd.amt.fishing.equipment.Boat;
import ch.heigvd.amt.fishing.equipment.Boots;
import ch.heigvd.amt.fishing.equipment.FishingRod;

import ch.heigvd.amt.fishing.equipment.api.*;

public class Fisherman {

  private IBoots boots;
  private IFishingRod fishingRod;
  private IBait bait;
  private IBoat boat;

  public Fisherman(IBoots boots, IFishingRod fishingRod, IBait bait, IBoat boat) {
    this.boots = boots;
    this.fishingRod = fishingRod;
    this.bait = bait;
    this.boat = boat;
  }

  public Fisherman() {
    boots = new Boots();
    fishingRod = new FishingRod();
    bait = new Bait();
    boat = new Boat();
  }

  public Fish goGetFish() {
    boots.wear();
    boat.putOnWater();
    boat.startEngine();
    bait.putOnHook();
    fishingRod.moveUpTheAir();
    Fish fish = fishingRod.pullOutOfWater();
    return fish;
  }

}
