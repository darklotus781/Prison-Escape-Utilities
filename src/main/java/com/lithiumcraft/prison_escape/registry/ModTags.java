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
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> WOOL_CARPETS = createTag("wool_carpets");
        public static final TagKey<Block> RELOCATION_NOT_SUPPORTED = createTag("c","relocation_not_supported");
        public static final TagKey<Block> BLACKLISTED_SPATIAL = createTag("ae2","blacklisted/spatial");
        public static final TagKey<Block> PHASE_DENY = createTag("justdirethings","phase_deny");
        public static final TagKey<Block> ECLIPSEGATE_DENY = createTag("justdirethings","eclipsegate_deny");
        public static final TagKey<Block> SWAPPER_DENY = createTag("justdirethings","swapper_deny");
        public static final TagKey<Block> PARADOX_ABSORB_DENY = createTag("justdirethings","paradox_absorb_deny");
        public static final TagKey<Block> BG_DENY = createTag("buildinggadets2","deny");


        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(PrisonEscape.MOD_ID, name));
        }

        private static TagKey<Block> createTag(String namespace, String key) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(namespace, key));
        }
    }

    public static class Items {

        public static final TagKey<Item> WOOL_CARPETS = createTag("wool_carpets");
        public static final TagKey<Item> PARADOX_DENY = createTag("justdirethings", "paradox_deny");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(PrisonEscape.MOD_ID, name));
        }

        private static TagKey<Item> createTag(String namespace, String key) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(namespace, key));
        }
    }
}