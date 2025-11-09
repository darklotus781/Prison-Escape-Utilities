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

package com.lithiumcraft.prison_escape.items;

import com.lithiumcraft.prison_escape.PrisonEscape;
import com.lithiumcraft.prison_escape.registry.ModBlocks;
import com.lithiumcraft.prison_escape.registry.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrisonEscape.MOD_ID);

    public static final Supplier<CreativeModeTab> PRISON_ESCAPE = CREATIVE_MODE_TAB.register("prison_escape",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PRISON_WALL.get()))
                    .title(Component.translatable("creativetab.prison_escape"))
                    .displayItems((itemDisplayParameters, output) -> {
                        ModBlocks.BLOCKS.getEntries().forEach(holder -> {
                            Block block = holder.get();

                            Item item = Item.BY_BLOCK.get(block);
                            if (item == null || item == Items.AIR) return;

                            output.accept(item);
                        });

                        ModItems.ITEMS.getEntries().forEach(holder -> {
                            if (!(holder.get() instanceof BlockItem)) {
                                output.accept(holder.get());
                            }
                        });
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
