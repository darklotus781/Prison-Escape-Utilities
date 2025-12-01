/*
 * Prison Escape - Utilities
 * Copyright (c) 2025 DarkLotus (DarkLotus781) / LithiumCraft
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

package com.lithiumcraft.prison_escape.events;

import com.lithiumcraft.prison_escape.PrisonEscape;
import com.lithiumcraft.prison_escape.registry.ModTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

@EventBusSubscriber(modid = PrisonEscape.MOD_ID)
public class PackEvents {
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onLeftClick(PlayerInteractEvent.LeftClickBlock event) {
        Item item = event.getItemStack().getItem();

        // Reflection detection
        if (item.getClass().getName().equals("net.byAqua3.avaritia.item.ItemInfinityPickaxe")) {

            BlockState state = event.getLevel().getBlockState(event.getPos());

            if (state.is(ModTags.Blocks.UNBREAKABLE)) {
                event.setCanceled(true);
            }
        }
    }
}
