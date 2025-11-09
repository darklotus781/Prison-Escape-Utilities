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

package com.lithiumcraft.prison_escape.registry;

import com.lithiumcraft.prison_escape.PrisonEscape;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    // Create a block registry for this mod
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(PrisonEscape.MOD_ID);

    public static final DeferredBlock<WoolCarpetBlock> WHITE_CARPET = registerBlock("white_carpet",
            () -> new WoolCarpetBlock(DyeColor.WHITE, BlockBehaviour.Properties.of().strength(0.1F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<WoolCarpetBlock> ORANGE_CARPET = registerBlock("orange_carpet",
            () -> new WoolCarpetBlock(DyeColor.ORANGE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(0.1F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<WoolCarpetBlock> MAGENTA_CARPET = registerBlock("magenta_carpet",
            () -> new WoolCarpetBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).strength(0.1F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<WoolCarpetBlock> LIGHT_BLUE_CARPET = registerBlock("light_blue_carpet",
            () -> new WoolCarpetBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).strength(0.1F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<WoolCarpetBlock> YELLOW_CARPET = registerBlock("yellow_carpet",
            () -> new WoolCarpetBlock(DyeColor.YELLOW, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(0.1F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<WoolCarpetBlock> LIME_CARPET = registerBlock("lime_carpet",
            () -> new WoolCarpetBlock(DyeColor.LIME, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).strength(0.1F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<WoolCarpetBlock> PINK_CARPET = registerBlock("pink_carpet",
            () -> new WoolCarpetBlock(DyeColor.PINK, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).strength(0.1F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<WoolCarpetBlock> GRAY_CARPET = registerBlock("gray_carpet",
            () -> new WoolCarpetBlock(DyeColor.GRAY, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).strength(0.1F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<WoolCarpetBlock> LIGHT_GRAY_CARPET = registerBlock("light_gray_carpet",
            () -> new WoolCarpetBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(0.1F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<WoolCarpetBlock> CYAN_CARPET = registerBlock("cyan_carpet",
            () -> new WoolCarpetBlock(DyeColor.CYAN, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(0.1F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<WoolCarpetBlock> PURPLE_CARPET = registerBlock("purple_carpet",
            () -> new WoolCarpetBlock(DyeColor.PURPLE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(0.1F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<WoolCarpetBlock> BLUE_CARPET = registerBlock("blue_carpet",
            () -> new WoolCarpetBlock(DyeColor.BLUE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(0.1F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<WoolCarpetBlock> BROWN_CARPET = registerBlock("brown_carpet",
            () -> new WoolCarpetBlock(DyeColor.BROWN, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(0.1F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<WoolCarpetBlock> GREEN_CARPET = registerBlock("green_carpet",
            () -> new WoolCarpetBlock(DyeColor.GREEN, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(0.1F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<WoolCarpetBlock> RED_CARPET = registerBlock("red_carpet",
            () -> new WoolCarpetBlock(DyeColor.RED, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(0.1F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<WoolCarpetBlock> BLACK_CARPET = registerBlock("black_carpet",
            () -> new WoolCarpetBlock(DyeColor.BLACK, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(0.1F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> PRISON_WALL = registerBlock("prison_wall",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK)));
    public static final DeferredBlock<FenceBlock> OAK_FENCE = registerBlock("oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
