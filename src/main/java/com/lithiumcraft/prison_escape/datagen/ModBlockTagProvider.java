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

package com.lithiumcraft.prison_escape.datagen;

import com.lithiumcraft.prison_escape.PrisonEscape;
import com.lithiumcraft.prison_escape.registry.ModBlocks;
import com.lithiumcraft.prison_escape.registry.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PrisonEscape.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.FEATURES_CANNOT_REPLACE)
                .add(ModBlocks.PRISON_WALL.get());

        tag(ModTags.Blocks.ECLIPSEGATE_DENY)
                .add(ModBlocks.PRISON_WALL.get());

        tag(ModTags.Blocks.PHASE_DENY)
                .add(ModBlocks.PRISON_WALL.get());

        tag(ModTags.Blocks.RELOCATION_NOT_SUPPORTED)
                .add(ModBlocks.PRISON_WALL.get());

        tag(BlockTags.WITHER_IMMUNE)
                .add(ModBlocks.PRISON_WALL.get());

        tag(BlockTags.DRAGON_IMMUNE)
                .add(ModBlocks.PRISON_WALL.get());

        tag(ModTags.Blocks.BLACKLISTED_SPATIAL)
                .add(ModBlocks.PRISON_WALL.get());

        tag(ModTags.Blocks.SWAPPER_DENY)
                .add(ModBlocks.PRISON_WALL.get());

        tag(ModTags.Blocks.PARADOX_ABSORB_DENY)
                .add(ModBlocks.PRISON_WALL.get());

        tag(ModTags.Blocks.BG_DENY)
                .add(ModBlocks.PRISON_WALL.get());

        tag(ModTags.Blocks.WOOL_CARPETS)
                .add(ModBlocks.WHITE_CARPET.get())
                .add(ModBlocks.ORANGE_CARPET.get())
                .add(ModBlocks.MAGENTA_CARPET.get())
                .add(ModBlocks.LIGHT_BLUE_CARPET.get())
                .add(ModBlocks.YELLOW_CARPET.get())
                .add(ModBlocks.LIME_CARPET.get())
                .add(ModBlocks.PINK_CARPET.get())
                .add(ModBlocks.GRAY_CARPET.get())
                .add(ModBlocks.LIGHT_GRAY_CARPET.get())
                .add(ModBlocks.CYAN_CARPET.get())
                .add(ModBlocks.PURPLE_CARPET.get())
                .add(ModBlocks.BLUE_CARPET.get())
                .add(ModBlocks.BROWN_CARPET.get())
                .add(ModBlocks.GREEN_CARPET.get())
                .add(ModBlocks.RED_CARPET.get())
                .add(ModBlocks.BLACK_CARPET.get());

        tag(BlockTags.WOOL_CARPETS)
                .addTag(ModTags.Blocks.WOOL_CARPETS);

        tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.OAK_FENCE.get());
    }
}