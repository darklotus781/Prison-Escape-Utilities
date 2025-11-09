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
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, PrisonEscape.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.PARADOX_DENY)
                .add(ModBlocks.PRISON_WALL.asItem());

        tag(ModTags.Items.WOOL_CARPETS)
                .add(ModBlocks.WHITE_CARPET.asItem())
                .add(ModBlocks.ORANGE_CARPET.asItem())
                .add(ModBlocks.MAGENTA_CARPET.asItem())
                .add(ModBlocks.LIGHT_BLUE_CARPET.asItem())
                .add(ModBlocks.YELLOW_CARPET.asItem())
                .add(ModBlocks.LIME_CARPET.asItem())
                .add(ModBlocks.PINK_CARPET.asItem())
                .add(ModBlocks.GRAY_CARPET.asItem())
                .add(ModBlocks.LIGHT_GRAY_CARPET.asItem())
                .add(ModBlocks.CYAN_CARPET.asItem())
                .add(ModBlocks.PURPLE_CARPET.asItem())
                .add(ModBlocks.BLUE_CARPET.asItem())
                .add(ModBlocks.BROWN_CARPET.asItem())
                .add(ModBlocks.GREEN_CARPET.asItem())
                .add(ModBlocks.RED_CARPET.asItem())
                .add(ModBlocks.BLACK_CARPET.asItem());

        tag(ItemTags.WOOL_CARPETS)
                .addTag(ModTags.Items.WOOL_CARPETS);

        tag(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.OAK_FENCE.asItem());
    }
}
