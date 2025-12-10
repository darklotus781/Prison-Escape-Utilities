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
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
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

    // NEW: handle portal item usage
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        if (level.isClientSide) {
            return;
        }

        ItemStack stack = event.getItemStack();
        if (stack.isEmpty()) {
            return;
        }

        Item item = stack.getItem();

        // Get registry name of the item
        ResourceLocation id = item.builtInRegistryHolder().key().location();
        String namespace = id.getNamespace();
        String path = id.getPath();

        if (!"netherportalitem".equals(namespace)) {
            return; // not from that mod, ignore
        }

        ResourceKey<Level> dim = level.dimension();

        // Nether Portal Item: only Overworld + Nether
        if ("nether_portal_item".equals(path)) {
            if (dim != Level.OVERWORLD && dim != Level.NETHER) {
                cancelPlacement(event);
                if (event.getEntity() != null) {
                    event.getEntity().displayClientMessage(
                            Component.literal("This portal can only be used in the Overworld or the Nether."),
                            true
                    );
                }
            }
            return;
        }

        // End Portal Item: only Overworld
        if ("end_portal_item".equals(path)) {
            if (dim != Level.OVERWORLD) {
                cancelPlacement(event);
                if (event.getEntity() != null) {
                    event.getEntity().displayClientMessage(
                            Component.literal("This portal can only be used in the Overworld."),
                            true
                    );
                }
            }
        }
    }

    private static void cancelPlacement(PlayerInteractEvent.RightClickBlock event) {
        // Make sure nothing else handles the click
        event.setCanceled(true);
        event.setCancellationResult(InteractionResult.FAIL);
    }
}
