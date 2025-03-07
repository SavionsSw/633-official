package com.rs.plugin.impl.commands;

import com.rs.game.player.Player;
import com.rs.game.player.Rights;
import com.rs.plugin.listener.CommandListener;
import com.rs.plugin.wrapper.CommandSignature;

@CommandSignature(alias = {"empty", "ei"}, rights = {Rights.ADMINISTRATOR}, syntax = "Empties player inventory")
public final class EmptyCommandPlugin implements CommandListener {
    @Override
    public void execute(Player player, String[] cmd, String command) {
        player.getInventory().reset();
    }
}