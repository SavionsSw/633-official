package com.rs.game.dialogue.impl;

import com.rs.game.map.GameObject;
import com.rs.game.map.WorldTile;
import com.rs.game.player.Player;

import lombok.Data;
import skills.magic.TeleportType;

/**
 * This class is used for generic actions. You still need to define object
 * actions in classes for example "Lumbridge" as the action takes place there,
 * etc..
 * 
 * @author Dennis
 *
 */
@Data
public class StairsLaddersDialogue {
	
	private final GameObject object;

	public void execute(Player player, int optionId){
		if (object.getDefinitions().getOption(optionId).equalsIgnoreCase("Climb")) {
			if (player.getPlane() == 3 || player.getPlane() == 0)
				return;
			player.dialogue(dialogue -> {
				dialogue.option("Go-Up", () -> {
					if (player.getPlane() == 3) {
						return;
					}
					player.getMovement().move(true,
							new WorldTile(player.getX(), player.getY(), player.getPlane() + 1), TeleportType.BLANK);
				}, "Go-Down", () -> {
					player.getMovement().move(true,
							new WorldTile(player.getX(), player.getY(), player.getPlane() - 1), TeleportType.BLANK);
				});
			});
		} else if (object.getDefinitions().getOption(optionId).equalsIgnoreCase("Climb-up")) {
			if (player.getPlane() == 3)
				return;
			player.getMovement().move(true, new WorldTile(player.getX(), player.getY(), player.getPlane() + 1), TeleportType.BLANK);
		} else if (object.getDefinitions().getOption(optionId).equalsIgnoreCase("Climb-down")) {
			if (player.getPlane() == 0)
				return;
			player.getMovement().move(true, new WorldTile(player.getX(), player.getY(), player.getPlane() - 1), TeleportType.BLANK);
		}
	}
}