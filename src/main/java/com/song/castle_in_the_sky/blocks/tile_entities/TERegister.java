package com.song.castle_in_the_sky.blocks.tile_entities;

import com.song.castle_in_the_sky.CastleInTheSky;
import com.song.castle_in_the_sky.blocks.BlockRegister;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TERegister {
    public static final DeferredRegister<BlockEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, CastleInTheSky.MOD_ID);

    public static final RegistryObject<BlockEntityType<LaputaCoreTE>> LAPUTA_CORE_TE_TYPE = TILE_ENTITIES.register("laputa_core_te", ()->BlockEntityType.Builder.of(LaputaCoreTE::new, BlockRegister.LAPUTA_CORE.get()).build(null));
}
